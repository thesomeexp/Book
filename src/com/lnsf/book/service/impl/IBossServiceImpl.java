package com.lnsf.book.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.lnsf.book.service.IBossService;
import com.lnsf.book.controller.RestaurantController;
import com.lnsf.book.dao.impl.AppraisedaoImpl;
import com.lnsf.book.dao.impl.MenudaoImpl;
import com.lnsf.book.dao.impl.RestaurantdaoImpl;
import com.lnsf.book.dao.impl.Tradedaoimpl;
import com.lnsf.book.dao.impl.UserdaoImpl;
import com.lnsf.book.model.Appraise;
import com.lnsf.book.model.Menu;
import com.lnsf.book.model.Restaurant;
import com.lnsf.book.model.Trade;
import com.lnsf.book.model.User;

public class IBossServiceImpl implements IBossService {

	@Override
	public List<Trade> selectTrade() { // 店家完成的订单信息
		Tradedaoimpl tradedao = new Tradedaoimpl();
		List<Trade> list = new ArrayList<Trade>();
		List<Trade> result = new ArrayList<Trade>();
		list = tradedao.select();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getRid() == RestaurantController.RID) // 如果店家编号和登录用户的店家编号相同
			{
				result.add(list.get(i));
			}
		}
		return result;
	}

	@Override
	public List<Menu> selectMenu() {		//店家的菜单
		MenudaoImpl menudao = new MenudaoImpl();
		List<Menu> list = new ArrayList<Menu>();
		List<Menu> result = new ArrayList<Menu>();
		list = menudao.select();
		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i).getRid() == RestaurantController.RID)		//如果菜单的店家号是登录用户的店家
			{
				result.add(list.get(i));
			}
		}
		return result;
	}

	@Override
	public List<Appraise> selectAppraise() {
		AppraisedaoImpl appraisedao = new AppraisedaoImpl();
		List<Appraise> list = new ArrayList<Appraise>();
		List<Appraise> result = new ArrayList<Appraise>();
		list = appraisedao.select();
		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i).getRid() == RestaurantController.RID)		//如果菜单的店家号是登录用户的店家
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
			if (list.get(i).getId() == getid.id)		//如果编号和登录用户编号相同
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
	public int getRestaurant() {
		RestaurantdaoImpl restaurantdao = new RestaurantdaoImpl();
		List<Restaurant> list = new ArrayList<Restaurant>();
		int id = 0;
		list = restaurantdao.select();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getUserid() == IBasicServiceImpl.id) {
				id = list.get(i).getId();
			}
		}
		return id;
	}

	@Override
	public boolean insertMenu(Menu menu) {
		MenudaoImpl menudao = new MenudaoImpl();
		boolean flag = menudao.insert(menu);
		return flag;
	}

	@Override
	public boolean updateMenu(Menu menu) {
		MenudaoImpl menudao = new MenudaoImpl();
		boolean flag = menudao.update(menu);
		return flag;
	}

	@Override
	public boolean deleteMenu(Menu menu) {
		MenudaoImpl menudao = new MenudaoImpl();
		boolean flag = menudao.delete(menu);
		return flag;
	}

}
