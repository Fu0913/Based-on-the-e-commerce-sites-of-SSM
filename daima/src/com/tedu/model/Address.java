package com.tedu.model;
/**
 * 地址类:对应表t_address
 * id 主键
 * base 基本地址(省市县)
 * place 详细地址
 * name 收件人
 * phone 收件人联系方式
 * status 地址状态
 * user 用户
 * @author Administrator
 *
 */
public class Address {
	private int id;
	private String base;
	private String place;
	private String name;
	private String phone;
	private int status;
	private User user;
	
	public Address(){
		
	}
	
	
	public Address(String place, String name, String phone) {
		super();
		this.place = place;
		this.name = name;
		this.phone = phone;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBase() {
		return base;
	}
	public void setBase(String base) {
		this.base = base;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
