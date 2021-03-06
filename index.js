const Alexa = require('ask-sdk-core');
var AWS = require('aws-sdk');
var fs = require('fs');
var dynamodb = new AWS.DynamoDB();

// 1. Text strings ================================================================================
//    Modify these strings and messages to change the behavior of your Lambda function

const welcomeOutput = "Hi,How can I help You ?";
const welcomeReprompt = "Kindly Provide your input";
const helpOutput = 'You can demonstrate the delegate directive by saying "book my ticket".';
const helpReprompt = 'Try saying "stars".';



// 1. Intent Handlers =============================================

const LaunchRequestHandler = {
  canHandle(handlerInput) {
    const request = handlerInput.requestEnvelope.request;
    return request.type === 'LaunchRequest';
  },
  handle(handlerInput) {
    //createTable();
    //loadsampleData();
    // httpGet();
    var a = require('./index1');
    console.log(a.a);

    const responseBuilder = handlerInput.responseBuilder;
    return responseBuilder
      .speak(welcomeOutput)
      .reprompt(welcomeReprompt)
      .getResponse();
  },
};

const InProgressPlanMyTripHandler = {
  canHandle(handlerInput) {
    const request = handlerInput.requestEnvelope.request;
    return request.type === 'IntentRequest' &&
      request.intent.name === 'PlanMyTripIntent' &&
      request.dialogState !== 'COMPLETED';
  },

  handle(handlerInput) {


    const slotValues = getSlotValues(handlerInput.requestEnvelope.request.intent.slots);
    console.log("handlerInput", slotValues);
    var validationResult;
    if (slotValues.fromCity.synonym != undefined || slotValues.toCity.synonym != undefined || slotValues.travelDate.synonym != undefined) {
      validationResult = validateSlotValues(slotValues);
      console.log("validationResult", validationResult);
      console.log(validationResult.isValid == true);
      if (validationResult.isValid == true) {
        console.log("if loop");
        var currentIntent1 = handlerInput.requestEnvelope.request.intent;
        var result = handlerInput.responseBuilder

          .addDelegateDirective(currentIntent1)
          .getResponse();
      }
      else {
        console.log("else loop");
        console.log("viloted slot", validationResult.violatedSlot);
        currentIntent1 = handlerInput.requestEnvelope.request.intent;
        result = handlerInput.responseBuilder
          .speak(validationResult.message.content)
          .reprompt(welcomeReprompt)
          .addElicitSlotDirective(validationResult.violatedSlot)
          .getResponse();

      }
    }
    else {
      console.log("final else loop");
      currentIntent1 = handlerInput.requestEnvelope.request.intent;
      result = handlerInput.responseBuilder
        .addDelegateDirective(currentIntent1)
        .getResponse();

    }
    return result;
  },
};

