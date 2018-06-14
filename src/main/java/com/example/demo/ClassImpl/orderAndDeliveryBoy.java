package com.example.demo.ClassImpl;


public class orderAndDeliveryBoy {
    Integer orders;
    Integer deliveryBoyId;

    public orderAndDeliveryBoy(Integer orders, Integer deliveryBoyId) {
        this.orders = orders;
        this.deliveryBoyId = deliveryBoyId;
    }

    public Integer getOrders() {
        return orders;
    }

    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    public Integer getDeliveryBoyId() {
        return deliveryBoyId;
    }

    public void setDeliveryBoyId(Integer deliveryBoyId) {
        this.deliveryBoyId = deliveryBoyId;
    }
}
