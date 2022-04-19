package com.mind.egsp.gstn.model.gstr1;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class B2BItem.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_EMPTY)
public class B2bItem implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** Serial no. */
	private long num;

	/** Item Details. */
	@JsonProperty("itm_det")
	private B2bItemDetail b2bItemDetail;

	/**
	 * Gets the Serial no..
	 *
	 * @return the num
	 */
	public long getNum() {
		return num;
	}

	/**
	 * Sets the Serial no..
	 *
	 * @param num
	 *            the new num
	 */
	public void setNum(long num) {
		this.num = num;
	}

	/**
	 * Gets the B2B item detail.
	 *
	 * @return the B2B item detail
	 */
	public B2bItemDetail getB2bItemDetail() {
		return b2bItemDetail;
	}

	/**
	 * Sets the B2B item detail.
	 *
	 * @param b2bItemDetail
	 *            the new B2B item detail
	 */
	public void setB2bItemDetail(B2bItemDetail b2bItemDetail) {
		this.b2bItemDetail = b2bItemDetail;
	}
	
	public String  toString(){
		StringBuilder builder = new StringBuilder();
		//itms=num=1,itm_det=csamt=20756.0,iamt=5400.0,rt=12.0,txval=45000.0
		if (num != 0) {
			builder.append("num=");
			builder.append(num);
			builder.append(",");
		}		
		if (b2bItemDetail != null) {
			builder.append("itm_det=");
			// TODO Check whether it could be null or null			
			builder.append("csamt="+b2bItemDetail.getCsamt());
			
			if(b2bItemDetail.getIamt()!=null){
				builder.append(",");
				builder.append("iamt="+b2bItemDetail.getIamt());
			}
			if(b2bItemDetail.getRt()!=null){
				builder.append(",");
				builder.append("rt="+b2bItemDetail.getRt());
			}
			if(b2bItemDetail.getRt()!=null){
				builder.append(",");
				builder.append("txval"+b2bItemDetail.getRt());
			}
		}
		
		return builder.toString();

	}

	

}
