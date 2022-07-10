package com.tedu.dao;

import java.util.List;

import com.tedu.model.Admin;

public interface AdminDao {
	public void add(Admin admin);
	public void delete(int id);
	public void update(Admin admin);
	public Admin load(int id);
	public List<Admin> list();
	public Admin login(String username);

}
