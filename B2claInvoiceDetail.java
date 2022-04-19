package com.mind.egsp.gstn.model.gstr1;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_EMPTY)
public class B2claInvoiceDetail extends B2clInvoiceDetail implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The Original invoice number. */
	private String oinum;

	private String invTyp;
	/** The Original invoice date. */
	private String oidt;
	/** Reverse Charge. */
	private Character rchrg = 'N';
    private List<B2claItem> b2claItems;
    private String idt;
	/**
	 * Gets Original invoice number.
	 * 
	 * Field Specification:Alphanumeric (Max length:16)
	 * 
	 * @return the oinum
	 */
	public String getOinum() {
		return oinum;
	}
	
	/**
	 * Gets the Supplier Invoice Date.
	 *
	 * @return the idt
	 */
	public String getIdt() {
		return idt;
	}
	
	/**
	 * Gets the B2bItems.
	 *
	 * @return the B2bItems
	 */
	public List<B2claItem> getB2claItems() {
		return b2claItems;
	}

	
	/**
	 * Gets the Reverse Charge.
	 *
	 * @return the rchrg
	 */
	public Character getRchrg() {
		return rchrg;
	}
	
	/**
	 * Gets the inv typ.
	 *
	 * @return the inv typ
	 */
	public String getInvTyp() {
		return invTyp;
	}
	
	/**
	 * Sets the Original invoice number.
	 *
	 * Field Specification:Alphanumeric (Max length:16)
	 *
	 * @param oinum
	 *            the new oinum
	 */
	public void setOinum(String oinum) {
		this.oinum = oinum;
	}

	/**
	 * Gets the Original invoice date.
	 *
	 * Field Specification:string (DD-MM-YYYY)
	 *
	 * @return the oidt
	 */
	public String getOidt() {
		return oidt;
	}

	/**
	 * Sets the Original invoice date.
	 *
	 * Field Specification:string (DD-MM-YYYY)
	 *
	 * @param oidt
	 *            the new oidt
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
