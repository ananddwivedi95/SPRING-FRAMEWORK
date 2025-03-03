package com.flipkart.order;

import com.flipkart.product.Product;


public class Order {
   private String orderId;
   private double orderValue;
   private Product product;

public Order() {
	super();
}

public Order(String orderId, double orderValue, Product product) {
	this.orderId = orderId;
	this.orderValue = orderValue;
	this.product = product;
}

public String getOrderId() {
	return orderId;
}
public void setOrderId(String orderId) {
	this.orderId = orderId;
}
public double getOrderValue() {
	return orderValue;
}
public void setOrderValue(double orderValue) {
	this.orderValue = orderValue;
}
public Product getProduct() {
	return product;
}
public void setProduct(Product product) {
	this.product = product;
}

@Override
public String toString() {
	return "Order [orderId=" + orderId + ", orderValue=" + orderValue + ", product=" + product + "]";
}
   
   
}
