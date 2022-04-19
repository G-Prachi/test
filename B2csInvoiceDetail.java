package com.mind.egsp.gstn.model.gstr1;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

//import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class b2csInvoiceDetail.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_EMPTY)
public class B2csInvoiceDetail implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** Tax payer action. */
	private Character flag;

	/** Invoice Check sum value. */
	private String chksum;

	/** Supplier Invoice Number. */
	private String inum;

	/** Supplier Invoice Date. */
	private String idt;

	/** Supplier Invoice Value. */
	private BigDecimal val;

	// Mandatory field.
	/** Place of supply. */
	private String pos = "";

	/** Reverse Charge. */
	private Character rchrg = 'N';
	private List<B2csItem> b2csItems;

	// TODO - Remove, currently it is a mandatory field
	/** EcomOperator. */
	private String etin;

	/** The Invoice type. */
	@JsonProperty("inv_typ")
	private String invTyp;

	/** Uploaded by. S- Supplier, R- Receiver. */
	@JsonIgnore
	private Character updby;

	/** Provisional assessment. */
	@JsonIgnore
	private Character prs = 'N';

	/** Order Number. */
	// @JsonProperty("od_num")
	@JsonIgnore
	private String odNum;

	/** Order Date. */
	// @JsonProperty("od_dt")
	@JsonIgnore
	private String odDt;

	/** The Counter Party Flag. */
	private Character cflag;

	/** The Original Period. */
	private String opd;

	@JsonProperty("diff_percent")
	private BigDecimal diffPercent;

	/** Items. */
	//@JsonProperty("itms")
//private List<b2csItem> b2csItems;

	@JsonProperty("updby")
	private String updbyGstn;

	/**
	 * Gets the Tax payer action flag.
	 *
	 * @return the flag
	 */
	
	public Character getFlag() {
		return flag;
	}

	/**
	 * Sets the Tax payer action flag.
	 *
	 * @param flag
	 *            the new flag
	 */
	public void setFlag(Character flag) {
		this.flag = flag;
	}	

	/**
	 * Gets the b2csItems.
	 *
	 * @return the b2csItems
	 */
	public List<B2csItem> getB2csItems() {
		return b2csItems;
	}
	
	/**
	 * Gets the Invoice Check sum value.
	 *
	 * @return the chksum
	 */
	public String getChksum() {
		return chksum;
	}

	/**
	 * Sets the Invoice Check sum value.
	 *
	 * @param chksum
	 *            the new chksum
	 */
	public void setChksum(String chksum) {
		if (chksum == null) {

		}
		this.chksum = chksum;
	}

	/**
	 * Gets the Supplier Invoice Number.
	 *
	 * @return the inum
	 */
	public String getInum() {
		return inum;
	}

	/**
	 * Sets the Supplier Invoice Number.
	 *
	 * @param inum
	 *            the new inum
	 */
	public void setInum(String inum) {
		this.inum = inum;
	}

	/**
	 * Gets the Supplier Invoice Date.
	 *
	 * @return the idt
	 */
	public String getIdt() {
		return idt;
	}

	/**
	 * Sets the Supplier Invoice Date.
	 *
	 * @param idt
	 *            the new idt
	 */
	public void setIdt(String idt) {
		this.idt = idt;
	}

	/**
	 * Gets the Supplier Invoice Value.
	 *
	 * @return the val
	 */
	public BigDecimal getVal() {
		return val;
	}

	/**
	 * Sets the Supplier Invoice Value.
	 *
	 * @param val
	 *            the new val
	 */
	public void setVal(BigDecimal val) {
		this.val = val;
	}

	/**
	 * Gets the Place of supply.
	 *
	 * @return the pos
	 */
	public String getPos() {
		return pos;
	}

	/**
	 * Sets the Place of supply.
	 *
	 * @param pos
	 *            the new pos
	 */
	public void setPos(String pos) {
		this.pos = pos;
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
	 * Gets the Provisional assessment.
	 *
	 * @return the prs
	 */
	public Character getPrs() {
		return prs;
	}

	/**
	 * Sets the Provisional assessment.
	 *
	 * @param prs
	 *            the new prs
	 */
	public void setPrs(Character prs) {
		this.prs = prs;
	}

	/**
	 * Gets the Order Number.
	 *
	 * @return the od num
	 */
	public String getOdNum() {
		return odNum;
	}

	/**
	 * Sets the Order Number.
	 *
	 * @param odNum
	 *            the new od num
	 */
	public void setOdNum(String odNum) {
		this.odNum = odNum;
	}

	/**
	 * Gets the Order Date.
	 *
	 * @return the od dt
	 */
	public String getOdDt() {
		return odDt;
	}

	/**
	 * Sets the Order Date.
	 *
	 * @param odDt
	 *            the new od dt
	 */
	public void setOdDt(String odDt) {
		this.odDt = odDt;
	}

	/**
	 * Gets the EcomOperator.
	 *
	 * @return the etin
	 */
	public String getEtin() {
		return etin;
	}

	/**
	 * Sets the EcomOperator.
	 *
	 * @param etin
	 *            the new etin
	 */
	public void setEtin(String etin) {
		this.etin = etin;
	}

	/**
	 * Gets the b2csItems.
	 *
	 * @return the b2csItems
	 *//*
	public List<B2csItem> getB2csItems() {
		return b2csItems;
	}
	*//**
	 * Sets the b2csItems.
	 *
	 * @param b2csItems
	 *            the new b2csItems
	 */
	public void setB2csItems(List<B2csItem> b2csItems) {
		this.b2csItems = b2csItems;
	}

	/**
	 * Gets the Uploaded by. S- Supplier, R- Receiver.
	 *
	 * @return the S for Supplier, R for Receiver
	 */
	public Character getUpdby() {
		return updby;
	}

	/**
	 * Sets the Uploaded by. S- Supplier, R- Receiver.
	 *
	 * @param updby
	 *            S for Supplier, R for Receiver
	 */
	public void setUpdby(Character updby) {
		this.updby = updby;
	}

	/**
	 * Gets the inv typ.
	 *
	 * @return the inv typ
	 */
	public String getInvTyp() {
		return invTyp;
	}

	/**
	 * Sets the inv typ.
	 *
	 * @param invTyp
	 *            the new inv typ
	 */
	public void setInvTyp(String invTyp) {
		this.invTyp = invTyp;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		/*
		 * if (etin != null) { builder.append("etin="); builder.append(etin);
		 * builder.append(","); }
		 */

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
		if (invTyp != null) {
			builder.append("inv_typ=");
			builder.append(invTyp);
			builder.append(",");
		}
		if (b2csItems != null) {
			builder.append("itms=");
		//	Collections.sort(b2csItems, new B2csItemsComparator());
			//builder.append(StringUtils.join(b2csItems, ","));
			builder.append(",");
		}
		if (pos != null) {
			builder.append("pos=");
			builder.append(pos);
			builder.append(",");
		}
		if (rchrg != null) {
			builder.append("rchrg=");
			builder.append(rchrg);
			builder.append(",");
		}
		if (val != null) {
			builder.append("val=");
			builder.append(val);
		}
		if (builder.length() > 1) {
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

	public String getUpdbyGstn() {
		return updbyGstn;
	}

	public void setUpdbyGstn(String updbyGstn) {
		this.updbyGstn = updbyGstn;
	}

}


