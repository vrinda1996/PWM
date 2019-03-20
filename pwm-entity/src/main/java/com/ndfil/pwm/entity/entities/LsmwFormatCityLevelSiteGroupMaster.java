package com.ndfil.pwm.entity.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the lsmw_format_city_level_site_group_master database table.
 * 
 */
@Entity
@Table(name="lsmw_format_city_level_site_group_master")
@NamedQuery(name="LsmwFormatCityLevelSiteGroupMaster.findAll", query="SELECT l FROM LsmwFormatCityLevelSiteGroupMaster l")
public class LsmwFormatCityLevelSiteGroupMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="lsmw_format_city_level_site_group_master_id")
	private String lsmwFormatCityLevelSiteGroupMasterId;

	private String city;

	private String format;

	@Column(name="is_blocked")
	private byte isBlocked;

	@Column(name="site_code")
	private String siteCode;

	@Column(name="site_group")
	private String siteGroup;

	@Column(name="site_name")
	private String siteName;

	private String zone;

	public LsmwFormatCityLevelSiteGroupMaster() {
	}

	public String getLsmwFormatCityLevelSiteGroupMasterId() {
		return this.lsmwFormatCityLevelSiteGroupMasterId;
	}

	public void setLsmwFormatCityLevelSiteGroupMasterId(String lsmwFormatCityLevelSiteGroupMasterId) {
		this.lsmwFormatCityLevelSiteGroupMasterId = lsmwFormatCityLevelSiteGroupMasterId;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getFormat() {
		return this.format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public byte getIsBlocked() {
		return this.isBlocked;
	}

	public void setIsBlocked(byte isBlocked) {
		this.isBlocked = isBlocked;
	}

	public String getSiteCode() {
		return this.siteCode;
	}

	public void setSiteCode(String siteCode) {
		this.siteCode = siteCode;
	}

	public String getSiteGroup() {
		return this.siteGroup;
	}

	public void setSiteGroup(String siteGroup) {
		this.siteGroup = siteGroup;
	}

	public String getSiteName() {
		return this.siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	public String getZone() {
		return this.zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

}