package com.sola.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sola.service.GoodsService;

@Controller
public class ShopController {
	@Autowired
	private GoodsService goodService;
	
	@RequestMapping(value="/goods/{typeId}",method=RequestMethod.GET)
	public String Mens_Single(@PathVariable Integer typeId,Model model) {
		model.addAttribute(goodService.findAllByTypeId(typeId));
		return "men_single";
	}
	
	@RequestMapping(value="/men_single")
	public String Mens_Single2() {
		return "men_single";
	}
	
	
}
