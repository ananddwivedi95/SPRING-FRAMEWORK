package com.spring.anand.ineuron;

public class CourcesSelection {
   private Cources cource;
   public void setCource(Cources cource)
   {
	   this.cource=cource;
   }
   public void selectCource()
   {
	  boolean status=cource.courcesSelection(); 
	  if(status)
	  {
		  System.out.println("selection is sucess");
	  }
	  else
	  {
		  System.out.println("faild to select");
	  }
   }
}
