package com.mind.egsp.gstn.model.gstr1;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class Gstr1SummaryData.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class Gstr1SummaryData implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The GSTIN of the Tax Payer. */
	private String gstin;

	/** Return Period. */
	@JsonProperty("ret_period")
	private String retPeriod;

	/** The Short / long Summary. */
	@JsonProperty("summ_typ")
	private Character summTyp;

	/** Invoice Check sum value. */
	private String chksum;

	/** Section Summary. */
	@JsonProperty("sec_sum")
	private List<Gstr1SectionSummary> sectionSummaries;

	/**
	 * Gets the gstin.
	 *
	 * @return the gstin
	 */
	public String getGstin() {
		return gstin;
	}

	/**
	 * Sets the gstin.
	 *
	 * @param gstin
	 *            the new gstin
	 */
	public void setGstin(String gstin) {
		this.gstin = gstin;
	}

	/**
	 * Gets the ret period.
	 *
	 * @return the ret period
	 */
	public String getRetPeriod() {
		return retPeriod;
	}

	/**
	 * Sets the ret period.
	 *
	 * @param retPeriod
	 *            the new ret period
	 */
	public void setRetPeriod(String retPeriod) {
		this.retPeriod = retPeriod;
	}

	/**
	 * Gets the chksum.
	 *
	 * @return the chksum
	 */
	public String getChksum() {
		return chksum;
	}

	/**
	 * Sets the chksum.
	 *
	 * @param chksum
	 *            the new chksum
	 */
	public void setChksum(String chksum) {
		this.chksum = chksum;
	}

	/**
	 * Gets the section summaries.
	 *
	 * @return the section summaries
	 */
	public List<Gstr1SectionSummary> getSectionSummaries() {
		return sectionSummaries;
	}

	/**
	 * Sets the section summaries.
	 *
	 * @param sectionSummaries
	 *            the new section summaries
	 */
	public void setSectionSummaries(List<Gstr1SectionSummary> sectionSummaries) {
		this.sectionSummaries = sectionSummaries;
	}

	/**
	 * Gets the summ typ.
	 *
	 * @return the summ typ
	 */
	public Character getSummTyp() {
		return summTyp;
	}

	/**
	 * Sets the summ typ.
	 *
	 * @param summTyp
	 *            the new summ typ
	 */
	public void setSummTyp(Character summTyp) {
		this.summTyp = summTyp;
	}

}
