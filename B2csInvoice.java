package com.mind.egsp.gstn.model.gstr1;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class B2csInvoiceDetail.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_EMPTY)
public class B2csInvoice implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The tax payer action. */
	private Character flag;

	/** The Invoice Check sum value. */
	private String chksum;

	/** The Recipient state code. */
	// @JsonProperty("state_cd")
	@JsonIgnore
	private String stCd;

	/** The Identifier if Goods or Services. */

	@JsonIgnore
	private String ty;

	/** The HSN or SAC of Goods or Services as per Invoice line items. */
	// @JsonProperty("hsn_sc")
	@JsonIgnore
	private String hsnSc;

	/** The Taxable value of Goods or Service as per invoice. */
	private BigDecimal txval;

	/** The IGST Rate as per invoice. */
	@JsonIgnore
	private BigDecimal irt;

	/** The IGST Amount as per invoice. */
	private BigDecimal iamt;

	/** The CGST Rate as per invoice. */
	@JsonIgnore
	private BigDecimal crt;

	/** The CGST Amount as per invoice. */
	private BigDecimal camt;

	/** The SGST Rate as per invoice. */

	@JsonIgnore
	private BigDecimal srt;

	/** The SGST Amount as per invoice. */
	private BigDecimal samt;

	/** The Cess Rate as per invoice. */
	@JsonIgnore
	private BigDecimal csrt;

	/** The Cess Amount as per invoice. */
	private BigDecimal csamt;

	/** The Provisional assessment. */
	@JsonIgnore
	private String prs;

	/** The Order Number. */
	// @JsonProperty("od_num")
	@JsonIgnore
	private String odNum;

	/** The Order Date. */
	// @JsonProperty("od_dt")
	@JsonIgnore
	private String odDt;

	/** The Ecom Operator Gstin. */
	private String etin;

	/** The Type . */
	private String typ;

	/** The Supply Type. */
	@JsonProperty("sply_ty")
	private String splyTy;

	/** The Place of Supply. */
	private String pos;

	/** The Rate as per invoice. */
	private BigDecimal rt;

	@JsonProperty("diff_percent")
	private BigDecimal diffPercent;
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
	 * Gets the Recipient state code.
	 *
	 * Field Specification:String(Max length:2)
	 *
	 * @return the st cd
	 */
	public String getStCd() {
		return stCd;
	}

	/**
	 * Sets the Recipient state code.
	 *
	 * Field Specification:String(Max length:2)
	 *
	 * @param stCd
	 *            the new st cd
	 */
	public void setStCd(String stCd) {
		this.stCd = stCd;
	}

	/**
	 * Gets the Identifier if Goods or Services.
	 *
	 * Field Specification:One Character (G or S)
	 *
	 * @return the ty
	 */
	public String getTy() {
		return ty;
	}

	/**
	 * Sets the Identifier if Goods or Services.
	 *
	 * Field Specification:One Character (G or S)
	 *
	 * @param ty
	 *            the new ty
	 */
	public void setTy(String ty) {
		this.ty = ty;
	}

	/**
	 * Gets the HSN or SAC of Goods or Services as per Invoice line items.
	 *
	 * Field Specification:Alphanumeric (Max length:10)
	 *
	 * @return the hsn sc
	 */
	public String getHsnSc() {
		return hsnSc;
	}

	/**
	 * Sets the HSN or SAC of Goods or Services as per Invoice line items.
	 * 
	 * Field Specification:Alphanumeric (Max length:10)
	 *
	 * @param hsnSc
	 *            the new hsn sc
	 */
	public void setHsnSc(String hsnSc) {
		this.hsnSc = hsnSc;
	}

	/**
	 * Gets the Taxable value of Goods or Service as per invoice.
	 *
	 * Field Specification:Decimal(15, 2)
	 *
	 * @return the txval
	 */
	public BigDecimal getTxval() {
		return txval;
	}

	/**
	 * Sets the Taxable value of Goods or Service as per invoice.
	 *
	 * Field Specification:Decimal(15, 2)
	 *
	 * @param txval
	 *            the new txval
	 */
	public void setTxval(BigDecimal txval) {
		this.txval = txval;
	}

	/**
	 * Gets the IGST Rate as per invoice.
	 *
	 * Field Specification:Decimal(15, 2)
	 *
	 * @return the irt
	 */
	public BigDecimal getIrt() {
		return irt;
	}

	/**
	 * Sets the IGST Rate as per invoice.
	 *
	 * Field Specification:Decimal(15, 2)
	 *
	 * @param irt
	 *            the new irt
	 */
	public void setIrt(BigDecimal irt) {
		this.irt = irt;
	}

	/**
	 * Gets the IGST Rate as per invoice.
	 *
	 * Field Specification:Decimal(15, 2)
	 *
	 * @return the iamt
	 */
	public BigDecimal getIamt() {
		return iamt;
	}

	/**
	 * Sets the IGST Rate as per invoice.
	 *
	 * Field Specification:Decimal(15, 2)
	 *
	 * @param iamt
	 *            the new iamt
	 */
	public void setIamt(BigDecimal iamt) {
		this.iamt = iamt;
	}

	/**
	 * Gets the CGST Rate as per invoice.
	 *
	 * Field Specification:Decimal(15, 2)
	 *
	 * @return the crt
	 */
	public BigDecimal getCrt() {
		return crt;
	}

	/**
	 * Sets the CGST Rate as per invoice.
	 *
	 * Field Specification:Decimal(15, 2)
	 *
	 * @param crt
	 *            the new crt
	 */
	public void setCrt(BigDecimal crt) {
		this.crt = crt;
	}

	/**
	 * Gets the CGST Amount as per invoice.
	 *
	 * Field Specification:Decimal(15, 2)
	 *
	 * @return the camt
	 */
	public BigDecimal getCamt() {
		return camt;
	}

	/**
	 * Sets the CGST Amount as per invoice.
	 *
	 * Field Specification:Decimal(15, 2)
	 *
	 * @param camt
	 *            the new camt
	 */
	public void setCamt(BigDecimal camt) {
		this.camt = camt;
	}

	/**
	 * Gets the SGST Rate as per invoice.
	 *
	 * Field Specification:Decimal(15, 2)
	 *
	 * @return the srt
	 */
	public BigDecimal getSrt() {
		return srt;
	}

	/**
	 * Sets the SGST Rate as per invoice.
	 *
	 * Field Specification:Decimal(15, 2)
	 *
	 * @param srt
	 *            the new srt
	 */
	public void setSrt(BigDecimal srt) {
		this.srt = srt;
	}

	/**
	 * Gets the SGST Amount as per invoice.
	 *
	 * Field Specification:Decimal(15, 2)
	 *
	 * @return the samt
	 */
	public BigDecimal getSamt() {
		return samt;
	}

	/**
	 * Sets the SGST Amount as per invoice.
	 *
	 * Field Specification:Decimal(15, 2)
	 *
	 * @param samt
	 *            the new samt
	 */
	public void setSamt(BigDecimal samt) {
		this.samt = samt;
	}

	/**
	 * Gets the Cess Rate as per invoice.
	 *
	 * Field Specification:Decimal(15, 2)
	 *
	 * @return the csrt
	 */
	public BigDecimal getCsrt() {
		return csrt;
	}

	/**
	 * Sets the Cess Rate as per invoice.
	 *
	 * Field Specification:Decimal(15, 2)
	 *
	 * @param csrt
	 *            the new csrt
	 */
	public void setCsrt(BigDecimal csrt) {
		this.csrt = csrt;
	}

	/**
	 * Gets the Cess Amount as per invoice.
	 *
	 * Field Specification:Decimal(15, 2)
	 *
	 * @return the csamt
	 */
	public BigDecimal getCsamt() {
		return csamt;
	}

	/**
	 * Sets the Cess Amount as per invoice.
	 *
	 * Field Specification:Decimal(15, 2)
	 *
	 * @param csamt
	 *            the new csamt
	 */
	public void setCsamt(BigDecimal csamt) {
		this.csamt = csamt;
	}

	/**
	 * Gets the Provisional assessment.
	 *
	 * Field Specification:Character
	 *
	 * @return the prs
	 */
	public String getPrs() {
		return prs;
	}

	/**
	 * Sets the Provisional assessment.
	 *
	 * Field Specification:Character
	 *
	 * @param prs
	 *            the new prs
	 */
	public void setPrs(String prs) {
		this.prs = prs;
	}

	/**
	 * Gets the Order Number.
	 *
	 * Field Specification:Alphanumeric (Max length:30)
	 *
	 * @return the od num
	 */
	public String getOdNum() {
		return odNum;
	}

	/**
	 * Sets the Order Number.
	 *
	 * Field Specification:Alphanumeric (Max length:30)
	 *
	 * @param odNum
	 *            the new od num
	 */
	public void setOdNum(String odNum) {
		this.odNum = odNum;
	}

	/**
	 * Gets the Order Date.
	 *
	 * Field Specification:string (DD-MM-YYYY)
	 *
	 * @return the od dt
	 */
	public String getOdDt() {
		return odDt;
	}

	/**
	 * Sets the Order Date.
	 *
	 * Field Specification:string (DD-MM-YYYY)
	 *
	 * @param odDt
	 *            the new od dt
	 */
	public void setOdDt(String odDt) {
		this.odDt = odDt;
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
	 * Gets the rt.
	 *
	 * @return the rt
	 */
	public BigDecimal getRt() {
		return rt;
	}

	/**
	 * Sets the rt.
	 *
	 * @param rt
	 *            the new rt
	 */
	public void setRt(BigDecimal rt) {
		this.rt = rt;
	}
	
	
	@Override
	public String toString(){
		StringBuilder builder = new StringBuilder();
		// TODO Remove below
		/*
		if (camt != null) {
			builder.append("camt=");
			builder.append(camt);	
			builder.append(",");	
		}
		if (csamt != null) {
			builder.append("csamt=");
			builder.append(csamt);	
			builder.append(",");	
		}
		if (etin != null) {
			builder.append("etin=");
			builder.append(etin);	
			builder.append(",");	
		}*/
		// TODO remove above
		
		if (iamt != null) {
			builder.append("iamt=");
			builder.append(iamt);	
			builder.append(",");	
		}
		if (pos != null) {
			builder.append("pos=");
			builder.append(pos);	
			builder.append(",");	
		}
		if (rt != null) {
			builder.append("rt=");
			builder.append(rt);	
			builder.append(",");	
		}
		/*
		if (samt != null) {
			builder.append("samt=");
			builder.append(samt);	
			builder.append(",");	
		}
		*/
		if (splyTy != null) {
			builder.append("sply_ty=");
			builder.append(splyTy);	
			builder.append(",");	
		}
		if (txval != null) {
			builder.append("txval=");
			builder.append(txval);	
			builder.append(",");	
		}
		if (typ != null) {
			builder.append("typ=");
			builder.append(typ);	
			builder.append(",");	
		}
		if(builder.length() > 1) {
			if (builder.charAt(builder.length() - 1) == ',') {
			builder.setLength(builder.length() - 1);
			}
		}
		return builder.toString(); 
		}

	public BigDecimal getDiffPercent() {
		return diffPercent;
	}

	public void setDiffPercent(BigDecimal diffPercent) {
		this.diffPercent = diffPercent;
	}

	
}
