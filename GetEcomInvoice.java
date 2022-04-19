package com.mind.egsp.gstn.model.gstr1;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class GetEcomInvoice.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class GetEcomInvoice implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	// ToDO: Check for correct property name from api documentation

	/** The Type of invoices- Inter-state/Intra-State. */
	@JsonProperty("ecom_ty")
	private String ecomTy;

	/** The ecom invoices detail. */
	@JsonProperty("eInvoices")
	private List<EcomInvoicesDetail> ecomInvoicesDetail;

	/**
	 * Gets the Type of invoices- Inter-state/Intra-State
	 * 
	 * Field Specification: string (5)
	 * 
	 * Sample Data: Inter/Intra .
	 *
	 * @return the ecom ty
	 */
	public String getEcomTy() {
		return ecomTy;
	}

	/**
	 * Sets the Type of invoices- Inter-state/Intra-State
	 * 
	 * Field Specification: string (5)
	 * 
	 * Sample Data: Inter/Intra .
	 *
	 * @param ecomTy
	 *            the new ecom ty
	 */
	public void setEcomTy(String ecomTy) {
		this.ecomTy = ecomTy;
	}

	/**
	 * Gets the ecom invoices detail.
	 *
	 * @return the ecom invoices detail
	 */
	public List<EcomInvoicesDetail> getEcomInvoicesDetail() {
		return ecomInvoicesDetail;
	}

	/**
	 * Sets the ecom invoices detail.
	 *
	 * @param ecomInvoicesDetail
	 *            the new ecom invoices detail
	 */
	public void setEcomInvoicesDetail(List<EcomInvoicesDetail> ecomInvoicesDetail) {
		this.ecomInvoicesDetail = ecomInvoicesDetail;
	}

}
