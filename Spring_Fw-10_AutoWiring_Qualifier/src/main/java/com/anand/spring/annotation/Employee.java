package com.anand.spring.annotation;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;


@Component("employee")
public class Employee {
   @Autowired
   private Address address;
   public Employee()
   {
	   System.out.println("employee object is created");
   }
   public Employee getEmployee()
   {
	   return new Employee();
   }
   
   public void getEmployeeDetail()
   {
	  address.getOfficeAddress();
	  System.out.println("getting full employee details");
   }
}
