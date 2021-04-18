package com.hzh.dao;

import com.hzh.pojo.User;

/**@Description: ����û����в����Ľӿ�
 * @author: hzh
 * @date: 2021��4��14������8:26:41 
 */

public interface UserDao {

	/**
	 * @Description: �û���¼����
	 * @author: hzh
	 * @param username
	 * @param password
	 * @return
	 */
	public abstract boolean isLogin(String username,String password);
	
	/**
	 * @Description: �û�ע�Ṧ��
	 * @author: hzh
	 * @param user
	 * 				Ҫע����û���Ϣ
	 */
	public abstract void regist(User user);
}
