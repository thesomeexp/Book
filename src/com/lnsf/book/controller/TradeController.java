package com.lnsf.book.controller;

import java.util.ArrayList;
import java.util.List;

import com.lnsf.book.model.Trade;
import com.lnsf.book.service.impl.IRestaurantdaoServiceImpl;
import com.lnsf.book.service.impl.ITradedaoServiceImpl;

public class TradeController {
	
	static ITradedaoServiceImpl tradedaoservice = new ITradedaoServiceImpl();
	static IRestaurantdaoServiceImpl restaurantdaoservice = new IRestaurantdaoServiceImpl();
	/**
	 * 根据id查询用户姓名
	 * @param userId
	 * @return String
	 */
	public static String getUsernameByUserId(int userId)
	{
		String name = tradedaoservice.getUsername(userId);
		return name;
	}
	/**
	 * 根据商家Id返回已完成订单列表
	 * @param rid
	 * @return List<Trade>
	 */
	public static List<Trade> getFinishedTradeByRid(int rid)
	{
		List<Trade> list = new ArrayList<Trade>();
		list = tradedaoservice.getTradeByStatus(rid, "已完成");
		return list;
	}
	/**
	 * 根据订单id和商家id查询已付款的订单是否存在
	 * 存在返回true，否则返回false
	 * @param id
	 * @param rid
	 * @return boolean
	 */
	public static boolean unfinishedTradeIsExist(int id, int rid)
	{
		boolean flag = tradedaoservice.unfinishedTrade(id, rid, "已付款");
		return flag;
	}
	/**
	 * 根据订单Id更新状态
	 * 更新成功返回true，否则返回false
	 * @param tradeId
	 * @return boolean
	 */
	public static boolean updateStatusToDelivered(int tradeId)
	{
		boolean flag = tradedaoservice.updateStatusById(tradeId, "已发货");
		return flag;
	}
	/**
	 * 
	 * @param id
	 * @return
	 */
	public static List<Trade> getUnfinishedTradeById(int rid) {
		List<Trade> list = new ArrayList<Trade>();
		list = tradedaoservice.getTradeByStatus(rid, "已付款");
		return list;
	}
	/**
	 * / 根据用户id,商家id和状态判断是否存在该订单
	 * 存在返回true否则false
	 * @param userId
	 * @param rid
	 * @param status
	 * @return boolean
	 */
	public static boolean isExistByUserIdAndRidAndStatus(int userId, int rid, String status)
	{
		boolean flag = tradedaoservice.selectTradeByStatus(userId, rid, status);
		return flag;
	}
	/**
	 * // 插入一个trade,trade的id为-1时代表自增
	 * 成功返回true否则false
	 * @param trade
	 * @return boolean
	 */
	public static boolean init(Trade trade)
	{
		boolean flag = tradedaoservice.insert(trade);
		return flag;
	}
	/**
	 * // 根据用户id和店家id和状态返回一个List<Trade>
	 * @param userId
	 * @param Rid
	 * @param status
	 * @return List<Trade>
	 */
	public static List<Trade> getTradeListIdByUseridAndRidAndStatus(int userId, int Rid, String status)
	{
		List<Trade> list = tradedaoservice.getTradeByStatus(userId, Rid, status);
		return list;
	}
	/**
	 * // 根据账单的id返回该账单Trade
	 * @param tid
	 * @return Trade
	 */
	public static Trade getTradeById(int tid)
	{
		Trade trade = tradedaoservice.getTradeById(tid);
		return trade;
	}
	/**
	 * // 根据传入的Trade的id来更新它的其他所有属性
	 * 成功返回true失败返回false
	 * @param trade
	 * @return boolean
	 */
	public static boolean update(Trade trade)
	{
		boolean flag = tradedaoservice.update(trade);
		return flag;
	}
	/**
	 * // 根据userid和状态返回一个TradeList,不能返回空
	 * @param userid
	 * @param status
	 * @return List<Trade>
	 */
	public static List<Trade> getTradeListByUseridAndStatus(int userid, String status)
	{
		List<Trade> list = tradedaoservice.getTradeByStatusAndUserId(userid, status);
		return list;
	}
	/**
	 * // 根据tid判断该订单是否存在,存在返回true不存在返回false
	 * @param tid
	 * @return boolean
	 */
	public static boolean isExist(int tid)
	{
		boolean flag = tradedaoservice.selectTradeById(tid);
		return flag;
	}
	/**
	 * // 根据用户id和状态,返回除了这个状态以外其他所有状态的订单列表(降序排列),不能返回null
	 * @param userid
	 * @param status
	 * @return
	 */
	public static List<Trade> getTradeListByUseridAndNotInStatus(int userid, String status)
	{
		List<Trade> list = tradedaoservice.getTradeListByUseridAndNotInStatus(userid, status);
		return list;
	}
	/**
	 * // 根据用户id和订单id和不应该包括的状态判断该订单是否存在
	 * 存在返回true不存在返回false
	 * @param userid
	 * @param tid
	 * @param status
	 * @return boolean
	 */
	public static boolean isExistByUseridAndTidAndNotInStatus(int userid, int tid, String status)
	{
		boolean flag = tradedaoservice.selectTradeById(tid);
		return flag;
	}
	/**
	 * // 根据店铺id和不包括的状态返回一个List<Trade>
	 * @param rid
	 * @param status
	 * @return List<Trade>
	 */
	public static List<Trade> getTradeListByRidAndNotInStatus(int rid, String status)
	{
		List<Trade> list = tradedaoservice.getTradeByRidAndStatus(rid, status);
		return list;
	}
	public static List<Trade> getTradeListByRidAndNotInStatus(int ridByUserId) {
		// TODO Auto-generated method stub
		return null;
	}
}
