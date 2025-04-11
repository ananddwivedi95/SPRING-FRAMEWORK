package com.zoo.animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("Zoo")

public class Zoo {
	
	
	@Autowired
	//@Qualifier("Lion")
    private Animal animal;
	
	public Zoo()
	{
		System.out.println("zoo object is created");
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
}
