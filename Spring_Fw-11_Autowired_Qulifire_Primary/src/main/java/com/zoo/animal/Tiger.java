package com.zoo.animal;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("Tiger")
public class Tiger implements Animal {

	@Override
	public void nameOfAnimal() {
		// TODO Auto-generated method stub
		System.out.println("this is tiger");
		
	}

	public Tiger() {
		super();
		// TODO Auto-generated constructor stub
	
	
		System.out.println("Tiger object created");}
	

}
