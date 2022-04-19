package com.mind.egsp.gstn.model.gstr1;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class ExpInvoiceDetail.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class ExpInvoiceDetail implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The tax payer action. */
	private String flag;

	/** The Invoice Check sum value. */
	private String chksum;

	/** Supplier Invoice Number. */
	private String inum;

	/** The Supplier Invoice Date. */
	private String idt;

	/** The Supplier Invoice Value. */
	private BigDecimal val;

	/** The Shipping Bill No. or Bill of Export No. */
	private String sbnum;

	/** The Shipping Bill Date. or Bill of Export Date. */
	private String sbdt;

	/** The Port Code. */

	private String sbpcode;

	/** The Provisional Assesment. */
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

	@JsonProperty("diff_percent")
	private BigDecimal diffPercent;

	/** The exp item detail. */
	@JsonProperty("itms")
	private List<ExpItemDetail> expItemDetails;

	@JsonProperty("exp_typ")
	private String expTyp;

	/**
	 * Gets the tax payer action.
	 *
	 * @return the flag
	 */
	public String getFlag() {
		return flag;
	}

	/**
	 * Sets the tax payer action.
	 * 
	 * Field Specification: One Character(D) (D-Delete (For deleting invoices))
	 *
	 * @param flag
	 *            the new flag
	 */
	public void setFlag(String flag) {
		this.flag = flag;
	}

	/**
	 * Gets the The Invoice Check sum value.
	 *
	 * Field Specification: string(Max length:15)
	 *
	 * Sample value: AflJufPlFStqKBZ
	 *
	 * @return the chksum
	 */
	public String getChksum() {
		return chksum;
	}

	/**
	 * Sets the The Invoice Check sum value.
	 *
	 * Field Specification: string(Max length:15)
	 *
	 * Sample value: AflJufPlFStqKBZ
	 *
	 * @param chksum
	 *            the new chksum
	 */
	public void setChksum(String chksum) {
		this.chksum = chksum;
	}

	/**
	 * Gets the Supplier Invoice Number.
	 *
	 * Field Specification: Alphanumeric (Max length:50)
	 *
	 * Sample value: S008400
	 *
	 * @return the inum
	 */
	public String getInum() {
		return inum;
	}

	/**
	 * Sets the Supplier Invoice Number.
	 *
	 * Field Specification: Alphanumeric (Max length:50)
	 *
	 * Sample value: S008400
	 *
	 * @param inum
	 *            the new inum
	 */
	public void setInum(String inum) {
		this.inum = inum;
	}

	/**
	 * Gets the Supplier Invoice Date.
	 *
	 * Field Specification: string (DD-MM-YYYY)
	 *
	 * Sample value: 03-02-2016
	 *
	 * @return the idt
	 */
	public String getIdt() {
		return idt;
	}

	/**
	 * Sets the Supplier Invoice Date.
	 *
	 * Field Specification: string (DD-MM-YYYY)
	 *
	 * Sample value: 03-02-2016
	 *
	 * @param idt
	 *            the new idt
	 */
	public void setIdt(String idt) {
		this.idt = idt;
	}

	/**
	 * Gets the Supplier Invoice Value.
	 *
	 * Field Specification: Decimal(15,2)
	 *
	 * Sample value: 10000.00
	 *
	 * @return the val
	 */
	public BigDecimal getVal() {
		return val;
	}

	/**
	 * Sets the Supplier Invoice Value.
	 *
	 * Field Specification: Decimal(15,2)
	 *
	 * Sample value: 10000.00
	 *
	 * @param val
	 *            the new val
	 */
	public void setVal(BigDecimal val) {
		this.val = val;
	}



	/**
	 * Gets the sbnum.
	 *
	 * @return the sbnum
	 */
	public String getSbnum() {
		return sbnum;
	}

	/**
	 * Sets the sbnum.
	 *
	 * @param sbnum the new sbnum
	 */
	public void setSbnum(String sbnum) {
		this.sbnum = sbnum;
	}

	/**
	 * Gets the Shipping Bill Date. or Bill of Export Date.
	 * 
	 * Field Specification: string (DD-MM-YYYY)
	 * 
	 * Sample value: 04-03-2016
	 *
	 * @return the sbdt
	 */
	public String getSbdt() {
		return sbdt;
	}

	/**
	 * Sets the Shipping Bill Date. or Bill of Export Date.
	 *
	 * Field Specification: string (DD-MM-YYYY)
	 *
	 * Sample value: 04-03-2016
	 *
	 * @param sbdt
	 *            the new sbdt
	 */
	public void setSbdt(String sbdt) {
		this.sbdt = sbdt;
	}

	/**
	 * Gets the Port Code.
	 *
	 * Field Specification: Alphanumeric (Max length:25)
	 *
	 *
	 * Sample value: SB12345654
	 *
	 * @return the sbpcode
	 */
	public String getSbpcode() {
		return sbpcode;
	}

	/**
	 * Sets the Port Code.
	 *
	 * Field Specification: Alphanumeric (Max length:25)
	 *
	 * Sample value: SB12345654
	 *
	 * @param sbpcode
	 *            the new sbpcode
	 */
	public void setSbpcode(String sbpcode) {
		this.sbpcode = sbpcode;
	}

	/**
	 * Gets the Provisional Assesment.
	 *
	 * Field Specification: One Character(Y/N)
	 *
	 * Sample value: Y
	 *
	 * @return the prs
	 */
	public String getPrs() {
		return prs;
	}

	/**
	 * Sets the Provisional Assesment.
	 *
	 * Field Specification: One Character(Y/N)
	 *
	 * Sample value: Y
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
	 * Field Specification: Alphanumeric (Max length:30)
	 *
	 * Sample value: S008400
	 *
	 * @return the od num
	 */
	public String getOdNum() {
		return odNum;
	}

	/**
	 * Sets the Order Number.
	 *
	 * Field Specification: Alphanumeric (Max length:30)
	 *
	 * Sample value: S008400
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
	 * Field Specification: string (DD-MM-YYYY)
	 *
	 * Sample value: 03-02-2016
	 *
	 * @return the od dt
	 */
	public String getOdDt() {
		return odDt;
	}

	/**
	 * Sets the Order Date.
	 *
	 * Field Specification: string (DD-MM-YYYY)
	 *
	 * Sample value: 03-02-2016
	 *
	 * @param odDt
	 *            the new od dt
	 */
	public void setOdDt(String odDt) {
		this.odDt = odDt;
	}

	/**
	 * Gets the b 2 b item details.
	 *
	 * @return the b 2 b item details
	 */
	public List<ExpItemDetail> getExpItemDetails() {
		return expItemDetails;
	}

	/**
	 * Sets the b 2 b item details.
	 *
	 * @param expItemDetails the new exp item details
	 */
	public void setExpItemDetails(List<ExpItemDetail> expItemDetails) {
		this.expItemDetails = expItemDetails;
	}

	public String getExpTyp() {
		return expTyp;
	}

	public void setExpTyp(String expTyp) {
		this.expTyp = expTyp;
	}
	
	
	@Override
	public String toString(){
		StringBuilder builder = new StringBuilder();
		/*
		if (expTyp != null) {
			builder.append("exp_typ=");
			builder.append(expTyp);	
			builder.append(",");	
		}
		*/
		if (idt != null) {
			builder.append("idt=");
			builder.append(idt);	
			builder.append(",");	
		}
		if (inum != null) {
			builder.append("inum=");
			builder.append(inum);	
			builder.append(",");	
		}
		if (expItemDetails != null) {
			builder.append("itms=");
			builder.append(expItemDetails);	
			Collections.sort(expItemDetails, new ExpItemDetailsComparator());
			builder.append(StringUtils.join(expItemDetails,","));
			builder.append(",");	
		}
		if (sbdt != null) {
			builder.append("sbdt=");
			builder.append(sbdt);	
			builder.append(",");	
		}
		if (sbnum != null) {
			builder.append("sbnum=");
			builder.append(sbnum);	
			builder.append(",");	
		}
		if (sbpcode != null) {
			builder.append("sbpcode=");
			builder.append(sbpcode);	
			builder.append(",");	
		}
		if (val != null) {
			builder.append("val=");
			builder.append(val);	
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
