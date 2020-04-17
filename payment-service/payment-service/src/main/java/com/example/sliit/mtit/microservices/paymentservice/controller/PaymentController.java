package com.example.sliit.mtit.microservices.paymentservice.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.sliit.mtit.microservices.paymentservice.dto.PaymentRequest;
import com.example.sliit.mtit.microservices.paymentservice.dto.PaymentResponse;

@RestController
@RequestMapping("/payments")
public class PaymentController {
	
	@PostMapping(consumes="application/json",produces="application/json")
	public @ResponseBody PaymentResponse createPayment(@RequestBody PaymentRequest PaymentRequest) {
		
		System.out.println("Payment Details :" +PaymentRequest);
		
		PaymentResponse PaymentResponse = new PaymentResponse();
		PaymentResponse.setPaymentId(UUID.randomUUID().toString());
		PaymentResponse.setStatusMessage("Payment Successfull !");
		
		return PaymentResponse;
	}

}
