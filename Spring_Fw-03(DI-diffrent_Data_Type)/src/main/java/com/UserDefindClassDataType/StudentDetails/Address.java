package com.UserDefindClassDataType.StudentDetails;

public class Address {
 private String city;
 private String state;
 private String pincode;
 private String Country;
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getPincode() {
	return pincode;
}
public void setPincode(String pincode) {
	this.pincode = pincode;
}
public String getCountry() {
	return Country;
}
public void setCountry(String country) {
	Country = country;
}
@Override
public String toString() {
	return "city ="+ city + " state=" + state + ", pincode=" + pincode + " Country=" + Country;
}
 
}
