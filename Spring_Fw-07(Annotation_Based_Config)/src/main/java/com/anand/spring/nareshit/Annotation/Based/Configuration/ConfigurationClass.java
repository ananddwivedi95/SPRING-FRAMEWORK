package com.anand.spring.nareshit.Annotation.Based.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationClass {
	
	@Bean(name="product1")  //here product1 is the name of 1st bean of Product Class and like this so on
   public Product getProduct1()
   {
		Product product= new Product(1);
		product.setProductId("p1");
		product.setProductName("oill");
		product.setPrice(85.0);
	  return product ; 
   }
	
	@Bean(name="product2")
	public Product getProduct2()
	{
		return new Product(2);
	}
	
	@Bean(name="product3")        // so basically here we are creating a multiple beans(Object) of same class i.e Product class 
	public Product getProduct3()
	{
		return new Product(3);
	}
}
