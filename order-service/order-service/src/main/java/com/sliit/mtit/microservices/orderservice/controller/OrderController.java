package com.sliit.mtit.microservices.orderservice.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sliit.mtit.microservices.orderservice.dto.OrderRequest;
import com.sliit.mtit.microservices.orderservice.dto.OrderResponse;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	@PostMapping(consumes="application/json",produces="application/json")
	public @ResponseBody OrderResponse createOrder(@RequestBody OrderRequest request) {
		
		System.out.println("Order Details :" + request);
		
		OrderResponse OrderResponse = new OrderResponse();
		OrderResponse.setOrderId(UUID.randomUUID().toString());
		OrderResponse.setStatusMessage("Order has been successfully created !");
		return OrderResponse;
	}

}
