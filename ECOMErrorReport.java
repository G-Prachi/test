package com.mind.egsp.gstn.model.gstr1;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class ECOMErrorReport.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class ECOMErrorReport extends ErrorReport implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * The Type of invoices- Inter-state/Intra-State .
	 */
	@JsonProperty("ecom_ty")
	private String ecomTy;

	/**
	 * Gets the Type of invoices- Inter-state/Intra-State Field Specification:
	 * string (5) Sample Data: Inter/Intra .
	 *
	 * @return the ecom ty
	 */
	public String getEcomTy() {
		return ecomTy;
	}

	/**
	 * Sets the Type of invoices- Inter-state/Intra-State Field Specification:
	 * string (5) Sample Data: Inter/Intra .
	 *
	 * @param ecomTy
	 *            the new ecom ty
	 */
	public void setEcomTy(String ecomTy) {
		this.ecomTy = ecomTy;
	}

}
