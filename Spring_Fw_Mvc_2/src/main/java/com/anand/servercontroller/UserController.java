package com.anand.servercontroller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
  @GetMapping(value="/profile")
  public String getUser()
  {
	  return "user information !!";
  }
  @PostMapping(value="/new")
  public String createAccount()
  {
	  return "create new account sucessfull";
  }
  @PutMapping(value="/update")
  public String updateProfile()
  {
	  return "information update Sucessfull !!";
  }
  @DeleteMapping(value="/deletion")
  public String deleteUser()
  {
	  return "user deletetion Sucessfull";
  }
}
