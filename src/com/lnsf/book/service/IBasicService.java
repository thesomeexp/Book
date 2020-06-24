package com.lnsf.book.service;

import com.lnsf.book.model.User;

public interface IBasicService {		//所有用户共同拥有的服务，基本的操作（登录、注册）
	
	User login(String username, String password);
	
	boolean register(User user);
}
