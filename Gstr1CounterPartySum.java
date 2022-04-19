package com.mind.egsp.gstn.model.gstr1;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GSTR1 Summary - The class for Counter Party Summary.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class Gstr1CounterPartySum implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Supplier TIN for B2B & CDN/ISD TIN for ISD/deductor TIN for TDS/
	 * Ecommerce Portal TIN for TCS/.
	 */
	private String ctin;

	/** The Invoice Check sum value. */
	private String chksum;

	/** The Total Record Count. */
	private Long ttl_rec;

	/** Total records value. */
	@JsonProperty("ttl_val")
	private BigDecimal ttlVal;

	/** Total IGST. */
	@JsonProperty("ttl_igst")
	private BigDecimal ttlIgst;

	/** Total CGST. */
	@JsonProperty("ttl_cgst")
	private BigDecimal ttlCgst;

	/** Total SGST. */
	@JsonProperty("ttl_sgst")
	private BigDecimal ttlSgst;

	/** Total Cess. */
	@JsonProperty("ttl_cess")
	private BigDecimal ttlCess;

	/** Total taxable value of records. */
	@JsonProperty("ttl_tax")
	private BigDecimal ttlTax;

	/**
	 * Gets the ctin.
	 *
	 * @return the ctin
	 */
	public String getCtin() {
		return ctin;
	}

	/**
	 * Sets the ctin.
	 *
	 * @param ctin
	 *            the new ctin
	 */
	public void setCtin(String ctin) {
		this.ctin = ctin;
	}

	/**
	 * Gets the chksum.
	 *
	 * @return the chksum
	 */
	public String getChksum() {
		return chksum;
	}

	/**
	 * Sets the chksum.
	 *
	 * @param chksum
	 *            the new chksum
	 */
	public void setChksum(String chksum) {
		this.chksum = chksum;
	}

	/**
	 * Gets the ttl rec.
	 *
	 * @return the ttl rec
	 */
	public Long getTtl_rec() {
		return ttl_rec;
	}

	/**
	 * Sets the ttl rec.
	 *
	 * @param ttl_rec
	 *            the new ttl rec
	 */
	public void setTtl_rec(Long ttl_rec) {
		this.ttl_rec = ttl_rec;
	}

	/**
	 * Gets the ttl val.
	 *
	 * @return the ttl val
	 */
	public BigDecimal getTtlVal() {
		return ttlVal;
	}

	/**
	 * Sets the ttl val.
	 *
	 * @param ttlVal
	 *            the new ttl val
	 */
	public void setTtlVal(BigDecimal ttlVal) {
		this.ttlVal = ttlVal;
	}

	/**
	 * Gets the ttl igst.
	 *
	 * @return the ttl igst
	 */
	public BigDecimal getTtlIgst() {
		return ttlIgst;
	}

	/**
	 * Sets the ttl igst.
	 *
	 * @param ttlIgst
	 *            the new ttl igst
	 */
	public void setTtlIgst(BigDecimal ttlIgst) {
		this.ttlIgst = ttlIgst;
	}

	/**
	 * Gets the ttl cgst.
	 *
	 * @return the ttl cgst
	 */
	public BigDecimal getTtlCgst() {
		return ttlCgst;
	}

	/**
	 * Sets the ttl cgst.
	 *
	 * @param ttlCgst
	 *            the new ttl cgst
	 */
	public void setTtlCgst(BigDecimal ttlCgst) {
		this.ttlCgst = ttlCgst;
	}

	/**
	 * Gets the ttl sgst.
	 *
	 * @return the ttl sgst
	 */
	public BigDecimal getTtlSgst() {
		return ttlSgst;
	}

	/**
	 * Sets the ttl sgst.
	 *
	 * @param ttlSgst
	 *            the new ttl sgst
	 */
	public void setTtlSgst(BigDecimal ttlSgst) {
		this.ttlSgst = ttlSgst;
	}

	/**
	 * Gets the ttl cess.
	 *
	 * @return the ttl cess
	 */
	public BigDecimal getTtlCess() {
		return ttlCess;
	}

	/**
	 * Sets the ttl cess.
	 *
	 * @param ttlCess
	 *            the new ttl cess
	 */
	public void setTtlCess(BigDecimal ttlCess) {
		this.ttlCess = ttlCess;
	}

	/**
	 * Gets the ttl tax.
	 *
	 * @return the ttl tax
	 */
	public BigDecimal getTtlTax() {
		return ttlTax;
	}

	/**
	 * Sets the ttl tax.
	 *
	 * @param ttlTax
	 *            the new ttl tax
	 */
	public void setTtlTax(BigDecimal ttlTax) {
		this.ttlTax = ttlTax;
	}

}
