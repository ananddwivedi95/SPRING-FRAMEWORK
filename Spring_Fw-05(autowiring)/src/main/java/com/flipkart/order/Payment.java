package com.flipkart.order;

public class Payment {
private String totalPayment;

public String getTotalPayment() {
	return totalPayment;
}

public void setTotalPayment(String totalPayment) {
	this.totalPayment = totalPayment;
}

@Override
public String toString() {
	return "Payment [totalPayment=" + totalPayment + "]";
}

}
