package com.anand.spring.tech.techer;

import org.springframework.stereotype.Component;

@Component("product1")
public class Product {
private String pid;
private String pname;
   public Product()
   {
	   super();
	   System.out.println("product object is created");
   }
public String getPid() {
	return pid;
}
public void setPid(String pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
@Override
public String toString() {
	return "pid=" + pid + ", pname=" + pname;
}


   
}
