package com.dojo.spring.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dojo.spring.model.License;
import com.dojo.spring.model.Person;
import com.dojo.spring.service.LicenseService;
import com.dojo.spring.service.PersonService;

@Controller
public class LicenseController {
	
	private final PersonService personService;
	private final LicenseService licenseService;
	
	public LicenseController(PersonService personService, LicenseService licenseService) {
		this.personService = personService;
		this.licenseService = licenseService;
	}
	
	@RequestMapping("/licenses/new")
	public String newPerson(@ModelAttribute("license") License license, Model model) {
		return "driversLicense/newlicense.jsp";
	}
	
	@RequestMapping(value="/addlicense", method=RequestMethod.POST)
	public String addperson(@Valid @ModelAttribute("license") License license, BindingResult result) {
		if (result.hasErrors()) {
			return "driversLicense/newlicense.jsp";
		} else {
			return "redirect:/";
		}
	}
	
	@RequestMapping("/licenses/{id}")
	public String viewDetails(@PathVariable("id") Long id, Model model) {
		model.addAttribute("license", licenseService.getLicense(id).get());
		return "driversLicense/viewlicense.jsp";
	}
}
