package com.learn.day2;

import java.util.Scanner;

public class TestCommand{
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int commend=0;
		System.out.println("请选择功能：1.显示全部记录    2.查询登录记录   3.欢迎使用   0.退出");
		commend=scan.nextInt();
		scan.close();
		switch (commend) {
		case 1:
			System.out.println("显示全部记录");
			break;
		case 2:
			System.out.println("查询登录记录");
			break;
		case 0:
			System.out.println("退出");
			break;

		default:
			System.out.println("输入错误");
			break;
		}
	}
}
