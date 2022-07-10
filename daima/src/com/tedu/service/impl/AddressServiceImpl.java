package com.tedu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tedu.dao.AddressDao;
import com.tedu.model.Address;
import com.tedu.service.AddressService;

@Service("addressService")
public class AddressServiceImpl implements AddressService{
	
	@Autowired
	private AddressDao addressDao;
	
	@Override
	public void add(Address address) {
		addressDao.add(address);
		
	}

	@Override
	public void delete(int id) {
		addressDao.delete(id);
		
	}

	@Override
	public void update(Address address) {
		addressDao.update(address);
		
	}

	@Override
	public Address load(int id) {
		return addressDao.load(id);
	}

	@Override
	public List<Address> listByUser(int uid) {
		return addressDao.listByUser(uid);
	}
	
}
