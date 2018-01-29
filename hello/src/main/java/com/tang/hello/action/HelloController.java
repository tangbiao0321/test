package com.tang.hello.action;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/user/{name}")
	public String hello(@PathVariable String name){
		return "Hello , "+ name;
	}
}
