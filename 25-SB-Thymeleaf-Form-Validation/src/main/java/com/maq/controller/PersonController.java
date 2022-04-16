package com.maq.controller;

import java.time.LocalDate;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.maq.binding.Person;

@Controller
public class PersonController {

	@GetMapping("/person")
	public String displayForm(Model model) {
		ModelAndView mav = new ModelAndView();
		Person personObj = new Person();
		model.addAttribute("person", personObj);
		return "index";
	}
	
	@PostMapping("/savePerson")
	public String savePerson(@Valid Person person, BindingResult result, Model model) {
		System.out.println(person);

		if (result.hasErrors()) {
			return "index";
		} else {
			model.addAttribute("msg", person.getName() + " record saved successfully");
		}
		return "data";
	}
	
	@GetMapping("/date")
	@ResponseBody
	public String display() {
		LocalDate date = LocalDate.now();
		String msg = "Today's Date Is : " + date;
		return msg;
	}

}