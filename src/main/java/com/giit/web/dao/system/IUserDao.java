package com.giit.web.dao.system;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import dmo.User;

/**
 * 
 * @author 17051548
 *
 */
public interface IUserDao {
	
	public List<User> findAll();
	
	public User findById(String id);
	
	public void update(User user);
	
	public void add(User user);
	
	public void delete(String id);
	
	public User findByIdAndPassword(@Param("id") String name,@Param("password")String password );
	
	public void updatePassword(@Param("UserId")String id,@Param("password")String password);
	
	public User findByUsername(String username);

}
