package com.lnsf.book.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.lnsf.book.service.IBasicService;
import com.lnsf.book.controller.RestaurantController;
import com.lnsf.book.dao.impl.UserdaoImpl;
import com.lnsf.book.model.User;

public class IBasicServiceImpl implements IBasicService{
	public static int id;		//用户id
	public static List<Integer> tid;	//订单id
	@Override
	public User login(String username, String password) {
		ICustomerServiceImpl customerService = new ICustomerServiceImpl();
		UserdaoImpl userdao = new UserdaoImpl();
		User user = new User(-1, null, -1, null, null);
		int flag = 0;
		List<User> list = new ArrayList<User>();
		list = userdao.select();
		for(int i = 0; i < list.size(); i++)
		{
			if(list.get(i).getUsername().equals(username) && list.get(i).getPassword().equals(password))
			{		//判断用户是否存在
				user = list.get(i);
				id = user.getId();
				if(list.get(i).getIdentify() == 1)	//返回用户的身份
				{
					flag = 1;						//用户是消费者用户
					tid = customerService.getTid();
				}
				else if(list.get(i).getIdentify() == 2)
				{
					flag = 2;						//用户是店主用户
					IBossServiceImpl boss = new IBossServiceImpl();
					RestaurantController.RID = boss.getRestaurant();
				}
			}
		}
		return user;
	}
	/**
	 * 
	 */
	@Override
	public boolean register(User user) {
		UserdaoImpl userdao = new UserdaoImpl();
		boolean flag = userdao.insert(user);
		return flag;
	}
	
}
