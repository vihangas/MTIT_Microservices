package com.sliit.mtit.microservices.cartservice.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sliit.mtit.microservices.cartservice.dto.CartRequset;
import com.sliit.mtit.microservices.cartservice.dto.CartResponse;

@RestController
@RequestMapping("/cart")
public class CartController {
	
	@PostMapping(consumes="application/json",produces="application/json")
	public @ResponseBody CartResponse createCart(@RequestBody CartRequset CartRequest) {
		
		System.out.println("Cart Details :" +CartRequest);
		
		CartResponse CartResponse = new CartResponse();
		CartResponse.setCartId(UUID.randomUUID().toString());
		CartResponse.setStatusMessage("Cart successfully created !");
		
		return CartResponse;
	}

}
