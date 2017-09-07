package com.giit.web.controller.system;

import javax.annotation.Resource;

import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.giit.web.service.IRoleService;
import com.giit.web.service.IUserService;

@Controller
@RequiresRoles("admin")
@RequestMapping("user.do")
public class UserController {
	
	@Resource(name="userService")
	private IUserService userService;
	
	@Resource(name="roleService")
	private IRoleService roleService;
	
	

}
