package com.anand.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class RegisterControll {

	@RequestMapping(method=RequestMethod.GET,value="/register")
	public String getRegister()
	{
		return "register";
	}
	//regester checking
	//open registration page and click registerUser and it is post type 
	@RequestMapping(method=RequestMethod.POST,value="/registerUser")
	public String userRegister(Model model , HttpServletRequest request)
	{
		String firstName = request.getParameter("firstName");
	    String lastName = request.getParameter("lastName");
	    String gender = request.getParameter("gender");
	    String age = request.getParameter("age");
	    String qualification = request.getParameter("qualification");
	    String marks = request.getParameter("marks");
	    String dob = request.getParameter("dob"); // Note: name should match input field name

	    // Add all values to model
	    model.addAttribute("firstName", firstName);
	    model.addAttribute("lastName", lastName);
	    model.addAttribute("gender", gender);
	    model.addAttribute("age", age);
	    model.addAttribute("qualification", qualification);
	    model.addAttribute("marks", marks);
	    model.addAttribute("dob", dob);

	    return "infoPage"; // this will open infoPage.jsp
		
	}
}
