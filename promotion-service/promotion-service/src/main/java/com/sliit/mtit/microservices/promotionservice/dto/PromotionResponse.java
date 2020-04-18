package com.sliit.mtit.microservices.promotionservice.dto;

public class PromotionResponse {
	
	private String promotionId;
	private String statusMessage;
	
	
	/**
	 * @return the promotionId
	 */
	public String getPromotionId() {
		return promotionId;
	}
	
	
	/**
	 * @param promotionId the promotionId to set
	 */
	public void setPromotionId(String promotionId) {
		this.promotionId = promotionId;
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
