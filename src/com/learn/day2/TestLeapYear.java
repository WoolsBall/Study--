package com.learn.day2;

import java.util.Scanner;

public class TestLeapYear {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("����������Ҫ�жϵ���ݣ� ");
	int year=scan.nextInt();
	scan.close();
	/*
	 *  boolean isLeapYear = (year % 4 == 0 && year % 100 != 0)
	 *  || year % 400 == 0;
	 *  */
	if(year%400==0){
		System.out.println(year+"������");
	}else if(year%4==0&&year%100!=0){
		System.out.println(year+"������");
	}else{
		System.out.println(year+"��ƽ��");
	}
}
}
