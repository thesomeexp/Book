package com.lnsf.book.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.lnsf.book.service.ICardaoService;
import com.lnsf.book.dao.impl.CardaoImpl;
import com.lnsf.book.model.Car;

public class ICardaoServiceImpl implements ICardaoService{

	@Override
	public List<Car> select() {
		CardaoImpl cardao = new CardaoImpl();
		List<Car> list = new ArrayList<Car>();
		list = cardao.select();
		return list;
	}

	@Override
	public boolean insert(Car car) {
		CardaoImpl cardao = new CardaoImpl();
		boolean flag = cardao.insert(car);
		return flag;
	}

	@Override
	public boolean update(Car car) {
		CardaoImpl cardao = new CardaoImpl();
		boolean flag = cardao.update(car);
		return flag;
	}

	@Override
	public boolean delete(Car car) {
		CardaoImpl cardao = new CardaoImpl();
		boolean flag = cardao.delete(car);
		return flag;
	}

	@Override
	public List<Car> selectByTid(int tid) {
		List<Car> list = new ArrayList<Car>();
		List<Car> result = new ArrayList<Car>();
		list = select();
		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i).getTid() == tid)
				result.add(list.get(i));
		}
		return result;
	}

	@Override
	public boolean isExistByTidAndMid(int tid, int mid) {
		List<Car> list = new ArrayList<Car>();
		list = select();
		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i).getMenuid() == mid && list.get(i).getTid() == tid)
				return true;
		}
		return false;
	}
	/**
	 * 根据传入的订单tid,菜式mid判断该car表是否有该记录
	 */
	@Override
	public Car getCar(int tid, int mid) {
		List<Car> list = new ArrayList<Car>();
		list = select();
		Car car = null;
		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i).getTid() == tid && list.get(i).getMenuid() == mid)
			{
				car = list.get(i);
			}
		}
		return car;
	}

	@Override
	public boolean isExistCarByTid(int tid) {
		List<Car> list = new ArrayList<Car>();
		list = select();
		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i).getTid() == tid)
			{
				return true;
			}
		}
		return false;
	}
	/**
	 * 根据传入的订单tid,菜式mid删除car
	 */
	@Override
	public boolean deleteByTidAndMid(int tid, int mid) {
		Car car = getCar(tid, mid);
		return delete(car);
	}
	
}
