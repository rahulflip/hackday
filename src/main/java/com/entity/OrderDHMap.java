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
    Integer dh_id;

    @Column
    Date date;

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Integer getDh_id() {
        return dh_id;
    }

    public void setDh_id(Integer dh_id) {
        this.dh_id = dh_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
