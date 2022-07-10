package com.tedu.model;
import java.sql.Timestamp;
import java.util.List;
/**
 * 订单:对用表t_order
 * id 主键
 * price 价格
 * status 状态
 * isdel 是否被删除
 * date 日期
 * address 地址
 * user 用户
 * @author Administrator
 *
 */
public class Order {
	private int id;
	private double price;
	
	private int status;
	private int isdel;
	private Timestamp date;
	private Address address;
	private User user;
	@Override
	public String toString() {
		return "Order [id=" + id + ", price=" + price + ", status=" + status + ", isdel=" + isdel + ", date=" + date
				+ ", address=" + address + ", user=" + user + ", orderProducts=" + orderProducts + "]";
	}
	private List<OrderProduct> orderProducts;
	
	public Order(){
		
	}

	public Order(double price, int status, int isdel, Address address, User user) {
		super();
		this.price = price;
		this.status = status;
		this.isdel = isdel;
		this.address = address;
		this.user = user;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getIsdel() {
		return isdel;
	}
	public void setIsdel(int isdel) {
		this.isdel = isdel;
	}
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<OrderProduct> getOrderProducts() {
		return orderProducts;
	}
	public void setOrderProducts(List<OrderProduct> orderProducts) {
		this.orderProducts = orderProducts;
	}
	
}
