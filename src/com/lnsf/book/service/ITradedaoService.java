package com.lnsf.book.service;

import java.util.List;

import com.lnsf.book.model.Trade;

public interface ITradedaoService {
	List<Trade> select();			//查询交易
	
	boolean insert(Trade trade);	//插入交易
	
	boolean update(Trade trade);	//更新交易
	
	boolean delete(Trade trade);	//删除交易
	
	String getUsername(int userid);	//根据用户Id查询收货人名字
	
	boolean unfinishedTrade(int id, int rid, String status);//根据订单Id和商家Id查询某状态的订单是否存在
	
	List<Trade> getTradeByStatus(int rid, String status);//根据商家Id返回某状态订单列表
	
	boolean updateStatusById(int id, String status);//根据订单Id更新状态
	
	boolean selectTradeByStatus(int id, int rid, String status);//根据订单Id和商家Id查询某状态的订单是否存在
	
	List<Trade> getTradeByStatus(int id, int rid, String status);//根据订单Id和商家Id返回某状态的订单
	
	Trade getTradeById(int id);		//根据id返回一个Trade对象
	
	List<Trade> getTradeByStatusAndUserId(int uid, String status);//根据用户Id返回某状态订单列表
	
	boolean selectTradeById(int id);//根据订单Id查询订单是否存在

	List<Trade> getTradeListByUseridAndNotInStatus(int userid, String status);	//根据用户id和状态,返回除了这个状态以外其他所有状态的订单列表(降序排列)
	
	boolean isExistByUseridAndTidAndNotInStatus(int userid, int tid, String status);	//根据用户id和订单id和不应该包括的状态判断该订单是否存在
	
	List<Trade> getTradeByRidAndStatus(int rid, String status);					//根据订单Id和状态返回列表
}
