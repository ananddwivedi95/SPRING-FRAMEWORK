package com.anand.spring.nareshit.Annotation.Based.Configuration.Main.Package;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.anand.spring.nareshit.Annotation.Based.Configuration.ConfigurationClass;
import com.anand.spring.nareshit.Annotation.Based.Configuration.Product;

public class MainApp {
    public static void main(String[] args)
    {
    	AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(ConfigurationClass.class);
    	Product product1= (Product) context.getBean("product1");
    	Product product2= (Product) context.getBean("product2");
    	Product product3= (Product) context.getBean("product3");
    	Product product4= (Product) context.getBean("product3");
    	System.out.println(product1);
    	System.out.println(product2);
    	System.out.println(product3);
    	System.out.println(product3);
    }
}
