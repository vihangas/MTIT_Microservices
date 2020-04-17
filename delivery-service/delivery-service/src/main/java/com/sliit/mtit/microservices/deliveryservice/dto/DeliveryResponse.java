package com.sliit.mtit.microservices.deliveryservice.dto;

public class DeliveryResponse {

	private String deliveryId;
	private String statusMessage;
	
	
	/**
	 * @return the deliveryId
	 */
	public String getDeliveryId() {
		return deliveryId;
	}
	
	/**
	 * @param deliveryId the deliveryId to set
	 */
	public void setDeliveryId(String deliveryId) {
		this.deliveryId = deliveryId;
	}
	
	/**
	 * @return the statusMessage
	 */
	public String getStatusMessage() {
		return statusMessage;
	}
	
	/**
	 * @param statusMessage the statusMessage to set
	 */
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}
	
}
