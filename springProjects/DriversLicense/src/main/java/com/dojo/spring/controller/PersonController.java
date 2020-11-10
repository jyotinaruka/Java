package com.dojo.spring.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dojo.spring.model.Person;
import com.dojo.spring.service.LicenseService;
import com.dojo.spring.service.PersonService;

@Controller
public class PersonController {
	
	private final PersonService personService;
	private final LicenseService licenseService;
	
	public PersonController(PersonService personService, LicenseService licenseService) {
		this.personService = personService;
		this.licenseService = licenseService;
	}

	@RequestMapping("/persons/new")
	public String newPerson(@ModelAttribute("person") Person person, Model model) {
		return "driversLicense/newperson.jsp";
	}
	
	@RequestMapping(value="/addperson", method=RequestMethod.POST)
	public String addperson(@Valid @ModelAttribute("person") Person person, BindingResult result) {
		if (result.hasErrors()) {
			return "driversLicense/newperson.jsp";
		} else {
			personService.addPerson(person);
			return "redirect:licenses/new";
		}
	}
	
	@RequestMapping("/persons/{id}")
	public String viewDetails(@PathVariable("id") Long id, Model model) {
		model.addAttribute("license", licenseService.getLicense(id).get());
		return "driversLicense/view.jsp";
	}
}
