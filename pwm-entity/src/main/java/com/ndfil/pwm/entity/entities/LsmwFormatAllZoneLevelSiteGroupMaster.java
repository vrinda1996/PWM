package com.ndfil.pwm.entity.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the lsmw_format_all_zone_level_site_group_master database table.
 * 
 */
@Entity
@Table(name="lsmw_format_all_zone_level_site_group_master")
@NamedQuery(name="LsmwFormatAllZoneLevelSiteGroupMaster.findAll", query="SELECT l FROM LsmwFormatAllZoneLevelSiteGroupMaster l")
public class LsmwFormatAllZoneLevelSiteGroupMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="lsmw_format_all_zone_level_site_group_master_id")
	private String lsmwFormatAllZoneLevelSiteGroupMasterId;

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

	public LsmwFormatAllZoneLevelSiteGroupMaster() {
	}

	public String getLsmwFormatAllZoneLevelSiteGroupMasterId() {
		return this.lsmwFormatAllZoneLevelSiteGroupMasterId;
	}

	public void setLsmwFormatAllZoneLevelSiteGroupMasterId(String lsmwFormatAllZoneLevelSiteGroupMasterId) {
		this.lsmwFormatAllZoneLevelSiteGroupMasterId = lsmwFormatAllZoneLevelSiteGroupMasterId;
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