package com.mind.egsp.gstn.model.gstr1;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class EcomInvoiceItemDetails.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class EcomInvoiceItemDetails implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The Identifier if Goods or Services. */
	private String ty;

	/** The HSN or SAC of Goods or Services as per Invoice line items. */

	@JsonProperty("hsn_sc")
	private String hsnSc;

	/** The Taxable value of Goods or Service as per invoice. */
	private String txval;

	/** The Nature of supply. */
	@JsonProperty("sup_type")
	private String supType;

	/** The IGST Rate as per invoice. */
	private BigDecimal irt;

	/** The IGST Amount as per invoice. */
	private BigDecimal iamt;

	/** The CGST Rate as per invoice. */
	private BigDecimal crt;

	/** The CGST Amount as per invoice. */
	private BigDecimal camt;

	/** The SGST Rate as per invoice. */
	private BigDecimal srt;

	/** The SGST Amount as per invoice. */
	private BigDecimal samt;

	/**
	 * Gets the Identifier if Goods or Services
	 * 
	 * Field Specification: One Character (G or S)
	 * 
	 * Sample Data: G- Goods, S- services .
	 *
	 * @return the ty
	 */
	public String getTy() {
		return ty;
	}

	/**
	 * Sets the Identifier if Goods or Services
	 * 
	 * Field Specification: One Character (G or S)
	 * 
	 * Sample Data: G- Goods, S- services .
	 *
	 * @param ty
	 *            the new ty
	 */
	public void setTy(String ty) {
		this.ty = ty;
	}

	/**
	 * Gets the HSN or SAC of Goods or Services as per Invoice line items
	 * 
	 * Field Specification: Alphanumeric (Max length:10)
	 * 
	 * Sample Data: 19059020 .
	 *
	 * @return the hsn sc
	 */
	public String getHsnSc() {
		return hsnSc;
	}

	/**
	 * Sets the HSN or SAC of Goods or Services as per Invoice line items
	 * 
	 * Field Specification: Alphanumeric (Max length:10)
	 * 
	 * Sample Data: 19059020 .
	 *
	 * @param hsnSc
	 *            the new hsn sc
	 */
	public void setHsnSc(String hsnSc) {
		this.hsnSc = hsnSc;
	}

	/**
	 * Gets the Taxable value of Goods or Service as per invoice
	 * 
	 * Field Specification: Decimal(p,2)
	 * 
	 * Sample Data: 10000.00 .
	 *
	 * @return the txval
	 */
	public String getTxval() {
		return txval;
	}

	/**
	 * Sets the Taxable value of Goods or Service as per invoice
	 * 
	 * Field Specification: Decimal(p,2)
	 * 
	 * Sample Data: 10000.00 .
	 *
	 * @param txval
	 *            the new txval
	 */
	public void setTxval(String txval) {
		this.txval = txval;
	}

	/**
	 * Gets the Nature of supply
	 * 
	 * Field Specification: Table name
	 * 
	 * Sample Data: B2B/B2C .
	 *
	 * @return the sup type
	 */
	public String getSupType() {
		return supType;
	}

	/**
	 * Sets the Nature of supply
	 * 
	 * Field Specification: Table name
	 * 
	 * Sample Data: B2B/B2C .
	 *
	 * @param supType
	 *            the new sup type
	 */
	public void setSupType(String supType) {
		this.supType = supType;
	}

	/**
	 * Gets the IGST Rate as per invoice
	 * 
	 * Field Specification: Decimal(p,2)
	 * 
	 * Sample Data: 10.00
	 * 
	 * Remarks: Applicable for Intra state .
	 *
	 * @return the irt
	 */
	public BigDecimal getIrt() {
		return irt;
	}

	/**
	 * Sets the IGST Rate as per invoice
	 * 
	 * Field Specification: Decimal(p,2)
	 * 
	 * Sample Data: 10.00
	 * 
	 * Remarks: Applicable for Intra state .
	 *
	 * @param irt
	 *            the new irt
	 */
	public void setIrt(BigDecimal irt) {
		this.irt = irt;
	}

	/**
	 * Gets the IGST Amount as per invoice
	 * 
	 * Field Specification: Decimal(p,2)
	 * 
	 * Sample Data: 1000.00 Remarks: Applicable for Inter state .
	 *
	 * @return the iamt
	 */
	public BigDecimal getIamt() {
		return iamt;
	}

	/**
	 * Sets the IGST Amount as per invoice
	 * 
	 * Field Specification: Decimal(p,2)
	 * 
	 * Sample Data: 1000.00 Remarks: Applicable for Inter state .
	 *
	 * @param iamt
	 *            the new iamt
	 */
	public void setIamt(BigDecimal iamt) {
		this.iamt = iamt;
	}

	/**
	 * Gets the CGST Rate as per invoice
	 * 
	 * Field Specification: Decimal(p,2)
	 * 
	 * Sample Data: 10.00 Remarks: Applicable for Inter state .
	 *
	 * @return the crt
	 */
	public BigDecimal getCrt() {
		return crt;
	}

	/**
	 * Sets the CGST Rate as per invoice
	 * 
	 * Field Specification: Decimal(p,2)
	 * 
	 * Sample Data: 10.00 Remarks: Applicable for Inter state .
	 *
	 * @param crt
	 *            the new crt
	 */
	public void setCrt(BigDecimal crt) {
		this.crt = crt;
	}

	/**
	 * Gets the CGST Amount as per invoice
	 * 
	 * Field Specification: Decimal(p,2)
	 * 
	 * Sample Data: 1000.00 Remarks: Applicable for Inter state .
	 *
	 * @return the camt
	 */
	public BigDecimal getCamt() {
		return camt;
	}

	/**
	 * Sets the CGST Amount as per invoice
	 * 
	 * Field Specification: Decimal(p,2)
	 * 
	 * Sample Data: 1000.00 Remarks: Applicable for Inter state .
	 *
	 * @param camt
	 *            the new camt
	 */
	public void setCamt(BigDecimal camt) {
		this.camt = camt;
	}

	/**
	 * Gets the SGST Rate as per invoice
	 * 
	 * Field Specification: Decimal(p,2)
	 * 
	 * Sample Data: 10.00 Remarks: Applicable for Inter state .
	 *
	 * @return the srt
	 */
	public BigDecimal getSrt() {
		return srt;
	}

	/**
	 * Sets the SGST Rate as per invoice
	 * 
	 * Field Specification: Decimal(p,2)
	 * 
	 * Sample Data: 10.00 Remarks: Applicable for Inter state .
	 *
	 * @param srt
	 *            the new srt
	 */
	public void setSrt(BigDecimal srt) {
		this.srt = srt;
	}

	/**
	 * Gets the SGST Amount as per invoice
	 * 
	 * Field Specification: Decimal(p,2) S
	 * 
	 * ample Data: 1000.00 Remarks: Applicable for Inter state .
	 *
	 * @return the samt
	 */
	public BigDecimal getSamt() {
		return samt;
	}

	/**
	 * Sets the SGST Amount as per invoice
	 * 
	 * Field Specification: Decimal(p,2)
	 * 
	 * Sample Data: 1000.00 Remarks: Applicable for Inter state .
	 *
	 * @param samt
	 *            the new samt
	 */
	public void setSamt(BigDecimal samt) {
		this.samt = samt;
	}

}
