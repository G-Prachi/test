package com.mind.egsp.gstn.model.gstr1;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class CdnraInvoiceDetail.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class CdnraInvoiceDetail extends CdnrInvoiceDetail implements Serializable {

	private static final long serialVersionUID = 1L;

	/** The Oringal Credit/debit note number. */
	@JsonProperty("ont_num")
	private String ontNum;
	private CDNRAItemDetail cdnraItemDetails;
	public CDNRAItemDetail getCdnraItemDetails() {
		return cdnraItemDetails;
	}

	public void setCdnraItemDetails(CDNRAItemDetail cdnraItemDetails) {
		this.cdnraItemDetails = cdnraItemDetails;
	}


	/** The Orignal Credit/Debit date. */
	@JsonProperty("ont_dt")
	private String ontDt;

	/**
	 * Gets the Oringal Credit/debit note number.
	 *
	 * Field Specification:Alphanumeric(max length:30)
	 *
	 * @return the ont num
	 */
	public String getOntNum() {
		return ontNum;
	}

	/**
	 * Sets the Oringal Credit/debit note number.
	 *
	 * Field Specification:Alphanumeric(max length:30)
	 *
	 * @param ontNum
	 *            the new ont num
	 */
	public void setOntNum(String ontNum) {
		this.ontNum = ontNum;
	}

	/**
	 * Gets the Orignal Credit/Debit date.
	 *
	 * Field Specification:string (DD-MM-YYYY)
	 *
	 * @return the ont dt
	 */
	public String getOntDt() {
		return ontDt;
	}

	/**
	 * Sets the Orignal Credit/Debit date.
	 *
	 * Field Specification:string (DD-MM-YYYY)
	 *
	 * @param ontDt
	 *            the new ont dt
	 */
	public void setOntDt(String ontDt) {
		this.ontDt = ontDt;
	}

	
	public String toString(){
		StringBuilder builder = new StringBuilder();
		if (ontDt != null) {
			builder.append("ont_dt=");
			builder.append(ontDt);	
			builder.append(",");	
		}
		if (ontNum != null) {
			builder.append("ont_num=");
			builder.append(ontNum);	
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
