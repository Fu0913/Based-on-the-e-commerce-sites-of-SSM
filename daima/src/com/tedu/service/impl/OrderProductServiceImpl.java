package com.tedu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tedu.dao.OrderProductDao;
import com.tedu.model.OrderProduct;
import com.tedu.service.OrderProductService;

@Service("orderProductService")
public class OrderProductServiceImpl implements OrderProductService{
	@Autowired
	private OrderProductDao orderProductDao;
	
	@Override
	public void add(OrderProduct orderProduct) {
		orderProductDao.add(orderProduct);
		
	}

}
