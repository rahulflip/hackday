package com.dto;

public class Response {

	private Integer orderId;
	private String orderNo;
	private Integer deliveryMedium;
	private Integer deliveryHub;
	private String deliveryMediumName;
	
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
	public Integer getDeliveryHub() {
		return deliveryHub;
	}
	public void setDeliveryHub(Integer deliveryHub) {
		this.deliveryHub = deliveryHub;
	}
	public String getDeliveryMediumName() {
		return deliveryMediumName;
	}
	public void setDeliveryMediumName(String deliveryMediumName) {
		this.deliveryMediumName = deliveryMediumName;
	}
	
	
}
