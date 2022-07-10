package com.tedu.service;

import java.util.List;

import com.tedu.model.Order;
import com.tedu.model.User;

public interface OrderService {
	public void add(Order order);
	public Order load(int id);
	public void update(Order order);
	public List<Order> listByUser(int uid);
	public int countByStatus(User user, int i);
	public List<Order> listByStatus(Order order);
	
}
