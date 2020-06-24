package com.lnsf.book.controller;

import java.util.ArrayList;
import java.util.List;

import com.lnsf.book.model.Restaurant;
import com.lnsf.book.service.impl.IRestaurantdaoServiceImpl;

public class RestaurantController {

	public static int RID = -1;		//商家id
	static IRestaurantdaoServiceImpl restaurantdaoservice = new IRestaurantdaoServiceImpl();
	/**
	 * 根据所给id查询出餐馆名字
	 * @param rid
	 * @return String
	 */
	public static String getNameByRid(int rid)
	{
		String name = restaurantdaoservice.selectNameById(rid);
		return name;
	}
	/**
	 * 插入该饭店信息
	 * @param restaurant
	 * @return
	 */
	public static boolean insertRestaurant(Restaurant restaurant)
	{
		boolean flag = restaurantdaoservice.insert(restaurant);
		return flag;
	}
	/**
	 * 查看所有饭馆,返回饭馆List
	 * @return List<Restaurant>
	 */
	public static List<Restaurant> getAllRestaurantList()
	{
		List<Restaurant> list = new ArrayList<Restaurant>();
		list = restaurantdaoservice.select();
		return list;
	}
	/**
	 * 根据rid判断该饭店是否存在,存在true不存在false
	 * @param rid
	 * @return boolean
	 */
	public static boolean isExist(int rid)// 根据rid判断该饭店是否存在,存在true不存在false
	{
		boolean flag = restaurantdaoservice.isExistById(rid);
		return flag;
	}
	/**
	 * // 通过商家id返回商家店铺rid
	 * @param userid
	 * @return int
	 */
	public static int getRidByUserId(int userid)
	{
		return restaurantdaoservice.selectRidByUserid(userid);
	}
	/**
	 * // 根据一个饭馆id返回一个饭馆
	 * @param rid
	 * @return Restaurant
	 */
	public static Restaurant getRestaurantByRid(int rid)
	{
		return restaurantdaoservice.selectById(rid);
	}
	/**
	 * // 根据输入的店铺的店铺id来更新店铺的名字和地址
	 * 成功返回true失败返回false
	 * @param restaurant
	 * @return boolean
	 */
	public static boolean updateRestaurant(Restaurant restaurant)
	{
		return restaurantdaoservice.update(restaurant);
	}
}
