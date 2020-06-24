package com.lnsf.book.service;

import java.util.List;

import com.lnsf.book.model.Type;

public interface ITypedaoService {
	List<Type> select();			//查询类型
	
	boolean insert(Type type);		//插入类型
	
	boolean update(Type type);		//更新类型
	
	boolean delete(Type type);		//删除类型
	
	boolean selectById(int id);		//查询类型是否存在(id)
	
	List<Type> selectByRId(int rid);//返回某商家的类型列表
	
	boolean selectByRid(int rid);	//查询类型是否存在(rid)
	
	Type getTypeById(int typeid); //根据类型id返回类型
	
	boolean selectByIdAndRId(int id, int rid);		//查询类型是否存在(id、rid)
	
	boolean isExistMenuByTypeId(int tid);	//判断类型下有没有菜式
}
