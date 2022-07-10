package com.tedu.model;
/**
 * 订单与商品的关系:对应表t_order_product
 * id 主键
 * product 商品
 * order 订单
 * quantity 数量
 * @author Administrator
 *
 */
public class OrderProduct {
	private int id;
	private Product product;
	private Order order;
	private int quantity;
	
	public OrderProduct(){
		
	}
	
	public OrderProduct(int id, Order order,Product product) {
		super();
		this.id = id;
		this.product = product;
		this.order = order;
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
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
