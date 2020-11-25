package com.dojo.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CodeController {

	@RequestMapping("/")
	public String code() {
		return "index.jsp";
	}

	@RequestMapping(value = "/result", method = RequestMethod.POST)
	public String secretCode(@RequestParam(value = "code") String code, RedirectAttributes redirectAttributes) {
		if ("bushido".equals(code)) {
			return "code.jsp";
		} else {
			redirectAttributes.addFlashAttribute("error", "You must train harder!");
			return "redirect:/";
		}
	}
}
