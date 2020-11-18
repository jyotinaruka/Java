package com.dojo.spring;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NinjaGoldGameController {
	
	@RequestMapping("/")
	public String gold(HttpSession session) {
		if(session.getAttribute("gold") == null) {
			session.setAttribute("gold", 0);
			session.setAttribute("activities", new ArrayList()) ;		
		}		
		return "gold.jsp";		
	}
	
	@RequestMapping(value="/process_money", method= RequestMethod.POST)
	public String processMoney(@RequestParam("action") String action, HttpSession session) {
		int earn = 0;
		if("farm".equals(action)) {
			earn = (int) ((Math.random() * 10) + 10);
		} else if("cave".equals(action)) {
			earn = (int) ((Math.random() * 5) + 5);
		} else if("house".equals(action)) {
			earn = (int) ((Math.random() * 3) + 2);
		} else if("casino".equals(action)) {
			earn = (int) ((Math.random() * 100) - 50);
		} else {
			return "redirect:/";
		}
		
		Integer gold = (Integer) session.getAttribute("gold");
		if(gold == null) {
			gold = 0;
		}
		session.setAttribute("gold", gold + earn);
		
		Map<String, Object> activity = new HashMap<>();
		activity.put("type", action);
		activity.put("money", earn);
		activity.put("date", new Date());
		
		ArrayList activities = (ArrayList) session.getAttribute("activities");
		activities.add(activity);
		session.setAttribute("activities", activities);
		
		return "redirect:/";
		
	}	
	
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		session.invalidate();
		return "redirect:/";
		
	}
}
