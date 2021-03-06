import boto3
from pyspark.sql.functions import *
from pyspark.sql import SparkSession

s3 = boto3.client('s3')
spark = SparkSession.builder.appName("MarutiDataLakeDrivingBehaviour").getOrCreate()

input_bucket = "s3://sm-csv-data/"
output_bucket = "s3://sm-parquet-data/bank_deposit/"

def process_keys(key):
    print("Started Processing Key {0}".format(key))
    try:
        df = spark.read.load(key)
        df = df.withColumn("year", year("txn_date_time")).withColumn("month", month("txn_date_time")).withColumn("day",dayofmonth("txn_date_time"))
        df.write.partitionBy('year', 'month', 'day').format("parquet").mode('append').save(output_bucket)
    except Exception as e:
        print("Error : {0} ".format(e))
    print("Completed Processing Key {0}".format(key))


def get_s3_keys(bucket,prefix):
    """Get a list of keys in an S3 bucket."""
    keys = []
    kwargs = {'Bucket': bucket, 'Prefix': prefix}
    resp = s3.list_objects_v2(**kwargs)
    for obj in resp['Contents']:
        keys.append(obj['Key'])
    return keys

prefix = "bank_deposit"
keys_list = get_s3_keys("sm-csv-data",prefix)
keys_list = [ "{0}{1}".format(input_bucket,key) for key in keys_list]
for key in keys_list:
   process_keys(key)