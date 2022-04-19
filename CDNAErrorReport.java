package com.mind.egsp.gstn.model.gstr1;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mind.egsp.gstn.model.all.CDNErrorReport;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class CDNAErrorReport.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class CDNAErrorReport extends CDNErrorReport implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * The Original Debit/Credit note number .
	 */
	@JsonProperty("ont_num")
	private int ontNum;

	/**
	 * The Original Debit/Credit date .
	 */
	@JsonProperty("ont_dt")
	private String ontDt;

	/**
	 * Gets the Original Debit/Credit note number Field Specification: Numeric
	 * (Max length:50) Sample Data: 863984 .
	 *
	 * @return the ont num
	 */
	public int getOntNum() {
		return ontNum;
	}

	/**
	 * Sets the Original Debit/Credit note number Field Specification: Numeric
	 * (Max length:50) Sample Data: 863984 .
	 *
	 * @param ontNum
	 *            the new ont num
	 */
	public void setOntNum(int ontNum) {
		this.ontNum = ontNum;
	}

	/**
	 * Gets the Original Debit/Credit date Field Specification: string
	 * (DD-MM-YYYY) Sample Data: 42526 .
	 *
	 * @return the ont dt
	 */
	public String getOntDt() {
		return ontDt;
	}

	/**
	 * Sets the Original Debit/Credit date Field Specification: string
	 * (DD-MM-YYYY) Sample Data: 42526 .
	 *
	 * @param ontDt
	 *            the new ont dt
	 */
	public void setOntDt(String ontDt) {
		this.ontDt = ontDt;
	}

}
