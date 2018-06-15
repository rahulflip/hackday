package com.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="dh_deliver_order_status")
public class DHDeliverOrderStatus {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "dh_id")
    private Integer dhId;

    @Column(name = "delivery_boy_id")
    private Integer deliveryBoyId;

    @Column(name = "delivery_boy_name")
    private String deliveryBoyName;

    @Column(name = "status")
    private String status;

    @Column(name = "date")
    private Date date;

    @Column(name = "order_id")
    private String orderId;
    
    public DHDeliverOrderStatus(Integer dhId, Integer deliveryBoyId, String deliveryBoyName, String status) {
    	this.dhId = dhId;
    	this.deliveryBoyId = deliveryBoyId;
    	this.deliveryBoyName = deliveryBoyName;
    	this.status = status;
    }


    public void setId(Integer id){this.id=id;}

    public Integer getId(){return  id;}

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

    public String getDeliveryBoyName() {
        return deliveryBoyName;
    }

    public void setDeliveryBoyName(String deliveryBoyName) {
        this.deliveryBoyName = deliveryBoyName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