function validateSlotValues(slots) {
  console.log("validateSlotValues", slots);
  const toCitySlotName = 'toCity';
  const fromCitySlotName = 'fromCity';
  const fromtravelDateSlotName = 'travelDate';
  const returnDateSlotValue = 'returnDate';
  const advanceAmountSlotValue = 'advanceAmount'


  var source = slots.fromCity.synonym;
  var destination = slots.toCity.synonym;
  var travelDate = slots.travelDate.synonym;
  var isreturn = slots.returnDateTime.synonym;
  var returnDate = slots.returnDate.synonym;
  var returnTime = slots.returnTime.synonym;
  var isAdvanceRequired = slots.isAdvanceRequired.synonym;
  var advanceAmount = slots.advanceAmount.synonym;
  console.log("isreturn", isreturn);

  var validationResult = { isValid: true };

  if (isreturn == 'yes' && returnDate != null && returnTime == null) {
    console.log('kshitizmohini');
    if (!isValidDate(returnDate)) {
      validationResult = buildValidationResult(false, returnDateSlotValue, 'I did not understand your departure date.  When would you book your flight ?');
    }
    else if (parseLocalDate(returnDate).getTime() == simpledateformat().getTime()) {

      validationResult = buildValidationResult(false, returnDateSlotValue, 'Reservations must be scheduled at least one day in advance. Please try a different date');
    }
    else if (parseLocalDate(returnDate) < new Date()) {

      validationResult = buildValidationResult(false, returnDateSlotValue, 'Ticket can not booked in past. Please try with future date. ');
    }
    else {
      validationResult = buildValidationResult(false, 'returnTime', ' Please provide return Time');
    }
  }
  else if (isAdvanceRequired == 'yes' && advanceAmount == null&& returnDate!=null) {
    console.log('returnDate');
    validationResult = buildValidationResult(false, advanceAmountSlotValue, ' Please provide advance Amount');
  }
  else if (isAdvanceRequired == 'yes' && advanceAmount != null&& returnDate==null) {
    console.log('returnDate');
    validationResult = buildValidationResult(false, 'tourDays', ' Please provide tour Days');
  }
  else if (source && !isValidCity(source)) {
    validationResult = buildValidationResult(false, fromCitySlotName, `We currently do not support ${source} as a valid city. Please try with city of India.`);
  }
  else if (destination && !isValidCity(destination)) {
    validationResult = buildValidationResult(false, toCitySlotName, `We currently do not support ${destination} as a valid destination.  Please try with city of India.`);
  }
  else if (isreturn == 'yes' && returnDate == null) {
    console.log('returnDate');
    validationResult = buildValidationResult(false, returnDateSlotValue, ' Please provide return Date');
  }
  else if (travelDate) {
    if (!isValidDate(travelDate)) {
      validationResult = buildValidationResult(false, fromtravelDateSlotName, 'I did not understand your departure date.  When would you book your flight ?');
    }
    else if (parseLocalDate(travelDate).getTime() == simpledateformat().getTime()) {

      validationResult = buildValidationResult(false, fromtravelDateSlotName, 'Reservations must be scheduled at least one day in advance. Please try a different date');
    }
    else if (parseLocalDate(travelDate) < new Date()) {

      validationResult = buildValidationResult(false, fromtravelDateSlotName, 'Ticket can not booked in past. Please try with future date. ');
    }
  }
  // console.log("ksh", (isreturn == 'yes' && returnDate != null && returnTime == null));

  return validationResult;
}

function buildValidationResult(isValid, violatedSlot, messageContent) {
  return {
    isValid,
    violatedSlot,
    message: { contentType: 'PlainText', content: messageContent },
  };
}


function isValidCity(city) {
  var validCities = ['AGATTI ISLAND', 'Aizawl', 'Lucknow', 'Bagdogra', 'Mangalore', 'Allahabad', 'SHILLONG', 'BELLARY', 'Bangalore', 'Bhavnagar',
    'Kulu', 'Bhubaneswar', 'BIKANER', 'Ranchi	', 'Kanpur	', 'Chandigarh', 'Chennai', 'Mumbai', 'Aurangabad', 'Goa', 'Delhi', 'Indore', 'DIMAPUR',
    'Diu In', 'Nagpur', 'Dharamshala', 'Gaya', 'Gorakhpur', 'Jamnagar', 'GWALIOR', 'HUBLI', 'JABALPUR', 'Patna',
    'JAISALMER', 'Jodhpur', 'Dehra Dun', 'KAILASHAHAR', 'Kandla', 'Khajuraho', 'Agra', 'Kochi', 'KOLHAPUR', 'KOTA', 'Kozhikode', 'Silchar',
    'Varanasi', 'Latur', 'Leh IN', 'Lilabari', 'Pune', 'Guwahati', 'Ludhiana',
    'Madurai', 'NASIK', 'Kolkata', 'PANTNAGAR', 'Entry Not fond in REFPUB', 'Coimbatore', 'Porbandar', 'PUTTAPARTHE', 'Raipur',
    'Bhopal', 'Amritsar', 'Rajahmundry', 'Hyderabad', 'Rajkot', 'Jorhat', 'Bhuj', 'SALEM', 'TEZPUR',
    'BELGAUM', 'Jaipur',
    'Ahmedabad', 'Jammu',
    'SHOLAPUR',
    'Shimla',
    'Agartala',
    'JAMSHEDPUR',
    'Srinagar',
    'SURAT',
    'TEZU',
    'Thiruvananthpuram',
    'Tiruchirappai',
    'Tirupati',
    'Imphal	',
    'Tuticorin',
    'Vadodara',
    'Port Blair',
    'VIJAYAWADA',
    'Vishakhapatanam', 'delhi', 'Delhi', 'New Delhi', 'pune', 'goa', '', 'chennai', 'kolkata', 'Banglore', 'banglore', 'BANGLORE', 'MUMBAI', 'kanpur'
  ];

  //    return (validCities.toUpperCase().indexOf(city.toUpperCase) > -1);*/
  console.log("valid city", validCities.findIndex(item => city.toLowerCase() === item.toLowerCase()));
  return (validCities.findIndex(item => city.toLowerCase() === item.toLowerCase()) > -1);
}

