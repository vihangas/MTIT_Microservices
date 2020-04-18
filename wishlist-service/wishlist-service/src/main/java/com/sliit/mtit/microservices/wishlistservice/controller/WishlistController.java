package com.sliit.mtit.microservices.wishlistservice.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sliit.mtit.microservices.wishlistservice.dto.WishlistRequest;
import com.sliit.mtit.microservices.wishlistservice.dto.WishlistResponse;

@RestController
@RequestMapping("/wishlist")
public class WishlistController {
	
	@PostMapping(consumes="application/json",produces="application/json")
	public @ResponseBody WishlistResponse createWishlist(@RequestBody WishlistRequest WishlistRequest) {
		
		System.out.println("Wishlist Details :" +WishlistRequest);
		
		WishlistResponse WishlistResponse = new WishlistResponse();
		WishlistResponse.setWishlistId(UUID.randomUUID().toString());
		WishlistResponse.setStatusMessage("Wishlist successfully created !");
		
		return WishlistResponse;		
		
	}

}
