package com.stacksimplify.restservices.Hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping(path = "/helloworld",method = RequestMethod.GET)
	public String helloWorld() {
		return "hello World";
	}
	
	@RequestMapping(path = "/getbean",method = RequestMethod.GET)
	public UserDetails getBean()
	{
		return new UserDetails("Tamal", "saha", "mumbai");
	}
}