function isValidDate(date) {
  try {
    return !(isNaN(parseLocalDate(date).getTime()));
  }
  catch (err) {
    return false;
  }
}

function parseLocalDate(date) {
  /**
   * Construct a date object in the local timezone by parsing the input date string, assuming a YYYY-MM-DD format.
   * Note that the Date(dateString) constructor is explicitly avoided as it may implicitly assume a UTC timezone.
   */
  const dateComponents = date.split(/\-/);
  console.log(dateComponents);
  return new Date(dateComponents[0], dateComponents[1] - 1, dateComponents[2]);
}

function simpledateformat() {
  var d1 = new Date();
  return new Date(d1.getFullYear(), d1.getMonth(), d1.getDate());
}

function getDayDifference(earlierDate, laterDate) {
  const laterDateInDaysSinceEpoch = new Date(laterDate).getTime() / 86400000;
  const earlierDateInDaysSinceEpoch = new Date(earlierDate).getTime() / 86400000;
  return Number(laterDateInDaysSinceEpoch - earlierDateInDaysSinceEpoch).toFixed(0);
}

const DeniedPlanMyTripHandler = {
  canHandle(handlerInput) {
    const request = handlerInput.requestEnvelope.request;
    return request.type === 'IntentRequest' &&
      request.intent.name === 'PlanMyTripIntent' &&
      request.intent.confirmationStatus === 'DENIED';
  },
  handle(handlerInput) {
    const responseBuilder = handlerInput.responseBuilder;
    return responseBuilder
      .speak("what You need to change?")
      .reprompt(welcomeReprompt)
      .getResponse();
  },
};


const CompletedPlanMyTripHandler = {
  canHandle(handlerInput) {
    const request = handlerInput.requestEnvelope.request;
    return request.type === 'IntentRequest' && request.intent.name === 'PlanMyTripIntent' && request.intent.confirmationStatus === 'CONFIRMED';
  },
  async handle(handlerInput) {
    const responseBuilder = handlerInput.responseBuilder;
    const filledSlots = handlerInput.requestEnvelope.request.intent.slots;
    const slotValues = getSlotValues(filledSlots);
    console.log("slotsvalues", slotValues);
    var outputSpeech = ' ';

    console.log('outputSpeech ', outputSpeech);

    // await saveRequest('http://api.open-notify.org/astros.json')
    // getPostData('jsonplaceholder.typicode.com', '/posts', '443', 'POST');
    dbOperations(slotValues);

    await saveRequest('efyduat.mindeservices.com', '/stars/api/request', '80', 'POST', slotValues)
      .then((response) => {
        var data = (response);
        console.log("API response", data);
        var statusMsg = data.message;
        var statusCode = data.status;
        var dataValue = data.data;
        var requisitionNo = dataValue.requestNo;
        // requistionNo='MIND/DOM/112153';
        console.log("requisitionNo", requisitionNo);

        if (statusMsg == "SUCCESS") {

          data = `your travel request has been submitted to workflow with requisition number ${requisitionNo} . 
          Ticket from ${slotValues.fromCity.synonym} to ${slotValues.toCity.synonym} 
          on ${slotValues.travelDate.synonym}.`;
          console.log("data", data);
        }
        outputSpeech += data;
        console.log("outputSpeech", outputSpeech);
      })
      .catch((err) => {
        console.log(err);
      });
    return responseBuilder
      .speak(outputSpeech)
      .getResponse();
  },
};


