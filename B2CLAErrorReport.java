package com.mind.egsp.gstn.model.gstr1;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mind.egsp.gstn.model.all.B2CLErrorReport;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class B2CLAErrorReport extends B2CLErrorReport implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * The Old Invoice Number .
	 */
	private String onum;

	/**
	 * The Old Invoice date .
	 */
	private String odt;

	/**
	 * Gets the Old Invoice Number Field Specification: Alphanumeric (Max
	 * length:50) Sample Data: S008401 .
	 *
	 * @return the onum
	 */
	public String getOnum() {
		return onum;
	}

	/**
	 * Sets the Old Invoice Number Field Specification: Alphanumeric (Max
	 * length:50) Sample Data: S008401 .
	 *
	 * @param onum
	 *            the new onum
	 */
	public void setOnum(String onum) {
		this.onum = onum;
	}

	/**
	 * Gets the Old Invoice date Field Specification: Date Sample Data:
	 * 03-02-2016 .
	 *
	 * @return the odt
	 */
	public String getOdt() {
		return odt;
	}

	/**
	 * Sets the Old Invoice date Field Specification: Date Sample Data:
	 * 03-02-2016 .
	 *
	 * @param odt
	 *            the new odt
	 */
	public void setOdt(String odt) {
		this.odt = odt;
	}

}
