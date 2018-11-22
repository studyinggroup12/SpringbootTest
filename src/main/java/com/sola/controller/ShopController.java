package com.sola.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sola.entity.Goods;
import com.sola.entity.TypeInfo;
import com.sola.service.GoodsService;
import com.sola.service.TypeInfoService;

@Controller
public class ShopController {
	@Autowired
	private GoodsService goodService;
	@Autowired
	private TypeInfoService typeInfoService;
	
	@RequestMapping(value="/goods/{urlName}",method=RequestMethod.GET)
	public String findGoodsByTypeId(@PathVariable String urlName,Model model) {
		model.addAttribute("goods",JSON.toJSONString(goodService.findAllByTypeId(typeInfoService.findIdByUrlName(urlName))));
		return "mens";
	}
	
	@RequestMapping(value="/goods/{urlName}/{id}",method=RequestMethod.GET)
	public String findGoodById(@PathVariable Integer id,@PathVariable String urlName,Model model) {
		model.addAttribute("good", goodService.findById(id).get());
		goodService.findById(id);
		return "mens_single";
	}
	
}
