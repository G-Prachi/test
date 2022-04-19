package com.mind.egsp.gstn.model.gstr1;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

// TODO: Auto-generated Javadoc
/**
 * The Class for B2C Small Amendments.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_EMPTY)
public class B2csaInvoice implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The tax payer action. */
	private Character flag;

	/** The Original Month. */
	private String omon;
	
	/** The Original Place of Supply. */
	private String opos;

	/** The Invoice Check sum value. */
	private String chksum;

	/** The Place of Supply. */
	private String pos;

	/** The Supply Type. */
	@JsonProperty("sply_ty")
	private String splyTy;

	/** The Type . */
	private String typ;

	/** The Ecom Operator Gstin. */
	private String etin;

	private String ctin;
	/** The Items. */
	@JsonProperty("itms")
	private List<B2csaItemDetail> itemDetails;
	
	private List<B2csaInvoiceDetail> b2csaInvoiceDetails;

	/**
	 * Gets the tax payer action.
	 *
	 * @return the flag
	 */
	public Character getFlag() {
		return flag;
	}

	/**
	 * Sets the tax payer action.
	 * 
	 * Field Specification:One Character (D-Delete (For deleting invoices))
	 *
	 * @param flag
	 *            the new flag
	 */
	public void setFlag(Character flag) {
		this.flag = flag;
	}

	/**
	 * Gets the ctin.
	 *
	 * @return the ctin
	 */
	public String getCtin() {
		return ctin;
	}
	/**
	 * Gets the Invoice Check sum value.
	 *
	 * Field Specification:string(Max length:15)
	 *
	 * @return the chksum
	 */
	public String getChksum() {
		return chksum;
	}

	/**
	 * Sets the Invoice Check sum value.
	 *
	 * Field Specification:string(Max length:15)
	 *
	 * @param chksum
	 *            the new chksum
	 */
	public void setChksum(String chksum) {
		this.chksum = chksum;
	}

	/**
	 * Gets the Ecom Operator Gstin.
	 *
	 * Field Specification:Alphanumeric (Max length:15)
	 *
	 * @return the etin
	 */
	public String getEtin() {
		return etin;
	}

	/**
	 * Sets the Ecom Operator Gstin.
	 *
	 * Field Specification:Alphanumeric (Max length:15)
	 *
	 * @param etin
	 *            the new etin
	 */
	public void setEtin(String etin) {
		this.etin = etin;
	}

	/**
	 * Gets the typ.
	 *
	 * Field Specification:string(Max length:2)
	 *
	 * @return the typ
	 */
	public String getTyp() {
		return typ;
	}

	/**
	 * Sets the typ.
	 *
	 * Field Specification:string(Max length:2)
	 *
	 * @param typ
	 *            the new typ
	 */
	public void setTyp(String typ) {
		this.typ = typ;
	}

	/**
	 * Gets the sply ty.
	 *
	 * @return the sply ty
	 */
	public String getSplyTy() {
		return splyTy;
	}

	/**
	 * Sets the sply ty.
	 *
	 * @param splyTy
	 *            the new sply ty
	 */
	public void setSplyTy(String splyTy) {
		this.splyTy = splyTy;
	}

	/**
	 * Gets the pos.
	 *
	 * @return the pos
	 */
	public String getPos() {
		return pos;
	}

	/**
	 * Sets the pos.
	 *
	 * @param pos
	 *            the new pos
	 */
	public void setPos(String pos) {
		this.pos = pos;
	}
	
	/**
	 * Gets the Original Month.
	 *
	 * Field Specification:string (MMYYYY)
	 *
	 * @return the omon
	 */
	public String getOmon() {
		return omon;
	}

	/**
	 * Sets the Original Month.
	 *
	 * Field Specification:string (MMYYYY)
	 *
	 * @param omon
	 *            the new omon
	 */
	public void setOmon(String omon) {
		this.omon = omon;
	}
	
	/**
	 * Gets the B2B invoice details.
	 *
	 * @return the B2B invoice details
	 */
	public List<B2csaInvoiceDetail> getB2csaInvoiceDetails() {
		return b2csaInvoiceDetails;
	}
	
	/**
	 * Sets the B2B invoice details.
	 *
	 * @param b2bInvoiceDetails
	 *            the new B2B invoice details
	 */
	public void setB2csaInvoiceDetails(List<B2csaInvoiceDetail> b2bInvoiceDetails) {
		this.b2csaInvoiceDetails = b2bInvoiceDetails;
	}
	

	
	/**
	 * Gets the Original Place of Supply.
	 *
	 * Field Specification:Two digit number
	 *
	 * @return the opos
	 */
	public String getOpos() {
		return opos;
	}

	/**
	 * Sets the Original Place of Supply.
	 *
	 * Field Specification:Two digit number
	 *
	 * @param opos
	 *            the new opos
	 */
	public void setOpos(String opos) {
		this.opos = opos;
	}

	/**
	 * Gets the item details.
	 *
	 * @return the item details
	 */
	public List<B2csaItemDetail> getItemDetails() {
		return itemDetails;
	}

	/**
	 * Sets the item details.
	 *
	 * @param itemDetails
	 *            the new item details
	 */
	public void setItemDetails(List<B2csaItemDetail> itemDetails) {
		this.itemDetails = itemDetails;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString(){
		StringBuilder builder = new StringBuilder();
		
		if (omon != null) {
			builder.append("omon=");
			builder.append(omon);	
			builder.append(",");	
		}
		
		if (opos != null) {
			builder.append("opos");
			builder.append(opos);	
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
