package com.mind.egsp.gstn.model.gstr1;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class AtInvoiceDetail.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_EMPTY)
public class AtInvoice implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The tax payer action value. */
	private Character flag;

	/** The Invoice Check sum value. */
	private String chksum;

	/** The Invoice type. */
	@JsonIgnore
	private String typ;

	/** The pos. */
	private String pos;

	/** The sply ty. */
	@JsonProperty("sply_ty")
	private String splyTy;

	/** The Counter party GSTIN or name. */
	@JsonIgnore
	private String cpty;

	/** The Recipient State Code. */
	// @JsonProperty("state_cd")
	@JsonIgnore
	private String stateCd;

	/** The Supplier Document Number. */
	@JsonProperty("doc_num")
	private String docNum;

	/** The Supplier Document Date. */
	@JsonProperty("doc_dt")
	private String docDt;

	@JsonProperty("diff_percent")
	private BigDecimal diffPercent;

	/** The b2b item detail. */
	@JsonProperty("itms")
	private List<AtItemDetail> atItemDetails;

	/**
	 * Gets the tax payer action flag.
	 *
	 * @return the tax payer action flag
	 */
	public Character getFlag() {
		return flag;
	}

	/**
	 * Sets the tax payer action flag.
	 *
	 * @param flag
	 *            the tax payer action flag
	 */
	public void setFlag(Character flag) {
		this.flag = flag;
	}

	/**
	 * Gets the Invoice Check sum value
	 * 
	 * Field Specification: String (Max length:15)
	 * 
	 * Sample Data: AflJufPlFStqKBZ .
	 *
	 * @return the chksum
	 */
	public String getChksum() {
		return chksum;
	}

	/**
	 * Sets the Invoice Check sum value
	 * 
	 * Field Specification: String (Max length:15)
	 * 
	 * Sample Data: AflJufPlFStqKBZ .
	 *
	 * @param chksum
	 *            the new chksum
	 */
	public void setChksum(String chksum) {
		this.chksum = chksum;
	}

	/**
	 * Gets the Invoice type
	 * 
	 * Field Specification: String (Max length:3) B2B/ B2C
	 * 
	 * Sample Data: B2B .
	 *
	 * @return the typ
	 */
	public String getTyp() {
		return typ;
	}

	/**
	 * Sets the Invoice type
	 * 
	 * Field Specification: String (Max length:3) B2B/ B2C
	 * 
	 * Sample Data: B2B .
	 *
	 * @param typ
	 *            the new typ
	 */
	public void setTyp(String typ) {
		this.typ = typ;
	}

	/**
	 * Gets the Counter party GSTIN or name
	 * 
	 * Field Specification: Alphanumeric( max length 50)
	 * 
	 * Sample Data: 06ADECO9084R5Z4 .
	 *
	 * @return the cpty
	 */
	public String getCpty() {
		return cpty;
	}

	/**
	 * Sets the Counter party GSTIN or name
	 * 
	 * Field Specification: Alphanumeric( max length 50)
	 * 
	 * 
	 * Sample Data: 06ADECO9084R5Z4 .
	 *
	 * @param cpty
	 *            the new cpty
	 */
	public void setCpty(String cpty) {
		this.cpty = cpty;
	}

	/**
	 * Gets the Recipient State Code
	 * 
	 * Field Specification: string(Max length :2)
	 * 
	 * Sample Data: 06 .
	 *
	 * @return the state cd
	 */
	public String getStateCd() {
		return stateCd;
	}

	/**
	 * Sets the Recipient State Code
	 * 
	 * Field Specification: string(Max length :2)
	 * 
	 * Sample Data: 06 .
	 *
	 * @param stateCd
	 *            the new state cd
	 */
	public void setStateCd(String stateCd) {
		this.stateCd = stateCd;
	}

	/**
	 * Gets the Supplier Document Number
	 * 
	 * Field Specification: Alphanumeric (Max length:50)
	 * 
	 * Sample Data: 100012.
	 *
	 * @return the doc num
	 */
	public String getDocNum() {
		return docNum;
	}

	/**
	 * Sets the Supplier Document Number
	 * 
	 * Field Specification: Alphanumeric (Max length:50)
	 * 
	 * Sample Data: 100012.
	 *
	 * @param docNum
	 *            the new doc num
	 */
	public void setDocNum(String docNum) {
		this.docNum = docNum;
	}

	/**
	 * Gets the Supplier Document Date
	 * 
	 * Field Specification: string (DD-MM-YYYY)
	 * 
	 * Sample Data: 26-06-2016 .
	 *
	 * @return the doc dt
	 */
	public String getDocDt() {
		return docDt;
	}

	/**
	 * Sets the Supplier Document Date
	 * 
	 * Field Specification: string (DD-MM-YYYY)
	 * 
	 * Sample Data: 26-06-2016 .
	 *
	 * @param docDt
	 *            the new doc dt
	 */
	public void setDocDt(String docDt) {
		this.docDt = docDt;
	}

	/**
	 * Gets the Advance Tax item details.
	 *
	 * @return the Advance Tax item details
	 */
	public List<AtItemDetail> getAtItemDetails() {
		return atItemDetails;
	}

	/**
	 * Sets the Advance Tax item details.
	 *
	 * @param atItemDetails
	 *            the new Advance Tax item details
	 */
	public void setAtItemDetails(List<AtItemDetail> atItemDetails) {
		this.atItemDetails = atItemDetails;
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

	public BigDecimal getDiffPercent() {
		return diffPercent;
	}

	public void setDiffPercent(BigDecimal diffPercent) {
		this.diffPercent = diffPercent;
	}

}
