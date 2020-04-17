package com.example.sliit.mtit.microservices.paymentservice.dto;

public class PaymentResponse {

	private String paymentId;
	private String statusMessage;
	
	
	/**
	 * @return the paymentId
	 */
	public String getPaymentId() {
		return paymentId;
	}
	
	
	/**
	 * @param paymentId the paymentId to set
	 */
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
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
