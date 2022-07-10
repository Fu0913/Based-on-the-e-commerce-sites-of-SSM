package com.tedu.dao;

import java.util.List;

import com.tedu.model.Img;



public interface ImgDao {
	public void add(Img img);
	public void delete(int id);
	public void update(Img img);
	public Img load(int id);
	public List<Img> list(int id);
}
