package com.tech.teacher;

public class Student {
private String stuentName;
private String stid;
private Double marks;


public Student() {
	super();
	System.out.print("Student created object");
	// TODO Auto-generated constructor stub
}
public String getStuentName() {
	return stuentName;
}
public void setStuentName(String stuentName) {
	this.stuentName = stuentName;
}
public String getStid() {
	return stid;
}
public void setStid(String stid) {
	this.stid = stid;
}
public Double getMarks() {
	return marks;
}
public void setMarks(Double marks) {
	this.marks = marks;
}
@Override
public String toString() {
	return "Student [stuentName=" + stuentName + ", stid=" + stid + ", marks=" + marks + "]";
}


}
