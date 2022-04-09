package com.maq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

	@GetMapping(value = "/product/{pid}")
	public ModelAndView getProductPrice(@PathVariable("pid") Integer productId) {

		String msgTxt = null;
		ModelAndView mav = new ModelAndView();

		if (productId == 101) {
			msgTxt = "Product price: 400";
		} else if (productId == 102) {
			msgTxt = "Product price: 500";
		}

		mav.addObject("msg", msgTxt);
		mav.setViewName("productView");

		return mav;
	}
}
