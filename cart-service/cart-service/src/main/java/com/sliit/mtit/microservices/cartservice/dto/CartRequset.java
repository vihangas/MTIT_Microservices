package com.sliit.mtit.microservices.cartservice.dto;

import java.util.StringJoiner;

public class CartRequset {
	
	private String orderId;
	private String type;
	private String quantity;
	private String price;
	
	
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
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	/**
	 * @return the quantity
	 */
	public String getQuantity() {
		return quantity;
	}
	
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(String quantity) {
		this.quantity = quantity;
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
		return new StringJoiner(",",CartRequset.class.getSimpleName()+"[","]")
				.add("orderId="+orderId+"'")
				.add("type="+type+"'")
				.add("quantity="+quantity+"'")
				.add("price="+price+"'")
				.toString();
	}
	
}
