package com.example.sliit.mtit.microservices.paymentservice.dto;

import java.util.StringJoiner;

public class PaymentRequest {

	private String orderId;
	private String userId;
	private String method;
	private String amount;
	
	
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
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	
	
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
	/**
	 * @return the method
	 */
	public String getMethod() {
		return method;
	}
	
	
	/**
	 * @param method the method to set
	 */
	public void setMethod(String method) {
		this.method = method;
	}
	
	
	/**
	 * @return the amount
	 */
	public String getAmount() {
		return amount;
	}
	
	
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return new StringJoiner(",",PaymentRequest.class.getSimpleName()+"[","]")
				.add("orderId="+orderId+"'")
				.add("userId="+userId+"'")
				.add("method="+method+"'")
				.add("amount="+amount+"'")
				.toString();
	}
}
