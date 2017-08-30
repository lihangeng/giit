package com.giit.web.controller.system;

import javax.annotation.Resource;

import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.giit.web.service.impl.RoleService;
import com.giit.web.service.impl.UserService;

@Controller
@RequiresRoles("admin")
@RequestMapping("user.do")
public class UserController {
	
	@Resource(name="userService")
	private UserService userService;
	
	@Resource(name="roleService")
	private RoleService roleService;
	
	

}
