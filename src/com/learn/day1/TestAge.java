package com.learn.day1;


import java.util.Scanner;

public class TestAge {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("������������䣺 ");
	int age=scan.nextInt();
	scan.close();
	System.out.println(age>=18&&age<=50);
}
}
