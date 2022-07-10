package com.tedu.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tedu.model.User;
import com.tedu.service.CartService;
import com.tedu.service.CategoryService;
import com.tedu.service.OrderService;
import com.tedu.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	@Autowired
	private CartService cartSercice;
	@Autowired
	private OrderService orderSercice;
	
	
	/**
	 * 访问注册页方法
	 */
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String register(Model model){
		model.addAttribute(new User());
		return "client/register";
	}
	
	/**
	 * 注册的操作方法
	 */
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String register(User user){
		userService.add(user);
		return "redirect:login";
	}
	
	
	
	
	/**
	 * 访问登录页面方法
	 */
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login(){
		return "client/login";
	}
	
	
	/**
	 * 登录操作方法
	 */
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(String username,String password,HttpSession session){
		User loginUser = userService.login(username, password);
		//获取登录用户的购物车中商品种类数量
		int cartSize = cartSercice.loadCartSize(loginUser.getId());
		session.setAttribute("cartSize", cartSize);
		session.setAttribute("loginUser", loginUser);
		return "redirect:/index.html";
	}
	
	/**
	 * 个人中心跳转方法
	 */
	@RequestMapping(value="my_shopping",method=RequestMethod.GET)
	public String myShopping(Model model,HttpSession session){
		User loginUser =(User)session.getAttribute("loginUser");
		if(loginUser == null){
			return "redirect:/login";
		}
		//获取未付款订单数量
		int waitPay = orderSercice.countByStatus(loginUser, 1);
		//获取待发货订单数量
		int waitSend = orderSercice.countByStatus(loginUser, 2);
		//获取待收货订单数量
		int waitConfirm = orderSercice.countByStatus(loginUser, 3);
		//获取退款中订单数量
		int refund = orderSercice.countByStatus(loginUser, 4);
		//获取退款完成订单数量
		int refundSuccess = orderSercice.countByStatus(loginUser, 5);
		if(waitPay > 0){
			session.setAttribute("waitPay", waitPay);
		}
		if(waitSend > 0){
			session.setAttribute("waitSend", waitSend);
		}
		if(waitConfirm > 0){
			session.setAttribute("waitConfirm", waitConfirm);
		}
		if(refund > 0){
			session.setAttribute("refund", refund);
		}
		if(refundSuccess > 0){
			session.setAttribute("refundSuccess", refundSuccess);
		}
		return "client/user/my_shopping";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}











