package com.mind.egsp.gstn.model.gstr1;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class ErrorDetails.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class ErrorDetails implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * The Return Table Section .
	 */
	private String sec;

	/** The error report structure. */
	// TODO: Check for correct property name from api documentation
	@JsonProperty("Error Report Structure")
	private ErrorReportStructure errorReportStructure;

	/**
	 * Gets the Return Table Section Field Specification: String Sample Data:
	 * {b2b/b2ba/b2cl/…} .
	 *
	 * @return the sec
	 */
	public String getSec() {
		return sec;
	}

	/**
	 * Sets the Return Table Section Field Specification: String Sample Data:
	 * {b2b/b2ba/b2cl/…} .
	 *
	 * @param sec
	 *            the new sec
	 */
	public void setSec(String sec) {
		this.sec = sec;
	}

	/**
	 * Gets the error report structure.
	 *
	 * @return the error report structure
	 */
	public ErrorReportStructure getErrorReportStructure() {
		return errorReportStructure;
	}

	/**
	 * Sets the error report structure.
	 *
	 * @param errorReportStructure
	 *            the new error report structure
	 */
	public void setErrorReportStructure(ErrorReportStructure errorReportStructure) {
		this.errorReportStructure = errorReportStructure;
	}

}
