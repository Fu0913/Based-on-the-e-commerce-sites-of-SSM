package com.tedu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tedu.dao.OrderDao;
import com.tedu.model.Order;
import com.tedu.model.User;
import com.tedu.service.OrderService;

@Service("orderService")
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderDao orderDao;
	
	@Override
	public void add(Order order) {
		orderDao.add(order);
		
	}

	@Override
	public Order load(int id) {
		return orderDao.load(id);
	}

	@Override
	public void update(Order order) {
		orderDao.update(order);
		
	}

	@Override
	public List<Order> listByUser(int uid) {
		return orderDao.listByUser(uid);
	}

	@Override
	public int countByStatus(User user, int i) {
		Order order = new Order();
		order.setUser(user);
		order.setStatus(i);
		return orderDao.countByStatus(order);
	}

	@Override
	public List<Order> listByStatus(Order order) {
		return orderDao.listByStatus(order);
	}

}
