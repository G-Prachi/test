package com.mind.egsp.gstn.model.gstr1;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class for Credit Debit Notes Amendments Registered Users.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_EMPTY)
public class CdnraInvoice extends CdnrInvoice implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The Original Credit note/debit note / Refund Voucher Number. */
	@JsonProperty("ont_num")
	private String ontNum;

	/** The OriginalCredit Note/Debit Note/ Refund Voucher date. */
	@JsonProperty("ont_dt")
	private String ontDt;
	
	private  List<CdnraInvoiceDetail> cdnraInvoiceDetails;



	/**
	 * Gets the Original Credit note/debit note / Refund Voucher Number.
	 *
	 * Field Specification:String(Max length : 16)
	 *
	 * @return the ontNum
	 */
	public String getOntNum() {
		return ontNum;
	}

	/**
	 * Sets the The Original Credit note/debit note / Refund Voucher Number..
	 *
	 * Field Specification:String(Max length : 16)
	 * 
	 * @param ontNum
	 *            the new ontNum
	 */
	public void setOntNum(String ontNum) {
		this.ontNum = ontNum;
	}
	
	/**
	 * Gets the B2B invoice details.
	 *
	 * @return the B2B invoice details
	 */
	public List<CdnraInvoiceDetail> getCdnraInvoiceDetails() {
		return cdnraInvoiceDetails;
	}

	/**
	 * Gets the OriginalCredit Note/Debit Note/ Refund Voucher date.
	 *
	 * Field Specification:string (DD-MM-YYYY)
	 *
	 * @return the ontNum
	 */
	public String getOntDt() {
		return ontDt;
	}

	/**
	 * Sets the The OriginalCredit Note/Debit Note/ Refund Voucher date.
	 *
	 * Field Specification:string (DD-MM-YYYY)
	 * 
	 * @param ontNum
	 *            the new ontNum
	 */
	public void setOntDt(String ontDt) {
		this.ontDt = ontDt;
	}

}
