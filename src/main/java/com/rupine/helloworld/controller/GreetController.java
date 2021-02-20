package com.rupine.helloworld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rupine.helloworld.service.GreetService;

@RestController
public class GreetController {
	
	@Autowired
	GreetService gs;
	
	@GetMapping("/welcome")
	public String greet()
	{
		return gs.greetService();
	}
	
	@GetMapping("/welcome1/{id}")
	public String greet1(@PathVariable("id") int xyz)
	{
		return gs.greetService1(xyz);
	}


}
