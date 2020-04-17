package com.sliit.mtit.microservices.deliveryservice.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sliit.mtit.microservices.deliveryservice.dto.DeliveryRequest;
import com.sliit.mtit.microservices.deliveryservice.dto.DeliveryResponse;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {
	
	@PostMapping(consumes="application/json",produces="application/json")
	public @ResponseBody DeliveryResponse createDelivery(@RequestBody DeliveryRequest DeliveryRequest) {
		
		System.out.println("Delivery Status :" +DeliveryRequest);
		
		DeliveryResponse DeliveryResponse = new DeliveryResponse();
		DeliveryResponse.setDeliveryId(UUID.randomUUID().toString());
		DeliveryResponse.setStatusMessage("Delivery successfully created !");
		
		return DeliveryResponse;
	}

}
