package com.tedu.service;

import java.util.List;

import com.tedu.model.Cart;
import com.tedu.model.Product;

public interface CartService {
	public void add(Cart cart);
	public List<Cart> listByUser(int uid);
	public int loadCartSize(int uid);
	public Cart load(int id);
	public void update(Cart cart);
	public void delete(int id);
	public List<Cart> list(int id);
}
