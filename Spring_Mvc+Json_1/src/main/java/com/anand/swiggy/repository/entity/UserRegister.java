package com.anand.swiggy.repository.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="userregister")
public class UserRegister {
	

 @Id
 @Column(name="name")
 private String name;
	
 @Column(name="email")
 private String email;
 
 @Column(name="mobile")
 private String mobile;
 
 
 
 @Column(name="password")
 private String password;
 
/**
 * @return the email
 */
public String getEmail() {
	return email;
}
/**
 * @return the mobile
 */
public String getMobile() {
	return mobile;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @return the password
 */
public String getPassword() {
	return password;
}
/**
 * @param email the email to set
 */
public void setEmail(String email) {
	this.email = email;
}
/**
 * @param mobile the mobile to set
 */
public void setMobile(String mobile) {
	this.mobile = mobile;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @param password the password to set
 */
public void setPassword(String password) {
	this.password = password;
}
 
 
 
}
