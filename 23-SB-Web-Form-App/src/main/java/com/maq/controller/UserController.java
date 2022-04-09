package com.maq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.maq.binding.User;
import com.maq.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	// method for loading empty form
	@GetMapping("/user")
	public ModelAndView loadForm() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("user", new User());
		mav.setViewName("userView");

		return mav;
	}

	// method for handling form submission
	@PostMapping("/user")
	public ModelAndView handleSubmit(User user) {
		System.out.println(user);
		ModelAndView mav = new ModelAndView();
		String msgTxt = userService.saveUser(user);
		mav.addObject("msg", msgTxt);
		mav.setViewName("userView");
		return mav;
	}

}
