package com.learn.day2;

import java.util.Scanner;

public class TestCommand{
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int commend=0;
		System.out.println("��ѡ���ܣ�1.��ʾȫ����¼    2.��ѯ��¼��¼   3.��ӭʹ��   0.�˳�");
		commend=scan.nextInt();
		scan.close();
		switch (commend) {
		case 1:
			System.out.println("��ʾȫ����¼");
			break;
		case 2:
			System.out.println("��ѯ��¼��¼");
			break;
		case 0:
			System.out.println("�˳�");
			break;

		default:
			System.out.println("�������");
			break;
		}
	}
}
