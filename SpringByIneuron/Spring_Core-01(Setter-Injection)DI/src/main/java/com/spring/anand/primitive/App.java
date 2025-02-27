package com.spring.anand.primitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//here we learn dependency injection by setter method(setter injection) using primitive data type 
public class App {
  public static void main(String[] args)
  {
	  ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/anand/primitive/config.xml");
	  Student st1=context.getBean("st1",Student.class);
	  Student st2=context.getBean("st2",Student.class);
	  System.out.println(st1);
	  System.out.println(st2);
  }
}

//here we learn dependency injection(DI) by setter method using primitive data type 