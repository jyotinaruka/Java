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

import com.dojo.spring.model.Category;
import com.dojo.spring.model.Product;
import com.dojo.spring.service.CategoryService;
import com.dojo.spring.service.ProductService;

@Controller
public class ProductController {
	private final ProductService productService;
	private final CategoryService categoryService;

	
	
	public ProductController(ProductService productService, CategoryService categoryService) {
		super();
		this.productService = productService;
		this.categoryService = categoryService;
	}

	@GetMapping("/")
	public String index() {
		return "redirect:/products";
	}
	
	@GetMapping("/products/new")
	public String newProduct(Model model) {
		model.addAttribute("product", new Product());
		return "newproduct.jsp";
	}
	
	@PostMapping("/products/new")
	public String createProduct(@Valid @ModelAttribute("product") Product product, BindingResult result) {
		if(result.hasErrors()) {
			return "newproduct.jsp";
		} else {
			productService.save(product);
			return "redirect:/products"; 
		}
	}
	
	@GetMapping("/products")
	public String products(Model model) {
		List<Product> products = productService.findAll();
		model.addAttribute("products", products);
		return "products.jsp";
	}
	
	@GetMapping("/products/{id}")
	public String showCategory(@PathVariable("id") Long id, Model model) {
		Product product = productService.findById(id);
		model.addAttribute("product", product);
		List<Category> categories = categoryService.findAll();
		model.addAttribute("categories", categories);
		return "showproduct.jsp";
	}
	
	
	
	
	
	
	
	
	
	

}
