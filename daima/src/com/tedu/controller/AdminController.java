package com.tedu.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tedu.model.Admin;
import com.tedu.service.AdminService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login(){
		return "admin/login";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(String username,String password,HttpSession session){
		Admin admin = null;
		try {
			admin = adminService.login(username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		session.setAttribute("loginAdmin", admin);
		
		return "redirect:main";
	}
	
	@RequestMapping(value="/logout",method=RequestMethod.GET)
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/admin/login";
	}
	
	@RequestMapping(value="/main",method=RequestMethod.GET)
	public String main() {
		return "admin/main/main";
	}
	/**
	 * 后台操作页面顶部页面跳转
	 * 
	 */
	@RequestMapping(value="/top",method=RequestMethod.GET)
	public String top() {
		return "admin/main/top";
	}
	
	@RequestMapping(value="/left",method=RequestMethod.GET)
	public String left() {
		return "admin/main/left";
	}
	
	@RequestMapping(value="/welcome",method=RequestMethod.GET)
	public String welcome() {
		return "admin/main/welcome";
	}
	
	
	
	
	
	
	
	
}
