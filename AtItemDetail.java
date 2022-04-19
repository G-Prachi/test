package com.mind.egsp.gstn.model.gstr1;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class B2BItemDetail.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_EMPTY)
public class AtItemDetail extends B2bItemDetail implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** Amount of Advance received. */
	@JsonProperty("ad_amt")
	private BigDecimal adAmt;

	/**
	 * Gets the ad Amount of Advance received.
	 *
	 * @return the Advance Amount
	 */
	public BigDecimal getAdAmt() {
		return adAmt;
	}

	/**
	 * Sets the Amount of Advance received.
	 * 
	 * 
	 *
	 * @param adAmt
	 *            the new ad amt
	 */
	public void setAdAmt(BigDecimal adAmt) {
		this.adAmt = adAmt;
	}
	
	@Override
	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append("items=");
		
		if (adAmt != null) {
			builder.append("ad_amt=");
			builder.append(adAmt);	
			builder.append(",");	
		}
		
		builder.append(super.toString());
		
		if(builder.length() > 1) {
			if (builder.charAt(builder.length() - 1) == ',') {
			builder.setLength(builder.length() - 1);
			}
		}
		return builder.toString(); 
		}

}
