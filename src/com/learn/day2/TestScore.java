package com.learn.day2;

import java.util.Scanner;

public class TestScore {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("��������ķ�����");
	int score=scan.nextInt();
	scan.close();
	
	if(score<0||score>100){
		System.out.println("�������");
	}else if(score>=90){
		System.out.println("��ĳɼ��ǣ�A");
	}else if(score>=80){
		System.out.println("��ĳɼ��ǣ�B");
	}else if(score>=60){
		System.out.println("��ĳɼ��ǣ�C");
	}else{
		System.out.println("��ĳɼ�������");
	}
}
}
