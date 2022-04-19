package com.mind.egsp.gstn.model.gstr1;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * The Class ExpaInvoiceDetail.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class ExpaInvoiceDetail extends ExpInvoiceDetail implements Serializable {
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The Original Invoice number. */
	private String oinum;

	/** The Original Invoice date. */
	private String oidt;
	
	private List<ExpaInvoiceDetail> ExpaInvoiceDetails;
	private String idt; 
	private BigDecimal totaltxval;
	private BigDecimal totaliamt;
	private BigDecimal totalcamt;
	private BigDecimal totalsamt;
	private BigDecimal totalcsamt;
	private String businessType;
	private String fp;
	

	/**
	 * Gets Original Invoice number Field
	 * 
	 * Specification: Alphanumeric (Max length:50)
	 * 
	 * Sample Data A38610200.
	 *
	 * @return the onum
	 */
	public String getOinum() {
		return oinum;
	}
	
	

	/**
	 * Sets Original Invoice number
	 * 
	 * Field Specification: Alphanumeric (Max length:50)
	 * 
	 * Sample Data A38610200.
	 *
	 * @param onum
	 *            the new onum
	 */
	public void setOinum(String oinum) {
		this.oinum = oinum;
	}

	/**
	 * Gets the Original Invoice number
	 * 
	 * Field Specification: Alphanumeric (Max length:50)
	 * 
	 * Sample Data A38610200.
	 *
	 * @return the odt
	 */
	public String getOidt() {
		return oidt;
	}
	
	/**
	 * Gets the B2BA invoice details.
	 *
	 * @return the B2BA invoice details
	 */
	public List<ExpaInvoiceDetail> getExpaInvoiceDetails() {
		return ExpaInvoiceDetails;
	}

	/**
	 * Sets the B2BA invoice details.
	 *
	 * @param b2baInvoiceDetails
	 *            the new B2BA invoice details
	 */
	public void setExpaInvoiceDetails(List<ExpaInvoiceDetail> ExpaInvoiceDetails) {
		this.ExpaInvoiceDetails = ExpaInvoiceDetails;
	}
	
	public String getIdt() {
		return idt;
	}

	public void setIdt(String idt) {
		this.idt = idt;
	}

	public BigDecimal getTotaltxval() {
		return totaltxval;
	}

	public void setTotaltxval(BigDecimal totaltxval) {
		this.totaltxval = totaltxval;
	}

	public BigDecimal getTotaliamt() {
		return totaliamt;
	}

	public void setTotaliamt(BigDecimal totaliamt) {
		this.totaliamt = totaliamt;
	}

	public BigDecimal getTotalcamt() {
		return totalcamt;
	}

	public void setTotalcamt(BigDecimal totalcamt) {
		this.totalcamt = totalcamt;
	}

	public BigDecimal getTotalsamt() {
		return totalsamt;
	}

	public void setTotalsamt(BigDecimal totalsamt) {
		this.totalsamt = totalsamt;
	}

	public BigDecimal getTotalcsamt() {
		return totalcsamt;
	}

	public void setTotalcsamt(BigDecimal totalcsamt) {
		this.totalcsamt = totalcsamt;
	}
	
	public String getBusinessType() {
		return businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getFp() {
		return fp;
	}

	public void setFp(String fp) {
		this.fp = fp;
	}

	/**
	 * Sets the Original Invoice number
	 * 
	 * Field Specification: Alphanumeric (Max length:50)
	 * 
	 * Sample Data A38610200.
	 *
	 * @param odt
	 *            the new odt
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
