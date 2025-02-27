package com.spring.anand.ineuron;

public class CreditCardPay implements IPay {
	public CreditCardPay()
	{
	    System.out.println("object creditCard object is created by ioc");	
	}
	@Override
	public boolean payBill(Double atm) {
		// TODO Auto-generated method stub
		return false;
	}

}
