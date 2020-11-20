package com.dojo.spring.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dojo.spring.model.Category;


@Repository
public interface CategoryRepository extends CrudRepository <Category, Long> {

	public List<Category> findAll();
	
}
