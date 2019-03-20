package com.ndfil.pwm.entity.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the mst_report_type database table.
 * 
 */
@Entity
@Table(name="mst_report_type")
@NamedQuery(name="MstReportType.findAll", query="SELECT m FROM MstReportType m")
public class MstReportType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="mst_report_type_id")
	private String mstReportTypeId;

	@Column(name="mst_report_type_desc")
	private String mstReportTypeDesc;

	//bi-directional many-to-one association to MstIntegaratedReport
	@OneToMany(mappedBy="mstReportType")
	private List<MstIntegaratedReport> mstIntegaratedReports;

	//bi-directional many-to-one association to MstReport
	@OneToMany(mappedBy="mstReportType")
	private List<MstReport> mstReports;

	//bi-directional many-to-one association to MstReportEmail
	@OneToMany(mappedBy="mstReportType")
	private List<MstReportEmail> mstReportEmails;

	//bi-directional many-to-one association to ReportCol
	@OneToMany(mappedBy="mstReportType")
	private List<ReportCol> reportCols;

	public MstReportType() {
	}

	public String getMstReportTypeId() {
		return this.mstReportTypeId;
	}

	public void setMstReportTypeId(String mstReportTypeId) {
		this.mstReportTypeId = mstReportTypeId;
	}

	public String getMstReportTypeDesc() {
		return this.mstReportTypeDesc;
	}

	public void setMstReportTypeDesc(String mstReportTypeDesc) {
		this.mstReportTypeDesc = mstReportTypeDesc;
	}

	public List<MstIntegaratedReport> getMstIntegaratedReports() {
		return this.mstIntegaratedReports;
	}

	public void setMstIntegaratedReports(List<MstIntegaratedReport> mstIntegaratedReports) {
		this.mstIntegaratedReports = mstIntegaratedReports;
	}

	public MstIntegaratedReport addMstIntegaratedReport(MstIntegaratedReport mstIntegaratedReport) {
		getMstIntegaratedReports().add(mstIntegaratedReport);
		mstIntegaratedReport.setMstReportType(this);

		return mstIntegaratedReport;
	}

	public MstIntegaratedReport removeMstIntegaratedReport(MstIntegaratedReport mstIntegaratedReport) {
		getMstIntegaratedReports().remove(mstIntegaratedReport);
		mstIntegaratedReport.setMstReportType(null);

		return mstIntegaratedReport;
	}

	public List<MstReport> getMstReports() {
		return this.mstReports;
	}

	public void setMstReports(List<MstReport> mstReports) {
		this.mstReports = mstReports;
	}

	public MstReport addMstReport(MstReport mstReport) {
		getMstReports().add(mstReport);
		mstReport.setMstReportType(this);

		return mstReport;
	}

	public MstReport removeMstReport(MstReport mstReport) {
		getMstReports().remove(mstReport);
		mstReport.setMstReportType(null);

		return mstReport;
	}

	public List<MstReportEmail> getMstReportEmails() {
		return this.mstReportEmails;
	}

	public void setMstReportEmails(List<MstReportEmail> mstReportEmails) {
		this.mstReportEmails = mstReportEmails;
	}

	public MstReportEmail addMstReportEmail(MstReportEmail mstReportEmail) {
		getMstReportEmails().add(mstReportEmail);
		mstReportEmail.setMstReportType(this);

		return mstReportEmail;
	}

	public MstReportEmail removeMstReportEmail(MstReportEmail mstReportEmail) {
		getMstReportEmails().remove(mstReportEmail);
		mstReportEmail.setMstReportType(null);

		return mstReportEmail;
	}

	public List<ReportCol> getReportCols() {
		return this.reportCols;
	}

	public void setReportCols(List<ReportCol> reportCols) {
		this.reportCols = reportCols;
	}

	public ReportCol addReportCol(ReportCol reportCol) {
		getReportCols().add(reportCol);
		reportCol.setMstReportType(this);

		return reportCol;
	}

	public ReportCol removeReportCol(ReportCol reportCol) {
		getReportCols().remove(reportCol);
		reportCol.setMstReportType(null);

		return reportCol;
	}

}