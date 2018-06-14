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
    Integer dh_id;

    @Column
    Integer delivery_boy_id;

    @Column
    String status;

    @Column
    Date order_date;

    public Integer getDh_id() {
        return dh_id;
    }

    public void setDh_id(Integer dh_id) {
        this.dh_id = dh_id;
    }

    public Integer getDelivery_boy_id() {
        return delivery_boy_id;
    }

    public void setDelivery_boy_id(Integer delivery_boy_id) {
        this.delivery_boy_id = delivery_boy_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getOrder_date() {
        return order_date;
    }

    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }
}
