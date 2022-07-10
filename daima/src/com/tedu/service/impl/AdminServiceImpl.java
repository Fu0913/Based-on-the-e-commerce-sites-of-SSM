package com.tedu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tedu.dao.AdminDao;
import com.tedu.execption.ShoppingException;
import com.tedu.model.Admin;
import com.tedu.service.AdminService;
import com.tedu.util.CodeUtil;

@Service("adminService")
public class AdminServiceImpl implements AdminService{
	@Autowired
	private AdminDao adminDao;
	
	@Override
	public Admin login(String username, String password) {
		Admin admin = adminDao.login(username);
		if(admin==null){
			throw new ShoppingException("用户名不存在");
		}
		if (!CodeUtil.getMD5Encoding(password).equals(admin.getPassword())) {
			throw new ShoppingException("密码不正确");
		}
		return admin;
	}
	
}

