package com.rupine.helloworld.service;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class GreetService {
	
	public String greetService()
	{
		Random rand = new Random();
		
		int number = rand.nextInt(100);
		if(number>50)
		{
			return "good morning";
		}
		else
		{
			return "good evening";
		}
	}
	public String greetService1(int number)
	{
		if(number>50)
		{
			return "good morning";
		}
		else
		{
			return "good evening";
		}
		
	}

}
