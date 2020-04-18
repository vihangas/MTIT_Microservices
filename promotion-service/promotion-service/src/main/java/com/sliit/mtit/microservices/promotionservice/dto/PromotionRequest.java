package com.sliit.mtit.microservices.promotionservice.dto;

import java.util.StringJoiner;

public class PromotionRequest {
	
	private String productName;
	private String productId;
	private String promotionPercentage;
	
	
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	
	
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	
	/**
	 * @return the productId
	 */
	public String getProductId() {
		return productId;
	}
	
	
	/**
	 * @param productId the productId to set
	 */
	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	
	/**
	 * @return the promotionPercentage
	 */
	public String getPromotionPercentage() {
		return promotionPercentage;
	}
	
	
	/**
	 * @param promotionPercentage the promotionPercentage to set
	 */
	public void setPromotionPercentage(String promotionPercentage) {
		this.promotionPercentage = promotionPercentage;
	}
	
	@Override
	public String toString() {
		return new StringJoiner(",",PromotionRequest.class.getSimpleName()+"[","]")
				.add("productName="+productName+"'")
				.add("productId="+productId+"'")
				.add("promotionPercentage="+promotionPercentage+"'")
				.toString();
	}
	
	

}
