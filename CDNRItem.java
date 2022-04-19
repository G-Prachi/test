package com.mind.egsp.gstn.model.gstr1;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mind.egsp.gstn.model.gstr2.Gstr2ItcDetail;

/**
 * The Class CDNRItems.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_EMPTY)
public class CDNRItem implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The num. */
	private int num;

	/** The item det. */
	@JsonProperty("itm_det")
	private CDNRItemDetail cdnrItemDetails;

	/** The ITC detail. */
	@JsonProperty("itc")
	private Gstr2ItcDetail itcDetail;

	/**
	 * Gets the num.
	 *
	 * @return the num
	 */
	public int getNum() {
		return num;
	}

	/**
	 * Sets the num.
	 *
	 * @param num
	 *            the new num
	 */
	public void setNum(int num) {
		this.num = num;
	}

	/**
	 * Gets the cdnr item details.
	 *
	 * @return the cdnr item details
	 */
	public CDNRItemDetail getCdnrItemDetails() {
		return cdnrItemDetails;
	}

	/**
	 * Sets the cdnr item details.
	 *
	 * @param cdnrItemDetails
	 *            the new cdnr item details
	 */
	public void setCdnrItemDetails(CDNRItemDetail cdnrItemDetails) {
		this.cdnrItemDetails = cdnrItemDetails;
	}

	/**
	 * Sets the cdnr ITC details.
	 * 
	 * @return Gstr2ItcDetail
	 */
	public Gstr2ItcDetail getItcDetail() {
		return itcDetail;
	}

	/**
	 * get the cdnr ITC details.
	 * 
	 * @param itcDetail
	 */
	public void setItcDetail(Gstr2ItcDetail itcDetail) {
		this.itcDetail = itcDetail;
	}
	

@Override
public String toString(){
	StringBuilder builder = new StringBuilder();
	
	if (num != 0) {
		builder.append("num=");
		builder.append(num);	
		builder.append(",");	
	}
	/*
	if (itcDetail != null) {
		builder.append("itc=");
		builder.append(itcDetail);	
		builder.append(",");	
	}
	*/
	
	if (cdnrItemDetails != null) {
		builder.append("itm_det=");
		builder.append(cdnrItemDetails);	
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
