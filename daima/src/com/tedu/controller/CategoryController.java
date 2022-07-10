package com.tedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tedu.model.Category;
import com.tedu.service.CategoryService;

@Controller
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	/**
	 * 跳转到添加页面
	 */
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String add(Model model){
		model.addAttribute(new Category());
		return "admin/main/category/add";
	}
	/**
	 * 具体的添加的操作
	 */
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String add(Category category){
		categoryService.add(category);
		return "redirect:/category/categories";
	}
	
	/**
	 * 删除类别
	 */
	@RequestMapping(value="/{id}/delete", method=RequestMethod.DELETE)
	public String delete(@PathVariable int id) {
		categoryService.delete(id);
		return "redirect:/category/categories";
	}
	
	/**
	 * 跳转到修改页面
	 */
	@RequestMapping(value="/{id}/update",method=RequestMethod.GET)
	public String update(@PathVariable int id,Model model){
		Category category = categoryService.load(id);
		model.addAttribute(category);
		return "admin/main/category/update";
	}
	
	/**
	 * 具体的修改操作
	 */
	@RequestMapping(value="/{id}",method=RequestMethod.PUT)
	public String update(Category category){
		categoryService.update(category);
		return "redirect:/category/categories";
	}
	
	/**
	 * 跳转到类别列表
	 */
	@RequestMapping(value="/categories",method=RequestMethod.GET)
	public String list(Model model) {
		List<Category> categories = categoryService.list();
		model.addAttribute("categories",categories);
		return "admin/main/category/list";
	}
	
}
