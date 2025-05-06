package com.anand.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ServerController {

	@RequestMapping("/user")
	@ResponseBody
	public String fetchUserDetail()
	{
		return "Welcome Dearuser !";
	}
	@RequestMapping("/update")
	@ResponseBody
	public String update()
	{
		return "Updation sucessfull !";
	}
	@RequestMapping("/new")
	@ResponseBody
	public String newRegistration()
	{
		return "Registration Sucessfull ! ";
	}
	@RequestMapping("/delete")
	@ResponseBody
	public String delete()
	{
		return "Deletion Sucessfull ! ";
	}
}
