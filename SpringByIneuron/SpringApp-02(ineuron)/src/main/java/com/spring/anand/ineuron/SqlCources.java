package com.spring.anand.ineuron;

public class SqlCources implements Cources {

	public SqlCources()
	{
		System.out.println("SqlCources object is created");
	}
	@Override
	public boolean courcesSelection() {
		// TODO Auto-generated method stub
		 System.out.println("Sql-Mysql is selected");
		 return true;
	}
  
}
