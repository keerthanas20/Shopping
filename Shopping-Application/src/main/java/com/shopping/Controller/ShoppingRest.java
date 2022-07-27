package com.shopping.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingRest {

	@RequestMapping(method=RequestMethod.GET, path="/hello-world")  
	public String hello() {
		return "hello world";
	}
}
