package com.dojo.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dojo.spring.model.Category;
import com.dojo.spring.repositories.CategoryRepository;

@Service
public class CategoryService {
	private final CategoryRepository categoryRepository;

	public CategoryService(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}

	public Category save(Category category) {
		
		return categoryRepository.save(category);
	}

	public Category findbyId(Long id) {		
		return categoryRepository.findById(id).orElse(null);
	}

	public List<Category> findAll() {
		return categoryRepository.findAll();
	}
	
	
	
	
	
	
	
	
	
	
	

}
