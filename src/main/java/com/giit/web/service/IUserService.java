package com.giit.web.service;

import java.util.List;
import java.util.Set;

import com.giit.web.dmo.User;
import com.giit.web.dmo.UserVo;

public interface IUserService {
	
	public List<UserVo> findAll();
	
	public User findById(String id);
	
	public void update(User user);
	
	public void add(User user);
	
	public void delete(String id);
	
	public void changePassword(String userId,String newPassword);
	
	public Set<String> findRoles(String username);
	
	public Set<String> findPermissions(String username);

}
