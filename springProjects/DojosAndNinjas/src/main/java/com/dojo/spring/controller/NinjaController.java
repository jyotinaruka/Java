package com.dojo.spring.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.dojo.spring.model.Dojo;
import com.dojo.spring.model.Ninja;
import com.dojo.spring.service.DojoNinjaService;

@Controller
public class NinjaController {
	
	private final DojoNinjaService dojoNinjaService;

	public NinjaController(DojoNinjaService dojoNinjaService) {
		this.dojoNinjaService = dojoNinjaService;
	}
	
	@GetMapping("/ninjas/new")
	public String newNinjaForm(Model model) {
		List<Dojo> dojos = dojoNinjaService.getAllDojos();
		model.addAttribute("dojos", dojos);
		model.addAttribute("ninja", new Ninja());
		return "dojoAndNinjas/newninjas.jsp";
	}
	
	@PostMapping("/ninjas/new")
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		if(result.hasErrors()) {
			return "dojoAndNinjas/newninjas.jsp";
		} else {
			 dojoNinjaService.addNinja(ninja);
			 return "redirect:/dojos/" + ninja.getDojo().getId();		
		}
		
	}
		
}
