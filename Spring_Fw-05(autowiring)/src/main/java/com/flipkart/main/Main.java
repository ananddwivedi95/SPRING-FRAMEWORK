package com.flipkart.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.flipkart.order.OrderManagment;
public class Main {
  public static void main(String[] args)
  {
	  ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
	  OrderManagment ogm=context.getBean("ordermanagment",OrderManagment.class);
	  System.out.println(ogm);
  }
}
