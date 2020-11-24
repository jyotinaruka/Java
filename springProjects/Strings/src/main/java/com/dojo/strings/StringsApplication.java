package com.dojo.strings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StringsApplication {
	
	@RequestMapping("/")
	public String hello() {
		return "Hello Client! How are you doing?";
	}

	@RequestMapping("/random/{xyz}")
	public String random(@PathVariable("xyz") String xyz) {
		return "Spring Boot is nice and easy! " + xyz;
	}

	public static void main(String[] args) {
		SpringApplication.run(StringsApplication.class, args);
	}

}
