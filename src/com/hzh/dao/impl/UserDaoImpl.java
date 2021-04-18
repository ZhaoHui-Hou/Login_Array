package com.hzh.dao.impl;

import java.util.ArrayList;

import com.hzh.dao.UserDao;
import com.hzh.pojo.User;

/**
 * @Description:
 * @author: hzh
 * @date: 2021年4月14日下午8:30:28
 */

public class UserDaoImpl implements UserDao {

	// 为了多个方法使用同一个集合，定义到方法外
	// 为了不让外界看到，定义为私有
	//为了让多个对象共享同一成员变量，用static修饰
	private static ArrayList<User> arrayList = new ArrayList<User>();

	@Override
	public boolean isLogin(String username, String password) {

		// 遍历集合，获取每个用户，判断名字和密码是否匹配
		boolean flag = false;

		for (User u : arrayList) {
			if (u.getUsername().equals(username) && u.getPassword().equals(password)) {
				flag = true;
				break;
			}
		}

		return flag;
	}

	@Override
	public void regist(User user) {

		// 把信息存储到集合
//		ArrayList<User> arrayList = new ArrayList<User>();
		arrayList.add(user);
	}
}
