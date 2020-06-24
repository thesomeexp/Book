package com.lnsf.book.dao;

import java.util.List;

import com.lnsf.book.model.Trade;

public interface ITradedao {
	List<Trade> select();
	
	boolean insert(Trade trade);
	
	boolean update(Trade trade);
	
	boolean delete(Trade trade);
}
