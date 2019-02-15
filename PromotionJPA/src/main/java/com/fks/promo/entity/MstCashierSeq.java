package com.fks.promo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mst_cashier_seq database table.
 * 
 */
@Entity
@Table(name="mst_cashier_seq")
@NamedQuery(name="MstCashierSeq.findAll", query="SELECT m FROM MstCashierSeq m")
public class MstCashierSeq implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cashier_id")
	private String cashierId;

	private int sequence;

	public MstCashierSeq() {
	}

	public String getCashierId() {
		return this.cashierId;
	}

	public void setCashierId(String cashierId) {
		this.cashierId = cashierId;
	}

	public int getSequence() {
		return this.sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

}