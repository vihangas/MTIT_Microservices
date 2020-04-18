package com.sliit.mtit.microservices.wishlistservice.dto;

public class WishlistResponse {
	
	private String wishlistId;
	private String statusMessage;
	
	
	/**
	 * @return the wishlistId
	 */
	public String getWishlistId() {
		return wishlistId;
	}
	
	
	/**
	 * @param wishlistId the wishlistId to set
	 */
	public void setWishlistId(String wishlistId) {
		this.wishlistId = wishlistId;
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
