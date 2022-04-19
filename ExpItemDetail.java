package com.mind.egsp.gstn.model.gstr1;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


// TODO: Auto-generated Javadoc
/**
 * The Class ExpItemDetail.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_EMPTY)
public class ExpItemDetail implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The Taxable value of Goods or Service as per invoice. */
	private BigDecimal txval;

	/** The rate of invoice. */
	private BigDecimal rt;

	/** The IGST Amount as per invoice. */
	private BigDecimal iamt;

	/** The csamt. */
	private BigDecimal csamt;

	/**
	 * Gets the txval.
	 *
	 * @return the txval
	 */
	public BigDecimal getTxval() {
		return txval;
	}

	/**
	 * Sets the txval.
	 *
	 * @param txval
	 *            the new txval
	 */
	public void setTxval(BigDecimal txval) {
		this.txval = txval;
	}



	/**
	 * Gets the iamt.
	 *
	 * @return the iamt
	 */
	public BigDecimal getIamt() {
		return iamt;
	}

	/**
	 * Sets the iamt.
	 *
	 * @param iamt
	 *            the new iamt
	 */
	public void setIamt(BigDecimal iamt) {
		this.iamt = iamt;
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

	/**
	 * Gets the csamt.
	 *
	 * @return the csamt
	 */
	public BigDecimal getCsamt() {
		return csamt;
	}

	/**
	 * Sets the csamt.
	 *
	 * @param csamt
	 *            the new csamt
	 */
	public void setCsamt(BigDecimal csamt) {
		this.csamt = csamt;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString(){
		StringBuilder builder = new StringBuilder();
		if (iamt != null) {
			builder.append("iamt=");
			builder.append(iamt);	
			builder.append(",");	
		}
		if (csamt != null) {
			builder.append("csamt=");
			builder.append(csamt);
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
