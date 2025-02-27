package com.spring.anand.ineuron;

public class DebitCardPay implements IPay {

	public DebitCardPay()
	{
		System.out.println("object debitCard object is created by ioc");
	}
	@Override
	public boolean payBill(Double atm) {
		// TODO Auto-generated method stub
		return false;
	}

}
