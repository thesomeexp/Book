package com.lnsf.book.dao;

import java.util.List;

import com.lnsf.book.model.Menu;

public interface IMenudao {
	
	List<Menu> select();
	
	boolean insert(Menu menu);
	
	boolean update(Menu menu);
	
	boolean delete(Menu menu);
	
}
