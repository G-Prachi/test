package com.mind.egsp.gstn.model.gstr1;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class CdnrInvoiceDetail.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_EMPTY)
public class CdnrInvoiceDetail implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The Invoice Status. */
	private Character flag;

	/** The Counter Party Flag. */
	private Character cflag;

	/** The Original Period. */
	private String opd;

	/** The Uploaded By. */
	private Character updby;

	/** The Invoice Check sum value . */
	private String chksum;

	/** The Credit/debit note type. */
	private Character ntty;

	/** The Credit/debit note number. */
	@JsonProperty("nt_num")
	private String ntNum;

	/** The Reason Code for issuing Debit/Credit Note. */
	@JsonIgnore
	private String rsn;

	/** The Original invoice number. */
	private String inum;

	/** The Invoice date. */
	private String idt;

	/** The Reverse Charge. */
	@JsonIgnore
	private Character rchrg;

	/** The Differential Value for which Dr./ Cr. note is issued. */
	private BigDecimal val;

	/** The IGST Rate as per invoice. */
	@JsonIgnore
	private BigDecimal irt;

	/** The IGST Amount as per invoice. */
	@JsonIgnore
	private BigDecimal iamt;

	/** The CGST Rate as per invoice. */
	@JsonIgnore
	private BigDecimal crt;

	/** The CGST Amount as per invoice. */
	@JsonIgnore
	private BigDecimal camt;

	/** The SGST Rate as per invoice. */
	@JsonIgnore
	private BigDecimal srt;

	/** The SGST Amount as per invoice. */
	@JsonIgnore
	private BigDecimal samt;

	/** The Credit/Debit Note date. */
	@JsonProperty("nt_dt")
	private String ntDt;

	/** The Cess Rate as per invoice. */
	@JsonIgnore
	private BigDecimal csrt;

	/** The Cess Amount as per invoice. */
	@JsonIgnore
	private BigDecimal csamt;

	/** The Ecom Operator Gstin. */
	@JsonIgnore
	private String etin;

	/** The pos. */
	private String pos;

	/** The Pre GST Regime Dr./ Cr. Notes. */
	@JsonProperty("p_gst")
	private Character pGst;

	@JsonProperty("diff_percent")
	private BigDecimal diffPercent;

	/** The cdnr items. */
	@JsonProperty("itms")
	private List<CDNRItem> cdnrItems;

	/**
	 * Gets the Invoice Status.
	 *
	 * @return the flag
	 */
	public Character getFlag() {
		return flag;
	}

	/**
	 * Sets the Invoice Status.
	 *
	 * @param flag
	 *            the new flag
	 */
	public void setFlag(Character flag) {
		this.flag = flag;
	}

	/**
	 * Gets the Uploaded By.
	 *
	 * @return the updby
	 */
	public Character getUpdby() {
		return updby;
	}

	/**
	 * Sets the Uploaded By.
	 *
	 * @param updby
	 *            the new updby
	 */
	public void setUpdby(Character updby) {
		this.updby = updby;
	}

	/**
	 * Gets the Invoice Check sum value .
	 *
	 * @return the chksum
	 */
	public String getChksum() {
		return chksum;
	}

	/**
	 * Sets the Invoice Check sum value .
	 *
	 * @param chksum
	 *            the new chksum
	 */
	public void setChksum(String chksum) {
		this.chksum = chksum;
	}

	/**
	 * Gets the Credit/debit note type.
	 *
	 * @return the ntty
	 */
	public Character getNtty() {
		return ntty;
	}

	/**
	 * Sets the Credit/debit note type.
	 *
	 * @param ntty
	 *            the new ntty
	 */
	public void setNtty(Character ntty) {
		this.ntty = ntty;
	}

	/**
	 * Gets the Credit/debit note number.
	 *
	 * @return the nt num
	 */
	public String getNtNum() {
		return ntNum;
	}

	/**
	 * Sets the Credit/debit note number.
	 *
	 * @param ntNum
	 *            the new nt num
	 */
	public void setNtNum(String ntNum) {
		this.ntNum = ntNum;
	}

	/**
	 * Gets the Reason Code for issuing Debit/Credit Note.
	 *
	 * @return the rsn
	 */
	public String getRsn() {
		return rsn;
	}

	/**
	 * Sets the Reason Code for issuing Debit/Credit Note.
	 *
	 * @param rsn
	 *            the new rsn
	 */
	public void setRsn(String rsn) {
		this.rsn = rsn;
	}

	/**
	 * Gets the Original invoice number.
	 *
	 * @return the inum
	 */
	public String getInum() {
		return inum;
	}

	/**
	 * Sets the Original invoice number.
	 *
	 * @param inum
	 *            the new inum
	 */
	public void setInum(String inum) {
		this.inum = inum;
	}

	/**
	 * Gets the Invoice date.
	 *
	 * @return the idt
	 */
	public String getIdt() {
		return idt;
	}

	/**
	 * Sets the Invoice date.
	 *
	 * @param idt
	 *            the new idt
	 */
	public void setIdt(String idt) {
		this.idt = idt;
	}

	/**
	 * Gets the Reverse Charge.
	 *
	 * @return the rchrg
	 */
	public Character getRchrg() {
		return rchrg;
	}

	/**
	 * Sets the Reverse Charge.
	 *
	 * @param rchrg
	 *            the new rchrg
	 */
	public void setRchrg(Character rchrg) {
		this.rchrg = rchrg;
	}

	/**
	 * Gets the Differential Value for which Dr./ Cr. note is issued.
	 *
	 * @return the val
	 */
	public BigDecimal getVal() {
		return val;
	}

	/**
	 * Sets the Differential Value for which Dr./ Cr. note is issued.
	 *
	 * @param val
	 *            the new val
	 */
	public void setVal(BigDecimal val) {
		this.val = val;
	}

	/**
	 * Gets the IGST Rate as per invoice.
	 *
	 * @return the irt
	 */
	public BigDecimal getIrt() {
		return irt;
	}

	/**
	 * Sets the IGST Rate as per invoice.
	 *
	 * @param irt
	 *            the new irt
	 */
	public void setIrt(BigDecimal irt) {
		this.irt = irt;
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
	 * Gets the CGST Rate as per invoice.
	 *
	 * @return the crt
	 */
	public BigDecimal getCrt() {
		return crt;
	}

	/**
	 * Sets the CGST Rate as per invoice.
	 *
	 * @param crt
	 *            the new crt
	 */
	public void setCrt(BigDecimal crt) {
		this.crt = crt;
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
	 * Gets the SGST Rate as per invoice.
	 *
	 * @return the srt
	 */
	public BigDecimal getSrt() {
		return srt;
	}

	/**
	 * Sets the SGST Rate as per invoice.
	 *
	 * @param srt
	 *            the new srt
	 */
	public void setSrt(BigDecimal srt) {
		this.srt = srt;
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
	 * Gets the Credit/Debit Note date.
	 *
	 * @return the nt dt
	 */
	public String getNtDt() {
		return ntDt;
	}

	/**
	 * Sets the Credit/Debit Note date.
	 *
	 * @param ntDt
	 *            the new nt dt
	 */
	public void setNtDt(String ntDt) {
		this.ntDt = ntDt;
	}

	/**
	 * Gets the Cess Rate as per invoice.
	 *
	 * @return the csrt
	 */
	public BigDecimal getCsrt() {
		return csrt;
	}

	/**
	 * Sets the Cess Rate as per invoice.
	 *
	 * @param csrt
	 *            the new csrt
	 */
	public void setCsrt(BigDecimal csrt) {
		this.csrt = csrt;
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
	 * Gets the Ecom Operator Gstin.
	 *
	 * @return the etin
	 */
	public String getEtin() {
		return etin;
	}

	/**
	 * Sets the Ecom Operator Gstin.
	 *
	 * @param etin
	 *            the new etin
	 */
	public void setEtin(String etin) {
		this.etin = etin;
	}

	/**
	 * Gets the cflag.
	 *
	 * @return the cflag
	 */
	public Character getCflag() {
		return cflag;
	}

	/**
	 * Sets the cflag.
	 *
	 * @param cflag
	 *            the new cflag
	 */
	public void setCflag(Character cflag) {
		this.cflag = cflag;
	}

	/**
	 * Gets the opd.
	 *
	 * @return the opd
	 */
	public String getOpd() {
		return opd;
	}

	/**
	 * Sets the opd.
	 *
	 * @param opd
	 *            the new opd
	 */
	public void setOpd(String opd) {
		this.opd = opd;
	}

	/**
	 * Gets the pos.
	 *
	 * @return the pos
	 */
	public String getPos() {
		return pos;
	}

	/**
	 * Sets the pos.
	 *
	 * @param pos
	 *            the new pos
	 */
	public void setPos(String pos) {
		this.pos = pos;
	}

	/**
	 * Gets the cdnr items.
	 *
	 * @return the cdnr items
	 */
	public List<CDNRItem> getCdnrItems() {
		return cdnrItems;
	}

	/**
	 * Sets the cdnr items.
	 *
	 * @param cdnrItems
	 *            the new cdnr items
	 */
	public void setCdnrItems(List<CDNRItem> cdnrItems) {
		this.cdnrItems = cdnrItems;
	}

	/**
	 * Gets the p gst.
	 *
	 * @return the p gst
	 */
	public Character getpGst() {
		return pGst;
	}

	/**
	 * Sets the p gst.
	 *
	 * @param pGst
	 *            the new p gst
	 */
	public void setpGst(Character pGst) {
		this.pGst = pGst;
	}

	@Override
	public String toString(){
		StringBuilder builder = new StringBuilder();
		if (idt != null) {
			builder.append("idt=");
			builder.append(idt);	
			builder.append(",");	
		}
		if (inum != null) {
			builder.append("inum=");
			builder.append(inum);	
			builder.append(",");	
		}
		if (cdnrItems != null) {
			builder.append("itms=");
			builder.append(cdnrItems);	
			Collections.sort(cdnrItems, new CdnrItemsComparator());
			builder.append(StringUtils.join(cdnrItems,","));
			builder.append(",");	
		}
		if (ntDt != null) {
			builder.append("nt_dt=");
			builder.append(ntDt);	
			builder.append(",");	
		}
		if (ntNum != null) {
			builder.append("nt_num=");
			builder.append(ntNum);	
			builder.append(",");	
		}
		if (ntty != null) {
			builder.append("ntty=");
			builder.append(ntty);	
			builder.append(",");	
		}
		if (pGst != null) {
			builder.append("p_gst=");
			builder.append(pGst);	
			builder.append(",");	
		}
		if (pos != null) {
			builder.append("pos=");
			builder.append(pos);	
			builder.append(",");	
		}
		if (rsn != null) {
			builder.append("rsn=");
			builder.append(rsn);	
			builder.append(",");	
		}
		if (val != null) {
			builder.append("val=");
			builder.append(val);	
			builder.append(",");	
		}
		if(builder.length() > 1) {
			if (builder.charAt(builder.length() - 1) == ',') {
			builder.setLength(builder.length() - 1);
			}
		}
		return builder.toString(); 
		}

	public BigDecimal getDiffPercent() {
		return diffPercent;
	}

	public void setDiffPercent(BigDecimal diffPercent) {
		this.diffPercent = diffPercent;
	}
	

}
