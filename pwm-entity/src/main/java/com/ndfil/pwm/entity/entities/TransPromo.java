package com.ndfil.pwm.entity.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the trans_promo database table.
 * 
 */
@Entity
@Table(name="trans_promo")
@NamedQuery(name="TransPromo.findAll", query="SELECT t FROM TransPromo t")
public class TransPromo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="trans_promo_id")
	private String transPromoId;

	@Column(name="bonus_buy")
	private String bonusBuy;

	@Column(name="buy_qty")
	private int buyQty;

	@Column(name="cashier_trigger")
	private String cashierTrigger;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date")
	private Date createdDate;

	@Column(name="end_time")
	private String endTime;

	private BigInteger file_Batch_id;

	private byte friday;

	@Column(name="get_qty")
	private int getQty;

	@Column(name="happy_hour")
	private byte happyHour;

	@Column(name="in_progress")
	private byte inProgress;

	@Column(name="is_file_upload")
	private byte isFileUpload;

	@Column(name="is_ho")
	private byte isHo;

	@Column(name="is_picked_by_scheduler")
	private byte isPickedByScheduler;

	@Column(name="is_visible")
	private byte isVisible;

	@Column(name="jump_offer_id")
	private BigInteger jumpOfferId;

	@Column(name="lsmw_file_path")
	private String lsmwFilePath;

	@Column(name="max_receipt")
	private int maxReceipt;

	private byte monday;

	@Column(name="pos_priority")
	private String posPriority;

	private String priority;

	@Column(name="promo_details")
	private String promoDetails;

	@Column(name="reason_for_rejection")
	private String reasonForRejection;

	@Column(name="rejection_remarks")
	private String rejectionRemarks;

	private String remarks;

	@Column(name="sap_remarks")
	private String sapRemarks;

	private byte saturday;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="scheduler_updated_date")
	private Date schedulerUpdatedDate;

	@Column(name="start_time")
	private String startTime;

	private byte sunday;

	@Column(name="team_member_remarks")
	private String teamMemberRemarks;

	private byte thursday;

	private byte tuesday;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_date")
	private Date updatedDate;

	@Column(name="user_type_id")
	private BigInteger userTypeId;

	@Temporal(TemporalType.DATE)
	@Column(name="valid_from")
	private Date validFrom;

	@Temporal(TemporalType.DATE)
	@Column(name="valid_to")
	private Date validTo;

	@Column(name="vistex_file_path")
	private String vistexFilePath;

	private byte wednesday;

	@Column(name="zone_name")
	private String zoneName;

	//bi-directional many-to-one association to SelfConflictResolution
	@OneToMany(mappedBy="transPromo")
	private List<SelfConflictResolution> selfConflictResolutions;

	//bi-directional many-to-one association to TransPromo
	@ManyToOne
	@JoinColumn(name="parent_node")
	private TransPromo transPromo;

	//bi-directional many-to-one association to TransPromo
	@OneToMany(mappedBy="transPromo")
	private List<TransPromo> transPromos;

	//bi-directional many-to-one association to MstPromo
	@ManyToOne
	@JoinColumn(name="promo_id")
	private MstPromo mstPromo;

	//bi-directional many-to-one association to MstPromotionType
	@ManyToOne
	@JoinColumn(name="promo_type_id")
	private MstPromotionType mstPromotionType;

	//bi-directional many-to-one association to MstEmployee
	@ManyToOne
	@JoinColumn(name="last_updated_by")
	private MstEmployee mstEmployee1;

	//bi-directional many-to-one association to MstStatus
	@ManyToOne
	@JoinColumn(name="status_id")
	private MstStatus mstStatus;

	//bi-directional many-to-one association to MstZone
	@ManyToOne
	@JoinColumn(name="zone_id")
	private MstZone mstZone;

	//bi-directional many-to-one association to MstEmployee
	@ManyToOne
	@JoinColumn(name="created_by")
	private MstEmployee mstEmployee2;

	//bi-directional many-to-one association to MstEmployee
	@ManyToOne
	@JoinColumn(name="executive_id")
	private MstEmployee mstEmployee3;

	//bi-directional many-to-one association to MstEmployee
	@ManyToOne
	@JoinColumn(name="business_exigency_id")
	private MstEmployee mstEmployee4;

	//bi-directional many-to-one association to MstEmployee
	@ManyToOne
	@JoinColumn(name="L1_id")
	private MstEmployee mstEmployee5;

	//bi-directional many-to-one association to MstEmployee
	@ManyToOne
	@JoinColumn(name="L2_id")
	private MstEmployee mstEmployee6;

	//bi-directional many-to-one association to MstEmployee
	@ManyToOne
	@JoinColumn(name="promo_mgr_id")
	private MstEmployee mstEmployee7;

	//bi-directional many-to-one association to TransPromoArticle
	@OneToMany(mappedBy="transPromo")
	private List<TransPromoArticle> transPromoArticles;

	//bi-directional many-to-one association to TransPromoConfig
	@OneToMany(mappedBy="transPromo")
	private List<TransPromoConfig> transPromoConfigs;

	//bi-directional many-to-one association to TransPromoDateModification
	@OneToMany(mappedBy="transPromo")
	private List<TransPromoDateModification> transPromoDateModifications;

	//bi-directional many-to-one association to TransPromoFile
	@OneToMany(mappedBy="transPromo")
	private List<TransPromoFile> transPromoFiles;

	//bi-directional many-to-one association to TransPromoMc
	@OneToMany(mappedBy="transPromo")
	private List<TransPromoMc> transPromoMcs;

	//bi-directional many-to-one association to TransPromoModification
	@OneToMany(mappedBy="transPromo")
	private List<TransPromoModification> transPromoModifications;

	//bi-directional many-to-one association to TransPromoStatus
	@OneToMany(mappedBy="transPromo")
	private List<TransPromoStatus> transPromoStatuses;

	public TransPromo() {
	}

	public String getTransPromoId() {
		return this.transPromoId;
	}

	public void setTransPromoId(String transPromoId) {
		this.transPromoId = transPromoId;
	}

	public String getBonusBuy() {
		return this.bonusBuy;
	}

	public void setBonusBuy(String bonusBuy) {
		this.bonusBuy = bonusBuy;
	}

	public int getBuyQty() {
		return this.buyQty;
	}

	public void setBuyQty(int buyQty) {
		this.buyQty = buyQty;
	}

	public String getCashierTrigger() {
		return this.cashierTrigger;
	}

	public void setCashierTrigger(String cashierTrigger) {
		this.cashierTrigger = cashierTrigger;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public BigInteger getFile_Batch_id() {
		return this.file_Batch_id;
	}

	public void setFile_Batch_id(BigInteger file_Batch_id) {
		this.file_Batch_id = file_Batch_id;
	}

	public byte getFriday() {
		return this.friday;
	}

	public void setFriday(byte friday) {
		this.friday = friday;
	}

	public int getGetQty() {
		return this.getQty;
	}

	public void setGetQty(int getQty) {
		this.getQty = getQty;
	}

	public byte getHappyHour() {
		return this.happyHour;
	}

	public void setHappyHour(byte happyHour) {
		this.happyHour = happyHour;
	}

	public byte getInProgress() {
		return this.inProgress;
	}

	public void setInProgress(byte inProgress) {
		this.inProgress = inProgress;
	}

	public byte getIsFileUpload() {
		return this.isFileUpload;
	}

	public void setIsFileUpload(byte isFileUpload) {
		this.isFileUpload = isFileUpload;
	}

	public byte getIsHo() {
		return this.isHo;
	}

	public void setIsHo(byte isHo) {
		this.isHo = isHo;
	}

	public byte getIsPickedByScheduler() {
		return this.isPickedByScheduler;
	}

	public void setIsPickedByScheduler(byte isPickedByScheduler) {
		this.isPickedByScheduler = isPickedByScheduler;
	}

	public byte getIsVisible() {
		return this.isVisible;
	}

	public void setIsVisible(byte isVisible) {
		this.isVisible = isVisible;
	}

	public BigInteger getJumpOfferId() {
		return this.jumpOfferId;
	}

	public void setJumpOfferId(BigInteger jumpOfferId) {
		this.jumpOfferId = jumpOfferId;
	}

	public String getLsmwFilePath() {
		return this.lsmwFilePath;
	}

	public void setLsmwFilePath(String lsmwFilePath) {
		this.lsmwFilePath = lsmwFilePath;
	}

	public int getMaxReceipt() {
		return this.maxReceipt;
	}

	public void setMaxReceipt(int maxReceipt) {
		this.maxReceipt = maxReceipt;
	}

	public byte getMonday() {
		return this.monday;
	}

	public void setMonday(byte monday) {
		this.monday = monday;
	}

	public String getPosPriority() {
		return this.posPriority;
	}

	public void setPosPriority(String posPriority) {
		this.posPriority = posPriority;
	}

	public String getPriority() {
		return this.priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getPromoDetails() {
		return this.promoDetails;
	}

	public void setPromoDetails(String promoDetails) {
		this.promoDetails = promoDetails;
	}

	public String getReasonForRejection() {
		return this.reasonForRejection;
	}

	public void setReasonForRejection(String reasonForRejection) {
		this.reasonForRejection = reasonForRejection;
	}

	public String getRejectionRemarks() {
		return this.rejectionRemarks;
	}

	public void setRejectionRemarks(String rejectionRemarks) {
		this.rejectionRemarks = rejectionRemarks;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getSapRemarks() {
		return this.sapRemarks;
	}

	public void setSapRemarks(String sapRemarks) {
		this.sapRemarks = sapRemarks;
	}

	public byte getSaturday() {
		return this.saturday;
	}

	public void setSaturday(byte saturday) {
		this.saturday = saturday;
	}

	public Date getSchedulerUpdatedDate() {
		return this.schedulerUpdatedDate;
	}

	public void setSchedulerUpdatedDate(Date schedulerUpdatedDate) {
		this.schedulerUpdatedDate = schedulerUpdatedDate;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public byte getSunday() {
		return this.sunday;
	}

	public void setSunday(byte sunday) {
		this.sunday = sunday;
	}

	public String getTeamMemberRemarks() {
		return this.teamMemberRemarks;
	}

	public void setTeamMemberRemarks(String teamMemberRemarks) {
		this.teamMemberRemarks = teamMemberRemarks;
	}

	public byte getThursday() {
		return this.thursday;
	}

	public void setThursday(byte thursday) {
		this.thursday = thursday;
	}

	public byte getTuesday() {
		return this.tuesday;
	}

	public void setTuesday(byte tuesday) {
		this.tuesday = tuesday;
	}

	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public BigInteger getUserTypeId() {
		return this.userTypeId;
	}

	public void setUserTypeId(BigInteger userTypeId) {
		this.userTypeId = userTypeId;
	}

	public Date getValidFrom() {
		return this.validFrom;
	}

	public void setValidFrom(Date validFrom) {
		this.validFrom = validFrom;
	}

	public Date getValidTo() {
		return this.validTo;
	}

	public void setValidTo(Date validTo) {
		this.validTo = validTo;
	}

	public String getVistexFilePath() {
		return this.vistexFilePath;
	}

	public void setVistexFilePath(String vistexFilePath) {
		this.vistexFilePath = vistexFilePath;
	}

	public byte getWednesday() {
		return this.wednesday;
	}

	public void setWednesday(byte wednesday) {
		this.wednesday = wednesday;
	}

	public String getZoneName() {
		return this.zoneName;
	}

	public void setZoneName(String zoneName) {
		this.zoneName = zoneName;
	}

	public List<SelfConflictResolution> getSelfConflictResolutions() {
		return this.selfConflictResolutions;
	}

	public void setSelfConflictResolutions(List<SelfConflictResolution> selfConflictResolutions) {
		this.selfConflictResolutions = selfConflictResolutions;
	}

	public SelfConflictResolution addSelfConflictResolution(SelfConflictResolution selfConflictResolution) {
		getSelfConflictResolutions().add(selfConflictResolution);
		selfConflictResolution.setTransPromo(this);

		return selfConflictResolution;
	}

	public SelfConflictResolution removeSelfConflictResolution(SelfConflictResolution selfConflictResolution) {
		getSelfConflictResolutions().remove(selfConflictResolution);
		selfConflictResolution.setTransPromo(null);

		return selfConflictResolution;
	}

	public TransPromo getTransPromo() {
		return this.transPromo;
	}

	public void setTransPromo(TransPromo transPromo) {
		this.transPromo = transPromo;
	}

	public List<TransPromo> getTransPromos() {
		return this.transPromos;
	}

	public void setTransPromos(List<TransPromo> transPromos) {
		this.transPromos = transPromos;
	}

	public TransPromo addTransPromo(TransPromo transPromo) {
		getTransPromos().add(transPromo);
		transPromo.setTransPromo(this);

		return transPromo;
	}

	public TransPromo removeTransPromo(TransPromo transPromo) {
		getTransPromos().remove(transPromo);
		transPromo.setTransPromo(null);

		return transPromo;
	}

	public MstPromo getMstPromo() {
		return this.mstPromo;
	}

	public void setMstPromo(MstPromo mstPromo) {
		this.mstPromo = mstPromo;
	}

	public MstPromotionType getMstPromotionType() {
		return this.mstPromotionType;
	}

	public void setMstPromotionType(MstPromotionType mstPromotionType) {
		this.mstPromotionType = mstPromotionType;
	}

	public MstEmployee getMstEmployee1() {
		return this.mstEmployee1;
	}

	public void setMstEmployee1(MstEmployee mstEmployee1) {
		this.mstEmployee1 = mstEmployee1;
	}

	public MstStatus getMstStatus() {
		return this.mstStatus;
	}

	public void setMstStatus(MstStatus mstStatus) {
		this.mstStatus = mstStatus;
	}

	public MstZone getMstZone() {
		return this.mstZone;
	}

	public void setMstZone(MstZone mstZone) {
		this.mstZone = mstZone;
	}

	public MstEmployee getMstEmployee2() {
		return this.mstEmployee2;
	}

	public void setMstEmployee2(MstEmployee mstEmployee2) {
		this.mstEmployee2 = mstEmployee2;
	}

	public MstEmployee getMstEmployee3() {
		return this.mstEmployee3;
	}

	public void setMstEmployee3(MstEmployee mstEmployee3) {
		this.mstEmployee3 = mstEmployee3;
	}

	public MstEmployee getMstEmployee4() {
		return this.mstEmployee4;
	}

	public void setMstEmployee4(MstEmployee mstEmployee4) {
		this.mstEmployee4 = mstEmployee4;
	}

	public MstEmployee getMstEmployee5() {
		return this.mstEmployee5;
	}

	public void setMstEmployee5(MstEmployee mstEmployee5) {
		this.mstEmployee5 = mstEmployee5;
	}

	public MstEmployee getMstEmployee6() {
		return this.mstEmployee6;
	}

	public void setMstEmployee6(MstEmployee mstEmployee6) {
		this.mstEmployee6 = mstEmployee6;
	}

	public MstEmployee getMstEmployee7() {
		return this.mstEmployee7;
	}

	public void setMstEmployee7(MstEmployee mstEmployee7) {
		this.mstEmployee7 = mstEmployee7;
	}

	public List<TransPromoArticle> getTransPromoArticles() {
		return this.transPromoArticles;
	}

	public void setTransPromoArticles(List<TransPromoArticle> transPromoArticles) {
		this.transPromoArticles = transPromoArticles;
	}

	public TransPromoArticle addTransPromoArticle(TransPromoArticle transPromoArticle) {
		getTransPromoArticles().add(transPromoArticle);
		transPromoArticle.setTransPromo(this);

		return transPromoArticle;
	}

	public TransPromoArticle removeTransPromoArticle(TransPromoArticle transPromoArticle) {
		getTransPromoArticles().remove(transPromoArticle);
		transPromoArticle.setTransPromo(null);

		return transPromoArticle;
	}

	public List<TransPromoConfig> getTransPromoConfigs() {
		return this.transPromoConfigs;
	}

	public void setTransPromoConfigs(List<TransPromoConfig> transPromoConfigs) {
		this.transPromoConfigs = transPromoConfigs;
	}

	public TransPromoConfig addTransPromoConfig(TransPromoConfig transPromoConfig) {
		getTransPromoConfigs().add(transPromoConfig);
		transPromoConfig.setTransPromo(this);

		return transPromoConfig;
	}

	public TransPromoConfig removeTransPromoConfig(TransPromoConfig transPromoConfig) {
		getTransPromoConfigs().remove(transPromoConfig);
		transPromoConfig.setTransPromo(null);

		return transPromoConfig;
	}

	public List<TransPromoDateModification> getTransPromoDateModifications() {
		return this.transPromoDateModifications;
	}

	public void setTransPromoDateModifications(List<TransPromoDateModification> transPromoDateModifications) {
		this.transPromoDateModifications = transPromoDateModifications;
	}

	public TransPromoDateModification addTransPromoDateModification(TransPromoDateModification transPromoDateModification) {
		getTransPromoDateModifications().add(transPromoDateModification);
		transPromoDateModification.setTransPromo(this);

		return transPromoDateModification;
	}

	public TransPromoDateModification removeTransPromoDateModification(TransPromoDateModification transPromoDateModification) {
		getTransPromoDateModifications().remove(transPromoDateModification);
		transPromoDateModification.setTransPromo(null);

		return transPromoDateModification;
	}

	public List<TransPromoFile> getTransPromoFiles() {
		return this.transPromoFiles;
	}

	public void setTransPromoFiles(List<TransPromoFile> transPromoFiles) {
		this.transPromoFiles = transPromoFiles;
	}

	public TransPromoFile addTransPromoFile(TransPromoFile transPromoFile) {
		getTransPromoFiles().add(transPromoFile);
		transPromoFile.setTransPromo(this);

		return transPromoFile;
	}

	public TransPromoFile removeTransPromoFile(TransPromoFile transPromoFile) {
		getTransPromoFiles().remove(transPromoFile);
		transPromoFile.setTransPromo(null);

		return transPromoFile;
	}

	public List<TransPromoMc> getTransPromoMcs() {
		return this.transPromoMcs;
	}

	public void setTransPromoMcs(List<TransPromoMc> transPromoMcs) {
		this.transPromoMcs = transPromoMcs;
	}

	public TransPromoMc addTransPromoMc(TransPromoMc transPromoMc) {
		getTransPromoMcs().add(transPromoMc);
		transPromoMc.setTransPromo(this);

		return transPromoMc;
	}

	public TransPromoMc removeTransPromoMc(TransPromoMc transPromoMc) {
		getTransPromoMcs().remove(transPromoMc);
		transPromoMc.setTransPromo(null);

		return transPromoMc;
	}

	public List<TransPromoModification> getTransPromoModifications() {
		return this.transPromoModifications;
	}

	public void setTransPromoModifications(List<TransPromoModification> transPromoModifications) {
		this.transPromoModifications = transPromoModifications;
	}

	public TransPromoModification addTransPromoModification(TransPromoModification transPromoModification) {
		getTransPromoModifications().add(transPromoModification);
		transPromoModification.setTransPromo(this);

		return transPromoModification;
	}

	public TransPromoModification removeTransPromoModification(TransPromoModification transPromoModification) {
		getTransPromoModifications().remove(transPromoModification);
		transPromoModification.setTransPromo(null);

		return transPromoModification;
	}

	public List<TransPromoStatus> getTransPromoStatuses() {
		return this.transPromoStatuses;
	}

	public void setTransPromoStatuses(List<TransPromoStatus> transPromoStatuses) {
		this.transPromoStatuses = transPromoStatuses;
	}

	public TransPromoStatus addTransPromoStatus(TransPromoStatus transPromoStatus) {
		getTransPromoStatuses().add(transPromoStatus);
		transPromoStatus.setTransPromo(this);

		return transPromoStatus;
	}

	public TransPromoStatus removeTransPromoStatus(TransPromoStatus transPromoStatus) {
		getTransPromoStatuses().remove(transPromoStatus);
		transPromoStatus.setTransPromo(null);

		return transPromoStatus;
	}

}