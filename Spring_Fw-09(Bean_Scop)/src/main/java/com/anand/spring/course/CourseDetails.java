package com.anand.spring.course;

import org.springframework.stereotype.Component;

@Component("python")
public class CourseDetails {
 private String courseName;
 private int noOFDays;
 
public CourseDetails() {
	super();
	// TODO Auto-generated constructor stub
	System.out.println("CourseDetail object is created");
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
public int getNoOFDays() {
	return noOFDays;
}
public void setNoOFDays(int noOFDays) {
	this.noOFDays = noOFDays;
}
//@Override
//public String toString() {
//	return "courseName=" + courseName + ", noOFDays=" + noOFDays;
//}
   
}
