package com.searchEngine.controller;

import org.springframework.web.context.request.WebRequestInterceptor;
import org.springframework.web.servlet.handler.WebRequestHandlerInterceptorAdapter;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyIntercepotr extends WebRequestHandlerInterceptorAdapter {

	public MyIntercepotr(WebRequestInterceptor requestInterceptor) {
		super(requestInterceptor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("This is pre Handler..");
		return true;
	}
	

}
