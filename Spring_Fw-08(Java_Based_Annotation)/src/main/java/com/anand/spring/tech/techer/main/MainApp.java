package com.anand.spring.tech.techer.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.anand.spring.tech.techer.Product;
import com.anand.spring.tech.techer.Student;

public class MainApp {
   public static void main(String[] args)
   {
	   //IOC  container
	   AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	   
	   
	   //provide information of packages
	   //Scanning all @Component classes which present in the package and after scanning spring will Automatically Create the bean
	   context.scan("com.anand.spring.tech.techer");
	   context.refresh();
	    Student student=(Student)context.getBean(Student.class);
	    student.setPid("1");
	    student.setpName("anand");
	    System.out.println(student);
	    Product product1=(Product)context.getBean("product1");
	    product1.setPid("2");
	    product1.setPname("Anand");
	    System.out.println(product1);
	   // Product product2=(Product)context.getBean("product2");
	    //System.out.println(product2);
   }
}
