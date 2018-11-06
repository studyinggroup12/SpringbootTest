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
	public String findGoodsByTypeId(@PathVariable Integer typeId,Model model) {
		model.addAttribute("goods",goodService.findAllByTypeId(typeId));
		return "mens";
	}
	
	@RequestMapping(value="/goods/{typeId}/{id}",method=RequestMethod.GET)
	public String findGoodById(@PathVariable Integer id,@PathVariable Integer typeId,Model model) {
		System.out.println(goodService.findById(id).toString());
		model.addAttribute("good", goodService.findById(id));
		System.out.println(goodService.findById(id).get("goodsName"));
		return "mens_single";
	}
	
	@RequestMapping(value="/mens_single")
	public String Mens_Single2() {
		return "mens_single";
	}
	
	
}
