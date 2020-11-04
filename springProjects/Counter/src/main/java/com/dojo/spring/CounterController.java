package com.dojo.spring;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController {
	
	@RequestMapping("/")
	public String home(Model model, HttpSession session) {
		Integer countnum = (Integer) session.getAttribute("count");
		if(countnum == null) {
			countnum = 1;
		} else {
			countnum += 1;
		}
		session.setAttribute("count", countnum);
		return "index.jsp";
	}
	
	@RequestMapping("/counter")
	public String counter(Model model, HttpSession session) {
		Integer countnum = (Integer) session.getAttribute("count");
		if(countnum == null) {
			countnum = 0;
		}
		model.addAttribute("counter", countnum);
		return "counter.jsp";
	}
}
