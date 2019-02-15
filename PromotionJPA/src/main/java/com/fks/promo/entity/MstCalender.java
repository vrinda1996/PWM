package com.fks.promo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the mst_calender database table.
 * 
 */
@Entity
@Table(name="mst_calender")
@NamedQuery(name="MstCalender.findAll", query="SELECT m FROM MstCalender m")
public class MstCalender implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="mst_calender_id")
	private String mstCalenderId;

	@Temporal(TemporalType.DATE)
	@Column(name="cal_date")
	private Date calDate;

	@Column(name="date_description")
	private String dateDescription;

	//bi-directional many-to-one association to MstZone
	@ManyToOne
	@JoinColumn(name="zone_id")
	private MstZone mstZone;

	public MstCalender() {
	}

	public String getMstCalenderId() {
		return this.mstCalenderId;
	}

	public void setMstCalenderId(String mstCalenderId) {
		this.mstCalenderId = mstCalenderId;
	}

	public Date getCalDate() {
		return this.calDate;
	}

	public void setCalDate(Date calDate) {
		this.calDate = calDate;
	}

	public String getDateDescription() {
		return this.dateDescription;
	}

	public void setDateDescription(String dateDescription) {
		this.dateDescription = dateDescription;
	}

	public MstZone getMstZone() {
		return this.mstZone;
	}

	public void setMstZone(MstZone mstZone) {
		this.mstZone = mstZone;
	}

}