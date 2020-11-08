package com.dojo.spring.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dojo.spring.model.Dojo;
import com.dojo.spring.model.Ninja;
import com.dojo.spring.service.DojoNinjaService;

@Controller
public class DojoController {
	
	private final DojoNinjaService dojoNinjaService;
	
	public DojoController(DojoNinjaService dojoNinjaService) {
		this.dojoNinjaService = dojoNinjaService;
	}
	
	@GetMapping("/dojos/new")
	public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
		return "/dojoAndNinjas/newdojo.jsp";
	}
	

	@PostMapping("/dojos/new")
	public String addDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "/dojoAndNinjas/newdojo.jsp";
		}
		else {
			dojoNinjaService.addDojo(dojo);
			return "redirect:/show/dojos";
		}
	}
	
	@GetMapping("/show/dojos")
	public String showDojo(Model model) {
		List<Dojo> dojos = dojoNinjaService.getAllDojos();
		model.addAttribute("dojos", dojos);
		return "/dojoAndNinjas/dojoList.jsp";
	}
	
	@GetMapping("/dojos/{id}")
	public String showNinjas(Model model, @PathVariable("id") Long id) {
		Dojo dojo = dojoNinjaService.singleDojo(id);
		model.addAttribute("dojo", dojo);
		List<Ninja> ninjas = dojoNinjaService.getAllNinjasForDojo(id);
		model.addAttribute("ninjas", ninjas);
		return "/dojoAndNinjas/showNinjas.jsp";
	}
	
	
		

}
