package com.mind.egsp.gstn.model.gstr1;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * The Class B2clItemDetail.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_EMPTY)
public class B2clItemDetail implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The Identifier if Goods or Services. */
	@JsonIgnore
	private char ty;

	/** The HSN or SAC of Goods or Services as per Invoice line items. */
	// @JsonProperty("hsn_sc")
	@JsonIgnore
	private String hsnSc;

	/** The Taxable value of Goods or Service as per invoice. */
	private BigDecimal txval;

	/** The IGST Rate as per invoice. */
	@JsonIgnore
	private BigDecimal irt;

	/** The IGST Amount as per invoice. */
	private BigDecimal iamt;

	/** The Cess Rate as per invoice. */
	@JsonIgnore
	private BigDecimal cssrt;

	/** The Cess Amount as per invoice. */
	private BigDecimal csamt;

	/** The rate of invoice. */
	private BigDecimal rt;
	private BigDecimal camt;
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

	public char getTy() {
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

	public void setTy(char ty) {
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
	 * Field Specification: Decimal(15,2)
	 * 
	 * Sample Data: 10000.00 .
	 *
	 * @return the txval
	 */
	public BigDecimal getTxval() {
		return txval;
	}

	/**
	 * Sets the Taxable value of Goods or Service as per invoice
	 * 
	 * Field Specification: Decimal(15,2)
	 * 
	 * Sample Data: 10000.00 .
	 *
	 * @param txval
	 *            the new txval
	 */
	public void setTxval(BigDecimal txval) {
		this.txval = txval;
	}
	
	/**
	 * Gets the CGST Amount as per invoice.
	 *
	 * @return the camt
	 */
	public BigDecimal getCamt() {
		return camt;
	}

	/**
	 * Sets the CGST Amount as per invoice.
	 *
	 * @param camt
	 *            the new camt
	 */
	public void setCamt(BigDecimal camt) {
		this.camt = camt;
	}


	/**
	 * Gets the SGST Amount as per invoice.
	 *
	 * @return the samt
	 */
	public BigDecimal getSamt() {
		return samt;
	}

	/**
	 * Sets the SGST Amount as per invoice.
	 *
	 * @param samt
	 *            the new samt
	 */
	public void setSamt(BigDecimal samt) {
		this.samt = samt;
	}

	/**
	 * Gets the IGST Rate as per invoice
	 * 
	 * Field Specification: Decimal(15,2)
	 * 
	 * Sample Data: 10.00 .
	 *
	 * @return the irt
	 */
	public BigDecimal getIrt() {
		return irt;
	}

	/**
	 * Sets the IGST Rate as per invoice
	 * 
	 * Field Specification: Decimal(15,2)
	 * 
	 * Sample Data: 10.00 .
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
	 * Field Specification: Decimal(15,2)
	 * 
	 * Sample Data: 1000.00 .
	 *
	 * @return the iamt
	 */
	public BigDecimal getIamt() {
		return iamt;
	}

	/**
	 * Sets the IGST Amount as per invoice
	 * 
	 * Field Specification: Decimal(15,2)
	 * 
	 * Sample Data: 1000.00 .
	 *
	 * @param iamt
	 *            the new iamt
	 */
	public void setIamt(BigDecimal iamt) {
		this.iamt = iamt;
	}

	/**
	 * Gets the Cess Rate as per invoice
	 * 
	 * Field Specification: Decimal(15,2)
	 * 
	 * Sample Data: 10.00 .
	 *
	 * @return the cssrt
	 */
	public BigDecimal getCssrt() {
		return cssrt;
	}

	/**
	 * Sets the Cess Rate as per invoice
	 * 
	 * Field Specification: Decimal(15,2)
	 * 
	 * Sample Data: 10.00 .
	 *
	 * @param cssrt
	 *            the new cssrt
	 */
	public void setCssrt(BigDecimal cssrt) {
		this.cssrt = cssrt;
	}

	/**
	 * Gets the Cess Amount as per invoice
	 * 
	 * Field Specification: Decimal(15,2)
	 * 
	 * Sample Data: 1000.00 .
	 *
	 * @return the csamt
	 */
	public BigDecimal getCsamt() {
		return csamt;
	}

	/**
	 * Sets the Cess Amount as per invoice
	 * 
	 * Field Specification: Decimal(15,2)
	 * 
	 * Sample Data: 1000.00 .
	 *
	 * @param csamt
	 *            the new csamt
	 */
	public void setCsamt(BigDecimal csamt) {
		this.csamt = csamt;
	}

	/**
	 * Gets the rt.
	 *
	 * @return the rt
	 */
	public BigDecimal getRt() {
		return rt;
	}

	/**
	 * Sets the rt.
	 *
	 * @param rt
	 *            the new rt
	 */
	public void setRt(BigDecimal rt) {
		this.rt = rt;
	}

	
	public String toString(){
		StringBuilder builder = new StringBuilder();
		if (csamt != null) {
			builder.append("csamt=");
			builder.append(csamt);	
			builder.append(",");	
		}
		if (iamt != null) {
			builder.append("iamt=");
			builder.append(iamt);	
			builder.append(",");	
		}
		if (rt != null) {
			builder.append("rt=");
			builder.append(rt);	
			builder.append(",");	
		}
		if (txval != null) {
			builder.append("txval=");
			builder.append(txval);	
			builder.append(",");	
		}
		if(builder.length() > 1) {
			if (builder.charAt(builder.length() - 1) == ',') {
			builder.setLength(builder.length() - 1);
			}
		}
		return builder.toString(); 
		}

	

}
