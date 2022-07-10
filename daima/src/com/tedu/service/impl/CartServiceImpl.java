package com.tedu.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tedu.dao.CartDao;
import com.tedu.model.Cart;
import com.tedu.model.Product;
import com.tedu.service.CartService;

@Service("cartService")
public class CartServiceImpl implements CartService{
	
	@Autowired
	private CartDao cartDao;
	
	@Override
	public void add(Cart cart) {
		// 判断购物车中是否有该商品
		Cart c = cartDao.loadByProduct(cart);
		// 购物中没有该商品
		if (c == null) {
			cartDao.add(cart);
		}
		// 购物车中有该商品
		else {
			// 修改购物中该商品的数量
			c.setQuantity(c.getQuantity() + cart.getQuantity());
			cartDao.update(c);
		}

	}

	@Override
	public List<Cart> listByUser(int uid) {
		return cartDao.listByUser(uid);
	}

	@Override
	public int loadCartSize(int uid) {
		return cartDao.loadCartSize(uid);
	}

	@Override
	public Cart load(int id) {
		return cartDao.load(id);
	}

	@Override
	public void update(Cart cart) {
		cartDao.update(cart);
		
	}

	@Override
	public void delete(int id) {
		cartDao.delete(id);
		
	}
	@Override
	public List<Cart> list(int id){
		return cartDao.list(id);
	}
}
