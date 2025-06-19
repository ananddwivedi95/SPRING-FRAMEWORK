package com.anand.swiggy.repository.dboperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.anand.swiggy.repository.entity.UserRegister;
import com.anand.swiggy.repository.userjparepository.UserJpaRepository;

@Component
public class UserDBOperation {

	@Autowired
	UserJpaRepository ujr;
	public String registerUserDetail(UserRegister register)
	{
		ujr.save(register);
		return "registration sucessfully done !!";
	}
}
