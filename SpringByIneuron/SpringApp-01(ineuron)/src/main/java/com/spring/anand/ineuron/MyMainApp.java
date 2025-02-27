package com.spring.anand.ineuron;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/anand/ineuron/config.xml");
		CreditCardPay ccp= context.getBean("credit",CreditCardPay.class);
		System.out.println(ccp);
		DebitCardPay dcp=context.getBean("debit",DebitCardPay.class);
		System.out.println(dcp);

	}

}
