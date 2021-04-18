package com.hzh.dao.impl;

import java.util.ArrayList;

import com.hzh.dao.UserDao;
import com.hzh.pojo.User;

/**
 * @Description:
 * @author: hzh
 * @date: 2021��4��14������8:30:28
 */

public class UserDaoImpl implements UserDao {

	// Ϊ�˶������ʹ��ͬһ�����ϣ����嵽������
	// Ϊ�˲�����翴��������Ϊ˽��
	//Ϊ���ö��������ͬһ��Ա��������static����
	private static ArrayList<User> arrayList = new ArrayList<User>();

	@Override
	public boolean isLogin(String username, String password) {

		// �������ϣ���ȡÿ���û����ж����ֺ������Ƿ�ƥ��
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

		// ����Ϣ�洢������
//		ArrayList<User> arrayList = new ArrayList<User>();
		arrayList.add(user);
	}
}
