package com.learn.day2;

import java.util.Scanner;

public class TestCashier {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("��������Ʒ�ĵ��ۣ� ");
	double unitPrice=scan.nextDouble();
	
	System.out.println("��������Ʒ�������� ");
	double amount=scan.nextDouble();
	
	System.out.println("������� ");
	double money=scan.nextDouble();
	scan.close();
	
	double totalPrice=unitPrice*amount;
	if(totalPrice>=500){
		totalPrice*=0.8;
	}
	
	if(money>totalPrice){
		double change=money-totalPrice;
		System.out.println("Ӧ����"+change);
	}else{
		System.out.println("�Բ��𣬽���");
	}
}
}
