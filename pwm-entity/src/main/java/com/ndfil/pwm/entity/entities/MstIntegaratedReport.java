package com.ndfil.pwm.entity.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the mst_integarated_report database table.
 * 
 */
@Entity
@Table(name="mst_integarated_report")
@NamedQuery(name="MstIntegaratedReport.findAll", query="SELECT m FROM MstIntegaratedReport m")
public class MstIntegaratedReport implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="request_id")
	private double requestId;

	@Lob
	@Column(name="app_city")
	private String appCity;

	@Lob
	@Column(name="app_store")
	private String appStore;

	@Lob
	@Column(name="app_zone")
	private String appZone;

	@Lob
	private String article;

	@Lob
	@Column(name="bonus_buy")
	private String bonusBuy;

	@Lob
	@Column(name="budiness_exigence")
	private String budinessExigence;

	@Lob
	private String campaign;

	@Lob
	private String category;

	@Temporal(TemporalType.DATE)
	@Column(name="date_from")
	private Date dateFrom;

	@Temporal(TemporalType.DATE)
	@Column(name="date_to")
	private Date dateTo;

	@Column(name="date_type")
	private int dateType;

	@Column(name="file_path")
	private String filePath;

	@Lob
	@Column(name="gst_selection")
	private String gstSelection;

	@Lob
	@Column(name="ini_location")
	private String iniLocation;

	@Lob
	@Column(name="marketing_type")
	private String marketingType;

	@Lob
	private String mclist;

	@Lob
	private String objective;

	@Lob
	@Column(name="offer_details")
	private String offerDetails;

	@Lob
	@Column(name="output_col")
	private String outputCol;

	private String remarks;

	@Temporal(TemporalType.DATE)
	@Column(name="report_date")
	private Date reportDate;

	@Column(name="report_status_id")
	private double reportStatusId;

	@Lob
	@Column(name="search_status")
	private String searchStatus;

	@Lob
	@Column(name="settlement_method")
	private String settlementMethod;

	@Lob
	private String subcategory;

	@Lob
	@Column(name="ticket_req")
	private String ticketReq;

	@Lob
	@Column(name="vendor_back")
	private String vendorBack;

	//bi-directional many-to-one association to MstEmployee
	@ManyToOne
	@JoinColumn(name="created_by")
	private MstEmployee mstEmployee;

	//bi-directional many-to-one association to MstReportType
	@ManyToOne
	@JoinColumn(name="mst_report_type_id")
	private MstReportType mstReportType;

	public MstIntegaratedReport() {
	}

	public double getRequestId() {
		return this.requestId;
	}

	public void setRequestId(double requestId) {
		this.requestId = requestId;
	}

	public String getAppCity() {
		return this.appCity;
	}

	public void setAppCity(String appCity) {
		this.appCity = appCity;
	}

	public String getAppStore() {
		return this.appStore;
	}

	public void setAppStore(String appStore) {
		this.appStore = appStore;
	}

	public String getAppZone() {
		return this.appZone;
	}

	public void setAppZone(String appZone) {
		this.appZone = appZone;
	}

	public String getArticle() {
		return this.article;
	}

	public void setArticle(String article) {
		this.article = article;
	}

	public String getBonusBuy() {
		return this.bonusBuy;
	}

	public void setBonusBuy(String bonusBuy) {
		this.bonusBuy = bonusBuy;
	}

	public String getBudinessExigence() {
		return this.budinessExigence;
	}

	public void setBudinessExigence(String budinessExigence) {
		this.budinessExigence = budinessExigence;
	}

	public String getCampaign() {
		return this.campaign;
	}

	public void setCampaign(String campaign) {
		this.campaign = campaign;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Date getDateFrom() {
		return this.dateFrom;
	}

	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}

	public Date getDateTo() {
		return this.dateTo;
	}

	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}

	public int getDateType() {
		return this.dateType;
	}

	public void setDateType(int dateType) {
		this.dateType = dateType;
	}

	public String getFilePath() {
		return this.filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getGstSelection() {
		return this.gstSelection;
	}

	public void setGstSelection(String gstSelection) {
		this.gstSelection = gstSelection;
	}

	public String getIniLocation() {
		return this.iniLocation;
	}

	public void setIniLocation(String iniLocation) {
		this.iniLocation = iniLocation;
	}

	public String getMarketingType() {
		return this.marketingType;
	}

	public void setMarketingType(String marketingType) {
		this.marketingType = marketingType;
	}

	public String getMclist() {
		return this.mclist;
	}

	public void setMclist(String mclist) {
		this.mclist = mclist;
	}

	public String getObjective() {
		return this.objective;
	}

	public void setObjective(String objective) {
		this.objective = objective;
	}

	public String getOfferDetails() {
		return this.offerDetails;
	}

	public void setOfferDetails(String offerDetails) {
		this.offerDetails = offerDetails;
	}

	public String getOutputCol() {
		return this.outputCol;
	}

	public void setOutputCol(String outputCol) {
		this.outputCol = outputCol;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Date getReportDate() {
		return this.reportDate;
	}

	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}

	public double getReportStatusId() {
		return this.reportStatusId;
	}

	public void setReportStatusId(double reportStatusId) {
		this.reportStatusId = reportStatusId;
	}

	public String getSearchStatus() {
		return this.searchStatus;
	}

	public void setSearchStatus(String searchStatus) {
		this.searchStatus = searchStatus;
	}

	public String getSettlementMethod() {
		return this.settlementMethod;
	}

	public void setSettlementMethod(String settlementMethod) {
		this.settlementMethod = settlementMethod;
	}

	public String getSubcategory() {
		return this.subcategory;
	}

	public void setSubcategory(String subcategory) {
		this.subcategory = subcategory;
	}

	public String getTicketReq() {
		return this.ticketReq;
	}

	public void setTicketReq(String ticketReq) {
		this.ticketReq = ticketReq;
	}

	public String getVendorBack() {
		return this.vendorBack;
	}

	public void setVendorBack(String vendorBack) {
		this.vendorBack = vendorBack;
	}

	public MstEmployee getMstEmployee() {
		return this.mstEmployee;
	}

	public void setMstEmployee(MstEmployee mstEmployee) {
		this.mstEmployee = mstEmployee;
	}

	public MstReportType getMstReportType() {
		return this.mstReportType;
	}

	public void setMstReportType(MstReportType mstReportType) {
		this.mstReportType = mstReportType;
	}

}