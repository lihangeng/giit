package com.giit.web.service;

import dmo.User;

public interface IAccountService {
	
	public User findByIdAndPassword(String username, String password);

    public void updatePassword(String id, String password);
}
