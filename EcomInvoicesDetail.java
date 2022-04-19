package com.mind.egsp.gstn.model.gstr1;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * The Class EcomInvoicesDetail.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class EcomInvoicesDetail implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The tax payer action. */
	private String flag;

	/** The Invoice Check sum value. */
	private String chksum;

	/** The Tax Period. */
	private String txprd;

	/** The Merchant ID issued by e-commerce portal. */
	private String mid;

	/** The Gross Value of supplies Field. */
	private BigDecimal grsval;

	/** The GSTIN Field. */
	private String ctin;

	/** The ecom invoice item details. */
	private EcomInvoiceItemDetails ecomInvoiceItemDetails;

	/**
	 * Gets the tax payer action
	 * 
	 * Field Specification: One Character(N/M/D)
	 * 
	 * Sample Data: N-New, M-Modify, D-Delete .
	 *
	 * @return the flag
	 */
	public String getFlag() {
		return flag;
	}

	/**
	 * Sets the tax payer action
	 * 
	 * Field Specification: One Character(N/M/D)
	 * 
	 * Sample Data: N-New, M-Modify, D-Delete .
	 *
	 * @param flag
	 *            the new flag
	 */
	public void setFlag(String flag) {
		this.flag = flag;
	}

	/**
	 * Gets the Invoice Check sum value
	 * 
	 * Field Specification: string(Max length:15)
	 * 
	 * Sample Data: AflJufPlFStqKBZ (Not present when flag- N) .
	 *
	 * @return the chksum
	 */
	public String getChksum() {
		return chksum;
	}

	/**
	 * Sets the Invoice Check sum value
	 * 
	 * Field Specification: string(Max length:15)
	 * 
	 * Sample Data: AflJufPlFStqKBZ (Not present when flag- N) .
	 *
	 * @param chksum
	 *            the new chksum
	 */
	public void setChksum(String chksum) {
		this.chksum = chksum;
	}

	/**
	 * Gets the Tax Period
	 * 
	 * Field Specification: string (YYYY-MM)
	 * 
	 * Sample Data: 2015-16 .
	 *
	 * @return the txprd
	 */
	public String getTxprd() {
		return txprd;
	}

	/**
	 * Sets the Tax Period
	 * 
	 * Field Specification: string (YYYY-MM)
	 * 
	 * Sample Data: 2015-16 .
	 *
	 * @param txprd
	 *            the new txprd
	 */
	public void setTxprd(String txprd) {
		this.txprd = txprd;
	}

	/**
	 * Gets the Merchant ID issued by e-commerce portal
	 * 
	 * Field Specification: string(Max length:20)
	 * 
	 * Sample Data: M13332 .
	 *
	 * @return the mid
	 */
	public String getMid() {
		return mid;
	}

	/**
	 * Sets the Merchant ID issued by e-commerce portal
	 * 
	 * Field Specification: string(Max length:20)
	 * 
	 * Sample Data: M13332 .
	 *
	 * @param mid
	 *            the new mid
	 */
	public void setMid(String mid) {
		this.mid = mid;
	}

	/**
	 * Gets the Gross Value of supplies
	 * 
	 * Field Specification: Decimal(p,2)
	 * 
	 * Sample Data: 1000.00 .
	 *
	 * @return the grsval
	 */
	public BigDecimal getGrsval() {
		return grsval;
	}

	/**
	 * Sets the Gross Value of supplies
	 * 
	 * Field Specification: Decimal(p,2)
	 * 
	 * Sample Data: 1000.00 .
	 *
	 * @param grsval
	 *            the new grsval
	 */
	public void setGrsval(BigDecimal grsval) {
		this.grsval = grsval;
	}

	/**
	 * Gets the GSTIN
	 * 
	 * Field Specification: Alphanumeric with 15 characters
	 * 
	 * Sample Data: 06ADECO9084R5Z4 .
	 *
	 * @return the ctin
	 */
	public String getCtin() {
		return ctin;
	}

	/**
	 * Sets the GSTIN
	 * 
	 * Field Specification: Alphanumeric with 15 characters
	 * 
	 * Sample Data: 06ADECO9084R5Z4 .
	 *
	 * @param ctin
	 *            the new ctin
	 */
	public void setCtin(String ctin) {
		this.ctin = ctin;
	}

	/**
	 * Gets the ecom invoice item details.
	 *
	 * @return the ecom invoice item details
	 */
	public EcomInvoiceItemDetails getEcomInvoiceItemDetails() {
		return ecomInvoiceItemDetails;
	}

	/**
	 * Sets the ecom invoice item details.
	 *
	 * @param ecomInvoiceItemDetails
	 *            the new ecom invoice item details
	 */
	public void setEcomInvoiceItemDetails(EcomInvoiceItemDetails ecomInvoiceItemDetails) {
		this.ecomInvoiceItemDetails = ecomInvoiceItemDetails;
	}

}
