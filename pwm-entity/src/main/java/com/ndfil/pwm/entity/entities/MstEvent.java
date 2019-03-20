package com.ndfil.pwm.entity.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the mst_event database table.
 * 
 */
@Entity
@Table(name="mst_event")
@NamedQuery(name="MstEvent.findAll", query="SELECT m FROM MstEvent m")
public class MstEvent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="event_id")
	private String eventId;

	@Column(name="event_code")
	private String eventCode;

	@Column(name="event_name")
	private String eventName;

	@Column(name="is_blocked")
	private byte isBlocked;

	@Column(name="lead_time_hour")
	private String leadTimeHour;

	@Column(name="mst_sap_id")
	private String mstSapId;

	//bi-directional many-to-one association to MstPromo
	@OneToMany(mappedBy="mstEvent")
	private List<MstPromo> mstPromos;

	public MstEvent() {
	}

	public String getEventId() {
		return this.eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public String getEventCode() {
		return this.eventCode;
	}

	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}

	public String getEventName() {
		return this.eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public byte getIsBlocked() {
		return this.isBlocked;
	}

	public void setIsBlocked(byte isBlocked) {
		this.isBlocked = isBlocked;
	}

	public String getLeadTimeHour() {
		return this.leadTimeHour;
	}

	public void setLeadTimeHour(String leadTimeHour) {
		this.leadTimeHour = leadTimeHour;
	}

	public String getMstSapId() {
		return this.mstSapId;
	}

	public void setMstSapId(String mstSapId) {
		this.mstSapId = mstSapId;
	}

	public List<MstPromo> getMstPromos() {
		return this.mstPromos;
	}

	public void setMstPromos(List<MstPromo> mstPromos) {
		this.mstPromos = mstPromos;
	}

	public MstPromo addMstPromo(MstPromo mstPromo) {
		getMstPromos().add(mstPromo);
		mstPromo.setMstEvent(this);

		return mstPromo;
	}

	public MstPromo removeMstPromo(MstPromo mstPromo) {
		getMstPromos().remove(mstPromo);
		mstPromo.setMstEvent(null);

		return mstPromo;
	}

}