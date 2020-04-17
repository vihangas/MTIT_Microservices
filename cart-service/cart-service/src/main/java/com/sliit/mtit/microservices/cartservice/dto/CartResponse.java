package com.sliit.mtit.microservices.cartservice.dto;

public class CartResponse {
	
	private String cartId;
	private String statusMessage;
	
	
	/**
	 * @return the cartId
	 */
	public String getCartId() {
		return cartId;
	}
	
	/**
	 * @param cartId the cartId to set
	 */
	public void setCartId(String cartId) {
		this.cartId = cartId;
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
