package com.anand.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {
  public UserDAO()
  {
	  System.out.println("UserDAO object is created");
  }
  public boolean save()
  {
	  System.out.println("able to save in dp");
	  return true;
  }
  
}
