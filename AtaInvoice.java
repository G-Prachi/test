package com.mind.egsp.gstn.model.gstr1;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class AtaInvoice.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_EMPTY)
public class AtaInvoice extends AtInvoice implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The Original CounterParty Gstin or Name. */
	private String ocpty;

	/** The Original Supplier Document Number. */
	@JsonProperty("odoc_num")
	private String odocNum;

	/** The Original Supplier Document Date . */
	@JsonProperty("odoc_dt")
	private String odocDt;

	/**
	 * Gets the Original CounterParty Gstin or Name
	 * 
	 * Field Specification: Alphanumeric (Max length:50)
	 * 
	 * Sample Data: 06ADECO9084R5Z4 .
	 *
	 * @return the ocpty
	 */

	public String getOcpty() {
		return ocpty;
	}

	/**
	 * Sets the Original CounterParty Gstin or Name
	 * 
	 * Field Specification: Alphanumeric (Max length:50)
	 * 
	 * Sample Data: 06ADECO9084R5Z4 .
	 *
	 * @param ocpty
	 *            the new ocpty
	 */

	public void setOcpty(String ocpty) {
		this.ocpty = ocpty;
	}

	/**
	 * Gets the Original Supplier Document Number
	 * 
	 * Field Specification: Alphanumeric (Max length:50)
	 * 
	 * Sample Data: A100052 .
	 *
	 * @return the odoc num
	 */

	public String getOdocNum() {
		return odocNum;
	}

	/**
	 * Sets the Original Supplier Document Number
	 * 
	 * Field Specification: Alphanumeric (Max length:50)
	 * 
	 * Sample Data: A100052 .
	 *
	 * @param odocNum
	 *            the new odoc num
	 */

	public void setOdocNum(String odocNum) {
		this.odocNum = odocNum;
	}

	/**
	 * Gets the Original Supplier Document Date
	 * 
	 * Field Specification: string (DD-MM-YYYY)
	 * 
	 * Sample Data: 20-05-2016 .
	 *
	 * @return the odoc dt
	 */

	public String getOdocDt() {
		return odocDt;
	}

	/**
	 * Sets the Original Supplier Document Date
	 * 
	 * Field Specification: string (DD-MM-YYYY)
	 * 
	 * Sample Data: 20-05-2016 .
	 *
	 * @param odocDt
	 *            the new odoc dt
	 */

	public void setOdocDt(String odocDt) {
		this.odocDt = odocDt;
	}

}
