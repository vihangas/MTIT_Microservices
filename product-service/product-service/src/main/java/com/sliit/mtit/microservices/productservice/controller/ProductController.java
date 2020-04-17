package com.sliit.mtit.microservices.productservice.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sliit.mtit.microservices.productservice.dto.ProductRequest;
import com.sliit.mtit.microservices.productservice.dto.ProductResponse;

@RestController
@RequestMapping("/products")
public class ProductController {

	@PostMapping(consumes="application/json",produces="application/json")
	public @ResponseBody ProductResponse createProduct(@RequestBody ProductRequest productRequest) {
		
		System.out.println("Product Details :" +productRequest);
		
		ProductResponse ProductResponse = new ProductResponse();
		ProductResponse.setProductId(UUID.randomUUID().toString());
		ProductResponse.setStatusMessage("Product Successfully Created !");
		
		return ProductResponse;
	}
}
