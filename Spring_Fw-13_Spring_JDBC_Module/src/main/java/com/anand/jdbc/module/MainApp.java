package com.anand.jdbc.module;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
public static void main(String[] args)
{
	AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
    context.scan("com.anand.jdbc.module");
    context.refresh();
    
    StudentDBOperation operation=(StudentDBOperation) context.getBean("std");
    System.out.print(operation);
    int rowInserted=operation.addStudent();
    System.out.println("row inserted "+rowInserted);
    int rowinserted1=operation.addStudentAll();
    System.out.println("row inserted "+rowinserted1);
    int rowdeleted=operation.deleteStudent();
    System.out.println(rowdeleted);
    context.close();
}
}
