package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="delivery_dh_master")
public class DeliveryBoyDHMaster {
    @Column(name="no_delivered_package")
    Integer noDeliveredPackage;

    @Column(name="delivery_boy_id")
    Integer deliveryBoyId;
    
    @Column(name="delivery_medium_name")
    String deliveryMediumName;
    
    @Column(name="dh_id")
    Integer dhId;

	public Integer getNoDeliveredPackage() {
		return noDeliveredPackage;
	}

	public void setNoDeliveredPackage(Integer noDeliveredPackage) {
		this.noDeliveredPackage = noDeliveredPackage;
	}

	public Integer getDeliveryBoyId() {
		return deliveryBoyId;
	}

	public void setDeliveryBoyId(Integer deliveryBoyId) {
		this.deliveryBoyId = deliveryBoyId;
	}

	public Integer getDhId() {
		return dhId;
	}

	public void setDhId(Integer dhId) {
		this.dhId = dhId;
	}

	public String getDeliveryMediumName() {
		return deliveryMediumName;
	}

	public void setDeliveryMediumName(String deliveryMediumName) {
		this.deliveryMediumName = deliveryMediumName;
	}

}
