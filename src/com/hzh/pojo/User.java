package com.hzh.pojo;

/**
 * @Description:用户描述类
 * @author: hzh
 * @date: 2021年4月14日下午8:24:44
 */

public class User {

	private String username;
	private String password;

	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
