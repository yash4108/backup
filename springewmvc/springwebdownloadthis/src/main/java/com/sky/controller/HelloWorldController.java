package com.sky.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//jsp program--Hello world//
//localhost:8080/mvc/hello/helloWorld//
//mvc-servlet,hello-class,helloworld-method//
@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	@RequestMapping("/helloworld")
	public ModelAndView helloWorld() {
		String message = "Hello World, Spring 3.0!";
		return new ModelAndView("hello","message",message);
		
		
	}
	

}
