package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.Date;

@Entity
@Table(name="dh_delivery_order_status")
public class DHDeliveryOrderStatus {
    @Column
    Integer dhId;

    @Column
    Integer deliveryBoyId;

    @Column
    String status;

    @Column
    Date orderDate;

    public Integer getDhId() {
        return dhId;
    }

    public void setDhId(Integer dhId) {
        this.dhId = dhId;
    }

    public Integer getDeliveryBoyId() {
        return deliveryBoyId;
    }

    public void setDeliveryBoyId(Integer deliveryBoyId) {
        this.deliveryBoyId = deliveryBoyId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}
