package com.sola.util;

import com.sola.entity.Result;

public class ResultUtil {
	public final static Integer OK=1;
	public final static Integer ERROR=200;
	public final static String NO_PWD="密码没有填写";
	public final static String NO_UNAME="用户名没有填写";
	public final static String NO_EMAIL="邮箱没有填写";
	public final static String NO_PHONE="电话没有填写";
	public final static String USR_EXI="用户名已存在";
	public final static String USR_NOT_EXT="用户名不存在";
	public final static String USR_ERROR="用户名不对";
	public final static String PWD_ERROR="密码不对";
	public final static String SESSION_EXT="您已登录";
	
	public static Result success(Object data) {
		Result result=new Result();
		result.setCode(0);
		result.setMsg("Ok!");
		result.setData(data);
		return result;
	}

	public static Result success() {
		return success(null);
	}
	
	public static Result error(Integer code,String msg) {
		Result result=new Result();
		result.setCode(code);
		result.setMsg(msg);
		return result;
	}
	
	public static Result error(String msg) {
		return error(ERROR,msg);
	}
	
	
}
