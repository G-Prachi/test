package com.mind.egsp.gstn.model.gstr1;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class B2CSErrorReport extends B2csInvoice implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * The Error_cd .
	 */
	@JsonProperty("error_cd")
	private String errorCd;

	/**
	 * The Error Message .
	 */
	@JsonProperty("error_msg")
	private String errorMsg;

	/**
	 * Gets the Error_cd Field Specification: Alphanumeric (Max length:10) Sample
	 * Data: RET100 .
	 *
	 * @return the error cd
	 */
	public String getErrorCd() {
		return errorCd;
	}

	/**
	 * Sets the Error_cd Field Specification: Alphanumeric (Max length:10) Sample
	 * Data: RET100 .
	 *
	 * @param errorCd
	 *            the new error cd
	 */
	public void setErrorCd(String errorCd) {
		this.errorCd = errorCd;
	}

	/**
	 * Gets the Error Message Field Specification: Alphanumeric (Max length:100)
	 * Sample Data: Duplicate Invoice .
	 *
	 * @return the error msg
	 */
	public String getErrorMsg() {
		return errorMsg;
	}

	/**
	 * Sets the Error Message Field Specification: Alphanumeric (Max length:100)
	 * Sample Data: Duplicate Invoice .
	 *
	 * @param errorMsg
	 *            the new error msg
	 */
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

}
