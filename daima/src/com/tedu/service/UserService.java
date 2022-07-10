package com.tedu.service;

import com.tedu.model.User;

public interface UserService {
	public void add(User user);
	public User login(String username, String password);
	public void updateBalance(User user);
}
