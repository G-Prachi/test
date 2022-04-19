package com.mind.egsp.gstn.model.gstr1;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mind.egsp.gstn.model.all.ATErrorReport;

/**
 * The Class ATAErrorReport.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class ATAErrorReport extends ATErrorReport implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * The original supplier .
	 */
	private String ogstin;

	/**
	 * The Original Name of Recepient .
	 */
	private String orname;

	/**
	 * The Original  Document Number .
	 */
	private String odnum;

	/**
	 * The Original  Document Date .
	 */
	private String otdt;

	/**
	 * Gets the original supplier Field Specification: Alphanumeric with 15
	 * characters Sample Data: ABC1252451234 .
	 *
	 * @return the ogstin
	 */
	public String getOgstin() {
		return ogstin;
	}

	/**
	 * Sets the original supplier Field Specification: Alphanumeric with 15
	 * characters Sample Data: ABC1252451234 .
	 *
	 * @param ogstin
	 *            the new ogstin
	 */
	public void setOgstin(String ogstin) {
		this.ogstin = ogstin;
	}

	/**
	 * Gets the Original Name of Recepient Field Specification: string(Max
	 * length :30) Sample Data: MTR .
	 *
	 * @return the orname
	 */
	public String getOrname() {
		return orname;
	}

	/**
	 * Sets the Original Name of Recepient Field Specification: string(Max
	 * length :30) Sample Data: MTR .
	 *
	 * @param orname
	 *            the new orname
	 */
	public void setOrname(String orname) {
		this.orname = orname;
	}

	/**
	 * Gets the Original  Document Number Field Specification: Alphanumeric (Max
	 * length:10) Sample Data: A100052 .
	 *
	 * @return the odnum
	 */
	public String getOdnum() {
		return odnum;
	}

	/**
	 * Sets the Original  Document Number Field Specification: Alphanumeric (Max
	 * length:10) Sample Data: A100052 .
	 *
	 * @param odnum
	 *            the new odnum
	 */
	public void setOdnum(String odnum) {
		this.odnum = odnum;
	}

	/**
	 * Gets the Original  Document Date Field Specification: string (DD-MM-YYYY)
	 * Sample Data: 20-05-2016 .
	 *
	 * @return the otdt
	 */
	public String getOtdt() {
		return otdt;
	}

	/**
	 * Sets the Original  Document Date Field Specification: string (DD-MM-YYYY)
	 * Sample Data: 20-05-2016 .
	 *
	 * @param otdt
	 *            the new otdt
	 */
	public void setOtdt(String otdt) {
		this.otdt = otdt;
	}

}
