package com.lnsf.book.service;

import java.util.List;

import com.lnsf.book.model.Car;

public interface ICardaoService {
	List<Car> select();			//查询购物车
	
	boolean insert(Car car);	//插入购物车
	
	boolean update(Car car);	//更新购物车
	
	boolean delete(Car car);	//删除购物车
	
	List<Car> selectByTid(int tid);	// 在car表中查询tid为tid参数的东西,返回一个List<Car>
	
	boolean isExistByTidAndMid(int tid, int mid);//根据传入的订单tid,菜式mid判断该car表是否有该记录
	
	Car getCar(int tid, int mid);//根据传入的订单tid,菜式mid判断该car表是否有该记录
	
	boolean isExistCarByTid(int tid);	//根据tid 判断是否存在购物车
	
	boolean deleteByTidAndMid(int tid, int mid);//根据传入的订单tid,菜式mid删除carﳵ
}
