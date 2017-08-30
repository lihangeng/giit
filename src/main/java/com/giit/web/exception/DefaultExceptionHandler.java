package com.giit.web.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.AuthorizationException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * 控制器异常处理
 * @author 17051548
 *
 */
public class DefaultExceptionHandler implements HandlerExceptionResolver{

	@Override
	public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o,
			Exception e) {
		ModelAndView mav = new ModelAndView();
		if(e instanceof AuthorizationException) {
			mav.setViewName("redirect:/login");
		}
		return mav;
	}

}
