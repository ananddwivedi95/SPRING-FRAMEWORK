package flipkart.product.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import flipkart.repository.ProductRepository;

@Component("pbdop")
public class ProductDBOperation {
  
	@Autowired
	ProductRepository  prorepo;
	
	public void addProducts(Product product)
	{
		prorepo.save(product);
	}
}
