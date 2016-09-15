package com.chronocode.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chronocode.model.Greeting;

@RestController
public class BaseController {

	@RequestMapping("/")
	public Greeting getSimpleMessage(){
		return new Greeting(1l, "Here we go.");
	}
	
}
