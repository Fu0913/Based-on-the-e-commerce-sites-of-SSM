package com.tedu.dao;

import java.util.List;

import com.tedu.model.Order;
import com.tedu.model.User;

public interface OrderDao {
	public void add(Order order);
	public Order load(int id);
	public void update(Order order);
	public List<Order> listByUser(int uid);
	public int countByStatus(Order order);
	public List<Order> listByStatus(Order order);
	
}
