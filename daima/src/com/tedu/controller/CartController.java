package com.tedu.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tedu.model.User;

@Controller
@RequestMapping("/cart")
public class CartController {
	
	
	
	/**
	 * 跳转到我的购物车
	 */
	@RequestMapping(value="/my_cart",method=RequestMethod.GET)
	public String cart(Model model,HttpSession session){
		User loginUser = (User)session.getAttribute("loginUser");
		if(loginUser == null){
			return "redirect:/login";
		}
		
		return "client/user/mycart";
	}
	
	
	
	
	
	
	
	
	
}
