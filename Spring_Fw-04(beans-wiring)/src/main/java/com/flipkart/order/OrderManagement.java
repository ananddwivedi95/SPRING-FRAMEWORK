package com.flipkart.order;

public class OrderManagement {
    private String noOfOrder;
    private double totalAmount;
    private Order order;
	public OrderManagement(String noOfOrder, double totalAmount, Order order) {
		super();
		this.noOfOrder = noOfOrder;
		this.totalAmount = totalAmount;
		this.order = order;
	}
	public OrderManagement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNoOfOrder() {
		return noOfOrder;
	}
	public void setNoOfOrder(String noOfOrder) {
		this.noOfOrder = noOfOrder;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	@Override
	public String toString() {
		return "OrderManagement [noOfOrder=" + noOfOrder + ", totalAmount=" + totalAmount + ", order=" + order + "]";
	}
    
    
}
