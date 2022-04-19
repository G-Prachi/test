package com.mind.egsp.gstn.model.gstr1;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The Class DocIssueInvoice.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class DocIssueInvoice implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The flag. */
	private Character flag;

	/** The chksum. */
	private String chksum;

	/** The document issued details. */

	@JsonProperty("doc_det")
	private List<DocumentIssuedDetail> documentIssuedDetails;

	/**
	 * Gets the flag.
	 *
	 * @return the flag
	 */
	public Character getFlag() {
		return flag;
	}

	/**
	 * Sets the flag.
	 *
	 * @param flag
	 *            the new flag
	 */
	public void setFlag(Character flag) {
		this.flag = flag;
	}

	/**
	 * Gets the chksum.
	 *
	 * @return the chksum
	 */
	public String getChksum() {
		return chksum;
	}

	/**
	 * Sets the chksum.
	 *
	 * @param chksum
	 *            the new chksum
	 */
	public void setChksum(String chksum) {
		this.chksum = chksum;
	}

	/**
	 * Gets the document issued details.
	 *
	 * @return the document issued details
	 */
	public List<DocumentIssuedDetail> getDocumentIssuedDetails() {
		return documentIssuedDetails;
	}

	/**
	 * Sets the document issued details.
	 *
	 * @param documentIssuedDetails
	 *            the new document issued details
	 */
	public void setDocumentIssuedDetails(List<DocumentIssuedDetail> documentIssuedDetails) {
		this.documentIssuedDetails = documentIssuedDetails;
	}



}
