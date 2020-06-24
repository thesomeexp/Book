package com.lnsf.book.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.lnsf.book.service.IUserdaoService;
import com.lnsf.book.dao.impl.UserdaoImpl;
import com.lnsf.book.model.User;

public class IUserdaoServiceImpl implements IUserdaoService{

	@Override
	public List<User> select() {
		UserdaoImpl userdao = new UserdaoImpl();
		List<User> list = new ArrayList<User>();
		list = userdao.select();
		return list;
	}

	@Override
	public boolean insert(User user) {
		UserdaoImpl userdao = new UserdaoImpl();
		boolean flag = userdao.insert(user);
		return flag;
	}

	@Override
	public boolean update(User user) {
		UserdaoImpl userdao = new UserdaoImpl();
		boolean flag = userdao.update(user);
		return flag;
	}

	@Override
	public boolean delete(User user) {
		UserdaoImpl userdao = new UserdaoImpl();
		boolean flag = userdao.delete(user);
		return flag;
	}
	
	/**
	 * 根据username判断username是否存在,存在返回false;
	 */
	@Override
	public boolean selectByUsername(String username) {
		boolean flag = false;
		UserdaoImpl userdao = new UserdaoImpl();
		List<User> list = new ArrayList<User>();
		list = userdao.select();
		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i).getUsername().equalsIgnoreCase(username))
			{
				flag = true;
			}
		}
		return flag;
	}
	/**
	 * 根据id返回name
	 */
	@Override
	public String selectUsername(int id) {
		List<User> list = new ArrayList<User>();
		String name = null;
		list = select();
		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i).getId() == id)
				name = list.get(i).getName();
		}
		return name;
	}
	/**
	 * 根据用户名返回id
	 */
	@Override
	public int selectUserId(String username) {
		List<User> list = new ArrayList<User>();
		list = select();
		for (int i = 0; i < list.size(); i++)
		{
			if(list.get(i).getUsername().equals(username))
			{
				return list.get(i).getId();
			}
		}
		return 0;
	}
	/**
	 * 根据一个用户id返回一个用户对象
	 */
	@Override
	public User selectUserById(int id) {
		List<User> list = new ArrayList<User>();
		list = select();
		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i).getId() == id)
				return list.get(i);
		}
		return null;
	}
}
