package com.anand.spring.nareshit.Annotation.Based.Configuration;

public class Product {
  private String productId;
  private String productName;
  private Double price;
  
  public Product(int i)
  {
	  super();
	  System.out.println("product Bean is created "+i);
  }

public String getProductId() {
	return productId;
}

public void setProductId(String productId) {
	this.productId = productId;
}

public String getProductName() {
	return productName;
}

public void setProductName(String productName) {
	this.productName = productName;
}

public Double getPrice() {
	return price;
}

public void setPrice(Double price) {
	this.price = price;
}

@Override
public String toString() {
	return "productId=" + productId + ", productName=" + productName + ", price=" + price;
}
  
  
  
  
  
  
   
}
