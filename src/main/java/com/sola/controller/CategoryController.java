package com.sola.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.soap.AddressingFeature.Responses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sola.entity.Result;
import com.sola.entity.TypeInfo;
import com.sola.service.GoodsService;
import com.sola.service.TypeInfoService;
import com.sola.util.ResultUtil;

@Controller
public class CategoryController {
	@Autowired
	private TypeInfoService typeInfoService;
	@Autowired
	private GoodsService goodsService;
	
	@RequestMapping(value="/men",method=RequestMethod.GET)
	@ResponseBody
	public List<TypeInfo> header() {
		return typeInfoService.findByFatherId(1);
	}
	
//	@RequestMapping(name="/")
//	public Map<String, Object> fff(Model model) {
//		Map<String, Object> map=new HashMap<String, Object>();
//		map.put("man", typeInfoService.findByFatherId(1));
//		return map;
//	}
	
	
}
