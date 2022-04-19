/*
 * 
 */
package com.mind.egsp.gstn.model.gstr1;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class for Credit Debit Notes Registered Users.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_EMPTY)
public class CdnrInvoice implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The ctin. */
	private String ctin;
	private String ntNum;
	public String getNtNum() {
		return ntNum;
	}

	public void setNtNum(String ntNum) {
		this.ntNum = ntNum;
	}

	public String getNtDt() {
		return ntDt;
	}

	public void setNtDt(String ntDt) {
		this.ntDt = ntDt;
	}

	public Character getNtty() {
		return ntty;
	}

	public void setNtty(Character ntty) {
		this.ntty = ntty;
	}

	private String ntDt;
	private Character ntty;
	

	/** The cfs. */
	private Character cfs;

	/** The cdnr invoice details. */
	@JsonProperty("nt")
	private List<CdnrInvoiceDetail> cdnrInvoiceDetails;

	/**
	 * Gets the ctin.
	 *
	 * @return the ctin
	 */
	public String getCtin() {
		return ctin;
	}

	/**
	 * Sets the ctin.
	 *
	 * @param ctin
	 *            the new ctin
	 */
	public void setCtin(String ctin) {
		this.ctin = ctin;
	}

	/**
	 * Gets the cfs.
	 *
	 * @return the cfs
	 */
	public Character getCfs() {
		return cfs;
	}

	/**
	 * Sets the cfs.
	 *
	 * @param cfs
	 *            the new cfs
	 */
	public void setCfs(Character cfs) {
		this.cfs = cfs;
	}

	/**
	 * Gets the cdnr invoice details.
	 *
	 * @return the cdnr invoice details
	 */
	public List<CdnrInvoiceDetail> getCdnrInvoiceDetails() {
		return cdnrInvoiceDetails;
	}

	/**
	 * Sets the cdnr invoice details.
	 *
	 * @param cdnrInvoiceDetails
	 *            the new cdnr invoice details
	 */
	public void setCdnrInvoiceDetails(List<CdnrInvoiceDetail> cdnrInvoiceDetails) {
		this.cdnrInvoiceDetails = cdnrInvoiceDetails;
	}

}
