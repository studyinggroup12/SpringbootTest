package com.sola.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sola.entity.Result;
import com.sola.entity.User;
import com.sola.service.UserService;
import com.sola.util.ResultUtil;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value="/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping(value="/login/login.do",method=RequestMethod.POST)
	@ResponseBody
	public Result dologin(
			@RequestParam(value="username") String username,
			@RequestParam(value="password") String password,
			Model model,
			HttpServletRequest request) { 
		HttpSession session=request.getSession();
		User user=userService.findByUsername(username);
		if(user!=null) {
			if(password.equals(user.getPassword()) && (password==null || password.trim()=="")) {
				if(session.getAttribute("user")==null) {
					session.setAttribute("user", user.getUsername());
					return ResultUtil.success();
				}else {
					return ResultUtil.error(ResultUtil.SESSION_EXT);
				}
			}
			else{
				return ResultUtil.error(ResultUtil.PWD_ERROR);
			} 
		}
		return ResultUtil.error(ResultUtil.USR_NOT_EXT);
	}
	
	@RequestMapping(value="/reg")
	public String reg() {
		return "register";
	}
	
	@RequestMapping(value="/reg/reg.do",method=RequestMethod.POST)
	@ResponseBody
	public Result doReg(User user) {
		if(userService.findByUsername(user.getUsername())!=null) {
			return ResultUtil.error(ResultUtil.USR_EXI);
		}
		
		if(user.getUsername().trim()==null || user.getUsername().trim()=="") {
			return ResultUtil.error(ResultUtil.NO_UNAME);
		}
		else if(user.getPassword().trim()==null || user.getPassword().trim()=="") {
			return ResultUtil.error(ResultUtil.NO_PWD);
		}
		else if(user.getEmail().trim()==null || user.getEmail().trim()=="") {
			return ResultUtil.error(ResultUtil.NO_EMAIL);
		}
		else if (user.getPhone().trim()==null || user.getPhone().trim()=="") {
			return ResultUtil.error(ResultUtil.NO_PHONE);
		}
		
		userService.save(user);
		return ResultUtil.success();
	}
	
}
