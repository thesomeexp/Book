package com.lnsf.book.dao;

import java.util.List;

import com.lnsf.book.model.Restaurant;

public interface IRestaurantdao {
	
	List<Restaurant> select();
	
	boolean insert(Restaurant restaurant);
	
	boolean update(Restaurant restaurant);
	
	boolean delete(Restaurant restaurant);
}
