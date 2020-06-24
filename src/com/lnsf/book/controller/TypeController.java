package com.lnsf.book.controller;

import java.util.List;

import com.lnsf.book.service.impl.ITypedaoServiceImpl;
import com.lnsf.book.model.Type;

public class TypeController {
	static ITypedaoServiceImpl typedaoservice = new ITypedaoServiceImpl();
	/**
	 * 根据类型id判断输入的类型是否存在，存在返回true，不存在返回false
	 * @param typeId
	 * @return boolean
	 */
	public static boolean isExist(int typeId)
	{
		boolean flag = typedaoservice.selectById(typeId);
		return flag;
	}
	/**
	 * 根据rid返回类型列表
	 * @param rid
	 * @return List<Type>
	 */
	public static List<Type> getTypeListByRid(int rid)
	{
		List<Type> list = typedaoservice.selectByRId(rid);
		return list;
	}
	/**
	 * 根据类型rid判断该商家有没有类别，存在返回true，不存在返回false
	 * @param rid
	 * @return boolean
	 */
	public static boolean isExistByRid(int rid)
	{
		boolean flag = typedaoservice.selectByRid(rid);
		return flag;
	}
	/**
	 * 根据类型id,rid判断输入的类型是否存在，存在返回true，不存在返回false
	 * @param rid
	 * @return boolean
	 */
	public static boolean isExistByIdAndRid(int id, int rid)
	{
		boolean flag = typedaoservice.selectByIdAndRId(id, rid);
		return flag;
	}
	/**
	 * 根据类型id返回类型名
	 * @param id
	 * @return String
	 */
	public static String getTypeNameById(int id)
	{
		String name = typedaoservice.getTypeById(id).getName();
		return name;
	}
	/**
	 * 添加一个新类型
	 * 添加成功返回true，否则返回false
	 * @param type
	 * @return boolean
	 */
	public static boolean addType(Type type)
	{
		boolean flag = typedaoservice.insert(type);
		return flag;
	}
	/**
	 * 根据类型id返回类型
	 * @param id
	 * @return Type
	 */
	public static Type getTypeById(int id)
	{
		Type type = typedaoservice.getTypeById(id);
		return type;
	}
	/**
	 * 更新类别
	 * 更新成功返回true，失败返回false
	 * @param type
	 * @return
	 */
	public static boolean updateType(Type type)
	{
		boolean flag = typedaoservice.update(type);
		return flag;
	}
	public static boolean delTypeById(int typeId)
	{
		boolean flag = typedaoservice.delete(typedaoservice.getTypeById(typeId));
		return flag;
	}
}
