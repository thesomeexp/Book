
package com.lnsf.book.controller;

import com.lnsf.book.model.User;
import com.lnsf.book.service.impl.IBasicServiceImpl;
import com.lnsf.book.service.impl.IUserdaoServiceImpl;
import com.lnsf.book.view.BgMain;
import com.lnsf.book.view.FgMain;
import com.lnsf.book.view.Main;
import com.lnsf.book.view.UserView;

public class UserController {
    public static User USER = new User(-1, "", -1, "", "");
    static IBasicServiceImpl basicservice = new IBasicServiceImpl();
    static IUserdaoServiceImpl userdaoservice = new IUserdaoServiceImpl();
    /**
     * 用户进行登录操作
     * 返回1代表普通用户，2代表商家用户，0代表登录失败,-1登录失败
     * @param username
     * @param password
     * @return int
     */
	public static int login(String username, String password){
		UserController.USER = basicservice.login(username, password);
		int flag = 0;
        if (UserController.USER.getIdentify() == 1){
            flag = 1;
        } else if(UserController.USER.getIdentify() == 2){
            flag = 2;
        } else if(UserController.USER.getIdentify() == -1){
            flag = -1;
        }
        else{
        	flag = 0;
        }
        return flag;
	}
	/**
	 * 用户进行注册操作
	 * 0代表注册失败，1代表注册成功
	 * @param user
	 * @return int
	 */
	public static boolean registerUser(User user)
	{
		boolean flag = false;
		boolean judge = false;
		judge = userdaoservice.selectByUsername(user.getUsername());
		if (!judge)
		{
			flag = userdaoservice.insert(user);
		}
		return flag;
	}
	/**
	 * 根据name判断是否为空
	 * 不为空则修改USER.name
	 * 0代表更新失败，2代表用户名已存在，1代表输入成功
	 * @param name
	 * @return
	 */
	public static int updateUserUsername(String username){
	    int flag = 0;
	    boolean exist = userdaoservice.selectByUsername(username);
	    boolean judge = false;
	    if (exist == true){
	        flag = 2;
	    } else {
	    	User user = UserController.USER;
	    	user.setUsername(username);
	        judge = userdaoservice.update(user);
	        if (judge == true) flag = 1;
	        else flag = 0;
	    }
	    return flag;
	}
	   /**
     * 根据password判断是否为空
     * 不为空则修改USER.password
     * 0代表更新失败，1代表更新成功
     * @param password
     * @return
     */
    public static int updateUserPassword(String password){
        int flag = 0;
        boolean judge = false;
    	User user = UserController.USER;
    	user.setPassword(password);;
        judge = userdaoservice.update(user);
        if (!judge){
            flag = 0;
        } else {
            flag = 1;
        }
        return flag;
    }
    /**
     * 根据name判断是否为空
     * name更新失败返回0，更新成功返回1
     * @param name
     * @return
     */
    public static int updateUserName(String name) {
        int flag = 0;
        boolean judge = false;
    	User user = UserController.USER;
    	user.setName(name);
        judge = userdaoservice.update(user);
        if (!judge){
            flag = 0;
        } else {
            flag = 1;
        }
        return flag;
    }
    /**
     * 根据用户名返回id
     * @param username
     * @return int
     */
    public static int getUserIdByUsername(String username)
    {
    	return userdaoservice.selectUserId(username);
    }
    /**
     * // 根据用户id返回用户名字
     * @param uid
     * @return
     */
    public static String getUsernameByUserId(int uid)
    {
    	return userdaoservice.selectUsername(uid);
    }
    /**
     * // 根据一个用户id返回一个用户
     * @param id
     * @return User
     */
    public static User getUserById(int id)
    {
    	return userdaoservice.selectUserById(id);
    }
}

