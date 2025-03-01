package Delivery.System;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ApplicationContext context= new ClassPathXmlApplicationContext("Delivery/System/Config.xml");
   System.out.print(context.getBean("deliveryAddress").toString());
	}

}
