package com.tedu.model;

public class Img {
	private int id;
	private String name;
	private Product product;
	public Img() {
		
	}
	public Img(String name, Product product) {
		this.name = name;
		this.product = product;
	}
	public Img(int id, String name, Product product) {
		this.id = id;
		this.name = name;
		this.product = product;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}

}
