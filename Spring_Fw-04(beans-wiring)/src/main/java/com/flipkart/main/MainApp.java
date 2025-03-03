package com.flipkart.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.flipkart.order.OrderManagement;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ApplicationContext context=new ClassPathXmlApplicationContext("com/flipkart/product/config.xml");
      OrderManagement oo=context.getBean("orderManagement",OrderManagement.class);
      System.out.print(oo);
	}

}
