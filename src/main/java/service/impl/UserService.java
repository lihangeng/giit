package service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.IRoleDao;
import dao.IStaffDao;
import dao.IUserDao;
import dmo.User;
import service.IUserService;

@Service
public class UserService implements IUserService {
	
	@Resource
	private IUserDao userDao;
	
	@Resource
	private IRoleDao roleDao;
	
	@Resource
	private IStaffDao staffDao;

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changePassword(String userId, String newPassword) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<String> findRoles(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> findPermissions(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
