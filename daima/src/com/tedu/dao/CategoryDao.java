package com.tedu.dao;


import java.util.List;

import com.tedu.model.Admin;
import com.tedu.model.Category;

public interface CategoryDao {
	
	public void add(Category category);
	public void delete(int id);
	public void update(Category category);
	public Category load(int id);
	public List<Category> list();
	
}
