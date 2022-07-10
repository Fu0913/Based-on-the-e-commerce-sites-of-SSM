package com.tedu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tedu.dao.CategoryDao;
import com.tedu.model.Category;
import com.tedu.service.CategoryService;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService{
	@Autowired
	private CategoryDao categoryDao;
	@Override
	public void add(Category category) {
		categoryDao.add(category);
		
	}

	@Override
	public void delete(int id) {
		categoryDao.delete(id);
		
	}

	@Override
	public void update(Category category) {
		categoryDao.update(category);
		
	}

	@Override
	public Category load(int id) {
		
		return categoryDao.load(id);
	}

	@Override
	public List<Category> list() {
		
		return categoryDao.list();
	}
	
	
	
}