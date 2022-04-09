package com.maq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@GetMapping("/welcome")
	public ModelAndView getWelcomeMsg() {
		String msgTxt = "Good Morning...!!";
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", msgTxt);
		mav.setViewName("index");
		return mav;
	}
}
