package com.dojo.spring.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dojo.spring.model.Question;
import com.dojo.spring.model.Tag;
import com.dojo.spring.model.TagQuestion;
import com.dojo.spring.service.OverFlowService;

@Controller
public class OverFlowController {
	private final OverFlowService overFlowService;
	
	public OverFlowController(OverFlowService overFlowService) {
		this.overFlowService = overFlowService;
	}
	
	@GetMapping("/")
	public String index(Model model) {
		List<Question> questions = overFlowService.findAllQuestions();
		model.addAttribute("questions",questions);
		return "index.jsp";
	}
	
	@GetMapping("/questions/new")
	public String newQuestion(Model model) {
		model.addAttribute("newquestion", new Question());
		return "newquestion.jsp";
	}
	
	@PostMapping("/addquestion")
	public String createProduct(@Valid @ModelAttribute("newquestion") Question question, @RequestParam("addtags") String[] tags, BindingResult result) {
		if(tags.length > 3) {
			result.addError(new FieldError("newquestion", "tags", "Only three tags are allowed!"));
		}
		
		if(result.hasErrors()) {
			return "newquestion.jsp";
		} else {
			List<Tag> dbTags = overFlowService.findTagsWithSubject(tags);
			List<String> filtered = new ArrayList<String>(Arrays.asList(tags));
			for(Tag tag : dbTags) {
				filtered.remove(tag.getSubject());
			}
			
			List<Tag> newTags = new ArrayList<>();
			for(String tagName: filtered) {
				Tag tag = new Tag();
				tag.setSubject(tagName);
				newTags.add(tag);
			}
			if(!newTags.isEmpty()) {
				overFlowService.saveTags(newTags);
			}
			
			Question savedQues = overFlowService.save(question);
			savedQues.setTags(new ArrayList<>());
			savedQues.getTags().addAll(dbTags);
			savedQues.getTags().addAll(newTags);
			savedQues = overFlowService.save(question);
			
			return "redirect:/"; 
		}
	}
	
	
}
