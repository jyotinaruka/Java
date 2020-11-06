package com.dojo.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.dojo.spring.model.Question;
import com.dojo.spring.model.Tag;
import com.dojo.spring.model.TagQuestion;
import com.dojo.spring.repositories.AnswerRepo;
import com.dojo.spring.repositories.QuestionRepo;
import com.dojo.spring.repositories.TagQuestionRepo;
import com.dojo.spring.repositories.TagRepo;

@Service
public class OverFlowService {
	
	private final AnswerRepo answerRepo;
	private final QuestionRepo questionRepo;
	private final TagRepo tagRepo;
	private final TagQuestionRepo tagQuestionRepo;
	
	public OverFlowService(AnswerRepo answerRepo, QuestionRepo questionRepo, TagRepo tagRepo,
			TagQuestionRepo tagQuestionRepo) {
		
		this.answerRepo = answerRepo;
		this.questionRepo = questionRepo;
		this.tagRepo = tagRepo;
		this.tagQuestionRepo = tagQuestionRepo;
	}
	
	public Question save(Question question) {
		return this.questionRepo.save(question);		
	}

	public List<Question> findAllQuestions() {
		return questionRepo.findAll();
	}

	public List<Tag> findTagsWithSubject(String[] tags){
		return tagRepo.findAllBySubjectIn(tags);
	}

	public void saveTags(List<Tag> tags) {
		tagRepo.saveAll(tags);
	}
}
