package com.mind.egsp.gstn.model.gstr1;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class for B2B Amendments.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_EMPTY)
public class B2baInvoice implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** GSTIN/UID of the Receiver taxpayer/UN, Govt Bodies. */
	private String ctin;

	/** Invoice Details. */
	@JsonProperty("inv")
	private List<B2baInvoiceDetail> b2baInvoiceDetails;

	/**
	 * Gets the gSTIN/UID of the Receiver taxpayer/UN, Govt Bodies.
	 *
	 * Field Specification:Alphanumeric with 15 characters
	 * 
	 * Sample Data:06ADECO9084R5Z4
	 *
	 * @return the gSTIN/UID of the Receiver taxpayer/UN, Govt Bodies
	 */
	public String getCtin() {
		return ctin;
	}

	/**
	 * Sets the gSTIN/UID of the Receiver taxpayer/UN, Govt Bodies.
	 *
	 * Field Specification:Alphanumeric with 15 characters
	 * 
	 * Sample Data:06ADECO9084R5Z4
	 *
	 * @param ctin
	 *            the new gSTIN/UID of the Receiver taxpayer/UN, Govt Bodies
	 */
	public void setCtin(String ctin) {
		this.ctin = ctin;
	}

	/**
	 * Gets the B2BA invoice details.
	 *
	 * @return the B2BA invoice details
	 */
	public List<B2baInvoiceDetail> getB2baInvoiceDetails() {
		return b2baInvoiceDetails;
	}

	/**
	 * Sets the B2BA invoice details.
	 *
	 * @param b2baInvoiceDetails
	 *            the new B2BA invoice details
	 */
	public void setB2baInvoiceDetails(List<B2baInvoiceDetail> b2baInvoiceDetails) {
		this.b2baInvoiceDetails = b2baInvoiceDetails;
	}
	
}
