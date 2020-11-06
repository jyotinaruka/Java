package com.dojo.spring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dojo.spring.model.Answer;

@Repository
public interface AnswerRepo extends CrudRepository <Answer, Long> {

}
