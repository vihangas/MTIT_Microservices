package com.sliit.mtit.microservices.promotionservice.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sliit.mtit.microservices.promotionservice.dto.PromotionRequest;
import com.sliit.mtit.microservices.promotionservice.dto.PromotionResponse;

@RestController
@RequestMapping("/promotions")
public class PromotionController {
	
	@PostMapping(consumes="application/json", produces="application/json")
	public @ResponseBody PromotionResponse createPromotion(@RequestBody PromotionRequest PromotionRequest) {
		
		System.out.println("Promotion Details :" +PromotionRequest);
		
		PromotionResponse PromotionResponse = new PromotionResponse();
		PromotionResponse.setPromotionId(UUID.randomUUID().toString());
		PromotionResponse.setStatusMessage("Promotion created successfully !");
		
		return PromotionResponse;
		
	}

}
