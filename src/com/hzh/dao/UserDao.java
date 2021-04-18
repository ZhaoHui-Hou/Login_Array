package com.hzh.dao;

import com.hzh.pojo.User;

/**@Description: 针对用户进行操作的接口
 * @author: hzh
 * @date: 2021年4月14日下午8:26:41 
 */

public interface UserDao {

	/**
	 * @Description: 用户登录功能
	 * @author: hzh
	 * @param username
	 * @param password
	 * @return
	 */
	public abstract boolean isLogin(String username,String password);
	
	/**
	 * @Description: 用户注册功能
	 * @author: hzh
	 * @param user
	 * 				要注册的用户信息
	 */
	public abstract void regist(User user);
}
