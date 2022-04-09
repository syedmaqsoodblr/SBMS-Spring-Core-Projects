package com.maq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.maq.binding.Product;

@Controller
public class ProductController {
	
	// method to display empty form
	@GetMapping("/product")
	public ModelAndView loadForm() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("product", new Product());
		mav.setViewName("productView");
		return mav;
	}
	
	// method to handle submit form
	@PostMapping("/product")
	public ModelAndView handleSubmitBtn(Product product) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("successView");
		return mav;
	} 
	
}
