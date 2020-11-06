package com.dojo.spring.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.dojo.spring.model.TagQuestion;

public interface TagQuestionRepo extends CrudRepository <TagQuestion, Long> {
	public List<TagQuestion> findAll();
}
