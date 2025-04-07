package com.anand.spring.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.anand.spring.course.CourseDetails;

public class MainApp {
   public static void main(String[] args)
   {
	   AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
       context.scan("com.anand");
       context.refresh();
       CourseDetails courseDetails =(CourseDetails)context.getBean("python");
       System.out.println(courseDetails); 
       
       CourseDetails courseDetails1 =(CourseDetails)context.getBean("java");
       System.out.println(courseDetails1); 
   }
}
