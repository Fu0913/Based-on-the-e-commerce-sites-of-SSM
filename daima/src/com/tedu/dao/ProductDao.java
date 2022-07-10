package com.tedu.dao;
import java.util.List;

import com.tedu.model.Category;
import com.tedu.model.Product;

public interface ProductDao {
	public void add(Product product);
	public void delete(int id);
	public void update(Product product);
	public List<Product> list();
	
	//加载所有商品
	public Product load(int id);
	//所有商品
	public List<Product> listByName(String name);
	
	//热销
	public List<Product> listBySales();
	//新上架
	public List<Product> listNewProduct();
		
}
