package com.dojo.spring.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.dojo.spring.model.Tag;

public interface TagRepo extends CrudRepository <Tag, Long> {
	public List<Tag> findAllBySubjectIn(String[] subjects);
}
