package com.anand.swiggy.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.anand.swiggy.service.ServerService;
import com.anand.swiggy.user.request.UserRegisterRequest;


@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	ServerService service;
	
	
	@PostMapping("/register")
	@ResponseBody
	public String registerUserDetails(@RequestBody UserRegisterRequest  request)
	{
		
		//view-> controller ->model(service ->repository)
		
		//passes the value to service layer
		String responce=service.registerNewUserDetails(request);
		return responce;
	}

	@GetMapping("/hello")
	@ResponseBody
	public String show()
	{
		return "hello";
	}
}



















