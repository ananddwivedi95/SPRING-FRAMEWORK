package com.anand.spring;

import org.springframework.stereotype.Component;

@Component("ads")
public class Address {

	private String City;
	private int pincode;
	public Address()
	{
		System.out.println("Address object created");
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
}
