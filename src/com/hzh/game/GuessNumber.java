package com.hzh.game;

import java.util.Scanner;

/**@Description: ��������Ϸ
 * @author: hzh
 * @date: 2021��4��14������9:04:23 
 */

public class GuessNumber {

	public static void start() {
		int randomNum = (int) (Math.random() * 100 + 1);
		
		//ͳ�Ʊ���
		int count = 0;
		
		while(true) {
			int guessNum = new Scanner(System.in).nextInt();
			
			count++;
			if(guessNum  > randomNum) {
				System.out.println("����");
			}else if (guessNum  < randomNum){
				System.out.println("С��");
			}else {
				System.out.println("���У�������" + count + "��");
			}
		}
	}
}
