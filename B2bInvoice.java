package com.mind.egsp.gstn.model.gstr1;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class for B2B Invoice.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class B2bInvoice implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** GSTIN/UID of the Receiver taxpayer/UN, Govt Bodies. */
	private String ctin;

	/** GSTR2 filing status of counter party. */
	private String cfs;

	/** Invoice Details. */
	@JsonProperty("inv")
	private List<B2bInvoiceDetail> b2bInvoiceDetails;

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
	//public void setCtin(String ctin) {
//		this.ctin = ctin;
//	}

	/**
	 * Gets the B2B invoice details.
	 *
	 * @return the B2B invoice details
	 */
	public List<B2bInvoiceDetail> getB2bInvoiceDetails() {
		return b2bInvoiceDetails;
	}

	/**
	 * Sets the B2B invoice details.
	 *
	 * @param b2bInvoiceDetails
	 *            the new B2B invoice details
	 */
	public void setB2bInvoiceDetails(List<B2bInvoiceDetail> b2bInvoiceDetails) {
		this.b2bInvoiceDetails = b2bInvoiceDetails;
	}

	/**
	 * Gets the GSTR2 filing status of counter party.
	 *
	 * @return the cfs
	 */
	public String getCfs() {
		return cfs;
	}

	/**
	 * Sets the GSTR2 filing status of counter party.
	 *
	 * @param cfs
	 *            the new cfs
	 */
	public void setCfs(String cfs) {
		this.cfs = cfs;
	}

	@Override
	public String toString() {
		return "B2bInvoice [ctin=" + ctin + ", cfs=" + cfs + ", b2bInvoiceDetails=" + b2bInvoiceDetails + "]";
	}

	
}
