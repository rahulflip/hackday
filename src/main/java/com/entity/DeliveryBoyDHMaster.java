package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="delivery_boy_dh_master")
public class DeliveryBoyDHMaster {
    @Column
    Integer no_delivered_package;

    @Column
    Integer delivery_boy_id;

    public Integer getNo_delivered_package() {
        return no_delivered_package;
    }

    public void setNo_delivered_package(Integer no_delivered_package) {
        this.no_delivered_package = no_delivered_package;
    }

    public Integer getDelivery_boy_id() {
        return delivery_boy_id;
    }

    public void setDelivery_boy_id(Integer delivery_boy_id) {
        this.delivery_boy_id = delivery_boy_id;
    }
}
