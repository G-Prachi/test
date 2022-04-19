package com.mind.egsp.gstn.model.gstr1;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mind.egsp.gstn.model.all.ATErrorReport;
import com.mind.egsp.gstn.model.all.B2BErrorReport;
import com.mind.egsp.gstn.model.all.B2CLErrorReport;
import com.mind.egsp.gstn.model.all.CDNErrorReport;
import com.mind.egsp.gstn.model.all.EXPErrorReport;
import com.mind.egsp.gstn.model.all.HSNErrorReport;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class ErrorReportStructure.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class ErrorReportStructure implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The B 2 B error report. */
	@JsonProperty("b2b")
	private List<B2BErrorReport> B2BErrorReport;

	/** The B 2 BA error report. */
	@JsonProperty("b2ba")
	private List<B2BAErrorReport> B2BAErrorReport;

	/** The B 2 CL error report. */
	@JsonProperty("b2cl")
	private List<B2CLErrorReport> B2CLErrorReport;

	/** The B 2 CLA error report. */
	@JsonProperty("b2cla")
	private List<B2CLAErrorReport> B2CLAErrorReport;

	/** The B 2 CS error report. */
	@JsonProperty("b2cs")
	private List<B2CSErrorReport> B2CSErrorReport;

	/** The B 2 CSA error report. */
	@JsonProperty("b2csa")
	private List<B2CSAErrorReport> B2CSAErrorReport;

	/** The CDN error report. */
	@JsonProperty("cdn")
	private List<CDNErrorReport> CDNErrorReport;

	/** The CDNA error report. */
	@JsonProperty("cdna")
	private List<CDNAErrorReport> CDNAErrorReport;

	/** The Nil rated error report. */
	// TODO: Check for correct property name from api documentation
	@JsonProperty("nil rated")
	private List<NilRatedErrorReport> NilRatedErrorReport;

	/** The EXP error report. */
	@JsonProperty("exp")
	private List<EXPErrorReport> EXPErrorReport;

	/** The EXPA error report. */
	@JsonProperty("expa")
	private List<EXPAErrorReport> EXPAErrorReport;

	/** The AT error report. */
	@JsonProperty("at")
	private List<ATErrorReport> ATErrorReport;

	/** The ATA error report. */
	@JsonProperty("ata")
	private List<ATAErrorReport> ATAErrorReport;

	/** The TXP error report. */
	@JsonProperty("txp")
	private List<TXPErrorReport> TXPErrorReport;

	/** The ECOM error report. */
	@JsonProperty("ecom")
	private List<ECOMErrorReport> ECOMErrorReport;

	/** The HSN error report. */
	@JsonProperty("hsn")
	private List<HSNErrorReport> HSNErrorReport;

	/**
	 * Gets the b 2 B error report.
	 *
	 * @return the b 2 B error report
	 */
	public List<B2BErrorReport> getB2BErrorReport() {
		return B2BErrorReport;
	}

	/**
	 * Sets the b 2 B error report.
	 *
	 * @param b2bErrorReport
	 *            the new b 2 B error report
	 */
	public void setB2BErrorReport(List<B2BErrorReport> b2bErrorReport) {
		B2BErrorReport = b2bErrorReport;
	}

	/**
	 * Gets the b 2 BA error report.
	 *
	 * @return the b 2 BA error report
	 */
	public List<B2BAErrorReport> getB2BAErrorReport() {
		return B2BAErrorReport;
	}

	/**
	 * Sets the b 2 BA error report.
	 *
	 * @param b2baErrorReport
	 *            the new b 2 BA error report
	 */
	public void setB2BAErrorReport(List<B2BAErrorReport> b2baErrorReport) {
		B2BAErrorReport = b2baErrorReport;
	}

	/**
	 * Gets the b 2 CL error report.
	 *
	 * @return the b 2 CL error report
	 */
	public List<B2CLErrorReport> getB2CLErrorReport() {
		return B2CLErrorReport;
	}

	/**
	 * Sets the b 2 CL error report.
	 *
	 * @param b2clErrorReport
	 *            the new b 2 CL error report
	 */
	public void setB2CLErrorReport(List<B2CLErrorReport> b2clErrorReport) {
		B2CLErrorReport = b2clErrorReport;
	}

	/**
	 * Gets the b 2 CLA error report.
	 *
	 * @return the b 2 CLA error report
	 */
	public List<B2CLAErrorReport> getB2CLAErrorReport() {
		return B2CLAErrorReport;
	}

	/**
	 * Sets the b 2 CLA error report.
	 *
	 * @param b2claErrorReport
	 *            the new b 2 CLA error report
	 */
	public void setB2CLAErrorReport(List<B2CLAErrorReport> b2claErrorReport) {
		B2CLAErrorReport = b2claErrorReport;
	}

	/**
	 * Gets the b 2 CS error report.
	 *
	 * @return the b 2 CS error report
	 */
	public List<B2CSErrorReport> getB2CSErrorReport() {
		return B2CSErrorReport;
	}

	/**
	 * Sets the b 2 CS error report.
	 *
	 * @param b2csErrorReport
	 *            the new b 2 CS error report
	 */
	public void setB2CSErrorReport(List<B2CSErrorReport> b2csErrorReport) {
		B2CSErrorReport = b2csErrorReport;
	}

	/**
	 * Gets the b 2 CSA error report.
	 *
	 * @return the b 2 CSA error report
	 */
	public List<B2CSAErrorReport> getB2CSAErrorReport() {
		return B2CSAErrorReport;
	}

	/**
	 * Sets the b 2 CSA error report.
	 *
	 * @param b2csaErrorReport
	 *            the new b 2 CSA error report
	 */
	public void setB2CSAErrorReport(List<B2CSAErrorReport> b2csaErrorReport) {
		B2CSAErrorReport = b2csaErrorReport;
	}

	/**
	 * Gets the CDN error report.
	 *
	 * @return the CDN error report
	 */
	public List<CDNErrorReport> getCDNErrorReport() {
		return CDNErrorReport;
	}

	/**
	 * Sets the CDN error report.
	 *
	 * @param cDNErrorReport
	 *            the new CDN error report
	 */
	public void setCDNErrorReport(List<CDNErrorReport> cDNErrorReport) {
		CDNErrorReport = cDNErrorReport;
	}

	/**
	 * Gets the CDNA error report.
	 *
	 * @return the CDNA error report
	 */
	public List<CDNAErrorReport> getCDNAErrorReport() {
		return CDNAErrorReport;
	}

	/**
	 * Sets the CDNA error report.
	 *
	 * @param cDNAErrorReport
	 *            the new CDNA error report
	 */
	public void setCDNAErrorReport(List<CDNAErrorReport> cDNAErrorReport) {
		CDNAErrorReport = cDNAErrorReport;
	}

	/**
	 * Gets the nil rated error report.
	 *
	 * @return the nil rated error report
	 */
	public List<NilRatedErrorReport> getNilRatedErrorReport() {
		return NilRatedErrorReport;
	}

	/**
	 * Sets the nil rated error report.
	 *
	 * @param nilRatedErrorReport
	 *            the new nil rated error report
	 */
	public void setNilRatedErrorReport(List<NilRatedErrorReport> nilRatedErrorReport) {
		NilRatedErrorReport = nilRatedErrorReport;
	}

	/**
	 * Gets the EXP error report.
	 *
	 * @return the EXP error report
	 */
	public List<EXPErrorReport> getEXPErrorReport() {
		return EXPErrorReport;
	}

	/**
	 * Sets the EXP error report.
	 *
	 * @param eXPErrorReport
	 *            the new EXP error report
	 */
	public void setEXPErrorReport(List<EXPErrorReport> eXPErrorReport) {
		EXPErrorReport = eXPErrorReport;
	}

	/**
	 * Gets the EXPA error report.
	 *
	 * @return the EXPA error report
	 */
	public List<EXPAErrorReport> getEXPAErrorReport() {
		return EXPAErrorReport;
	}

	/**
	 * Sets the EXPA error report.
	 *
	 * @param eXPAErrorReport
	 *            the new EXPA error report
	 */
	public void setEXPAErrorReport(List<EXPAErrorReport> eXPAErrorReport) {
		EXPAErrorReport = eXPAErrorReport;
	}

	/**
	 * Gets the AT error report.
	 *
	 * @return the AT error report
	 */
	public List<ATErrorReport> getATErrorReport() {
		return ATErrorReport;
	}

	/**
	 * Sets the AT error report.
	 *
	 * @param aTErrorReport
	 *            the new AT error report
	 */
	public void setATErrorReport(List<ATErrorReport> aTErrorReport) {
		ATErrorReport = aTErrorReport;
	}

	/**
	 * Gets the ATA error report.
	 *
	 * @return the ATA error report
	 */
	public List<ATAErrorReport> getATAErrorReport() {
		return ATAErrorReport;
	}

	/**
	 * Sets the ATA error report.
	 *
	 * @param aTAErrorReport
	 *            the new ATA error report
	 */
	public void setATAErrorReport(List<ATAErrorReport> aTAErrorReport) {
		ATAErrorReport = aTAErrorReport;
	}

	/**
	 * Gets the TXP error report.
	 *
	 * @return the TXP error report
	 */
	public List<TXPErrorReport> getTXPErrorReport() {
		return TXPErrorReport;
	}

	/**
	 * Sets the TXP error report.
	 *
	 * @param tXPErrorReport
	 *            the new TXP error report
	 */
	public void setTXPErrorReport(List<TXPErrorReport> tXPErrorReport) {
		TXPErrorReport = tXPErrorReport;
	}

	/**
	 * Gets the ECOM error report.
	 *
	 * @return the ECOM error report
	 */
	public List<ECOMErrorReport> getECOMErrorReport() {
		return ECOMErrorReport;
	}

	/**
	 * Sets the ECOM error report.
	 *
	 * @param eCOMErrorReport
	 *            the new ECOM error report
	 */
	public void setECOMErrorReport(List<ECOMErrorReport> eCOMErrorReport) {
		ECOMErrorReport = eCOMErrorReport;
	}

	/**
	 * Gets the HSN error report.
	 *
	 * @return the HSN error report
	 */
	public List<HSNErrorReport> getHSNErrorReport() {
		return HSNErrorReport;
	}

	/**
	 * Sets the HSN error report.
	 *
	 * @param hSNErrorReport
	 *            the new HSN error report
	 */
	public void setHSNErrorReport(List<HSNErrorReport> hSNErrorReport) {
		HSNErrorReport = hSNErrorReport;
	}

}
