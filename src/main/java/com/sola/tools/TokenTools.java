package com.sola.tools;

import javax.servlet.http.HttpServletRequest;

public class TokenTools {
	public static final String REP_SEESION_NAME="isRepeat";
	
	public static boolean isNoRepeat(HttpServletRequest request) {
		Boolean isReat = (Boolean) request.getSession().getAttribute(REP_SEESION_NAME);
		return (isReat ==null ||!isReat);
		
	}
}
