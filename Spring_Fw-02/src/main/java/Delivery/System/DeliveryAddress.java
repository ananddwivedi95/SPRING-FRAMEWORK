package Delivery.System;

public class DeliveryAddress {
ProductDetails product;
private String dAddress;
private String expectDate;
private String deliveryFees;



public ProductDetails getProduct() {
	return product;
}



public void setProduct(ProductDetails product) {
	this.product = product;
}



public String getdAddress() {
	return dAddress;
}



public void setdAddress(String dAddress) {
	this.dAddress = dAddress;
}



public String getExpectDate() {
	return expectDate;
}



public void setExpectDate(String expectDate) {
	this.expectDate = expectDate;
}



public String getDeliveryFees() {
	return deliveryFees;
}



public void setDeliveryFees(String deliveryFees) {
	this.deliveryFees = deliveryFees;
}



@Override
public String toString() {
	return "product= " + product + " dAddress= " + dAddress + " expectDate= " + expectDate
			+ " deliveryFees= " + deliveryFees;
}

}
