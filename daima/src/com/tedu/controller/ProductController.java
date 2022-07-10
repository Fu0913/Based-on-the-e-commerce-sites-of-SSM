package com.tedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tedu.model.Product;
import com.tedu.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	/**
	 * 前台查看商品详情
	 */
	@RequestMapping(value="/{id}/item",method=RequestMethod.GET)
	public String item(@PathVariable Integer id, Model model){
		Product product = productService.load(id);
		model.addAttribute(product);
		return "client/product_item";
	}
	
	
	/**
	 * 跳转到添加页面（自己拓展的）
	 */
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String add(Model model){
		
		model.addAttribute(new Product());
		return "admin/main/product/add";
	}
	
	/**
	 * 具体的添加操作（自己拓展的）
	 */
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String add(Product product){
		
		productService.add(product);
		return "redirect:/product/products";
	}
	/**
	 * 删除类别
	 */
	@RequestMapping(value="/{id}/delete", method=RequestMethod.DELETE)
	public String delete(@PathVariable int id) {
		productService.delete(id);
		return "redirect:/product/products";
	}
	
	/**
	 * 跳转到修改页面
	 */
	@RequestMapping(value="/{id}/update",method=RequestMethod.GET)
	public String update(@PathVariable int id,Model model){
		Product product = productService.load(id);
		model.addAttribute(product);
		return "admin/main/product/update";
	}
	
	/**
	 * 具体的修改操作
	 */
	@RequestMapping(value="/{id}",method=RequestMethod.PUT)
	public String update(Product product){
		productService.update(product);
		return "redirect:/product/products";
	}
	
	/**
	 * 跳转到商品列表
	 */
	@RequestMapping(value="/products",method=RequestMethod.GET)
	public String list(Model model) {
		List<Product> product = productService.list();
		model.addAttribute("products",product);
		return "admin/main/product/list";
	}
	
}