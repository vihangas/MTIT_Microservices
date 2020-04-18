package com.sliit.mtit.microservices.wishlistservice.dto;

import java.util.StringJoiner;

public class WishlistRequest {
	
	private String productName;
	private String productId;
	
	
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
	
	@Override
	public String toString() {
		return new StringJoiner(",",WishlistRequest.class.getSimpleName()+"[","]")
				.add("productName="+productName+"'")
				.add("productId="+productId+"'")
				.toString();
	}
	

}
