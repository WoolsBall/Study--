package com.learn.day1;

public class Test1 {
	public static void main(String[] args) {
		long l=1024L*1024*1024*4;
		int j=(int)l;
		System.out.println(j);//0
		/*������������ɥʧ*/
		
		double pi=3.141592653589793;
		float f=(float)pi;
		System.out.println(f);
		/*double���͵ı���piת��Ϊfloat���͵ı���fʱ����˾��ȵ���ʧ*/
		
		long distance = 10000 * 365 * 24 * 60 * 60 * 299792458L;
		System.out.println(distance);
		double change = 800 - 599.0;
		System.out.println(change);
		double persent = 80 / 100;
		System.out.println(persent);
		double persent2 = 80.0 / 100; 
		System.out.println(persent2);
		
		
		
	}
}