const httpGetApproverList = function() {
  return new Promise((resolve, reject) => {
    console.log("1234");
    var postheaders = {
      'winUserId': 'kshitizmohini',
      'domainName': 'MIND',
      'requestSource': 'M',
      'systemName': 'STARS-APP',
      'deviceId': '172.29.37.162',
    };
    var outputSpeech1 = "";
    var get_options = {
      host: 'efyduat.mindeservices.com',
      port: '80',
      path: '/stars/api/request/workflow/D/112102/list',
      method: 'GET',
      headers: postheaders,

    };
    const http = require('http');
    var post_req = http.request(get_options, function(res) {
      console.log("get_option", get_options);
      res.setEncoding('utf8');
      res.on('data', function(chunk) {
        const data = JSON.parse(chunk);
        console.log("approverListAPIResponse", data);
        var status = data.status;
        if (status == 200) {
          var aprrover = data.data;
          console.log("abc", aprrover);
          for (var i = 0; i < aprrover.length; i++)
            outputSpeech1 += aprrover[i].name + ',';
          console.log("Source: " + outputSpeech1);
        }
        else {
          outputSpeech1 = data.message;
        }
        resolve(outputSpeech1)
      });
    });
    post_req.write('');
    post_req.end();
  });
};

const saveRequest = function(host, path, port, method, slotsvalues) {
  return new Promise((resolve, reject) => {
    /***************************************************************/



    const http = require('http');
    console.log("Enter getpostdata");
    var travelDate1 = slotsvalues.travelDate.synonym;
    console.log("Before passing to format value is:-", travelDate1);
    var travelDate = format(travelDate1);
    console.log("After passing to format value is:-", travelDate);

    var travelTimeInput = 'No Preference';
    var returnTimeInput = 'No Preference';
    var advanceAmount = 0;

    if (slotsvalues.hasOwnProperty('travelTimePrefix')) {
      var travelTimePrefix = slotsvalues.travelTimePrefix.synonym;
      var preferredTimeMode = 0;
      console.log("case1 ", travelTimePrefix == 'not before');
      switch (travelTimePrefix) {
        case 'not before':
          preferredTimeMode = 1;
          break;
        case 'arrival until':
          preferredTimeMode = 2;
          break;
        case 'before':
          preferredTimeMode = 2;
          break;
        case 'after':
          preferredTimeMode = 1;
          break;
      }
    }
    if (slotsvalues.hasOwnProperty('returnDate')) {
      var returnDate1 = slotsvalues.returnDate.synonym;
      var returnDate = format(returnDate1);
      var journeyType = "O";
      if (returnDate != null) { journeyType = "R"; }
    }
    if (slotsvalues.hasOwnProperty('travelTime')) {
      travelTimeInput = slotsvalues.travelTime.synonym;
    }
    if (travelTimeInput.length == 2) {
      travelTimeInput += ":00";
      console.log("parsetime1", travelTimeInput);
    }
    if (slotsvalues.hasOwnProperty('returnTime')) {
      returnTimeInput = slotsvalues.returnTime.synonym;
      console.log("return Time Input", returnTimeInput);
      if (returnTimeInput != 'undefined' && returnTimeInput.length == 2) {
        returnTimeInput += ":00";
        console.log("parsetime2", returnTimeInput);
      }

    }
    if (slotsvalues.hasOwnProperty('advanceAmount')) {
      advanceAmount = slotsvalues.advanceAmount.synonym;

      if (advanceAmount != null) {
        var noOfDayOfTour = getDayDifference(travelDate1, returnDate1);
        var contingenciesAmount = 1000;
        var dailyAllowanceExpPerDay = 350;
        var othersAmount = 500;
      }
    }

    getTimecode(travelTimeInput, function(res) {
      console.log("Value after the returning 1 " + res);

      getTimecode(returnTimeInput, function(res1) {
        console.log("Value after the returning 2 " + res1);
        var jsonObject = JSON.stringify({
          "flightJourneyDetails": {
            "flightJourney": [{
              "country": 105,
              "dateOfJourney": travelDate,
              "destination": slotsvalues.toCity.synonym,
              "journeyCode": "F1",
              "journeyOrder": 0,
              "preferredAirline": "No preference",
              "preferredSeat": 30,
              "preferredTime": res,
              "preferredTimeMode": preferredTimeMode,
              "source": slotsvalues.fromCity.synonym,
              "stayType": -1,
              "travelClass": 31
            }],
            "flightJourneyRemarks": slotsvalues.remarks.synonym,
            "journeyType": journeyType,
            "returnDate": returnDate,
            "returnTime": res1
          },
          "advanceDetails": {
            "advanceAmountDetails": [{
              "contingencies": 0,
              "currencyCode": "INR",
              "dailyAllowanceExpPerDay": 0,
              "dailyAllowanceTourDays": noOfDayOfTour,
              "exchangeRateINR": 0,
              "hotelChargesExpPerDay": 0,
              "hotelChargesTourDays": 0,
              "others": 0,
              "total": advanceAmount,
              "totalINR": 0
            }],
            "advanceRemarks": "",
            "currencyDominationDetails": "",
            "totalAmountINR": 0,
            "totalUSDPerDay": 0
          },
          "siteId": 86,
          "reasonForTravel": slotsvalues.remarks.synonym,
          "travellerId": 0,
          "travelType": "D",
          "domainName": "MIND",
          "winUserId": "kshitizmohini",
          "deviceId": "172.29.37.162",
          "requestSource": "A",
          "systemName": "STARS-APP",
          "submitFlag": "Y"
        });

        console.log(jsonObject);
        var postheaders = {
          'Content-Type': 'application/json'

        };
        var outputSpeech;

        var post_options = {
          host: host,
          port: port,
          path: path,
          method: method,
          headers: postheaders,

        };

        var post_req = http.request(post_options, function(res) {
          console.log("post_option", post_options);
          res.setEncoding('utf8');
          res.on('data', function(chunk) {
            const data = JSON.parse(chunk);
            //outputSpeech = data.message;
            console.log("kshitiz", data);
            resolve(data);
          });
        });
        post_req.write(jsonObject);
        post_req.end();

        post_req.on('error', (err) => reject(err));

      });
    });
  });
};

