package com.mind.egsp.gstn.model.gstr1;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

// TODO: Auto-generated Javadoc
/**
 * Gstr1 Summary - Class for Section Summary.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class Gstr1SectionSummary implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** Return Section. */
	@JsonProperty("sec_nm")
	private String secNm;

	/** Invoice Check sum value . */

	private String chksum;

	/** The Total Record Count. */
	@JsonProperty("ttl_rec")
	private BigDecimal ttlRec;

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

	/** Counter Party Summary. */
	@JsonProperty("cpty_sum")
	private List<Gstr1CounterPartySum> counterPartySums;

	// TODO - Check the specification
	// /** State code Summary. */
	// @JsonProperty("state code summary")
	// private List<Gstr1StateCodeSum> gstr1StateCodeSums;

	/** Total document Issued. */
	@JsonProperty("ttl_doc_issued")
	private Long ttlDocIssued;

	/** Total Document Cancelled. */
	@JsonProperty("ttl_doc_cancelled")
	private Long ttlDocCancelled;

	/** Net Document Issued. */
	@JsonProperty("net_doc_issued")
	private Long netDocIssued;

	/** Total Nil rated outward supplies. */
	@JsonProperty("ttl_nilsup_amt")
	private BigDecimal ttlNilsupAmt;

	/** Total Exempted outward supplies. */
	@JsonProperty("ttl_expt_amt")
	private BigDecimal ttlExptAmt;

	/** Total Non GST outward supplies. */
	@JsonProperty("ttl_ngsup_amt")
	private BigDecimal ttlNgsupAamt;

	/**
	 * Gets the sec nm.
	 *
	 * @return the sec nm
	 */
	public String getSecNm() {
		return secNm;
	}

	/**
	 * Sets the sec nm.
	 *
	 * @param secNm
	 *            the new sec nm
	 */
	public void setSecNm(String secNm) {
		this.secNm = secNm;
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



	/**
	 * Gets the Total Record Count.
	 *
	 * @return the Total Record Count
	 */
	public BigDecimal getTtlRec() {
		return ttlRec;
	}

	/**
	 * Sets the Total Record Count.
	 *
	 * @param ttlRec
	 *            the new Total Record Count
	 */
	public void setTtlRec(BigDecimal ttlRec) {
		this.ttlRec = ttlRec;
	}

	/**
	 * Gets the counter party sums.
	 *
	 * @return the counter party sums
	 */
	public List<Gstr1CounterPartySum> getCounterPartySums() {
		return counterPartySums;
	}

	/**
	 * Sets the counter party sums.
	 *
	 * @param counterPartySums
	 *            the new counter party sums
	 */
	public void setCounterPartySums(List<Gstr1CounterPartySum> counterPartySums) {
		this.counterPartySums = counterPartySums;
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
	 * Gets the ttl doc issued.
	 *
	 * @return the ttl doc issued
	 */
	public Long getTtlDocIssued() {
		return ttlDocIssued;
	}

	/**
	 * Sets the ttl doc issued.
	 *
	 * @param ttlDocIssued
	 *            the new ttl doc issued
	 */
	public void setTtlDocIssued(Long ttlDocIssued) {
		this.ttlDocIssued = ttlDocIssued;
	}

	/**
	 * Gets the ttl doc cancelled.
	 *
	 * @return the ttl doc cancelled
	 */
	public Long getTtlDocCancelled() {
		return ttlDocCancelled;
	}

	/**
	 * Sets the ttl doc cancelled.
	 *
	 * @param ttlDocCancelled
	 *            the new ttl doc cancelled
	 */
	public void setTtlDocCancelled(Long ttlDocCancelled) {
		this.ttlDocCancelled = ttlDocCancelled;
	}

	/**
	 * Gets the net doc issued.
	 *
	 * @return the net doc issued
	 */
	public Long getNetDocIssued() {
		return netDocIssued;
	}

	/**
	 * Sets the net doc issued.
	 *
	 * @param netDocIssued
	 *            the new net doc issued
	 */
	public void setNetDocIssued(Long netDocIssued) {
		this.netDocIssued = netDocIssued;
	}

	/**
	 * Gets the ttl nilsup amt.
	 *
	 * @return the ttl nilsup amt
	 */
	public BigDecimal getTtlNilsupAmt() {
		return ttlNilsupAmt;
	}

	/**
	 * Sets the ttl nilsup amt.
	 *
	 * @param ttlNilsupAmt
	 *            the new ttl nilsup amt
	 */
	public void setTtlNilsupAmt(BigDecimal ttlNilsupAmt) {
		this.ttlNilsupAmt = ttlNilsupAmt;
	}

	/**
	 * Gets the ttl expt amt.
	 *
	 * @return the ttl expt amt
	 */
	public BigDecimal getTtlExptAmt() {
		return ttlExptAmt;
	}

	/**
	 * Sets the ttl expt amt.
	 *
	 * @param ttlExptAmt
	 *            the new ttl expt amt
	 */
	public void setTtlExptAmt(BigDecimal ttlExptAmt) {
		this.ttlExptAmt = ttlExptAmt;
	}

	/**
	 * Gets the ttl ngsup aamt.
	 *
	 * @return the ttl ngsup aamt
	 */
	public BigDecimal getTtlNgsupAamt() {
		return ttlNgsupAamt;
	}

	/**
	 * Sets the ttl ngsup aamt.
	 *
	 * @param ttlNgsupAamt
	 *            the new ttl ngsup aamt
	 */
	public void setTtlNgsupAamt(BigDecimal ttlNgsupAamt) {
		this.ttlNgsupAamt = ttlNgsupAamt;
	}
}
