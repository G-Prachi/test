package com.mind.egsp.gstn.model.gstr1;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class CdnuraInvoiceDetail.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class CdnuraInvoiceDetail extends CdnurInvoiceDetail implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The Original Credit note/debit note / Refund Voucher Number. */
	@JsonProperty("ont_num")
	private String ontNum;

	/** The OriginalCredit Note/Debit Note/ Refund Voucher date. */
	@JsonProperty("ont_dt")
	private String ontDt;

	/**
	 * Gets the Original Credit note/debit note / Refund Voucher Number.
	 *
	 * @return the Original Credit note/debit note / Refund Voucher Number
	 */
	public String getOntNum() {
		return ontNum;
	}

	/**
	 * Sets the Original Credit note/debit note / Refund Voucher Number.
	 * 
	 * Field Specifications: String(Max length : 16), Sample Value: NT100001
	 *
	 * @param ontNum
	 *            the ontNum
	 */
	public void setOntNum(String ontNum) {
		this.ontNum = ontNum;
	}

	/**
	 * Gets the OriginalCredit Note/Debit Note/ Refund Voucher date.
	 *
	 * @return the OriginalCredit Note/Debit Note/ Refund Voucher date
	 */
	public String getOntDt() {
		return ontDt;
	}

	/**
	 * Sets the OriginalCredit Note/Debit Note/ Refund Voucher date.
	 * 
	 * Field Specifications:String (DD-MM-YYYY), Sample Value: 03-02-2016 GlassWorks
	 *
	 * @param cname
	 *            the new OriginalCredit Note/Debit Note/ Refund Voucher date
	 */
	public void setOntDt(String ontDt) {
		this.ontDt = ontDt;
	}
	
}
