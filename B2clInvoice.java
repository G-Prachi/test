package com.mind.egsp.gstn.model.gstr1;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class for B2C Large Invoices.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class B2clInvoice implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	private String ctin;

	/** The Recipient state code. */

	@JsonProperty("state_cd")
	private String stateCd;

	/** The B2clInvoice Details of . */
	@JsonProperty("inv")
	private List<B2clInvoiceDetail> invoiceDetails;

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
	 * Gets the ctin.
	 *
	 * @return the ctin
	 */
	public String getCtin() {
		return ctin;
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
	 * Gets the B2clInvoice details.
	 *
	 * @return the invoice details
	 */
	public List<B2clInvoiceDetail> getInvoiceDetails() {
		return invoiceDetails;
	}

	/**
	 * Sets the B2clInvoice details.
	 *
	 * @param invoiceDetails
	 *            the new invoice details
	 */
	public void setInvoiceDetails(List<B2clInvoiceDetail> invoiceDetails) {
		this.invoiceDetails = invoiceDetails;
	}

}
