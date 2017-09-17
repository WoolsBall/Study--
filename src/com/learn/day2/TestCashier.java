package com.learn.day2;

import java.util.Scanner;

public class TestCashier {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("请输入商品的单价： ");
	double unitPrice=scan.nextDouble();
	
	System.out.println("请输入商品的数量： ");
	double amount=scan.nextDouble();
	
	System.out.println("请输入金额： ");
	double money=scan.nextDouble();
	scan.close();
	
	double totalPrice=unitPrice*amount;
	if(totalPrice>=500){
		totalPrice*=0.8;
	}
	
	if(money>totalPrice){
		double change=money-totalPrice;
		System.out.println("应找零"+change);
	}else{
		System.out.println("对不起，金额不足");
	}
}
}
