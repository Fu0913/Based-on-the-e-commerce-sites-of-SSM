package com.tedu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tedu.dao.ImgDao;
import com.tedu.model.Img;
import com.tedu.service.ImgService;

@Service("imgService")
public class ImgServiceImpl implements ImgService{
	
	@Autowired
	private ImgDao imgDao;
	
	@Override
	public void add(Img img) {
		imgDao.add(img);
		
	}

	@Override
	public void delete(int id) {
		imgDao.delete(id);
		
	}

	@Override
	public void update(Img img) {
		imgDao.update(img);
		
	}

	@Override
	public Img load(int id) {
		return imgDao.load(id);
	}

	@Override
	public List<Img> list(int id) {
		return imgDao.list(id);
	}

}
