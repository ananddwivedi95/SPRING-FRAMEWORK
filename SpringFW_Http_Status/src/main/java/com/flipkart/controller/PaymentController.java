package com.flipkart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flipkart.model.PaymentData;
import com.flipkart.service.PaymentService;

@RestController
public class PaymentController {

	@Autowired
	PaymentService service;
	
	
	@GetMapping("/check/profile")
	public ResponseEntity<String> check() // ResponseEntity is tha class of SpringFrameWork that is represents the response htttp with including status code, header, body
	{
		String response="welcome in Spring project";
		return new ResponseEntity<String>(response , HttpStatus.OK);
	}
	
	@GetMapping("/makepayment")
	public ResponseEntity<String> makePayment(@RequestParam(value="message" , required = false) String message) //responseEntity is the class of springframework and it is represent the response of http including status code , header , body;
	{
		String response= "sucess";
		if(response.equalsIgnoreCase(message))
		{
			return new ResponseEntity<String>(response,HttpStatus.OK);
		}
		return new ResponseEntity<String>(response,HttpStatus.BAD_REQUEST);
		
	}
	
	@GetMapping("/payment")
	public ResponseEntity<PaymentData> getPaymentData(@PathVariable String paymentId)
	{
		PaymentData data =service.getPaymentData(paymentId);
		
		if(data != null)
		{
			return new ResponseEntity<PaymentData>(data , HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<PaymentData>(data,HttpStatus.BAD_REQUEST);
		}
	}
}
