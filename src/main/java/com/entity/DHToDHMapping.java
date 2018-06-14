package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="dh_to_dh_mapping")
public class DHToDHMapping {

	@Column
	private Integer dh_id;
	
	@Column
	private Integer nearest_dh_id;

	public Integer getDh_id() {
		return dh_id;
	}

	public void setDh_id(Integer dh_id) {
		this.dh_id = dh_id;
	}

	public Integer getNearest_dh_id() {
		return nearest_dh_id;
	}

	public void setNearest_dh_id(Integer nearest_dh_id) {
		this.nearest_dh_id = nearest_dh_id;
	}
	
	
}
