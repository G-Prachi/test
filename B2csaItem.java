package com.mind.egsp.gstn.model.gstr1;

import com.fasterxml.jackson.annotation.JsonProperty;

public class B2csaItem {
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** Serial no. */
	private long num;

	/** Item Details. */
	@JsonProperty("itm_det")
	private B2csaItemDetail b2csaItemDetail;

	/**
	 * Gets the num.
	 * 
	 * Field Specification:number
	 *
	 * @return the num
	 */
	public long getNum() {
		return num;
	}

	/**
	 * Sets the num.
	 * 
	 * Field Specification:number
	 * 
	 * @param num
	 *            the new num
	 */
	public void setNum(long num) {
		this.num = num;
	}

	/**
	 * Gets the b 2 cl item detail.
	 *
	 * @return the b 2 cl item detail
	 */
	public B2csaItemDetail getB2csaItemDetail() {
		return b2csaItemDetail;
	}

	/**
	 * Sets the b 2 cl item detail.
	 *
	 * @param b2clItemDetail
	 *            the new b 2 cl item detail
	 */
	public void setB2csaItemDetail(B2csaItemDetail b2csaItemDetail) {
		this.b2csaItemDetail = b2csaItemDetail;
	}
	

public String toString(){
	StringBuilder builder = new StringBuilder();
	if (num != 0) {
		builder.append("num=");
		builder.append(num);	
		builder.append(",");	
	}
	if (b2csaItemDetail != null) {
		builder.append("itm_det=");
		builder.append(b2csaItemDetail);	
		builder.append(",");	
	}
	
	if (b2csaItemDetail != null) {
		builder.append("itm_det=");
		builder.append(b2csaItemDetail);	
		builder.append(",");	
	}
	
	if (b2csaItemDetail != null) {
		builder.append("itm_det=");
		builder.append(b2csaItemDetail);	
		builder.append(",");	
	}
	
	if (b2csaItemDetail != null) {
		builder.append("itm_det=");
		builder.append(b2csaItemDetail);	
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
