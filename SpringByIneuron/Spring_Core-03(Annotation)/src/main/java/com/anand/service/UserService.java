package com.anand.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anand.dao.UserDAO;

@Service
public class UserService {
	
	@Autowired
   private UserDAO userDao; 
   public UserService()
   {
	 System.out.println("UserService obj is created");  
   }
   public void storeInDb()
   {
	   boolean status=userDao.save();
	   if(status)
	   {
		   System.out.println("Storing Sucess");
	   }
	   else
	   {
		   System.out.println("Strong not sucess");
	   }
   }
}
