package com.ndfil.pwm.entity.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the map_approver_initiator database table.
 * 
 */
@Entity
@Table(name="map_approver_initiator")
@NamedQuery(name="MapApproverInitiator.findAll", query="SELECT m FROM MapApproverInitiator m")
public class MapApproverInitiator implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="map_approver_initiator_id")
	private String mapApproverInitiatorId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date")
	private Date createdDate;

	//bi-directional many-to-one association to MstEmployee
	@ManyToOne
	@JoinColumn(name="approver_id")
	private MstEmployee mstEmployee1;

	//bi-directional many-to-one association to MstEmployee
	@ManyToOne
	@JoinColumn(name="created_by")
	private MstEmployee mstEmployee2;

	//bi-directional many-to-one association to MstEmployee
	@ManyToOne
	@JoinColumn(name="initiator_id")
	private MstEmployee mstEmployee3;

	public MapApproverInitiator() {
	}

	public String getMapApproverInitiatorId() {
		return this.mapApproverInitiatorId;
	}

	public void setMapApproverInitiatorId(String mapApproverInitiatorId) {
		this.mapApproverInitiatorId = mapApproverInitiatorId;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
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

	public MstEmployee getMstEmployee3() {
		return this.mstEmployee3;
	}

	public void setMstEmployee3(MstEmployee mstEmployee3) {
		this.mstEmployee3 = mstEmployee3;
	}

}