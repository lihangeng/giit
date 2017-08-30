package com.giit.web.controller.system;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest req, Model model, HttpSession session) {
		ModelAndView mav = new ModelAndView("forward:login.jsp");
		String exceptionClassName = (String)req.getAttribute("shiroLoginFailure");
		String error;
		if(UnknownAccountException.class.getName().equals(exceptionClassName)) {
			error = "用户名错误";
			mav.addObject("errormsg", error);
		}else if(IncorrectCredentialsException.class.getName().equals(exceptionClassName)){
			error = "密码错误";
			mav.addObject("errormsg", error);
		}else if(exceptionClassName != null) {
			error = "其他错误";
			mav.addObject("errormsg", error);
				}
		
		org.apache.shiro.subject.Subject subject = SecurityUtils.getSubject();
		boolean isAuthenticated = subject.isAuthenticated();
		if(isAuthenticated) {
			String principal = (String)subject.getPrincipal();
			session.setAttribute("username", principal);
			
			switch(principal) {
			case "admin":
//				return mav.;
			case "teacher":
			case "student":
			case "suppiler":
			}
		}
		return mav;
		
	}

}
