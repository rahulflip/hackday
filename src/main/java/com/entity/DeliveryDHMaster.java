package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="delivery_dh_master")
public class DeliveryDHMaster  {
    @Id
    @Column
    private Integer noDeliveredPackage;

    @Column
    private Integer deliveryBoyId;

    @Column
    private Integer dhId;

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
}
