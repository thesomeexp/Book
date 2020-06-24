package com.lnsf.book.controller;

import java.util.List;

import com.lnsf.book.model.Car;
import com.lnsf.book.service.impl.ICardaoServiceImpl;

public class CarController {
	public static ICardaoServiceImpl cardaoservice = new ICardaoServiceImpl();
	/**
	 * // 在car表中查询tid为tid参数的东西,返回一个List<Car>
	 * @param tid
	 * @return
	 */
	public static List<Car> getCarListByTid(int tid)
	{
		List<Car> list = cardaoservice.selectByTid(tid);
		return list;
	}
	/**
	 * // 根据传入的订单tid,菜式mid判断该car表是否有该记录,有返回true没有返回false
	 * @param tid
	 * @param mid
	 * @return	boolean
	 */
	public static boolean isExist(int tid, int mid)
	{
		boolean flag = cardaoservice.isExistByTidAndMid(tid, mid);
		return flag;
	}
	/**
	 * // 根据订单tid和菜单mid返回一个Car
	 * @param tid
	 * @param mid
	 * @return Car
	 */
	public static Car getCarByTidAndMid(int tid, int mid)
	{
		Car car = cardaoservice.getCar(tid, mid);
		return car;
	}
	/**
	 * // 根据传入的Car的id来更新Car表的记录
	 * 更新成功返回true失败返回false
	 * @param car
	 * @return boolean
	 */
	public static boolean updateCar(Car car)
	{
		boolean flag = cardaoservice.update(car);
		return flag;
	}
	/**
	 * // 根据传入的Car插入表,传入的Car的id是-1,插入成功返回true,插入失败返回false
	 * @param car
	 * @return boolean 
	 */
	public static boolean insertCar(Car car)
	{
		boolean flag = cardaoservice.insert(car);
		return flag;
	}
	/**
	 * 根据tid 查询是否购物车
	 * @param tid
	 * @return boolean
	 */
	public static boolean isExistByTid(int tid)
	{
		boolean flag = cardaoservice.isExistCarByTid(tid);
		return flag;
	}
	/**
	 * 根据tid和mid删除car里面的数据
	 * 成功返回true，失败返回false
	 * @param tid
	 * @param mid
	 * @return
	 */
	public static boolean deleteByTidAndMid(int tid, int mid)
	{
		return cardaoservice.deleteByTidAndMid(tid, mid);
	}

}	