function format(inputDate) {
  var date = new Date(inputDate);
  console.log("format function date", date);
  if (!isNaN(date.getTime())) {
    // Months use 0 index.
    return date.getDate() + '/' + (date.getMonth() + 1) + '/' + date.getFullYear();
  }
}


const HelpHandler = {
  canHandle(handlerInput) {
    const request = handlerInput.requestEnvelope.request;
    return request.type === 'IntentRequest' && request.intent.name === 'AMAZON.HelpIntent';
  },
  handle(handlerInput) {
    const responseBuilder = handlerInput.responseBuilder;
    return responseBuilder
      .speak(helpOutput)
      .reprompt(helpReprompt)
      .getResponse();
  },
};

const CancelStopHandler = {
  canHandle(handlerInput) {
    const request = handlerInput.requestEnvelope.request;
    return request.type === 'IntentRequest' &&
      (request.intent.name === 'AMAZON.CancelIntent' || request.intent.name === 'AMAZON.StopIntent');
  },
  handle(handlerInput) {
    const responseBuilder = handlerInput.responseBuilder;
    const speechOutput = 'Okay, talk to you later! ';

    return responseBuilder
      .speak(speechOutput)
      .withShouldEndSession(true)
      .getResponse();
  },
};

const SessionEndedHandler = {
  canHandle(handlerInput) {
    const request = handlerInput.requestEnvelope.request;
    return request.type === 'SessionEndedRequest';
  },
  handle(handlerInput) {
    console.log(`Session ended with reason: ${handlerInput.requestEnvelope.request.reason}`);
    return handlerInput.responseBuilder.getResponse();
  },
};

const ErrorHandler = {
  canHandle() {
    return true;
  },
  handle(handlerInput, error) {
    const request = handlerInput.requestEnvelope.request;

    console.log(`Original Request was: ${JSON.stringify(request, null, 2)}`);
    console.log(`Error handled: ${error}`);

    return handlerInput.responseBuilder
      .speak('Sorry, I can not understand the command.  Please say again.')
      .reprompt('Sorry, I can not understand the command.  Please say again.')
      .getResponse();
  },
};

// 2. Helper Functions ============================================================================

