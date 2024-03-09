package com.searchEngine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InterceptorController {
	
	@RequestMapping("/showwelcome")
	public String welcomeView() {
		return "welcome";
	}
	
	@RequestMapping("/viewname")
	public String process(@RequestParam("welcome") String name, Model model) {
		System.out.println(name);
		model.addAttribute("welcome", name);
		return "welcomeok";
	}

}
