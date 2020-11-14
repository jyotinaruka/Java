package com.dojo.spring.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.dojo.spring.model.Language;
import com.dojo.spring.service.LanguageService;

@Controller
public class LanguagesController {

	private final LanguageService languageService;

	public LanguagesController(LanguageService languageService) {
		this.languageService = languageService;
	}

	@RequestMapping("/languages")
	public String index(Model model, @ModelAttribute("addNew") Language newLang) {
		List<Language> languages = languageService.allLanguages();
		model.addAttribute("languages", languages);
//		model.addAttribute("addNew", new Language());
		return "languages/dashboard.jsp";
	}
	
	@RequestMapping(value = "/languages", method = RequestMethod.POST)
	public String addLanguage(@Valid @ModelAttribute("addNew") Language newLang, BindingResult result, RedirectAttributes attr) {
		if(result.hasErrors()) {
			attr.addFlashAttribute("org.springframework.validation.BindingResult.addNew", result);
		    attr.addFlashAttribute("addNew", newLang);
			return "redirect:/languages";
		} else {
			languageService.addLanguage(newLang);
			return "redirect:/languages";
		}		
	}
	
	@RequestMapping("/languages/edit/{id}")
	public String editLanguage(@PathVariable("id") Long id, Model model) {
		Language language = languageService.findLanguage(id);
		model.addAttribute("language", language);
		return "languages/edit.jsp";
	}
	
	@RequestMapping(value="/languages/edit/{id}", method = RequestMethod.PUT)
	public String updateLanguage(@Valid @ModelAttribute("language") Language updateLang, BindingResult result) {
		if(result.hasErrors()) {
			return "languages/edit.jsp";
		} else {
			languageService.save(updateLang);
			return "redirect:/languages";
		}
	}
	
	@RequestMapping("/languages/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		languageService.deleteLanguage(id);
		return "redirect:/languages";
	}

	@RequestMapping("/languages/{id}")
	public String showLanguage(@PathVariable("id") Long id, Model model) {
		Language lang = languageService.findLanguage(id);
		model.addAttribute("language", lang);
		return "languages/show.jsp";
	}
	
}
