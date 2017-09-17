package com.learn.day3;


import java.util.Scanner;

public class GuessNumberGame {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入你要猜的数（1-1000）： 退出请按0");
		int guest = scan.nextInt();
		int num = (int) (Math.random() * 1000)+1;
		 //如果猜测错误，则继续
        while (guest!=num) {
            //输入为0，则退出循环；否则判断数字
            if(guest == 0){
                break;            
            }else if (guest > num) {
                System.out.println("太大了!");
            } else {
                System.out.println("太小了!");
            } 
            System.out.print("请输入你猜测的数字(1-1000)，退出请按0：");
            guest = scan.nextInt();
        }
        //提示用户最终结果
        if(guest == num) {
            System.out.println("恭喜，你猜对了!");
        }else{
            System.out.println("真遗憾，下次再挑战吧!");
        }
        scan.close();

	}
	
	
}
