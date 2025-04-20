package flipkart.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import flipkart.OrderDbOperation;
import flipkart.OrderTable;
import flipkart.config.FlipkartConfiguration;

public class OrderTableMainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
            context.scan("flipkart");
            context.refresh();
            OrderTable order = new OrderTable();
            order.setOrderId(12);
            order.setProductName("fan");
            order.setTotalAmount(100000);
            
            OrderDbOperation dbOperation = context.getBean(OrderDbOperation.class);
            dbOperation.addOrderDetails(order);
            
            System.out.println("Operation completed successfully!");
            dbOperation.deleteOrderDetails(order); //delete specific row
            
            dbOperation.deleteAll(); // delete entire content of table
       
    }
}