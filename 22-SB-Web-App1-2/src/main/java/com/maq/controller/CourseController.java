package com.maq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CourseController {

	@GetMapping(value = "/course")
	public ModelAndView getCourseCost(@RequestParam("name") String name) {
		// http://localhost:9090/course?name=Spring
		String msgTxt = null;
		ModelAndView mav = new ModelAndView();

		if (name.equals("Spring")) {
			msgTxt = "Spring Course price is 6000";
		} else if (name.equals("Python")) {
			msgTxt = "Python Course price is 7000";
		} else {
			msgTxt = "Please contact Admin Team for more info";
		}
		mav.addObject("msg", msgTxt);
		mav.setViewName("courseView");
		return mav;
	}
}
