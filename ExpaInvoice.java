package com.mind.egsp.gstn.model.gstr1;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class for Exports Amendments.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class ExpaInvoice implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * The Export Type : With/Without payment of GST/Deemed Exports with payment
	 * of duty.
	 */
	@JsonProperty("exp_typ")
	private String exTyp;

	/** The expa invoice detail. */
	@JsonProperty("inv")
	private List<ExpaInvoiceDetail> expaInvoiceDetail;

	/**
	 * Gets the Export Type : With/Without payment of GST/Deemed Exports with
	 * payment of duty.
	 *
	 * Field Specification:String with 5 characters
	 *
	 * Sample Data:WPAY / WOPAY / DEPD
	 *
	 * @return the ex typ
	 */
	public String getExTyp() {
		return exTyp;
	}

	/**
	 * Sets the Export Type : With/Without payment of GST/Deemed Exports with
	 * payment of duty.
	 *
	 * Field Specification:String with 5 characters
	 *
	 * SampleData:WPAY / WOPAY / DEPD
	 *
	 * @param exTyp
	 *            the new ex typ
	 */
	public void setExTyp(String exTyp) {
		this.exTyp = exTyp;
	}

	/**
	 * Gets the expa invoice detail.
	 *
	 * @return the expa invoice detail
	 */
	public List<ExpaInvoiceDetail> getExpaInvoiceDetail() {
		return expaInvoiceDetail;
	}

	/**
	 * Sets the expa invoice detail.
	 *
	 * @param expaInvoiceDetail
	 *            the new expa invoice detail
	 */
	public void setExpaInvoiceDetail(List<ExpaInvoiceDetail> expaInvoiceDetail) {
		this.expaInvoiceDetail = expaInvoiceDetail;
	}

}
