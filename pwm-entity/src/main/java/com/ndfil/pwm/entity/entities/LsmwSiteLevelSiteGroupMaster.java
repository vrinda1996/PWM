package com.ndfil.pwm.entity.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the lsmw_site_level_site_group_master database table.
 * 
 */
@Entity
@Table(name="lsmw_site_level_site_group_master")
@NamedQuery(name="LsmwSiteLevelSiteGroupMaster.findAll", query="SELECT l FROM LsmwSiteLevelSiteGroupMaster l")
public class LsmwSiteLevelSiteGroupMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="lsmw_site_level_site_group_master_id")
	private String lsmwSiteLevelSiteGroupMasterId;

	@Column(name="is_blocked")
	private byte isBlocked;

	@Column(name="site_code")
	private String siteCode;

	@Column(name="site_group")
	private String siteGroup;

	@Column(name="site_name")
	private String siteName;

	public LsmwSiteLevelSiteGroupMaster() {
	}

	public String getLsmwSiteLevelSiteGroupMasterId() {
		return this.lsmwSiteLevelSiteGroupMasterId;
	}

	public void setLsmwSiteLevelSiteGroupMasterId(String lsmwSiteLevelSiteGroupMasterId) {
		this.lsmwSiteLevelSiteGroupMasterId = lsmwSiteLevelSiteGroupMasterId;
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

}