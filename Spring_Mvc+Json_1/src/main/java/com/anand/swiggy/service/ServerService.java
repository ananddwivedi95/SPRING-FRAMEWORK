package com.anand.swiggy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.anand.swiggy.repository.dboperation.UserDBOperation;
import com.anand.swiggy.repository.entity.UserRegister;
import com.anand.swiggy.user.request.UserRegisterRequest;

@Service
public class ServerService {

	@Autowired
	UserDBOperation udb;
	
	public String registerNewUserDetails(UserRegisterRequest registerRequest)
	{ 
		//reciving the data from controller
	    //transfering the data to repository layer
		
		System.out.println(registerRequest.getName());
		System.out.println(registerRequest.getEmail());
		System.out.println(registerRequest.getMobile());
		System.out.println(registerRequest.getPassword());
		
		
		//converting UserRegisterRequest object to UserRegister before passing even both classes have same field
		
		UserRegister userRegister=new UserRegister();
		userRegister.setEmail(registerRequest.getEmail());
		userRegister.setMobile(registerRequest.getMobile());
		userRegister.setName(registerRequest.getName());
		userRegister.setPassword(registerRequest.getPassword());
		
		String response=udb.registerUserDetail(userRegister);
		return response;
	}
}
