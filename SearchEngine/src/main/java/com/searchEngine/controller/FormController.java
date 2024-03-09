package com.searchEngine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.searchEngine.model.Student;

@Controller
public class FormController {
	
	@RequestMapping("/application")
	public String showForm() {
		return "complex_form";
	}
	
	@RequestMapping(path = "/handleform", method = RequestMethod.POST)
	public String formHandle(@ModelAttribute("student") Student student, BindingResult result) {
		
		if(result.hasErrors()) {
			return "complex_form";
		}
		return "success";
	}

}
