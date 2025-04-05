package com.anand.spring.tech;

import org.springframework.stereotype.Component;

@Component
public class Order {
  public Order()
  {
	  System.out.println("Order object is created");
  }
}
