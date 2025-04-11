package com.anand.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("emp")
public class Employee {
   private String empName;
   private Double Saliary;
   
   //dependency 1
   @Autowired
   private Address address;
   
   public Employee()
   {
	   System.out.println("employee object is created");
   }

public String getEmpName() {
	return empName;
}

public void setEmpName(String empName) {
	this.empName = empName;
}

public Double getSaliary() {
	return Saliary;
}

public void setSaliary(Double saliary) {
	Saliary = saliary;
}

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}
   
}
