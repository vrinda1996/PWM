package com.fks.promo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the trans_promo_dup_inter database table.
 * 
 */
@Entity
@Table(name="trans_promo_dup_inter")
@NamedQuery(name="TransPromoDupInter.findAll", query="SELECT t FROM TransPromoDupInter t")
public class TransPromoDupInter implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	@Lob
	@Column(name="field_value")
	private String fieldValue;

	public TransPromoDupInter() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFieldValue() {
		return this.fieldValue;
	}

	public void setFieldValue(String fieldValue) {
		this.fieldValue = fieldValue;
	}

}