package com.learn.day3;


import java.util.Scanner;

public class GuessNumberGame {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("��������Ҫ�µ�����1-1000���� �˳��밴0");
		int guest = scan.nextInt();
		int num = (int) (Math.random() * 1000)+1;
		 //����²���������
        while (guest!=num) {
            //����Ϊ0�����˳�ѭ���������ж�����
            if(guest == 0){
                break;            
            }else if (guest > num) {
                System.out.println("̫����!");
            } else {
                System.out.println("̫С��!");
            } 
            System.out.print("��������²������(1-1000)���˳��밴0��");
            guest = scan.nextInt();
        }
        //��ʾ�û����ս��
        if(guest == num) {
            System.out.println("��ϲ����¶���!");
        }else{
            System.out.println("���ź����´�����ս��!");
        }
        scan.close();

	}
	
	
}