function getSlotValues(filledSlots) {
  const slotValues = {};

  console.log(`The filled slots: ${JSON.stringify(filledSlots)}`);
  Object.keys(filledSlots).forEach((item) => {
    const name = filledSlots[item].name;

    if (filledSlots[item] &&
      filledSlots[item].resolutions &&
      filledSlots[item].resolutions.resolutionsPerAuthority[0] &&
      filledSlots[item].resolutions.resolutionsPerAuthority[0].status &&
      filledSlots[item].resolutions.resolutionsPerAuthority[0].status.code) {
      switch (filledSlots[item].resolutions.resolutionsPerAuthority[0].status.code) {
        case 'ER_SUCCESS_MATCH':
          slotValues[name] = {
            synonym: filledSlots[item].value,
            resolved: filledSlots[item].resolutions.resolutionsPerAuthority[0].values[0].value.name,
            isValidated: true,
          };
          break;
        case 'ER_SUCCESS_NO_MATCH':
          slotValues[name] = {
            synonym: filledSlots[item].value,
            resolved: filledSlots[item].value,
            isValidated: false,
          };
          break;
        default:
          break;
      }
    }
    else {
      slotValues[name] = {
        synonym: filledSlots[item].value,
        resolved: filledSlots[item].value,
        isValidated: false,
      };
    }
  }, this);

  return slotValues;
}

function getRandomPhrase(array) {
  // the argument is an array [] of words or phrases
  const i = Math.floor(Math.random() * array.length);
  return (array[i]);
}

function dbOperations(slotsvalues) {
  var tableName = "starsinfo";
  var datetime = new Date().getTime().toString();

  dynamodb.putItem({
    "TableName": tableName,
    "Item": {
      "id": {
        "S": "2"
      },
      "toCity": {
        "S": slotsvalues.toCity.synonym
      },
      "fromCity": {
        "S": slotsvalues.fromCity.synonym
      },
      "travelDate": {
        "S": slotsvalues.travelDate.synonym
      },
      "remarks": {
        "S": slotsvalues.remarks.synonym
      },
      "timedate": {
        "N": datetime
      }
    }
  }, function(err, data) {
    if (err) {
      console.log('ERROR: Dynamo failed: ' + err);
    }
    else {
      console.log('Dynamo Success: ' + JSON.stringify(data, null, '  '));
      // context.succeed('SUCCESS');
    }
  });
}

function getTimecode(inputTime, cb) {
  var docClient = new AWS.DynamoDB.DocumentClient();
  console.log("Querying for time ID .");

  var params = {
    TableName: "timemaster",
    KeyConditionExpression: "#yr = :id",
    ExpressionAttributeNames: {
      "#yr": "preferTime"
    },
    ExpressionAttributeValues: {
      ":id": inputTime
    }
  };
  var returnValue1;
  docClient.query(params, function(err, data) {

    if (err) {
      console.error("Unable to query. Error:", JSON.stringify(err, null, 2));
    }
    else {
      console.log("Query succeeded.");
      data.Items.forEach(function(item) {
        console.log(" -", item.timeId + ": " + item.preferTime);
        returnValue1 = item.timeId;
        cb(returnValue1);
      });
    }
  });
}


function loadsampleData() {
  var docClient = new AWS.DynamoDB.DocumentClient();

  console.log("Importing movies into DynamoDB. Please wait.");

  var allTimeCode = JSON.parse(fs.readFileSync('cityListMaster.json', 'utf8'));
  console.log("hello", allTimeCode);
  allTimeCode.forEach(function(timeMasterData) {
    var params = {
      TableName: "cityListMaster",
      Item: {
        "cityname": timeMasterData.cityname

      }
    };

    docClient.put(params, function(err, data) {
      if (err) {
        console.error("Unable to add time Master Data", timeMasterData.preferTime, ". Error JSON:", JSON.stringify(err, null, 2));
      }
      else {
        console.log("PutItem succeeded:", timeMasterData.preferTime);
      }
    });
  });
}

/*function createTable() {
  var params = {
    TableName: "Movies",
    KeySchema: [
      { AttributeName: "year", KeyType: "HASH" }, //Partition key
      { AttributeName: "title", KeyType: "RANGE" } //Sort key
    ],
    AttributeDefinitions: [
      { AttributeName: "year", AttributeType: "N" },
      { AttributeName: "title", AttributeType: "S" }
    ],
    ProvisionedThroughput: {
      ReadCapacityUnits: 10,
      WriteCapacityUnits: 10
    }
  };

  dynamodb.createTable(params, function(err, data) {
    if (err) {
      console.error("Unable to create table. Error JSON:", JSON.stringify(err, null, 2));
    }
    else {
      console.log("Created table. Table description JSON:", JSON.stringify(data, null, 2));
    }
  });
}*/


