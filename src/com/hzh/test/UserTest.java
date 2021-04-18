package com.hzh.test;

import java.util.Scanner;

import com.hzh.dao.UserDao;
import com.hzh.dao.impl.UserDaoImpl;
import com.hzh.game.GuessNumber;
import com.hzh.pojo.User;

/**
 * @Description: �û�������
 * @author: hzh
 * @date: 2021��4��14������8:40:15
 * 
 *        1�����������һ����Ա��������static����
 *        2��ѭ��������switch��������switch������break�������Ĳ���ѭ��������switch
 */

public class UserTest {

	public static void main(String[] args) {

		while (true) {
			System.out.println("----------------------------------");
			System.out.println("1 ��¼");
			System.out.println("2 ע��");
			System.out.println("3 �˳�");
			System.out.println("���룺");

			//
			Scanner sc = new Scanner(System.in);
			// Ϊ����������ݽ��գ���String��������
			String choiceStr = sc.nextLine();

			UserDao dao = new UserDaoImpl();

			switch (choiceStr) {
			case "1":
				System.out.println("-------------��¼----------------");
				System.out.println("�û�����");
				String username = sc.nextLine();
				System.out.println("��   �룺");
				String password = sc.nextLine();

				// ����ע�Ṧ��
				boolean flag = dao.isLogin(username, password);
				if (flag) {
					System.out.println("�ɹ�");
				} else {
					System.out.println("������û�������");
				}

				System.out.println("����Ϸ��y/n");
				// ����Ϸ
				while (true) {
					String res = sc.nextLine();
					if(res.equalsIgnoreCase("y")) {
						GuessNumber.start();						
						System.out.println("������y/n");
					}else {
						break;
					}
				}
				System.exit(0);// �˳�
//				break;//����дbreak����������switch
			case "2":
				System.out.println("-------------ע��----------------");
				System.out.println("�û�����");
				String newusername = sc.nextLine();
				System.out.println("��   �룺");
				String newpassword = sc.nextLine();

				// �û����������װ������
				User user = new User(newusername, newpassword);

				// ����ע�Ṧ��
//			UserDao dao = new UserDaoImpl();
				dao.regist(user);
				System.out.println("ע��ɹ�");
				break;
			case "3":
			default:
				System.out.println("�˳�");
				System.exit(0);// �˳�
				break;
			}
		}
	}
}
