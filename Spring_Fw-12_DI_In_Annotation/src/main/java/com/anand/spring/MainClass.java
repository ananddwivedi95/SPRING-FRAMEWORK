package com.anand.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
   public static void main(String[] args)
   {
	   AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
	   context.scan("com.anand.spring");
	   context.refresh();
	   Employee emp=(Employee) context.getBean("emp");
	   System.out.println(emp);
	   System.out.println(emp.getAddress());
   }
}
