package com.lnsf.book.service;

import java.util.List;

import com.lnsf.book.model.Appraise;

public interface IAppraisedaoService {
	
	List<Appraise> select();			//查询评价
	
	boolean insert(Appraise appraise);	//插入评价
	
	boolean update(Appraise appraise);	//更新评价
	
	boolean delete(Appraise appraise);	//删除评价
	
	boolean isExistByUserIdAndRid(int uid, int rid);	//根据用户id和店铺id查看该用户的评价是否存在
	
	String getAboutByUserIdAndRid(int uid, int rid);	//根据用户id和店铺id获取该用户的评价
	
	List<Appraise> getAppraiseByRid(int rid);	// 根据rid来返回一个评价List,该List不能为null
}
