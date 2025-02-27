package com.spring.anand.collection;


//here we learn how to dependency injection (DI) using setter injection and collection data type
import java.util.*;
public class Student {
	private String name;
	private List<String> address;
	private Set<String> phone;
	private Map<String,String> cources;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getAddress() {
		return address;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", phone=" + phone + ", cources=" + cources + "]";
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	public Set<String> getPhone() {
		return phone;
	}
	public void setPhone(Set<String> phone) {
		this.phone = phone;
	}
	public Map<String, String> getCources() {
		return cources;
	}
	public void setCources(Map<String, String> cources) {
		this.cources = cources;
	}
	//here we learn how to dependency injection (DI) using setter injection and collection data type

}
