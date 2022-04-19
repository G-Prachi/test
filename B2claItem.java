package com.mind.egsp.gstn.model.gstr1;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class B2claItem {
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The Recipient state code. */

	@JsonProperty("state_cd")
	private String stateCd;
	private B2claItemDetail b2claItemDetail;

	/** The B2clInvoice Details of . */
	@JsonProperty("inv")
	private List<B2claInvoiceDetail> invoiceDetails;

	/**
	 * Gets the Recipient state code.
	 * 
	 * Sample Data: 06
	 *
	 * @return the state cd
	 */
	public String getStateCd() {
		return stateCd;
	}

	/**
	 * Sets the Recipient state code.
	 * 
	 * Sample Data: 06
	 *
	 * @param stateCd
	 *            the new state cd
	 */
	public void setStateCd(String stateCd) {
		this.stateCd = stateCd;
	}
	
	/**
	 * Gets the B2B item detail.
	 *
	 * @return the B2B item detail
	 */
	public B2claItemDetail getB2claItemDetail() {
		return b2claItemDetail;
	}


	/**
	 * Gets the B2clInvoice details.
	 *
	 * @return the invoice details
	 */
	public List<B2claInvoiceDetail> getInvoiceDetails() {
		return invoiceDetails;
	}

	/**
	 * Sets the B2clInvoice details.
	 *
	 * @param invoiceDetails
	 *            the new invoice details
	 */
	public void setInvoiceDetails(List<B2claInvoiceDetail> invoiceDetails) {
		this.invoiceDetails = invoiceDetails;
	}

}
