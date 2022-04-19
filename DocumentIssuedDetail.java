package com.mind.egsp.gstn.model.gstr1;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class DocumentIssuedDetail implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The doc num. */
	@JsonProperty("doc_num")
	private int docNum;

	/** The tax payer action. */
	private String flag;

	/** The Invoice Check sum value. */
	private String chksum;

	/** The doc typ. */
	// @JsonProperty("doc_typ")
	@JsonIgnore
	private String docTyp;

	/** The document lists. */
	@JsonProperty("docs")
	private List<DocumentList> documentLists;

	/**
	 * Gets the doc num.
	 *
	 * @return the doc num
	 */
	public int getDocNum() {
		return docNum;
	}

	/**
	 * Sets the doc num.
	 *
	 * @param docNum
	 *            the new doc num
	 */
	public void setDocNum(int docNum) {
		this.docNum = docNum;
	}

	/**
	 * Gets the doc typ.
	 *
	 * @return the doc typ
	 */
	public String getDocTyp() {
		return docTyp;
	}

	/**
	 * Sets the doc typ.
	 *
	 * @param docTyp
	 *            the new doc typ
	 */
	public void setDocTyp(String docTyp) {
		this.docTyp = docTyp;
	}

	/**
	 * Gets the document lists.
	 *
	 * @return the document lists
	 */
	public List<DocumentList> getDocumentLists() {
		return documentLists;
	}

	/**
	 * Sets the document lists.
	 *
	 * @param documentLists
	 *            the new document lists
	 */
	public void setDocumentLists(List<DocumentList> documentLists) {
		this.documentLists = documentLists;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getChksum() {
		return chksum;
	}

	public void setChksum(String chksum) {
		this.chksum = chksum;
	}
	
	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append("doc_det=");
		if (docNum != 0) {
			builder.append("doc_num=");
			builder.append(docNum);	
			builder.append(",");	
		}
		if (documentLists != null) {
			builder.append("docs=");
			builder.append(documentLists);	
			Collections.sort(documentLists, new DocumentListsComparator());
			builder.append(StringUtils.join(documentLists,","));
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
