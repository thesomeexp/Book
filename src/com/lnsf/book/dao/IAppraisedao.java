package com.lnsf.book.dao;

import java.util.List;

import com.lnsf.book.model.Appraise;


public interface IAppraisedao {

	List<Appraise> select();
	
	boolean insert(Appraise appraise);
	
	boolean update(Appraise appraise);
	
	boolean delete(Appraise appraise);
}
