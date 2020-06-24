package com.lnsf.book.dao;

import java.util.List;

import com.lnsf.book.model.User;

public interface IUserdao {
	
	List<User> select();
	
	boolean insert(User user);
	
	boolean update(User user);
	
	boolean delete(User user);
}
