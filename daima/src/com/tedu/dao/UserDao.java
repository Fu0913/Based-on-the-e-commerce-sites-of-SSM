package com.tedu.dao;

import com.tedu.model.User;

public interface UserDao {
	public void add(User user);
	public User login(String username);
	public void updateBalance(User user);
}
