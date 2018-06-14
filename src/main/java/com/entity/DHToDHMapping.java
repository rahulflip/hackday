package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="dh_dh_mapper")
public class DHToDHMapping {

	@Column
	private Integer dhId;
	
	@Column
	private Integer nearestDhId;

	public Integer getDhId() {
		return dhId;
	}

	public void setDhId(Integer dhId) {
		this.dhId = dhId;
	}

	public Integer getNearestDhId() {
		return nearestDhId;
	}

	public void setNearestDhId(Integer nearestDhId) {
		this.nearestDhId = nearestDhId;
	}
}