const bookTicketConditional = {
  canHandle(handlerInput) {
    const request = handlerInput.requestEnvelope.request;
    return request.type === 'IntentRequest' &&
      request.intent.name === 'bookTicketCondition';
  },
  async handle(handlerInput) {
    var outputSpeech;
    var source = handlerInput.requestEnvelope.request.intent.slots.fromCity.value;
    var destination = handlerInput.requestEnvelope.request.intent.slots.toCity.value;
    var requisitionNo;
    await httpGetLastApprovedRequest('efyduat.mindeservices.com', '/stars/api/request/approved/1/', '80', 'GET', source, destination)
      .then((response) => {
        var data = (response);
        console.log("API response", data);

        var lastApprovedBookingReqNo = data[0].requestNo;
        var flightDetailList = data[0].flightDetailList;
        var lastApprovedBookingTraveldate = flightDetailList[0].dateOfJourney;

        console.log("lastApprovedBookingTraveldate", lastApprovedBookingTraveldate);

        var valueReturn = '';
        const filledSlots = handlerInput.requestEnvelope.request.intent.slots;
        const slotValues = getSlotValues(filledSlots);





        saveRequest('efyduat.mindeservices.com', '/stars/api/request', '80', 'POST', slotValues)
          .then((response) => {
            var data = (response);
            console.log("API response", data);
            var statusMsg = data.message;
            var statusCode = data.status;
            var dataValue = data.data;
            requisitionNo = dataValue.requestNo;
            // requistionNo='MIND/DOM/112153';
            console.log("requisitionNo", requisitionNo);

            if (statusMsg == "SUCCESS") {

              var data1 = `your travel request has been submitted to workflow with requisition number ${requisitionNo} . 
          Ticket from ${slotValues.fromCity.synonym} to ${slotValues.toCity.synonym} 
          on ${slotValues.travelDate.synonym}.`;
              console.log("data", data1);
            }
            outputSpeech += data1;
            console.log("outputSpeech", outputSpeech);

          })
          .catch((err) => {
            console.log(err);
          });







        outputSpeech = 'your booking submitted as per your last booking that is requested for travel date ' +
          lastApprovedBookingTraveldate + '.';
      })
      .catch((err) => {
        console.log(err);
      });

    const responseBuilder = handlerInput.responseBuilder;
    return responseBuilder
      .speak(outputSpeech)
      .reprompt(welcomeReprompt)
      .getResponse();
  },
};

const httpGetLastApprovedRequest = function(host, path, port, method, source, destination) {
  return new Promise((resolve, reject) => {
    var postheaders = {
      'winUserId': 'kshitizmohini',
      'domainName': 'MIND',
      'requestSource': 'A',
      'systemName': 'STARS-APP',
      'deviceId': '172.29.37.162',
    };
    var outputSpeech1 = "";
    var get_options = {
      host: host,
      port: port,
      path: path + source + '/' + destination + '/list',
      method: method,
      headers: postheaders,
    };
    const http = require('http');
    var post_req = http.request(get_options, function(res) {
      console.log("get_option", get_options);
      res.setEncoding('utf8');
      res.on('data', function(chunk) {
        const response = JSON.parse(chunk);
        console.log("xyz", response);
        var status = response.status;
        if (status == 200) {
          var lastApprovedBooking = response.data;
          console.log("abc", lastApprovedBooking);
          if (lastApprovedBooking) {
            outputSpeech1 = lastApprovedBooking;
          }
        }
        else {
          outputSpeech1 = response.message;
        }
        resolve(outputSpeech1);
      });
    });
    post_req.write('');
    post_req.end();
  });
};

// 4. Exports handler function and setup ===================================================
const skillBuilder = Alexa.SkillBuilders.custom();
exports.handler = skillBuilder
  .addRequestHandlers(
    bookTicketConditional,
    LaunchRequestHandler,
    InProgressPlanMyTripHandler,
    DeniedPlanMyTripHandler,
    CompletedPlanMyTripHandler,
    CancelStopHandler,
    HelpHandler,
    SessionEndedHandler,
  )
  .addErrorHandlers(ErrorHandler)
  .lambda();
