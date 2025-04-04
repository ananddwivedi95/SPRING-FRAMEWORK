package com.anand.spring.nareshit.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tech.teacher.Student;

public class JavaBasedMainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(BeansConfiguration.class);
		Student student=(Student) context.getBean("student"); //for bean 1 which is belongs to Student object
		System.out.println(student);  
		Student student1= (Student) context.getBean("student1"); //for bean 2 which is belongs to Student object
		System.out.println(student1);

	}

}
