package com.anand.servercontroller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class CartController {

	 @GetMapping(value="/view")
	  public String getCart()
	  {
		  return "Cart information !!";
	  }
	  @PostMapping(value="/new")
	  public String newCart()
	  {
		  return "new Cart sucessfull";
	  }
	  @PutMapping(value="/update")
	  public String updateCart()
	  {
		  return "Cart information update Sucessfull !!";
	  }
	  @DeleteMapping(value="/deletion")
	  public String deleteCart()
	  {
		  return "Cart Deletetion Sucessfull";
	  }
}
