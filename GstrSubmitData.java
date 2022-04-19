package com.mind.egsp.gstn.model.gstr1;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Gstr1 Submit Data.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GstrSubmitData implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The GSTIN of the Tax Payer. */
	private String gstin;

	/** Financial period. */
	@JsonProperty("ret_period")
	private String retPeriod;

	/**
	 * Gets the GSTIN of the taxpayer
	 * 
	 * Field Specification: Alphanumeric with 15 characters
	 * 
	 * Mandatory: Y
	 * 
	 * Sample Data: 29HJKPS9689A8Z4
	 * 
	 * Return.
	 *
	 * @return the gstin
	 */
	public String getGstin() {
		return gstin;
	}

	/**
	 * Sets the GSTIN of the taxpayer
	 * 
	 * Field Specification: Alphanumeric with 15 characters
	 * 
	 * Mandatory: Y
	 * 
	 * Sample Data: 29HJKPS9689A8Z4 Return.
	 *
	 * @param gstin
	 *            the new gstin
	 */
	public void setGstin(String gstin) {
		this.gstin = gstin;
	}

	/**
	 * Gets the Return Period
	 * 
	 * Field Specification: MMYYYY
	 * 
	 * Mandatory: Y
	 * 
	 * Sample Data: 072016 .
	 *
	 * @return the ret period
	 */
	public String getRetPeriod() {
		return retPeriod;
	}

	/**
	 * Sets the Return Period
	 * 
	 * Field Specification: MMYYYY
	 * 
	 * Mandatory: Y
	 * 
	 * Sample Data: 072016 .
	 *
	 * @param retPeriod
	 *            the new ret period
	 */
	public void setRetPeriod(String retPeriod) {
		this.retPeriod = retPeriod;
	}
}
