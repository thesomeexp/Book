package com.lnsf.book.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.lnsf.book.dao.impl.AppraisedaoImpl;
import com.lnsf.book.model.Appraise;
import com.lnsf.book.service.IAppraisedaoService;

public class IAppraisedaoServiceImpl implements IAppraisedaoService{

	@Override
	public List<Appraise> select() {
		AppraisedaoImpl appraisedao = new AppraisedaoImpl();
		List<Appraise> list = new ArrayList<Appraise>();
		list = appraisedao.select();
		return list;
	}

	@Override
	public boolean insert(Appraise appraise) {
		AppraisedaoImpl appraisedao = new AppraisedaoImpl();
		boolean flag = appraisedao.insert(appraise);
		return flag;
	}

	@Override
	public boolean update(Appraise appraise) {
		AppraisedaoImpl appraisedao = new AppraisedaoImpl();
		boolean flag = appraisedao.update(appraise);
		return flag;
	}

	@Override
	public boolean delete(Appraise appraise) {
		AppraisedaoImpl appraisedao = new AppraisedaoImpl();
		boolean flag = appraisedao.delete(appraise);
		return flag;
	}
	/**
	 * 根据用户id和店铺id查看该用户的评价是否存在
	 */
	public boolean isExistByUserIdAndRid(int uid, int rid) {
		List<Appraise> list = select();
		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i).getUid() == uid && list.get(i).getRid() == rid)
			{
				return true;
			}
		}
		return false;
	}
	/**
	 * 根据用户id和店铺id获取该用户的评价
	 */
	@Override
	public String getAboutByUserIdAndRid(int uid, int rid) {
		List<Appraise> list = select();
		String about = "";
		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i).getUid() == uid && list.get(i).getRid() == rid)
			{
				about = list.get(i).getAbout();
			}
		}
		
		return about;
	}
	/**
	 * // 根据rid来返回一个评价List,该List不能为null
	 */
	@Override
	public List<Appraise> getAppraiseByRid(int rid) {
		List<Appraise> list = select();;
		List<Appraise> result = new ArrayList<Appraise>();
		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i).getRid() == rid)
			{
				result.add(list.get(i));
			}
		}
		return result;
	}
	
}
