package com.mind.egsp.gstn.model.gstr1;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class for Exports Invoice .
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class ExpInvoice implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The ex tp. */
	@JsonProperty("exp_typ")
	private String exTp;

	/** The exp invoice detail. */
	@JsonProperty("inv")
	private List<ExpInvoiceDetail> expInvoiceDetails;

	/**
	 * Gets the ex tp.
	 *
	 * @return the ex tp
	 */
	public String getExTp() {
		return exTp;
	}

	/**
	 * Sets the ex tp.
	 *
	 * @param exTp
	 *            the new ex tp
	 */
	public void setExTp(String exTp) {
		this.exTp = exTp;
	}

	/**
	 * Gets the exp invoice detail.
	 *
	 * @return the exp invoice detail
	 */
	public List<ExpInvoiceDetail> getExpInvoiceDetails() {
		return expInvoiceDetails;
	}

	/**
	 * Sets the exp invoice detail.
	 *
	 * @param expInvoiceDetail
	 *            the new exp invoice detail
	 */
	public void setExpInvoiceDetails(List<ExpInvoiceDetail> expInvoiceDetails) {
		this.expInvoiceDetails = expInvoiceDetails;
	}

}
