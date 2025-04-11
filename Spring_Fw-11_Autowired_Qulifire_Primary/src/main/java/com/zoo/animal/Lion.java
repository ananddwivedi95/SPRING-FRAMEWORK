package com.zoo.animal;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("Lion")
@Primary
public class Lion implements  Animal{

	@Override
	public void nameOfAnimal() {
		// TODO Auto-generated method stub
		System.out.println("this is Lion");
	}

	public Lion() {
		super();
		// TODO Auto-generated constructor stub
	System.out.println("Lion object created");
	}

}
