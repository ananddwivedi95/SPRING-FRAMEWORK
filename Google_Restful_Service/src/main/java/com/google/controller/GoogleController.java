package com.google.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.google.service.GoogleService;
import com.google.service.response.FlipKartResponse;

@RestController
public class GoogleController {

	//call flipkart rest service
	//http://localhost:8080/SpringFW_Http_Status/information
	//GET
	
	@Autowired
	GoogleService googleService;
	
	@GetMapping("/check")
	public String check()
	{
		return "welcome in SpringWorld";
	}
	@GetMapping("/track/payment/{id}")
	public FlipKartResponse getFlipKartPaymentData(@PathVariable("id") String id)
	{
		
	    FlipKartResponse response=	googleService.getFlipKartPaymentData(id);
		return response;
	}
}
