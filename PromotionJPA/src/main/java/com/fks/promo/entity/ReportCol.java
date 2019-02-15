package com.fks.promo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the report_col database table.
 * 
 */
@Entity
@Table(name="report_col")
@NamedQuery(name="ReportCol.findAll", query="SELECT r FROM ReportCol r")
public class ReportCol implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Temporal(TemporalType.DATE)
	@Column(name="crt_dt")
	private Date crtDt;

	@Column(name="crt_usr")
	private int crtUsr;

	@Column(name="db_name")
	private String dbName;

	@Column(name="disp_name")
	private String dispName;

	@Column(name="is_active")
	private int isActive;

	@Column(name="is_selected")
	private int isSelected;

	@Column(name="sort_id")
	private int sortId;

	@Temporal(TemporalType.DATE)
	@Column(name="updt_date")
	private Date updtDate;

	@Column(name="updt_usr")
	private int updtUsr;

	//bi-directional many-to-one association to MstReportType
	@ManyToOne
	@JoinColumn(name="report_id")
	private MstReportType mstReportType;

	public ReportCol() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCrtDt() {
		return this.crtDt;
	}

	public void setCrtDt(Date crtDt) {
		this.crtDt = crtDt;
	}

	public int getCrtUsr() {
		return this.crtUsr;
	}

	public void setCrtUsr(int crtUsr) {
		this.crtUsr = crtUsr;
	}

	public String getDbName() {
		return this.dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public String getDispName() {
		return this.dispName;
	}

	public void setDispName(String dispName) {
		this.dispName = dispName;
	}

	public int getIsActive() {
		return this.isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public int getIsSelected() {
		return this.isSelected;
	}

	public void setIsSelected(int isSelected) {
		this.isSelected = isSelected;
	}

	public int getSortId() {
		return this.sortId;
	}

	public void setSortId(int sortId) {
		this.sortId = sortId;
	}

	public Date getUpdtDate() {
		return this.updtDate;
	}

	public void setUpdtDate(Date updtDate) {
		this.updtDate = updtDate;
	}

	public int getUpdtUsr() {
		return this.updtUsr;
	}

	public void setUpdtUsr(int updtUsr) {
		this.updtUsr = updtUsr;
	}

	public MstReportType getMstReportType() {
		return this.mstReportType;
	}

	public void setMstReportType(MstReportType mstReportType) {
		this.mstReportType = mstReportType;
	}

}