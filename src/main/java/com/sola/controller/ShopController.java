package com.sola.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShopController {
	
	@RequestMapping(value="/mens_single")
	public String Mens_Single() {
		return "mens_single";
	}
}
