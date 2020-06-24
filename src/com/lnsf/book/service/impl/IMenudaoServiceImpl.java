package com.lnsf.book.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.lnsf.book.service.IMenudaoService;
import com.lnsf.book.dao.impl.MenudaoImpl;
import com.lnsf.book.model.Menu;

public class IMenudaoServiceImpl implements IMenudaoService{

	@Override
	public List<Menu> select() {
		MenudaoImpl menudao = new MenudaoImpl();
		List<Menu> list = new ArrayList<Menu>();
		list = menudao.select();
		return list;
	}

	@Override
	public boolean insert(Menu menu) {
		MenudaoImpl menudao = new MenudaoImpl();
		boolean flag = menudao.insert(menu);
		return flag;
	}

	@Override
	public boolean update(Menu menu) {
		MenudaoImpl menudao = new MenudaoImpl();
		boolean flag = menudao.update(menu);
		return flag;
	}

	@Override
	public boolean delete(Menu menu) {
		MenudaoImpl menudao = new MenudaoImpl();
		boolean flag = menudao.delete(menu);
		return flag;
	}
	
	/**
	 * 根据Rid返回菜单
	 */
	@Override
	public List<Menu> select(int rid) {
		MenudaoImpl menudao = new MenudaoImpl();
		List<Menu> list = new ArrayList<Menu>();
		List<Menu> result = new ArrayList<Menu>();
		list = menudao.select();
		for (int i = 0; i < list.size(); i++)
		{
			if(list.get(i).getRid() == rid)
				result.add(list.get(i));
		}
		return result;
	}
	/**
	 * 根据menuid和rid判断菜式是否存在
	 */
	@Override
	public boolean selectByMenuIdAndRId(int menuid, int rid) {
		MenudaoImpl menudao = new MenudaoImpl();
		List<Menu> list = new ArrayList<Menu>();
		List<Menu> result = new ArrayList<Menu>();
		list = menudao.select();
		for (int i = 0; i < list.size(); i++)
		{
			if(list.get(i).getRid() == rid && list.get(i).getId() == menuid)
				result.add(list.get(i));
		}
		if (result.size() > 0) return true;
		return false;
	}
	/**
	 * 根据id返回一个菜式
	 */
	@Override
	public Menu selectById(int id) {
		MenudaoImpl menudao = new MenudaoImpl();
		List<Menu> list = new ArrayList<Menu>();
		Menu menu = null;
		list = menudao.select();
		for (int i = 0; i < list.size(); i++)
		{
			if(list.get(i).getId() == id)
				menu = list.get(i);
		}
		return menu;
	}
	/**
	 * 根据Id删除菜式
	 */
	@Override
	public boolean deleteById(int id) {
		List<Menu> list = new ArrayList<Menu>();
		boolean flag = false;
		list = select();
		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i).getId() == id)
			{
				flag = delete(list.get(i));
			}
		}
		return flag;
	}

	@Override
	public boolean updateName(int id) {
		// TODO Auto-generated method stub
		return false;
	}
	/**
	 * 根据Id返回库存
	 */
	@Override
	public int selectStockById(int id) {
		Menu menu = selectById(id);
		return menu.getStock();
	}



}
