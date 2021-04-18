package com.hzh.game;

import java.util.Scanner;

/**@Description: 猜数字游戏
 * @author: hzh
 * @date: 2021年4月14日下午9:04:23 
 */

public class GuessNumber {

	public static void start() {
		int randomNum = (int) (Math.random() * 100 + 1);
		
		//统计变量
		int count = 0;
		
		while(true) {
			int guessNum = new Scanner(System.in).nextInt();
			
			count++;
			if(guessNum  > randomNum) {
				System.out.println("大了");
			}else if (guessNum  < randomNum){
				System.out.println("小了");
			}else {
				System.out.println("猜中！！用了" + count + "次");
			}
		}
	}
}
