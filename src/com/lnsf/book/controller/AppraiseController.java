package com.lnsf.book.controller;

import java.util.List;

import com.lnsf.book.model.Appraise;
import com.lnsf.book.service.impl.IAppraisedaoServiceImpl;

public class AppraiseController {
	static IAppraisedaoServiceImpl appraisedaoservice = new IAppraisedaoServiceImpl();
	/**
	 * // 根据用户id和店铺id查看该用户是否已经评价过该店铺
	 * 如有是则true,不是则false
	 * @param userid
	 * @param rid
	 * @return boolean
	 */
	public static boolean isExist(int userid, int rid)
	{
		return appraisedaoservice.isExistByUserIdAndRid(userid, rid);
	}
	/**
	 * // 根据用户id和商家id返回评价信息String,返回值不能为null
	 * @param uid
	 * @param rid
	 * @return String
	 */
	public static String getAboutByUidAndRid(int uid, int rid)
	{
		return appraisedaoservice.getAboutByUserIdAndRid(uid, rid);
	}
	/**
	 * // 根据用户id和店铺id更新评价
	 * 成功返回true失败返回false
	 * @param userid
	 * @param rid
	 * @param about
	 * @return boolean
	 */
	public static boolean updateAbout(int userid, int rid, String about)
	{
		return appraisedaoservice.update(new Appraise(userid, rid, about));
	}
	/**
	 * // 根据用户id和店铺id插入评价信息
	 * 插入成功返回true失败返回false
	 * @param userid
	 * @param rid
	 * @param about
	 * @return boolean
	 */
	public static boolean insertAbout(int userid, int rid, String about)
	{
		return appraisedaoservice.insert(new Appraise(userid, rid, about));
	}
	/**
	 * // 根据rid来返回一个评价List,该List不能为null
	 * @param rid
	 * @return List<Appraise>
	 */
	public static List<Appraise> getAppraiseListByRid(int rid)
	{
		return appraisedaoservice.getAppraiseByRid(rid);
	}
}
