package com.lnsf.book.service;

import java.util.List;

import com.lnsf.book.model.Appraise;
import com.lnsf.book.model.Menu;
import com.lnsf.book.model.Trade;
import com.lnsf.book.model.User;

public interface IBossService {		//店主服务
	
	List<Trade> selectTrade();			//查看订单信息
	
	List<Menu> selectMenu();			//查看菜单
	
	List<Appraise> selectAppraise();	//查看评价信息
	
	boolean insertMenu(Menu menu);		//插入新的菜式
	
	boolean updateMenu(Menu menu);		//修改现有菜式信息
	
	boolean deleteMenu(Menu menu);		//删除现有菜式
	
	User selectUser();					//查看个人信息

	boolean updateUser(User user);		//修改个人信息
	
	int getRestaurant();				//获取店家的ID
}
