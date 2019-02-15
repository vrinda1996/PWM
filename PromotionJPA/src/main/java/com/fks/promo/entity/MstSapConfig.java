package com.fks.promo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mst_sap_config database table.
 * 
 */
@Entity
@Table(name="mst_sap_config")
@NamedQuery(name="MstSapConfig.findAll", query="SELECT m FROM MstSapConfig m")
public class MstSapConfig implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="client_id")
	private String clientId;

	private String groupflag;

	private String groupname;

	private String hostname;

	@Column(name="is_active")
	private byte isActive;

	private String language;

	private String maxconnection;

	private String poolname;

	private String r3name;

	private String strid;

	@Column(name="user_id")
	private String userId;

	@Column(name="user_password")
	private String userPassword;

	public MstSapConfig() {
	}

	public String getClientId() {
		return this.clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getGroupflag() {
		return this.groupflag;
	}

	public void setGroupflag(String groupflag) {
		this.groupflag = groupflag;
	}

	public String getGroupname() {
		return this.groupname;
	}

	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}

	public String getHostname() {
		return this.hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public byte getIsActive() {
		return this.isActive;
	}

	public void setIsActive(byte isActive) {
		this.isActive = isActive;
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getMaxconnection() {
		return this.maxconnection;
	}

	public void setMaxconnection(String maxconnection) {
		this.maxconnection = maxconnection;
	}

	public String getPoolname() {
		return this.poolname;
	}

	public void setPoolname(String poolname) {
		this.poolname = poolname;
	}

	public String getR3name() {
		return this.r3name;
	}

	public void setR3name(String r3name) {
		this.r3name = r3name;
	}

	public String getStrid() {
		return this.strid;
	}

	public void setStrid(String strid) {
		this.strid = strid;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

}