package flipkart.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import flipkart.product.entity.Product;
import flipkart.product.entity.ProductDBOperation;

public class ProductMainApp {
  public static void main(String[] args)
  {
	  AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
      context.scan("flipkart");
      context.refresh();
      
      Product product= new Product();
      product.setProductId(12);
      product.setProductName("iphone");
      product.setProductPrice("12500022");
      ProductDBOperation pbdop=(ProductDBOperation) context.getBean("pbdop");
      pbdop.addProducts(product);
  
  }
}
