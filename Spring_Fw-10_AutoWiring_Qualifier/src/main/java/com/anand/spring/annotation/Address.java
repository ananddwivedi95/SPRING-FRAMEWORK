package com.anand.spring.annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("address")
@Scope("prototype")
public class Address {
	
	/*
	 * public Address() { System.out.println("Office Address object is created"); }
	 */
   public Address getAdress()
   {
	   return new Address();
   }
   public void getOfficeAddress()
   {
	   System.out.println("office address is printed");
   }
}
