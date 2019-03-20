package com.ndfil.pwm.entity.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the mst_promo database table.
 * 
 */
@Entity
@Table(name="mst_promo")
@NamedQuery(name="MstPromo.findAll", query="SELECT m FROM MstPromo m")
public class MstPromo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="promo_id")
	private String promoId;

	private String category;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date")
	private Date createdDate;

	@Column(name="dis_type")
	private String disType;

	@Column(name="error_file_path")
	private String errorFilePath;

	@Column(name="fb_fund")
	private String fbFund;

	@Column(name="file_path")
	private String filePath;

	@Column(name="gst_selection")
	private String gstSelection;

	@Column(name="offer_zone")
	private BigInteger offerZone;

	private String remarks;

	@Column(name="request_name")
	private String requestName;

	@Column(name="settlement_method")
	private String settlementMethod;

	@Column(name="sub_category")
	private String subCategory;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_date")
	private Date updatedDate;

	@Column(name="vender_fund")
	private String venderFund;

	@Column(name="vendor_backed")
	private String vendorBacked;

	//bi-directional many-to-one association to MapPromoCity
	@OneToMany(mappedBy="mstPromo")
	private List<MapPromoCity> mapPromoCities;

	//bi-directional many-to-one association to MapPromoFormat
	@OneToMany(mappedBy="mstPromo")
	private List<MapPromoFormat> mapPromoFormats;

	//bi-directional many-to-one association to MapPromoMch
	@OneToMany(mappedBy="mstPromo")
	private List<MapPromoMch> mapPromoMches;

	//bi-directional many-to-one association to MapPromoMch1
	@OneToMany(mappedBy="mstPromo")
	private List<MapPromoMch1> mapPromoMch1s;

	//bi-directional many-to-one association to MapPromoRegion
	@OneToMany(mappedBy="mstPromo")
	private List<MapPromoRegion> mapPromoRegions;

	//bi-directional many-to-one association to MapPromoState
	@OneToMany(mappedBy="mstPromo")
	private List<MapPromoState> mapPromoStates;

	//bi-directional many-to-one association to MapPromoStore
	@OneToMany(mappedBy="mstPromo")
	private List<MapPromoStore> mapPromoStores;

	//bi-directional many-to-one association to MapPromoZone
	@OneToMany(mappedBy="mstPromo")
	private List<MapPromoZone> mapPromoZones;

	//bi-directional many-to-one association to MstAot
	@ManyToOne
	@JoinColumn(name="aot_id")
	private MstAot mstAot;

	//bi-directional many-to-one association to MstOffer
	@ManyToOne
	@JoinColumn(name="offer_id")
	private MstOffer mstOffer;

	//bi-directional many-to-one association to MstEvent
	@ManyToOne
	@JoinColumn(name="event_id")
	private MstEvent mstEvent;

	//bi-directional many-to-one association to MstMktg
	@ManyToOne
	@JoinColumn(name="mktg_id")
	private MstMktg mstMktg;

	//bi-directional many-to-one association to MstEmployee
	@ManyToOne
	@JoinColumn(name="created_by")
	private MstEmployee mstEmployee1;

	//bi-directional many-to-one association to MstEmployee
	@ManyToOne
	@JoinColumn(name="updated_by")
	private MstEmployee mstEmployee2;

	//bi-directional many-to-one association to MstStatus
	@ManyToOne
	@JoinColumn(name="status_id")
	private MstStatus mstStatus;

	//bi-directional many-to-one association to MstCampaign
	@ManyToOne
	@JoinColumn(name="campaign_id")
	private MstCampaign mstCampaign;

	//bi-directional many-to-one association to SelfConflictResolution
	@OneToMany(mappedBy="mstPromo")
	private List<SelfConflictResolution> selfConflictResolutions;

	//bi-directional many-to-one association to TransPromo
	@OneToMany(mappedBy="mstPromo")
	private List<TransPromo> transPromos;

	//bi-directional many-to-one association to TransPromoModification
	@OneToMany(mappedBy="mstPromo")
	private List<TransPromoModification> transPromoModifications;

	public MstPromo() {
	}

	public String getPromoId() {
		return this.promoId;
	}

	public void setPromoId(String promoId) {
		this.promoId = promoId;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getDisType() {
		return this.disType;
	}

	public void setDisType(String disType) {
		this.disType = disType;
	}

	public String getErrorFilePath() {
		return this.errorFilePath;
	}

	public void setErrorFilePath(String errorFilePath) {
		this.errorFilePath = errorFilePath;
	}

	public String getFbFund() {
		return this.fbFund;
	}

	public void setFbFund(String fbFund) {
		this.fbFund = fbFund;
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

	public BigInteger getOfferZone() {
		return this.offerZone;
	}

	public void setOfferZone(BigInteger offerZone) {
		this.offerZone = offerZone;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getRequestName() {
		return this.requestName;
	}

	public void setRequestName(String requestName) {
		this.requestName = requestName;
	}

	public String getSettlementMethod() {
		return this.settlementMethod;
	}

	public void setSettlementMethod(String settlementMethod) {
		this.settlementMethod = settlementMethod;
	}

	public String getSubCategory() {
		return this.subCategory;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getVenderFund() {
		return this.venderFund;
	}

	public void setVenderFund(String venderFund) {
		this.venderFund = venderFund;
	}

	public String getVendorBacked() {
		return this.vendorBacked;
	}

	public void setVendorBacked(String vendorBacked) {
		this.vendorBacked = vendorBacked;
	}

	public List<MapPromoCity> getMapPromoCities() {
		return this.mapPromoCities;
	}

	public void setMapPromoCities(List<MapPromoCity> mapPromoCities) {
		this.mapPromoCities = mapPromoCities;
	}

	public MapPromoCity addMapPromoCity(MapPromoCity mapPromoCity) {
		getMapPromoCities().add(mapPromoCity);
		mapPromoCity.setMstPromo(this);

		return mapPromoCity;
	}

	public MapPromoCity removeMapPromoCity(MapPromoCity mapPromoCity) {
		getMapPromoCities().remove(mapPromoCity);
		mapPromoCity.setMstPromo(null);

		return mapPromoCity;
	}

	public List<MapPromoFormat> getMapPromoFormats() {
		return this.mapPromoFormats;
	}

	public void setMapPromoFormats(List<MapPromoFormat> mapPromoFormats) {
		this.mapPromoFormats = mapPromoFormats;
	}

	public MapPromoFormat addMapPromoFormat(MapPromoFormat mapPromoFormat) {
		getMapPromoFormats().add(mapPromoFormat);
		mapPromoFormat.setMstPromo(this);

		return mapPromoFormat;
	}

	public MapPromoFormat removeMapPromoFormat(MapPromoFormat mapPromoFormat) {
		getMapPromoFormats().remove(mapPromoFormat);
		mapPromoFormat.setMstPromo(null);

		return mapPromoFormat;
	}

	public List<MapPromoMch> getMapPromoMches() {
		return this.mapPromoMches;
	}

	public void setMapPromoMches(List<MapPromoMch> mapPromoMches) {
		this.mapPromoMches = mapPromoMches;
	}

	public MapPromoMch addMapPromoMch(MapPromoMch mapPromoMch) {
		getMapPromoMches().add(mapPromoMch);
		mapPromoMch.setMstPromo(this);

		return mapPromoMch;
	}

	public MapPromoMch removeMapPromoMch(MapPromoMch mapPromoMch) {
		getMapPromoMches().remove(mapPromoMch);
		mapPromoMch.setMstPromo(null);

		return mapPromoMch;
	}

	public List<MapPromoMch1> getMapPromoMch1s() {
		return this.mapPromoMch1s;
	}

	public void setMapPromoMch1s(List<MapPromoMch1> mapPromoMch1s) {
		this.mapPromoMch1s = mapPromoMch1s;
	}

	public MapPromoMch1 addMapPromoMch1(MapPromoMch1 mapPromoMch1) {
		getMapPromoMch1s().add(mapPromoMch1);
		mapPromoMch1.setMstPromo(this);

		return mapPromoMch1;
	}

	public MapPromoMch1 removeMapPromoMch1(MapPromoMch1 mapPromoMch1) {
		getMapPromoMch1s().remove(mapPromoMch1);
		mapPromoMch1.setMstPromo(null);

		return mapPromoMch1;
	}

	public List<MapPromoRegion> getMapPromoRegions() {
		return this.mapPromoRegions;
	}

	public void setMapPromoRegions(List<MapPromoRegion> mapPromoRegions) {
		this.mapPromoRegions = mapPromoRegions;
	}

	public MapPromoRegion addMapPromoRegion(MapPromoRegion mapPromoRegion) {
		getMapPromoRegions().add(mapPromoRegion);
		mapPromoRegion.setMstPromo(this);

		return mapPromoRegion;
	}

	public MapPromoRegion removeMapPromoRegion(MapPromoRegion mapPromoRegion) {
		getMapPromoRegions().remove(mapPromoRegion);
		mapPromoRegion.setMstPromo(null);

		return mapPromoRegion;
	}

	public List<MapPromoState> getMapPromoStates() {
		return this.mapPromoStates;
	}

	public void setMapPromoStates(List<MapPromoState> mapPromoStates) {
		this.mapPromoStates = mapPromoStates;
	}

	public MapPromoState addMapPromoState(MapPromoState mapPromoState) {
		getMapPromoStates().add(mapPromoState);
		mapPromoState.setMstPromo(this);

		return mapPromoState;
	}

	public MapPromoState removeMapPromoState(MapPromoState mapPromoState) {
		getMapPromoStates().remove(mapPromoState);
		mapPromoState.setMstPromo(null);

		return mapPromoState;
	}

	public List<MapPromoStore> getMapPromoStores() {
		return this.mapPromoStores;
	}

	public void setMapPromoStores(List<MapPromoStore> mapPromoStores) {
		this.mapPromoStores = mapPromoStores;
	}

	public MapPromoStore addMapPromoStore(MapPromoStore mapPromoStore) {
		getMapPromoStores().add(mapPromoStore);
		mapPromoStore.setMstPromo(this);

		return mapPromoStore;
	}

	public MapPromoStore removeMapPromoStore(MapPromoStore mapPromoStore) {
		getMapPromoStores().remove(mapPromoStore);
		mapPromoStore.setMstPromo(null);

		return mapPromoStore;
	}

	public List<MapPromoZone> getMapPromoZones() {
		return this.mapPromoZones;
	}

	public void setMapPromoZones(List<MapPromoZone> mapPromoZones) {
		this.mapPromoZones = mapPromoZones;
	}

	public MapPromoZone addMapPromoZone(MapPromoZone mapPromoZone) {
		getMapPromoZones().add(mapPromoZone);
		mapPromoZone.setMstPromo(this);

		return mapPromoZone;
	}

	public MapPromoZone removeMapPromoZone(MapPromoZone mapPromoZone) {
		getMapPromoZones().remove(mapPromoZone);
		mapPromoZone.setMstPromo(null);

		return mapPromoZone;
	}

	public MstAot getMstAot() {
		return this.mstAot;
	}

	public void setMstAot(MstAot mstAot) {
		this.mstAot = mstAot;
	}

	public MstOffer getMstOffer() {
		return this.mstOffer;
	}

	public void setMstOffer(MstOffer mstOffer) {
		this.mstOffer = mstOffer;
	}

	public MstEvent getMstEvent() {
		return this.mstEvent;
	}

	public void setMstEvent(MstEvent mstEvent) {
		this.mstEvent = mstEvent;
	}

	public MstMktg getMstMktg() {
		return this.mstMktg;
	}

	public void setMstMktg(MstMktg mstMktg) {
		this.mstMktg = mstMktg;
	}

	public MstEmployee getMstEmployee1() {
		return this.mstEmployee1;
	}

	public void setMstEmployee1(MstEmployee mstEmployee1) {
		this.mstEmployee1 = mstEmployee1;
	}

	public MstEmployee getMstEmployee2() {
		return this.mstEmployee2;
	}

	public void setMstEmployee2(MstEmployee mstEmployee2) {
		this.mstEmployee2 = mstEmployee2;
	}

	public MstStatus getMstStatus() {
		return this.mstStatus;
	}

	public void setMstStatus(MstStatus mstStatus) {
		this.mstStatus = mstStatus;
	}

	public MstCampaign getMstCampaign() {
		return this.mstCampaign;
	}

	public void setMstCampaign(MstCampaign mstCampaign) {
		this.mstCampaign = mstCampaign;
	}

	public List<SelfConflictResolution> getSelfConflictResolutions() {
		return this.selfConflictResolutions;
	}

	public void setSelfConflictResolutions(List<SelfConflictResolution> selfConflictResolutions) {
		this.selfConflictResolutions = selfConflictResolutions;
	}

	public SelfConflictResolution addSelfConflictResolution(SelfConflictResolution selfConflictResolution) {
		getSelfConflictResolutions().add(selfConflictResolution);
		selfConflictResolution.setMstPromo(this);

		return selfConflictResolution;
	}

	public SelfConflictResolution removeSelfConflictResolution(SelfConflictResolution selfConflictResolution) {
		getSelfConflictResolutions().remove(selfConflictResolution);
		selfConflictResolution.setMstPromo(null);

		return selfConflictResolution;
	}

	public List<TransPromo> getTransPromos() {
		return this.transPromos;
	}

	public void setTransPromos(List<TransPromo> transPromos) {
		this.transPromos = transPromos;
	}

	public TransPromo addTransPromo(TransPromo transPromo) {
		getTransPromos().add(transPromo);
		transPromo.setMstPromo(this);

		return transPromo;
	}

	public TransPromo removeTransPromo(TransPromo transPromo) {
		getTransPromos().remove(transPromo);
		transPromo.setMstPromo(null);

		return transPromo;
	}

	public List<TransPromoModification> getTransPromoModifications() {
		return this.transPromoModifications;
	}

	public void setTransPromoModifications(List<TransPromoModification> transPromoModifications) {
		this.transPromoModifications = transPromoModifications;
	}

	public TransPromoModification addTransPromoModification(TransPromoModification transPromoModification) {
		getTransPromoModifications().add(transPromoModification);
		transPromoModification.setMstPromo(this);

		return transPromoModification;
	}

	public TransPromoModification removeTransPromoModification(TransPromoModification transPromoModification) {
		getTransPromoModifications().remove(transPromoModification);
		transPromoModification.setMstPromo(null);

		return transPromoModification;
	}

}