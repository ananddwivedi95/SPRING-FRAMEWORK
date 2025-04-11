package com.anand.spring.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
       context.scan("com.anand.spring.annotation");
       context.refresh();
       Employee emp = (Employee) context.getBean("employee");
       System.out.println(emp);
       emp.getEmployeeDetail();
       System.out.println(context.getBean("address"));
       
       Address ad1= (Address)context.getBean("address");
       System.out.println(ad1);
       Address ad2= (Address)context.getBean("address");
       System.out.println(ad2);
       
	}

}
