package com.hzh.test;

import java.util.Scanner;

import com.hzh.dao.UserDao;
import com.hzh.dao.impl.UserDaoImpl;
import com.hzh.game.GuessNumber;
import com.hzh.pojo.User;

/**
 * @Description: 用户测试类
 * @author: hzh
 * @date: 2021年4月14日下午8:40:15
 * 
 *        1、多个对象公用一个成员变量，用static修饰
 *        2、循环里面有switch，并且在switch里面有break，结束的不是循环，而是switch
 */

public class UserTest {

	public static void main(String[] args) {

		while (true) {
			System.out.println("----------------------------------");
			System.out.println("1 登录");
			System.out.println("2 注册");
			System.out.println("3 退出");
			System.out.println("输入：");

			//
			Scanner sc = new Scanner(System.in);
			// 为方便后面数据接收，用String接收数据
			String choiceStr = sc.nextLine();

			UserDao dao = new UserDaoImpl();

			switch (choiceStr) {
			case "1":
				System.out.println("-------------登录----------------");
				System.out.println("用户名：");
				String username = sc.nextLine();
				System.out.println("密   码：");
				String password = sc.nextLine();

				// 调用注册功能
				boolean flag = dao.isLogin(username, password);
				if (flag) {
					System.out.println("成功");
				} else {
					System.out.println("密码或用户名错误");
				}

				System.out.println("玩游戏吗？y/n");
				// 玩游戏
				while (true) {
					String res = sc.nextLine();
					if(res.equalsIgnoreCase("y")) {
						GuessNumber.start();						
						System.out.println("还玩吗？y/n");
					}else {
						break;
					}
				}
				System.exit(0);// 退出
//				break;//这里写break，结束的是switch
			case "2":
				System.out.println("-------------注册----------------");
				System.out.println("用户名：");
				String newusername = sc.nextLine();
				System.out.println("密   码：");
				String newpassword = sc.nextLine();

				// 用户名和密码封装到对象
				User user = new User(newusername, newpassword);

				// 调用注册功能
//			UserDao dao = new UserDaoImpl();
				dao.regist(user);
				System.out.println("注册成功");
				break;
			case "3":
			default:
				System.out.println("退出");
				System.exit(0);// 退出
				break;
			}
		}
	}
}
