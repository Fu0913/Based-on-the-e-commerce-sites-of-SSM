package com.tedu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tedu.dao.UserDao;
import com.tedu.execption.ShoppingException;
import com.tedu.model.User;
import com.tedu.service.UserService;
import com.tedu.util.CodeUtil;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public void add(User user) {
		// 密码加密
		String password = user.getPassword();// 取出密码
		String newPassword = CodeUtil.getMD5Encoding(password);// 加密
		user.setPassword(newPassword);// 修改密码
		userDao.add(user);

	}

	@Override
	public User login(String username, String password) {
		User user = userDao.login(username);
		if(user == null) {
			throw new ShoppingException("用户名不存在");
		}
		if(!user.getPassword().equals(CodeUtil.getMD5Encoding(password))) {
			throw new ShoppingException("密码错误");
		}
		return user;
	}

	@Override
	public void updateBalance(User user) {
		userDao.updateBalance(user);
		
	}

	
	
}
