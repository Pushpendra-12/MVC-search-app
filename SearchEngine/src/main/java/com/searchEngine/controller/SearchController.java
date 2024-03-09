package com.searchEngine.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	@RequestMapping("/engine")
	public String home() {
		String str = null;
		System.out.println(str.length());
		return "homeview";
	}
	

	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query) {
		
		String url = "https://www.google.com/search?q="+query;
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(url);
		return redirectView;
		
	}
	
	@RequestMapping("/pathvar/{userid}")
	public String getUserDetails(@PathVariable("userid") int userid) {
		System.out.println(userid);
		return "homeview";
	}
	
//	@ResponseStatus(value= HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler({NullPointerException.class})
//	public String exceptionHandlerNull() {
//		return "null_page";
//	}
//	
//	@ResponseStatus(value= HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler(value = Exception.class)
//	public String exceptionHandlerGeneric() {
//		return "null_page";
//	}
}
