package com.flipkart.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import com.flipkart.model.PaymentData;
@Service
public class PaymentService {

	public String makePayment()
	{
	    String paymentStatus="Sucess"; 
	    return paymentStatus;
	}
	
	//Get payment details
		public PaymentData getPaymentData(String paymentId)
		{
			if(paymentId.equalsIgnoreCase("paymentId1234"))
			{
			PaymentData paymentData = new PaymentData();
			paymentData.setPaymentStatus("sucess");
			paymentData.setPaymentDate(LocalDate.now());
			paymentData.setPaymentId("paymentId1234");
			return paymentData;
			}
			return null;
		}
}
