package com.dojo.strings;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	

	@RequestMapping("/demo")
	public String random() {
		return "Spring Demo is nice and easy!";
	}

}
