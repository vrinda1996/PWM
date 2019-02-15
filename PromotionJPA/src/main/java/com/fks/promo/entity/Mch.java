package com.fks.promo.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the mch database table.
 * 
 */
@Entity
@NamedQuery(name="Mch.findAll", query="SELECT m FROM Mch m")
public class Mch implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="mc_code")
	private String mcCode;

	@Column(name="category_name")
	private String categoryName;

	@Column(name="is_blocked")
	private Boolean isBlocked;

	@Column(name="mc_name")
	private String mcName;

	@Column(name="sub_category_name")
	private String subCategoryName;

	@Column(name="updated_by")
	private BigInteger updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_date")
	private Date updatedDate;

	//bi-directional many-to-one association to MapPromoMch
	@OneToMany(mappedBy="mch")
	private List<MapPromoMch> mapPromoMches;

	//bi-directional many-to-one association to MapPromoMch1
	@OneToMany(mappedBy="mch")
	private List<MapPromoMch1> mapPromoMch1s;

	//bi-directional many-to-one association to MapRoleMch
	@OneToMany(mappedBy="mch")
	private List<MapRoleMch> mapRoleMches;

	//bi-directional many-to-one association to MapUserMchF1
	@OneToMany(mappedBy="mch")
	private List<MapUserMchF1> mapUserMchF1s;

	//bi-directional many-to-one association to MapUserMchF2
	@OneToMany(mappedBy="mch")
	private List<MapUserMchF2> mapUserMchF2s;

	//bi-directional many-to-one association to MapUserMchF3
	@OneToMany(mappedBy="mch")
	private List<MapUserMchF3> mapUserMchF3s;

	//bi-directional many-to-one association to MapUserMchF5
	@OneToMany(mappedBy="mch")
	private List<MapUserMchF5> mapUserMchF5s;

	//bi-directional many-to-one association to MstLocation
	@ManyToOne
	@JoinColumn(name="location_id")
	private MstLocation mstLocation;

	//bi-directional many-to-one association to MstEmployee
	@ManyToOne
	@JoinColumn(name="created_by")
	private MstEmployee mstEmployee;

	//bi-directional many-to-one association to MstBusinessPlaceProfitCenter
	@OneToMany(mappedBy="mch")
	private List<MstBusinessPlaceProfitCenter> mstBusinessPlaceProfitCenters;

	//bi-directional many-to-one association to TransPromoMc
	@OneToMany(mappedBy="mch")
	private List<TransPromoMc> transPromoMcs;

	//bi-directional many-to-one association to TransPromoModification
	@OneToMany(mappedBy="mch")
	private List<TransPromoModification> transPromoModifications;

	public Mch() {
	}

	public String getMcCode() {
		return this.mcCode;
	}

	public void setMcCode(String mcCode) {
		this.mcCode = mcCode;
	}

	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Boolean getIsBlocked() {
		return this.isBlocked;
	}

	public void setIsBlocked(Boolean isBlocked) {
		this.isBlocked = isBlocked;
	}

	public String getMcName() {
		return this.mcName;
	}

	public void setMcName(String mcName) {
		this.mcName = mcName;
	}

	public String getSubCategoryName() {
		return this.subCategoryName;
	}

	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}

	public BigInteger getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(BigInteger updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public List<MapPromoMch> getMapPromoMches() {
		return this.mapPromoMches;
	}

	public void setMapPromoMches(List<MapPromoMch> mapPromoMches) {
		this.mapPromoMches = mapPromoMches;
	}

	public MapPromoMch addMapPromoMch(MapPromoMch mapPromoMch) {
		getMapPromoMches().add(mapPromoMch);
		mapPromoMch.setMch(this);

		return mapPromoMch;
	}

	public MapPromoMch removeMapPromoMch(MapPromoMch mapPromoMch) {
		getMapPromoMches().remove(mapPromoMch);
		mapPromoMch.setMch(null);

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
		mapPromoMch1.setMch(this);

		return mapPromoMch1;
	}

	public MapPromoMch1 removeMapPromoMch1(MapPromoMch1 mapPromoMch1) {
		getMapPromoMch1s().remove(mapPromoMch1);
		mapPromoMch1.setMch(null);

		return mapPromoMch1;
	}

	public List<MapRoleMch> getMapRoleMches() {
		return this.mapRoleMches;
	}

	public void setMapRoleMches(List<MapRoleMch> mapRoleMches) {
		this.mapRoleMches = mapRoleMches;
	}

	public MapRoleMch addMapRoleMch(MapRoleMch mapRoleMch) {
		getMapRoleMches().add(mapRoleMch);
		mapRoleMch.setMch(this);

		return mapRoleMch;
	}

	public MapRoleMch removeMapRoleMch(MapRoleMch mapRoleMch) {
		getMapRoleMches().remove(mapRoleMch);
		mapRoleMch.setMch(null);

		return mapRoleMch;
	}

	public List<MapUserMchF1> getMapUserMchF1s() {
		return this.mapUserMchF1s;
	}

	public void setMapUserMchF1s(List<MapUserMchF1> mapUserMchF1s) {
		this.mapUserMchF1s = mapUserMchF1s;
	}

	public MapUserMchF1 addMapUserMchF1(MapUserMchF1 mapUserMchF1) {
		getMapUserMchF1s().add(mapUserMchF1);
		mapUserMchF1.setMch(this);

		return mapUserMchF1;
	}

	public MapUserMchF1 removeMapUserMchF1(MapUserMchF1 mapUserMchF1) {
		getMapUserMchF1s().remove(mapUserMchF1);
		mapUserMchF1.setMch(null);

		return mapUserMchF1;
	}

	public List<MapUserMchF2> getMapUserMchF2s() {
		return this.mapUserMchF2s;
	}

	public void setMapUserMchF2s(List<MapUserMchF2> mapUserMchF2s) {
		this.mapUserMchF2s = mapUserMchF2s;
	}

	public MapUserMchF2 addMapUserMchF2(MapUserMchF2 mapUserMchF2) {
		getMapUserMchF2s().add(mapUserMchF2);
		mapUserMchF2.setMch(this);

		return mapUserMchF2;
	}

	public MapUserMchF2 removeMapUserMchF2(MapUserMchF2 mapUserMchF2) {
		getMapUserMchF2s().remove(mapUserMchF2);
		mapUserMchF2.setMch(null);

		return mapUserMchF2;
	}

	public List<MapUserMchF3> getMapUserMchF3s() {
		return this.mapUserMchF3s;
	}

	public void setMapUserMchF3s(List<MapUserMchF3> mapUserMchF3s) {
		this.mapUserMchF3s = mapUserMchF3s;
	}

	public MapUserMchF3 addMapUserMchF3(MapUserMchF3 mapUserMchF3) {
		getMapUserMchF3s().add(mapUserMchF3);
		mapUserMchF3.setMch(this);

		return mapUserMchF3;
	}

	public MapUserMchF3 removeMapUserMchF3(MapUserMchF3 mapUserMchF3) {
		getMapUserMchF3s().remove(mapUserMchF3);
		mapUserMchF3.setMch(null);

		return mapUserMchF3;
	}

	public List<MapUserMchF5> getMapUserMchF5s() {
		return this.mapUserMchF5s;
	}

	public void setMapUserMchF5s(List<MapUserMchF5> mapUserMchF5s) {
		this.mapUserMchF5s = mapUserMchF5s;
	}

	public MapUserMchF5 addMapUserMchF5(MapUserMchF5 mapUserMchF5) {
		getMapUserMchF5s().add(mapUserMchF5);
		mapUserMchF5.setMch(this);

		return mapUserMchF5;
	}

	public MapUserMchF5 removeMapUserMchF5(MapUserMchF5 mapUserMchF5) {
		getMapUserMchF5s().remove(mapUserMchF5);
		mapUserMchF5.setMch(null);

		return mapUserMchF5;
	}

	public MstLocation getMstLocation() {
		return this.mstLocation;
	}

	public void setMstLocation(MstLocation mstLocation) {
		this.mstLocation = mstLocation;
	}

	public MstEmployee getMstEmployee() {
		return this.mstEmployee;
	}

	public void setMstEmployee(MstEmployee mstEmployee) {
		this.mstEmployee = mstEmployee;
	}

	public List<MstBusinessPlaceProfitCenter> getMstBusinessPlaceProfitCenters() {
		return this.mstBusinessPlaceProfitCenters;
	}

	public void setMstBusinessPlaceProfitCenters(List<MstBusinessPlaceProfitCenter> mstBusinessPlaceProfitCenters) {
		this.mstBusinessPlaceProfitCenters = mstBusinessPlaceProfitCenters;
	}

	public MstBusinessPlaceProfitCenter addMstBusinessPlaceProfitCenter(MstBusinessPlaceProfitCenter mstBusinessPlaceProfitCenter) {
		getMstBusinessPlaceProfitCenters().add(mstBusinessPlaceProfitCenter);
		mstBusinessPlaceProfitCenter.setMch(this);

		return mstBusinessPlaceProfitCenter;
	}

	public MstBusinessPlaceProfitCenter removeMstBusinessPlaceProfitCenter(MstBusinessPlaceProfitCenter mstBusinessPlaceProfitCenter) {
		getMstBusinessPlaceProfitCenters().remove(mstBusinessPlaceProfitCenter);
		mstBusinessPlaceProfitCenter.setMch(null);

		return mstBusinessPlaceProfitCenter;
	}

	public List<TransPromoMc> getTransPromoMcs() {
		return this.transPromoMcs;
	}

	public void setTransPromoMcs(List<TransPromoMc> transPromoMcs) {
		this.transPromoMcs = transPromoMcs;
	}

	public TransPromoMc addTransPromoMc(TransPromoMc transPromoMc) {
		getTransPromoMcs().add(transPromoMc);
		transPromoMc.setMch(this);

		return transPromoMc;
	}

	public TransPromoMc removeTransPromoMc(TransPromoMc transPromoMc) {
		getTransPromoMcs().remove(transPromoMc);
		transPromoMc.setMch(null);

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
		transPromoModification.setMch(this);

		return transPromoModification;
	}

	public TransPromoModification removeTransPromoModification(TransPromoModification transPromoModification) {
		getTransPromoModifications().remove(transPromoModification);
		transPromoModification.setMch(null);

		return transPromoModification;
	}

}