package com.maq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetController {
	
	@GetMapping("/greet")
	public ModelAndView displayGreetMsg() {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "Good Morning.....!!");
		mav.setViewName("greetView");
		
		return mav;
	}
	
}
