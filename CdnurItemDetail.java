package com.mind.egsp.gstn.model.gstr1;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * The Class CdnurItemDetail.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class CdnurItemDetail implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The rt. */
	private BigDecimal rt;

	/** The txval. */
	private BigDecimal txval;

	/** The iamt. */
	private BigDecimal iamt;

	/** The camt. */
	private BigDecimal camt;

	/** The samt. */
	private BigDecimal samt;

	/** The csamt. */
	private BigDecimal csamt;

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
	 * Gets the camt.
	 *
	 * @return the camt
	 */
	public BigDecimal getCamt() {
		return camt;
	}

	/**
	 * Sets the camt.
	 *
	 * @param camt
	 *            the new camt
	 */
	public void setCamt(BigDecimal camt) {
		this.camt = camt;
	}

	/**
	 * Gets the samt.
	 *
	 * @return the samt
	 */
	public BigDecimal getSamt() {
		return samt;
	}

	/**
	 * Sets the samt.
	 *
	 * @param samt
	 *            the new samt
	 */
	public void setSamt(BigDecimal samt) {
		this.samt = samt;
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

}
