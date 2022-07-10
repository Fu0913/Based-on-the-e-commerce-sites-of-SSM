package com.tedu.dao;

import java.util.List;

import com.tedu.model.Address;

public interface AddressDao {
	
	public void add(Address address);
	public void delete(int id);
	public void update(Address address);
	public Address load(int id);
	public List<Address> listByUser(int uid);
	
}
