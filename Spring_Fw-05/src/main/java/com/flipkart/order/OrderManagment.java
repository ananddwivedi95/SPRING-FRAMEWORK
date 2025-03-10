package com.flipkart.order;

public class OrderManagment {
  private String orderDate;
  private String orderPrice;
  private Order order;
public String getOrderDate() {
	return orderDate;
}
public void setOrderDate(String orderDate) {
	this.orderDate = orderDate;
}
public String getOrderPrice() {
	return orderPrice;
}
public void setOrderPrice(String orderPrice) {
	this.orderPrice = orderPrice;
}
public Order getOrder() {
	return order;
}
public void setOrder(Order order) {
	this.order = order;
}
@Override
public String toString() {
	return "OrderManagment [orderDate=" + orderDate + ", orderPrice=" + orderPrice + ", order=" + order + "]";
}
  
}
