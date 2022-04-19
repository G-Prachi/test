package com.mind.egsp.gstn.model.gstr1;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


/**
 * The Class B2BItemDetail.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_EMPTY)
public class B2bItemDetail implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;



	/** Taxable value of Goods or Service as per invoice. */
	private BigDecimal txval;


	/** IGST Amount as per invoice. */

	private BigDecimal iamt;



	/** CGST Amount as per invoice. */
	private BigDecimal camt;



	/** SGST Amount as per invoice. */
	private BigDecimal samt;



	/** Cess Amount as per invoice. */
	private BigDecimal csamt;

	/** The Rate as per invoice. */
	private BigDecimal rt;



	/**
	 * Gets the Taxable value of Goods or Service as per invoice.
	 *
	 * @return the txval
	 */
	public BigDecimal getTxval() {
		return txval;
	}

	/**
	 * Sets the Taxable value of Goods or Service as per invoice.
	 *
	 * @param txval
	 *            the new txval02
	 */
	public void setTxval(BigDecimal txval) {
		this.txval = txval;
	}


	/**
	 * Gets the IGST Amount as per invoice.
	 *
	 * @return the iamt
	 */
	public BigDecimal getIamt() {
		return iamt;
	}

	/**
	 * Sets the IGST Amount as per invoice.
	 *
	 * @param iamt
	 *            the new iamt
	 */
	public void setIamt(BigDecimal iamt) {
		this.iamt = iamt;
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
	 * Gets the Cess Amount as per invoice.
	 *
	 * @return the csamt
	 */
	public BigDecimal getCsamt() {
		return csamt;
	}

	/**
	 * Sets the Cess Amount as per invoice.
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
		if (camt != null) {
			builder.append(",camt=");
			builder.append(camt);	
			builder.append(",");	
		}
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
		if (samt != null) {
			builder.append("samt=");
			builder.append(samt);	
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
