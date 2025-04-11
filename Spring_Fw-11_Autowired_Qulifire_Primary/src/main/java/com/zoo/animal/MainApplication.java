package com.zoo.animal;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplication {
   public static void main(String[] args)
   {
		/*
		 * Animal animal= new Lion(); animal.nameOfAnimal();
		 */
	   AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
	   context.scan("com.zoo");
	   context.refresh();
	   System.out.println(context.getBean(Zoo.class));
	   System.out.println(context.getBean(Tiger.class));
	   System.out.println(context.getBean(Lion.class));
	   
	   
   }
}
