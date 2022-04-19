package com.mind.egsp.gstn.model.gstr1;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_EMPTY)
public class B2baInvoiceDetail extends B2bInvoiceDetail implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** Original invoice number. */
	private String oinum;

	/** Original invoice date. */
	private String oidt;

	/**
	 * Gets the Original invoice number.
	 *
	 * Field Specification:Alphanumeric (Max length:50)
	 * 
	 * Sample Data: S008400
	 *
	 * @return the oinum
	 */
	public String getOinum() {
		return oinum;
	}

	/**
	 * Sets the original invoice number.
	 *
	 * Field Specification:Alphanumeric (Max length:50)
	 * 
	 * Sample Data: S008400
	 *
	 * 
	 * @param oinum
	 *            the new original invoice number
	 */
	public void setOinum(String oinum) {
		this.oinum = oinum;
	}

	/**
	 * Gets the original invoice date.
	 *
	 * Field Specification:string (DD-MM-YYYY)
	 *
	 * Sample Data: 03-01-2016
	 *
	 * @return the original invoice date
	 */
	public String getOidt() {
		return oidt;
	}

	/**
	 * Sets the original invoice date.
	 *
	 * Field Specification:string (DD-MM-YYYY)
	 * 
	 * Sample Data: 03-01-2016
	 *
	 * @param oidt
	 *            the new original invoice date
	 */
	public void setOidt(String oidt) {
		this.oidt = oidt;
	}

	public String toString(){
		StringBuilder builder = new StringBuilder();
		if (oidt != null) {
			builder.append("oidt=");
			builder.append(oidt);	
			builder.append(",");	
		}
		if (oinum != null) {
			builder.append("oinum=");
			builder.append(oinum);	
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
