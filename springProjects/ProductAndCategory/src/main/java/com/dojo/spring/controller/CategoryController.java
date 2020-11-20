package com.dojo.spring.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dojo.spring.model.Category;
import com.dojo.spring.model.Product;
import com.dojo.spring.service.CategoryService;
import com.dojo.spring.service.ProductService;

@Controller
public class CategoryController {
	
	private final CategoryService categoryService;
	private final ProductService  productService;
	
	
	public CategoryController(CategoryService categoryService, ProductService productService) {
		
		this.categoryService = categoryService;
		this.productService = productService;
	}

	@GetMapping("/categories/new")
	public String category(Model model) {
		model.addAttribute("category", new Category());
		return "newcategory.jsp";
	}
	
	@PostMapping("/categories/new")
	public String createCategory(@Valid @ModelAttribute("category") Category category, BindingResult result) {
		if(result.hasErrors()) {
			return "newcategory.jsp";
		} else {
			category = categoryService.save(category);
			return "redirect:/categories/" + category.getId();
		}
	}
	
	@GetMapping("/categories/{id}")
	public String showCategory(@PathVariable("id") Long id, Model model) {
		Category category = categoryService.findbyId(id);
		model.addAttribute("category", category);
		List<Product> products = productService.findAll();
		model.addAttribute("products", products);
		return "showcategory.jsp";
	}
	
	@PostMapping("/categories/product/add")
	public String addProductToCategory(@RequestParam("category_id") Long categoryId, @RequestParam("product_id") Long productId) {
		Category category = categoryService.findbyId(categoryId);
		Product product = productService.findById(productId);
		category.getProducts().add(product);
		categoryService.save(category);
		return "redirect:/categories/" + categoryId;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	

}
