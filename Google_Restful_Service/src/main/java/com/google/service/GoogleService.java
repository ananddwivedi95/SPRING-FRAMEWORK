package com.google.service;

import java.util.Collections;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.google.service.response.FlipKartResponse;
@Service
public class GoogleService {

	public FlipKartResponse getFlipKartPaymentData(String paymentId)
	{
	String URL="http://localhost:8080/SpringFW_Http_Status/payment/"+paymentId;
	
	//Create resful service for communicate with other services or API.4
	HttpHeaders httpHeader= new HttpHeaders();
	httpHeader.add("Security-token", "hshbdhugfbd");
	httpHeader.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
	
	HttpEntity<String> entity= new HttpEntity<String>(httpHeader);
	
	
	RestTemplate restTamplet= new RestTemplate();
	restTamplet.getMessageConverters().add(0, new MappingJackson2HttpMessageConverter());
	
    ResponseEntity<FlipKartResponse> response = 
    restTamplet.exchange(URL,HttpMethod.GET, entity,FlipKartResponse.class);
	return response.getBody();
	}
}
