package com.maq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@GetMapping("/welcome")
	public ModelAndView displayWelcomeMsg() {
		String msgTxt = "Welcome to Spring MVC first app..!!";
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", msgTxt);
		mav.setViewName("welcomeView");
		
		return mav;
	}
	
}
