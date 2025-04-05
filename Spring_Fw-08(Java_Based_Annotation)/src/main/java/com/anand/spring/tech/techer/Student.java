package com.anand.spring.tech.techer;

import org.springframework.stereotype.Component;

@Component("student")
public class Student {
	private String pid;
	private String pName;
    public Student()
    {
    	super();
    	System.out.println("Student onject is created");
    }
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	@Override
	public String toString() {
		return "pid=" + pid + ", pName=" + pName;
	}
	
    
}
