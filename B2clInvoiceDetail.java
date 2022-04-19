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
 * The Class B2clInvoiceDetail.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_EMPTY)
public class B2clInvoiceDetail implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The tax payer action. */
	private String flag;

	/** The Invoice Check sum value. */
	private String chksum;

	/** The Counter party name. */
	@JsonIgnore
	private String cname;

	/** The Supplier Invoice Number. */
	private String inum;

	/** The Supplier Invoice Date. */
	private String idt;

	/** The Supplier Invoice Value. */
	private BigDecimal val;

	private String invTyp;
	/**
	 * The Place of Supply (Only if its different from the location of
	 * recipient).
	 */
	@JsonIgnore
	private String pos;

	/** The Provisional assessment. */
	@JsonIgnore
	private Character prs;

	/** The Order Number. */
	@JsonProperty("od_num")
	@JsonIgnore
	private String odNum;

	/** The Order Date. */
	// @JsonProperty("od_dt")
	@JsonIgnore
	private String odDt;

	/** The Ecommerce Gstin. */
	private String etin;

	@JsonProperty("diff_percent")
	private BigDecimal diffPercent;
	/** The B2clItems. */
	@JsonProperty("itms")
	private List<B2clItem> b2clItems;
	private Character rchrg;

	/**
	 * Gets the flag.
	 *
	 * @return the flag
	 */
	public String getFlag() {
		return flag;
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
	 * Sets the flag.
	 *
	 * @param flag
	 *            the new flag
	 */
	public void setFlag(String flag) {
		this.flag = flag;
	}

	/**
	 * Gets the Invoice Check sum value
	 * 
	 * Field Specification: string(Max length:15)
	 * 
	 * Sample Data: AflJufPlFStqKBZ .
	 *
	 * @return the chksum
	 */

	public String getChksum() {
		return chksum;
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
	 * Sets the Invoice Check sum value
	 * 
	 * Field Specification: string(Max length:15)
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
	 * Gets the Counter party name
	 * 
	 * Field Specification: String (Max length:90)
	 * 
	 * Sample Data: .
	 *
	 * @return the cname
	 */
	public String getCname() {
		return cname;
	}

	/**
	 * Sets the Counter party name
	 * 
	 * Field Specification: String (Max length:90)
	 * 
	 * Sample Data: .
	 *
	 * @param cname
	 *            the new cname
	 */
	public void setCname(String cname) {
		this.cname = cname;
	}

	/**
	 * Gets the Supplier Invoice Number
	 * 
	 * Field Specification: Alphanumeric (Max length:50)
	 * 
	 * Sample Data: S008400 .
	 *
	 * @return the inum
	 */
	public String getInum() {
		return inum;
	}

	/**
	 * Sets the Supplier Invoice Number
	 * 
	 * Field Specification: Alphanumeric (Max length:50)
	 * 
	 * Sample Data: S008400 .
	 *
	 * @param inum
	 *            the new inum
	 */
	public void setInum(String inum) {
		this.inum = inum;
	}

	/**
	 * Gets the Supplier Invoice Date
	 * 
	 * Field Specification: string (DD-MM-YYYY)
	 * 
	 * Sample Data: 03-02-2016 .
	 *
	 * @return the idt
	 */
	public String getIdt() {
		return idt;
	}

	/**
	 * Sets the Supplier Invoice Date
	 * 
	 * Field Specification: string (DD-MM-YYYY)
	 * 
	 * Sample Data: 03-02-2016 .
	 *
	 * @param idt
	 *            the new idt
	 */
	public void setIdt(String idt) {
		this.idt = idt;
	}

	/**
	 * Gets the Supplier Invoice Value
	 * 
	 * Field Specification: Decimal(15,2)
	 * 
	 * Sample Data: 10000.00 .
	 *
	 * @return the val
	 */
	public BigDecimal getVal() {
		return val;
	}

	/**
	 * Sets the Supplier Invoice Value
	 * 
	 * Field Specification: Decimal(15,2)
	 * 
	 * Sample Data: 10000.00 .
	 *
	 * @param val
	 *            the new val
	 */
	public void setVal(BigDecimal val) {
		this.val = val;
	}

	/**
	 * Gets the Place of Supply (Only if its different from the location of
	 * recipient)
	 * 
	 * Field Specification: String(Max length:2)
	 * 
	 * Sample Data: 04 .
	 *
	 * @return the pos
	 */
	public String getPos() {
		return pos;
	}

	/**
	 * Sets the Place of Supply (Only if its different from the location of
	 * recipient)
	 * 
	 * Field Specification: String(Max length:2)
	 * 
	 * Sample Data: 04 .
	 *
	 * @param pos
	 *            the new pos
	 */
	public void setPos(String pos) {
		this.pos = pos;
	}

	public Character getPrs() {
		return prs;
	}

	public void setPrs(Character prs) {
		this.prs = prs;
	}

	/**
	 * Gets the Order Number
	 * 
	 * Field Specification: Alphanumeric (Max length:30)
	 * 
	 * Sample Data: S008400 .
	 *
	 * @return the od num
	 */
	public String getOdNum() {
		return odNum;
	}

	/**
	 * Sets the Order Number
	 * 
	 * Field Specification: Alphanumeric (Max length:30)
	 * 
	 * Sample Data: S008400 .
	 *
	 * @param odNum
	 *            the new od num
	 */
	public void setOdNum(String odNum) {
		this.odNum = odNum;
	}

	/**
	 * Gets the Order Date
	 * 
	 * Field Specification: string (DD-MM-YYYY)
	 * 
	 * Sample Data: 03-02-2016 .
	 *
	 * @return the od dt
	 */
	public String getOdDt() {
		return odDt;
	}

	/**
	 * Sets the Order Date
	 * 
	 * Field Specification: string (DD-MM-YYYY)
	 * 
	 * Sample Data: 03-02-2016 .
	 *
	 * @param odDt
	 *            the new od dt
	 */
	public void setOdDt(String odDt) {
		this.odDt = odDt;
	}

	/**
	 * Gets the Ecommerce Gstin
	 * 
	 * Field Specification: Alphanumeric with 15 characters
	 * 
	 * Sample Data: 29HJKPS9689A8Z4 .
	 *
	 * @return the etin
	 */
	public String getEtin() {
		return etin;
	}

	/**
	 * Sets the Ecommerce Gstin
	 * 
	 * Field Specification: Alphanumeric with 15 characters
	 * 
	 * Sample Data: 29HJKPS9689A8Z4 .
	 *
	 * @param etin
	 *            the new etin
	 */
	public void setEtin(String etin) {
		this.etin = etin;
	}

	/**
	 * Gets the b 2 cl items.
	 *
	 * @return the b 2 cl items
	 */
	public List<B2clItem> getB2clItems() {
		return b2clItems;
	}

	/**
	 * Sets the b 2 cl items.
	 *
	 * @param b2clItems
	 *            the new b 2 cl items
	 */
	public void setB2clItems(List<B2clItem> b2clItems) {
		this.b2clItems = b2clItems;
	}

	
	@Override
	public String toString(){
		StringBuilder builder = new StringBuilder();
		/*if (etin != null) {
			builder.append("etin=");
			builder.append(etin);	
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
		if (b2clItems != null) {
			builder.append("itms=");
			builder.append(b2clItems);	
			Collections.sort(b2clItems, new B2clItemsComparator());
			builder.append(StringUtils.join(b2clItems,","));
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
