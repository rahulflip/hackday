package com.example.demo.ClassImpl;

public class OrderAndDeliveryHub {

    Integer ordersRemaining;
    Integer deliveryHubId;

    public OrderAndDeliveryHub(Integer ordersRemaining, Integer deliveryHubId) {
        this.ordersRemaining = ordersRemaining;
        this.deliveryHubId = deliveryHubId;
    }

    public Integer getOrdersRemaining() {
        return ordersRemaining;
    }

    public void setOrdersRemaining(Integer ordersRemaining) {
        this.ordersRemaining = ordersRemaining;
    }

    public Integer getDeliveryHubId() {
        return deliveryHubId;
    }

    public void setDeliveryHubId(Integer deliveryHubId) {
        this.deliveryHubId = deliveryHubId;
    }
}
