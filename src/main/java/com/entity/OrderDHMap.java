package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="order_dh_map")
public class OrderDHMap {
    @Column
    Integer order;

    @Column
    Integer dhId;

    @Column
    Date date;

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Integer getDh_id() {
        return dhId;
    }

    public void setDh_id(Integer dhId) {
        this.dhId = dhId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}