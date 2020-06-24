package com.lnsf.book.service;
import java.util.List;

import com.lnsf.book.model.Appraise;
import com.lnsf.book.model.Car;
import com.lnsf.book.model.Menu;
import com.lnsf.book.model.Restaurant;
import com.lnsf.book.model.Trade;
import com.lnsf.book.model.Type;
import com.lnsf.book.model.User;

public interface ICustomerService {		//消费者服务
	
	List<Car> historyCar();				//查看历史购物车
	
	List<Appraise> selectAppraise();	//查看评价信息
	
	List<Restaurant> selectRestaurant();//查看餐厅
	
	Restaurant chooseRestaurant(int choose);//选择餐厅
	
	List<Menu> selectMenu(Restaurant restaurant);			//查看菜单，显示所有菜式
	
	List<Menu> selectMenuByType(Restaurant restaurant, Type type);		//按照类别查看菜式
	
	List<Trade> selectTrade();			//查看订单信息
	
	User selectUser();					//查看个人信息
	
	List<Integer> getTid();						//获取订单号

	boolean updateUser(User user);		//修改个人信息

	
}
