package com.ndfil.pwm.entity.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the map_promo_org_level_mapping database table.
 * 
 */
@Entity
@Table(name="map_promo_org_level_mapping")
@NamedQuery(name="MapPromoOrgLevelMapping.findAll", query="SELECT m FROM MapPromoOrgLevelMapping m")
public class MapPromoOrgLevelMapping implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="map_promo_org_level_mapping_id")
	private String mapPromoOrgLevelMappingId;

	@Column(name="level_id")
	private BigInteger levelId;

	@Column(name="promo_id")
	private BigInteger promoId;

	@Temporal(TemporalType.DATE)
	@Column(name="updated_date")
	private Date updatedDate;

	public MapPromoOrgLevelMapping() {
	}

	public String getMapPromoOrgLevelMappingId() {
		return this.mapPromoOrgLevelMappingId;
	}

	public void setMapPromoOrgLevelMappingId(String mapPromoOrgLevelMappingId) {
		this.mapPromoOrgLevelMappingId = mapPromoOrgLevelMappingId;
	}

	public BigInteger getLevelId() {
		return this.levelId;
	}

	public void setLevelId(BigInteger levelId) {
		this.levelId = levelId;
	}

	public BigInteger getPromoId() {
		return this.promoId;
	}

	public void setPromoId(BigInteger promoId) {
		this.promoId = promoId;
	}

	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

}