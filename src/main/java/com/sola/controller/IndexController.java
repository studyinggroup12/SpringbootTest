package com.sola.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping(value="/mens")
	public String mens() {
		return "mens";
	}
	
	@RequestMapping(value="/womens")
	public String womens() {
		return "womens";
	}
	
}
