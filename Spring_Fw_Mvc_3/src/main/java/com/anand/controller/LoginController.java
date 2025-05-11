package com.anand.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

 //display login page
	@GetMapping("/login")
	public String loadLoginPage()
	{
	  return "login";
	}
	
	@PostMapping("/loginCheck")
	public String ValidationUserDetail(Model model,HttpServletRequest request)
	{
		String name=request.getParameter("name");
		String pwd=request.getParameter("pwd");
		
		//JPA Module
		//find
		if("anand".equalsIgnoreCase(name) && "1234".equalsIgnoreCase(pwd))
		{
			model.addAttribute("validationMessage", "Welcome to Spring Tranning");
		}
		else
		{
			model.addAttribute("validationMessage", "invalid Credentails");
		}
		return "sucess";
	}
}
