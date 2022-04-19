package com.mind.egsp.gstn.model.gstr1;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class DocumentList.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class DocumentList implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The num. */
	private int num;

	/** The from. */
	private String from;

	/** The to. */
	private String to;

	/** The totnum. */
	private int totnum;

	/** The cancel. */
	private int cancel;

	/** The net issue. */
	@JsonProperty("net_issue")
	private int netIssue;

	/**
	 * Gets the num.
	 *
	 * @return the num
	 */
	public int getNum() {
		return num;
	}

	/**
	 * Sets the num.
	 *
	 * @param num
	 *            the new num
	 */
	public void setNum(int num) {
		this.num = num;
	}

	/**
	 * Gets the from.
	 *
	 * @return the from
	 */
	public String getFrom() {
		return from;
	}

	/**
	 * Sets the from.
	 *
	 * @param from
	 *            the new from
	 */
	public void setFrom(String from) {
		this.from = from;
	}

	/**
	 * Gets the to.
	 *
	 * @return the to
	 */
	public String getTo() {
		return to;
	}

	/**
	 * Sets the to.
	 *
	 * @param to
	 *            the new to
	 */
	public void setTo(String to) {
		this.to = to;
	}

	/**
	 * Gets the totnum.
	 *
	 * @return the totnum
	 */
	public int getTotnum() {
		return totnum;
	}

	/**
	 * Sets the totnum.
	 *
	 * @param totnum
	 *            the new totnum
	 */
	public void setTotnum(int totnum) {
		this.totnum = totnum;
	}

	/**
	 * Gets the cancel.
	 *
	 * @return the cancel
	 */
	public int getCancel() {
		return cancel;
	}

	/**
	 * Sets the cancel.
	 *
	 * @param cancel
	 *            the new cancel
	 */
	public void setCancel(int cancel) {
		this.cancel = cancel;
	}

	/**
	 * Gets the net issue.
	 *
	 * @return the net issue
	 */
	public int getNetIssue() {
		return netIssue;
	}

	/**
	 * Sets the net issue.
	 *
	 * @param netIssue
	 *            the new net issue
	 */
	public void setNetIssue(int netIssue) {
		this.netIssue = netIssue;
	}
	

public String toString(){
	StringBuilder builder = new StringBuilder();
	if (cancel != 0) {
		builder.append("cancel=");
		builder.append(cancel);	
		builder.append(",");	
	}
	if (from != null) {
		builder.append("from=");
		builder.append(from);	
		builder.append(",");	
	}
	if (netIssue != 0) {
		builder.append("net_issue=");
		builder.append(netIssue);	
		builder.append(",");	
	}
	if (num != 0) {
		builder.append("num=");
		builder.append(num);	
		builder.append(",");	
	}
	if (to != null) {
		builder.append("to=");
		builder.append(to);	
		builder.append(",");	
	}
	if (totnum != 0) {
		builder.append("totnum=");
		builder.append(totnum);	
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
