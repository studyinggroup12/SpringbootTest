package com.sola.enums;
/**
 * 后续实现
 * @author Administrator
 *
 */
public enum UserEnum{
	OK(1000,"OK!"),
	NO_PWD(1001,"密码没有填写"),
	NO_UNAME(1002,"用户名没有填写"),
	NO_EMAIL(1003,"邮箱没有填写"),
	NO_PHONE(1004,"电话没有填写"),
	USR_EXI(1005,"用户名已存在"),
	USR_NOT_EXT(1006,"用户名不存在"),
	USR_ERROR(1007,"用户名不对"),
	PWD_ERROR(1008,"密码不对"),
	SESSION_EXT(1009,"您已登录")
	;
	
	private Integer code;
	private String msg;
	
	private UserEnum(Integer code,String msg) {
		this.code=code;
		this.msg=msg;
	}
	
	public Integer getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void setCode(Integer code) {
		this.code = code;
	}
	
	
	
}
