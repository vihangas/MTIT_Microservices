package com.sliit.mtit.microservices.productservice.dto;

import java.util.StringJoiner;

public class ProductRequest {

	private String productName;
	private String manufacturer;
	private String price;
	
	
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
	 * @return the manufacturer
	 */
	public String getManufacturer() {
		return manufacturer;
	}
	
	/**
	 * @param manufacturer the manufacturer to set
	 */
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	/**
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}
	
	/**
	 * @param price the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return new StringJoiner(",",ProductRequest.class.getSimpleName()+"[","]")
				.add("productName="+productName+"'")
				.add("manufacturer="+manufacturer+"'")
				.add("price="+price+"'")
				.toString();
	}
	
}
