package com.lnsf.book.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.lnsf.book.service.ICustomerService;
import com.lnsf.book.dao.impl.AppraisedaoImpl;
import com.lnsf.book.dao.impl.CardaoImpl;
import com.lnsf.book.dao.impl.MenudaoImpl;
import com.lnsf.book.dao.impl.RestaurantdaoImpl;
import com.lnsf.book.dao.impl.Tradedaoimpl;
import com.lnsf.book.dao.impl.UserdaoImpl;
import com.lnsf.book.model.Appraise;
import com.lnsf.book.model.Car;
import com.lnsf.book.model.Menu;
import com.lnsf.book.model.Restaurant;
import com.lnsf.book.model.Trade;
import com.lnsf.book.model.Type;
import com.lnsf.book.model.User;

public class ICustomerServiceImpl implements ICustomerService{

	@Override
	public List<Car> historyCar() {
		CardaoImpl cardao = new CardaoImpl();
		IBasicServiceImpl basicService = new IBasicServiceImpl();
		List<Car> list = new ArrayList<Car>();
		List<Car> result = new ArrayList<Car>();
		list = cardao.select();
		for (int i = 0; i < list.size(); i++)
		{
			for (int j = 0; j < IBasicServiceImpl.tid.size(); j++)
			{
				if (list.get(i).getTid() == IBasicServiceImpl.tid.get(j))
				{
					result.add(list.get(i));
				}
			}
		}
		return result;
	}

	@Override
	public List<Appraise> selectAppraise() {
		IBasicServiceImpl getid = new IBasicServiceImpl();
		AppraisedaoImpl appraisedao = new AppraisedaoImpl();
		List<Appraise> list = new ArrayList<Appraise>();
		List<Appraise> result = new ArrayList<Appraise>();
		list = appraisedao.select();
		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i).getUid() == IBasicServiceImpl.id)		//如果菜单的店家号是登录用户的店家
			{
				result.add(list.get(i));
			}
		}
		return result;
	}

	@Override
	public List<Restaurant> selectRestaurant() {
		RestaurantdaoImpl restaurantdao = new RestaurantdaoImpl();
		List<Restaurant> list = new ArrayList<Restaurant>();
		list = restaurantdao.select();
		return list;
	}

	@Override
	public List<Menu> selectMenu(Restaurant restaurant) {
		MenudaoImpl menudao = new MenudaoImpl();
		List<Menu> list = new ArrayList<Menu>();
		List<Menu> result = new ArrayList<Menu>();
		list = menudao.select();
		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i).getRid() == restaurant.getId())
			{
				result.add(list.get(i));
			}
		}
		return result;
	}

	@Override
	public List<Menu> selectMenuByType(Restaurant restaurant, Type type) {
		MenudaoImpl menudao = new MenudaoImpl();
		ICustomerServiceImpl customerService = new ICustomerServiceImpl();
		List<Menu> list = new ArrayList<Menu>();
		List<Menu> result = new ArrayList<Menu>();
		list = customerService.selectMenu(restaurant);		//选出该店的菜单
		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i).getType() == type.getId())
			{
				result.add(list.get(i));
			}
		}
		return result;
	}

	@Override
	public List<Trade> selectTrade() {
		Tradedaoimpl tradedao = new Tradedaoimpl();
		IBasicServiceImpl getid = new IBasicServiceImpl();
		int id = IBasicServiceImpl.id;
		List<Trade> list = new ArrayList<Trade>();
		List<Trade> result = new ArrayList<Trade>();
		list = tradedao.select();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getUserid() == id) // 如果用户编号和登录用户的编号相同
			{
				result.add(list.get(i));
			}
		}
		return result;

	}

	@Override
	public User selectUser() {
		IBasicServiceImpl getid = new IBasicServiceImpl();
		UserdaoImpl userdao = new UserdaoImpl();
		List<User> list = new ArrayList<User>();
		User result = null;
		list = userdao.select();
		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i).getId() == IBasicServiceImpl.id)		//如果菜单的店家号是登录用户的店家
			{
				result = new User(list.get(i).getId(), list.get(i).getName(), 
						list.get(i).getIdentify(), list.get(i).getUsername(), list.get(i).getPassword());
			}
		}
		return result;
	}

	@Override
	public boolean updateUser(User user) {
		UserdaoImpl userdao = new UserdaoImpl();
		boolean flag = userdao.update(user);
		return flag;
	}

	@Override
	public List<Integer> getTid() {
		Tradedaoimpl tradedao = new Tradedaoimpl();
		IBasicServiceImpl basicService = new IBasicServiceImpl();
		List<Integer> tid = new ArrayList<Integer>();
		List<Trade> list = new ArrayList<Trade>();
		list = tradedao.select();
		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i).getUserid() == IBasicServiceImpl.id)
			{
				tid.add(list.get(i).getId());
			}
		}
		return tid;
	}

	@Override
	public Restaurant chooseRestaurant(int choose) {
		RestaurantdaoImpl restaurantdao = new RestaurantdaoImpl();
		List<Restaurant> list = new ArrayList<Restaurant>();
		list = restaurantdao.select();
		Restaurant restaurant = null ;
		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i).getId() == choose)
			{
				restaurant = list.get(i);
			}
		}
		return restaurant;
	}
}
