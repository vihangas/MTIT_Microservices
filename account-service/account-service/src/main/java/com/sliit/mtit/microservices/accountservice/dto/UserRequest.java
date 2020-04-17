package com.sliit.mtit.microservices.accountservice.dto;

import java.util.StringJoiner;

public class UserRequest {

	private String fullName;
	private String age;
	private String address;
	private String phoneNo;
	private String email;
	
	
	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}
	
	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}
	
	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}
	
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * @return the phoneNo
	 */
	public String getPhoneNo() {
		return phoneNo;
	}
	
	/**
	 * @param phoneNo the phoneNo to set
	 */
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return new StringJoiner(",",UserRequest.class.getSimpleName()+"[","]")
				.add("fullName="+fullName+"'")
				.add("age="+age+"'")
				.add("address="+address+"'")
				.add("phoneNo="+phoneNo+"'")
				.add("email="+email+"'")
				.toString();
	}
	
	
}
