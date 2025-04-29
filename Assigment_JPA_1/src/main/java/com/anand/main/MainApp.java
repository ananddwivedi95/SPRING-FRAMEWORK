package com.anand.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.anand.dboperation.StudentDbOperation;

public class MainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context;
		context = new AnnotationConfigApplicationContext();
		context.scan("com.anand");
		context.refresh();

		StudentDbOperation stoper = (StudentDbOperation) context.getBean("stop");

		
		  //insertion operation
			/*
			 * stoper.addStudentDetails(1,"anand","B.Tech", 93360444);
			 * stoper.addStudentDetails(2,"anand","B.Tech", 93360444);
			 * stoper.addStudentDetails(3,"anand","B.Tech", 93360444);
			 * stoper.addStudentDetails(4,"anand","B.Tech", 93360444);
			 * stoper.addStudentDetails(5,"anand","B.Tech", 93360444);
			 * System.out.println("***************************************");
			 */
			 
		 
	      // deletion operation  
		  stoper.deleteStudentDetail(1);
		  System.out.println("***************************************");
		  
		  //for update
		  stoper.updateStudentDetail(8,"Anshu Dwivedi","B.pharma",93360444);
		  System.out.println("***************************************");
		  
		  //for select operation on the besis of stId
		  System.out.println(stoper.select(2).toString());
		  System.out.println("***************************************");
		 
	}
}
