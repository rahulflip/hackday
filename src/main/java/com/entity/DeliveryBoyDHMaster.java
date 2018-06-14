package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="delivery_boy_dh_master")
public class DeliveryBoyDHMaster {
    @Column
    Integer noDeliveredPackage;

    @Column
    Integer deliveryBoyId;

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
}
