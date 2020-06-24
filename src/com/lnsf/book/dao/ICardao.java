package com.lnsf.book.dao;

import java.util.List;

import com.lnsf.book.model.Car;

public interface ICardao {
	
	List<Car> select();
	
	boolean insert(Car car);
	
	boolean update(Car car);
	
	boolean delete(Car car);
}
