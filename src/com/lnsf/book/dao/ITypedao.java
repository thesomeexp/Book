package com.lnsf.book.dao;

import java.util.List;

import com.lnsf.book.model.Type;

public interface ITypedao {
	
	List<Type> select();
	
	boolean insert(Type type);
	
	boolean update(Type type);
	
	boolean delete(Type type);
}
