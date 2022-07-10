package com.tedu.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tedu.dao.ProductDao;
import com.tedu.model.Product;
import com.tedu.service.ProductService;

@Service("productService")
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductDao productDao;

	// 前端获取所有商品
	@Override
	public Product load(int id) {
		return productDao.load(id);
	}

	// 前端获取所有商品
	@Override
	public List<Product> listByName(String name) {
		return productDao.listByName(name);
	}
	
	@Override
	public void add(Product product) {
		productDao.add(product);
		
	}

	@Override
	public void delete(int id) {
		productDao.delete(id);
		
	}

	@Override
	public void update(Product product) {
		productDao.update(product);
		
	}

	@Override
	public List<Product> list() {
		return productDao.list();
	}
	
	

	@Override
	public List<Product> listBySales() {
		return productDao.listBySales();
	}

	@Override
	public List<Product> listNewProduct() {
		return productDao.listNewProduct();
	}
	
	
	
}
