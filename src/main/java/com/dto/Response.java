package com.dto;

public class Response {

	private Integer orderId;
	private String orderNo;
	private Integer deliveryMedium;
	private String deliveryHub;
	
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public Integer getDeliveryMedium() {
		return deliveryMedium;
	}
	public void setDeliveryMedium(Integer deliveryMedium) {
		this.deliveryMedium = deliveryMedium;
	}
	public String getDeliveryHub() {
		return deliveryHub;
	}
	public void setDeliveryHub(String deliveryHub) {
		this.deliveryHub = deliveryHub;
	}
	
}
