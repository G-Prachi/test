package com.mind.egsp.gstn.model.gstr1;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class B2clItem.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_EMPTY)
public class B2clItem implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** Serial no. */
	private long num;

	/** Item Details. */
	@JsonProperty("itm_det")
	private B2clItemDetail b2clItemDetail;

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
	public B2clItemDetail getB2clItemDetail() {
		return b2clItemDetail;
	}

	/**
	 * Sets the b 2 cl item detail.
	 *
	 * @param b2clItemDetail
	 *            the new b 2 cl item detail
	 */
	public void setB2clItemDetail(B2clItemDetail b2clItemDetail) {
		this.b2clItemDetail = b2clItemDetail;
	}
	

public String toString(){
	StringBuilder builder = new StringBuilder();
	if (num != 0) {
		builder.append("num=");
		builder.append(num);	
		builder.append(",");	
	}
	if (b2clItemDetail != null) {
		builder.append("itm_det=");
		builder.append(b2clItemDetail);	
		builder.append(",");	
	}
	
	if (b2clItemDetail != null) {
		builder.append("itm_det=");
		builder.append(b2clItemDetail);	
		builder.append(",");	
	}
	
	if (b2clItemDetail != null) {
		builder.append("itm_det=");
		builder.append(b2clItemDetail);	
		builder.append(",");	
	}
	
	if (b2clItemDetail != null) {
		builder.append("itm_det=");
		builder.append(b2clItemDetail);	
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
