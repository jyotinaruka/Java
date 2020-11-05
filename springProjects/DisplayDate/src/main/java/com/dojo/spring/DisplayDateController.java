package com.dojo.spring;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DisplayDateController {

	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("dojoName", "Burbank");
		return "index.jsp";
	}

	@RequestMapping("/date")
	public String date(Model model) {
		model.addAttribute("date", new Date());
		return "date.jsp";
	}

	@RequestMapping("/time")
	public String time(Model model) {
		model.addAttribute("time", new Date());
		return "time.jsp";
	}

}
