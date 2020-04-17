package com.sliit.mtit.microservices.deliveryservice.dto;

import java.util.StringJoiner;

public class DeliveryRequest {
	
	private String orderId;
	private String fullName;
	private String address;
	private String phoneNo;
	private String deliveryStatus;
	
	
	/**
	 * @return the orderId
	 */
	public String getOrderId() {
		return orderId;
	}
	
	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	
	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}
	
	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * @return the phoneNo
	 */
	public String getPhoneNo() {
		return phoneNo;
	}
	
	/**
	 * @param phoneNo the phoneNo to set
	 */
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	/**
	 * @return the deliveryStatus
	 */
	public String getDeliveryStatus() {
		return deliveryStatus;
	}
	
	/**
	 * @param deliveryStatus the deliveryStatus to set
	 */
	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}
	
	@Override
	public String toString() {
		return new StringJoiner(",",DeliveryRequest.class.getSimpleName()+"[","]")
				.add("orderId="+orderId+"'")
				.add("fullName="+fullName+"'")
				.add("address="+address+"'")
				.add("phoneNo="+phoneNo+"'")
				.add("deliveryStatus="+deliveryStatus+"'")
				.toString();
	}
}
