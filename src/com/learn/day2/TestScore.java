package com.learn.day2;

import java.util.Scanner;

public class TestScore {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("请输入你的分数：");
	int score=scan.nextInt();
	scan.close();
	
	if(score<0||score>100){
		System.out.println("输入错误");
	}else if(score>=90){
		System.out.println("你的成绩是：A");
	}else if(score>=80){
		System.out.println("你的成绩是：B");
	}else if(score>=60){
		System.out.println("你的成绩是：C");
	}else{
		System.out.println("你的成绩不及格");
	}
}
}
