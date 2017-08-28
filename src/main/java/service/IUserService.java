package service;

import java.util.List;

import dmo.User;

public interface IUserService {
	
	public List<User> findAll();
	
	public User findById(String id);
	
	public void update(User user);
	
	public void add(User user);
	
	public void delete(String id);
	
	public void changePassword(String userId,String newPassword);
	
	public List<String> findRoles(String username);
	
	public List<String> findPermissions(String username);

}
