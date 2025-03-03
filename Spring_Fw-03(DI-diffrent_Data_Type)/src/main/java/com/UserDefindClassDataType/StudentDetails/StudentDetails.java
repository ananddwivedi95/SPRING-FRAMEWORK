package com.UserDefindClassDataType.StudentDetails;

public class StudentDetails {
private String name;
private String id;
private String cource;
private long phoneNumber;
private Address address;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getCource() {
	return cource;
}
public void setCource(String cource) {
	this.cource = cource;
}
public long getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(long phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
@Override
public String toString() {
	return "name = " + name + " id = " + id + " cource = " + cource + " phoneNumber = " + phoneNumber
			+ ", address=" + address;
}

}
