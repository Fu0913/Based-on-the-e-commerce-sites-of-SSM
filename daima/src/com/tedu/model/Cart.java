package com.tedu.model;
import java.sql.Timestamp;
/**
 * 购物车:对应表t_cart
 * id 主键
 * product 商品
 * user 用户
 * quantity 商品数量
 * date 日期
 * @author Administrator
 *
 */
public class Cart {
	private int id;
	private Product product;
	private User user;
	private int quantity;
	private Timestamp date;
	public Cart() {
		
	}
	
	public Cart(Product product, User user, int quantity) {
		this.product = product;
		this.user = user;
		this.quantity = quantity;
	}

	public Cart(int id, Product product, User user, int quantity) {
		this.id = id;
		this.product = product;
		this.user = user;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}
	
}
