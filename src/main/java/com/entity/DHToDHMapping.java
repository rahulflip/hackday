package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dh_dh_mapper")
public class DHToDHMapping {


	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "dh_id")
	private Integer dhId;
	
	@Column(name = "nearest_dh_id")
	private Integer nearestDhId;

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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
