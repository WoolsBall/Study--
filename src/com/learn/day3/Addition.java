package com.learn.day3;

import java.util.Scanner;

public class Addition {
public static void main(String[] args) {
	System.out.println("将开始加法题目测试（10题-100以内）： 退出请按-1");
	Scanner sa=new Scanner(System.in);
	int score=0;
	for(int i=1;i<=10;i++){
		int a=(int)(Math.random()*100);
		int b=(int)(Math.random()*100);
		System.out.println("("+i+")"+a+"+"+b+"="+"?");
		System.out.print("请输入答案（输入-1退出）： ");
		int c=sa.nextInt();
		int result=a+b;
		if(c==-1){
			
			break;
		}else if(c!=result){
			System.out.println("Error");
		}else{
			score+=10;
			System.out.println("Coorrect");
		}
		
	}
	sa.close();
	 System.out.println("此次测验结束，你的分数是：" + score);
}
}
