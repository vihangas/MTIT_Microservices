package com.sliit.mtit.microservices.accountservice.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sliit.mtit.microservices.accountservice.dto.UserRequest;
import com.sliit.mtit.microservices.accountservice.dto.UserResponse;

@RestController
@RequestMapping("/users")
public class AccountController {

	@PostMapping(consumes="application/json",produces="application/json")
	public @ResponseBody UserResponse createUser(@RequestBody UserRequest UserRequest) {
		
		System.out.println("User Details :" + UserRequest);
		
		UserResponse UserResponse = new UserResponse();
		UserResponse.setUserId(UUID.randomUUID().toString());
		UserResponse.setStatusMessage("User successfully created !");
		
		return UserResponse;
	}
}
