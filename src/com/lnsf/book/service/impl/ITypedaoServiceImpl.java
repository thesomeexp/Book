package com.lnsf.book.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.lnsf.book.service.ITypedaoService;
import com.lnsf.book.dao.impl.TypedaoImpl;
import com.lnsf.book.model.Menu;
import com.lnsf.book.model.Type;

public class ITypedaoServiceImpl implements ITypedaoService{
	

	@Override
	public List<Type> select() {
		TypedaoImpl typedao = new TypedaoImpl();
		List<Type> list = new ArrayList<Type>();
		list = typedao.select();
		return list;
	}

	@Override
	public boolean insert(Type type) {
		TypedaoImpl typedao = new TypedaoImpl();
		boolean flag = typedao.insert(type);
		return flag;
	}

	@Override
	public boolean update(Type type) {
		TypedaoImpl typedao = new TypedaoImpl();
		boolean flag = typedao.update(type);
		return flag;
	}

	@Override
	public boolean delete(Type type) {
		TypedaoImpl typedao = new TypedaoImpl();
		boolean flag = typedao.delete(type);
		return flag;
	}
	/**
	 * 根据id判断类型是否存在
	 */
	@Override
	public boolean selectById(int id) {
		TypedaoImpl typedao = new TypedaoImpl();
		boolean flag = false;
		List<Type> list = new ArrayList<Type>();
		List<Type> result = new ArrayList<Type>();
		list = typedao.select();
		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i).getId() == id)
			{
				result.add(list.get(i));
			}
		}
		if (result.size() > 0) flag = true;
		return flag;
	}
	/**
	 * 根据rid返回类型列表
	 */
	@Override
	public List<Type> selectByRId(int rid) {
		TypedaoImpl typedao = new TypedaoImpl();
		List<Type> list = new ArrayList<Type>();
		List<Type> result = new ArrayList<Type>();
		list = typedao.select();
		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i).getRid() == rid)
			{
				result.add(list.get(i));
			}
		}
		return result;
	}
	/**
	 * 根据rid判断是否已经有类型存在
	 */
	@Override
	public boolean selectByRid(int rid) {
		TypedaoImpl typedao = new TypedaoImpl();
		boolean flag = false;
		List<Type> list = new ArrayList<Type>();
		List<Type> result = new ArrayList<Type>();
		list = typedao.select();
		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i).getRid() == rid)
			{
				result.add(list.get(i));
			}
		}
		if (result.size() > 0) flag = true;
		return flag;
	}
	/**
	 * 根据类型id返回类型
	 */
	@Override
	public Type getTypeById(int id) {
		TypedaoImpl typedao = new TypedaoImpl();
		List<Type> list = new ArrayList<Type>();
		Type type = null;
		list = typedao.select();
		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i).getId() == id)
			{
				type = list.get(i);
			}
		}
		return type;
	}

	@Override
	public boolean selectByIdAndRId(int id, int rid) {
		TypedaoImpl typedao = new TypedaoImpl();
		List<Type> list = new ArrayList<Type>();
		list = typedao.select();
		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i).getId() == id && list.get(i).getRid() == rid) return true;
		}
		return false;
	}
	/**
	 * 判断类型下有没有菜式
	 */
	@Override
	public boolean isExistMenuByTypeId(int tid) {
		IMenudaoServiceImpl menudaoservice = new IMenudaoServiceImpl();
		List<Menu> list = new ArrayList<Menu>();
		list = menudaoservice.select();
		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i).getType() == tid) return true;
		}
		return false;
	}
	
	
}
