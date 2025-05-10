package com.anand.servercontroller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

	 @GetMapping(value="/viewOrder")
	  public String getOrder()
	  {
		  return "order information !!";
	  }
	  @PostMapping(value="/new")
	  public String newOrder()
	  {
		  return "new Order sucessfull";
	  }
	  @PutMapping(value="/update")
	  public String updateOrder()
	  {
		  return "Order information update Sucessfull !!";
	  }
	  @DeleteMapping(value="/deletion")
	  public String deleteOrder()
	  {
		  return "Order Deletetion Sucessfull";
	  }
}
