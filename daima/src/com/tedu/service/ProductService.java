package com.tedu.service;

import java.util.List;

import com.tedu.model.Product;

public interface ProductService {
	public void add(Product product);
	public void delete(int id);
	public void update(Product product);
	public List<Product> list();
	
	//前端获取所有商品
	public Product load(int id);
	//前端获取所有商品
	public List<Product> listByName(String name);
	
	
	public List<Product> listBySales();
	//新上架
	public List<Product> listNewProduct();
}
