package com.mind.egsp.gstn.model.gstr1;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class for B2C Large Amendments.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class B2claInvoice implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The Recipient state code. */
	private String state_cd;

	/** The B2clInvoice Details of . */
	@JsonProperty("inv")
	private List<B2claInvoiceDetail> invoiceDetails;

	/**
	 * Gets the state cd.
	 *
	 * Field Specification:String(Max length:2)
	 *
	 * @return the state cd
	 */
	public String getState_cd() {
		return state_cd;
	}

	/**
	 * Sets the state cd.
	 *
	 * Field Specification:String(Max length:2)
	 *
	 * @param state_cd
	 *            the new state cd
	 */
	public void setState_cd(String state_cd) {
		this.state_cd = state_cd;
	}

	/**
	 * Gets the invoice details.
	 *
	 * @return the invoice details
	 */
	public List<B2claInvoiceDetail> getInvoiceDetails() {
		return invoiceDetails;
	}

	/**
	 * Sets the invoice details.
	 *
	 * @param invoiceDetails
	 *            the new invoice details
	 */
	public void setInvoiceDetails(List<B2claInvoiceDetail> invoiceDetails) {
		this.invoiceDetails = invoiceDetails;
	}

}
