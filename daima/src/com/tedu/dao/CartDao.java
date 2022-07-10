package com.tedu.dao;

import java.util.List;
import java.util.Map;

import com.tedu.model.Cart;
import com.tedu.model.Product;

public interface CartDao {
	public void add(Cart cart);
	public List<Cart> listByUser(int uid);
	public int loadCartSize(int uid);
	public Cart load(int id);
	public void update(Cart cart);
	public void delete(int id);
	public Cart loadByProduct(Cart cart);
	public List<Cart> list(int id);
	
}
