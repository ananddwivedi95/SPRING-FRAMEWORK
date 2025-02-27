package com.spring.anand.collection;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
public class App {

	
	//here we learn how to dependency injection (DI) using setter injection and collection data type
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/anand/collection/config.xml");
	  Student st=context.getBean("st1",Student.class);
	  System.out.println(st);
	}

}
