package com.tedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tedu.model.Product;
import com.tedu.service.ProductService;

@Controller
public class IndexController {
	
	@Autowired
	private ProductService productService;
	
	/**
	 * 访问首页方法
	 */
	@RequestMapping(value="/index.html",method=RequestMethod.GET)
	public String index(Model model){
		List<Product> products = productService.listByName(null);
		model.addAttribute("products",products);
		return "client/index";
		
	}
	
	
	
	
	
	
	
	
}
