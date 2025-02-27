package com.anand.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.anand.service.UserService;
public class MyMainApplication {
 public static void main(String[] args)
 {
	 ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
	 UserService service=context.getBean(UserService.class);
	 service.storeInDb();
 }
}
