package com.giit.web.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.giit.web.dao.system.IUserDao;
import com.giit.web.dmo.User;
import com.giit.web.service.IAccountService;
/**
 * AccountService
 * @author 17051548
 *
 */
@Service
public class AccountService implements IAccountService {
	
	@Resource
	private IUserDao userDao;

	@Override
	public User findByIdAndPassword(String username, String password) {
		return userDao.findByIdAndPassword(username, password);
	}

	@Override
	public void updatePassword(String id, String password) {
		userDao.updatePassword(id, password);

	}

}
