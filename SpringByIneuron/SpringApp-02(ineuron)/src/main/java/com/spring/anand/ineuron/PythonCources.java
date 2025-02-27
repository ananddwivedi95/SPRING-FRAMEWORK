package com.spring.anand.ineuron;

public class PythonCources implements Cources {

	public PythonCources()
	{
		System.out.println("pythonCources object is created");
	}
	@Override
	public boolean courcesSelection() {
		// TODO Auto-generated method stub
		System.out.println("python is selected");
		return true;
	}

}
