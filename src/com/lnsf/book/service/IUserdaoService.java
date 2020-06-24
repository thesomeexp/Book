package com.lnsf.book.service;

import java.util.List;

import com.lnsf.book.model.User;

public interface IUserdaoService {
	
	List<User> select();			//查询用户
	
	boolean insert(User user);		//插入用户
	
	boolean update(User user);		//更新用户
	
	boolean delete(User user);		//删除用户
	
	boolean selectByUsername(String username);//根据username判断username是否存在
	
	String selectUsername(int id);//根据id返回username
	
	int selectUserId(String username);//根据用户名返回id
	
	User selectUserById(int id);	//根据一个用户id返回一个用户对象
}
