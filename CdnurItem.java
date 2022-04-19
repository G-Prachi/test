package com.mind.egsp.gstn.model.gstr1;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class CdnurItem.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class CdnurItem implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The num. */
	private int num;

	/** The cdnur item detail. */
	@JsonProperty("itm_det")
	private CdnurItemDetail cdnurItemDetail;

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
	 * Gets the cdnur item detail.
	 *
	 * @return the cdnur item detail
	 */
	public CdnurItemDetail getCdnurItemDetail() {
		return cdnurItemDetail;
	}

	/**
	 * Sets the cdnur item detail.
	 *
	 * @param cdnurItemDetail
	 *            the new cdnur item detail
	 */
	public void setCdnurItemDetail(CdnurItemDetail cdnurItemDetail) {
		this.cdnurItemDetail = cdnurItemDetail;
	}


public String toString(){
	StringBuilder builder = new StringBuilder();
	if (cdnurItemDetail != null) {
		builder.append("itm_det=");
		builder.append(cdnurItemDetail);	
		builder.append(",");	
	}
	if (num != 0) {
		builder.append("num=");
		builder.append(num);	
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
