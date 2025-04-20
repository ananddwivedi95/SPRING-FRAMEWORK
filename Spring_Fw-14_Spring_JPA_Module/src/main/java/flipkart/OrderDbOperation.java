package flipkart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import flipkart.repository.FlipkartOrderRepository;

@Component("OrderDbOperation")
public class OrderDbOperation {

    @Autowired
    FlipkartOrderRepository repo;
    
    //inserting value
    public void addOrderDetails(OrderTable order) {
        repo.save(order);
        System.out.println("Order saved successfully!");
    }
    //for delete elements 
    public void deleteOrderDetails(OrderTable order)
    {
    	repo.delete(order);
    	System.out.println("order deleted sucessfully");
    }
    // for deleting entire content of table 
    public void deleteAll()
    {
    	repo.deleteAll();
   }
}