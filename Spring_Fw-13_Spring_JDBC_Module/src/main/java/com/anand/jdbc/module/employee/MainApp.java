package com.anand.jdbc.module.employee;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
     context.scan("com.anand.jdbc.module");
     context.refresh();
     
     EmployeeOperations empo=context.getBean(EmployeeOperations.class);
     EmployeeDetails empd= new EmployeeDetails();
     empd.setEmpid("1212");
     empd.setEmpName("raj");
     empd.setSaliary("85000000");
     int rowInserted=empo.addEmployee(empd);
     System.out.println("inserted row "+rowInserted);
     empd.setEmpName("anand dwivedi");
     int deleteRow= empo.deleteEmployee(empd);
     System.out.println("deleteRow "+deleteRow);
     
     //print all emp details
     empo.loadAllEmployee();
    
     
	}

}
