package com.dojo.spring.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dojo.spring.model.Question;

@Repository
public interface QuestionRepo extends CrudRepository <Question, Long> {
	public List<Question> findAll();
}
