package com.flipkart.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.flipkart.product.Product;

public class Order {
 private String orderName;
 private String orderAddress;
 private Product product;
 private Payment payment;
public String getOrderName() {
	return orderName;
}
public void setOrderName(String orderName) {
	this.orderName = orderName;
}

public String getOrderAddress() {
	return orderAddress;
}
public void setOrderAddress(String orderAddress) {
	this.orderAddress = orderAddress;
}
public Product getProduct() {
	return product ;
}
public void setProduct(Product product) {
	this.product  = product;
}

public Payment getPayment() {
	return payment;
}
public void setPayment(Payment payment) {
	this.payment = payment;
}
@Override
public String toString() {
	return "Order [orderName=" + orderName + ", orderAddress=" + orderAddress + ", product=" + product  + ", payment="
			+ payment + "]";
}
 
}
