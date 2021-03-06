package com.dojo.spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@RequestMapping("/")
	public String greet(@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "last_name", required = false) String lastName) {
		if (name == null) {
			return "Hello Human!";
		} else if (lastName == null) {
			return "Hello " + name + "!";
		} else {
			return "Hello " + name + " " + lastName + "!";
		}

	}

}
