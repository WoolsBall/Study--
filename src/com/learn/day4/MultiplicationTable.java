package com.learn.day4;

public class MultiplicationTable {
public static void main(String[] args) {
	System.out.println("�žų˷���");
	for(int i=1;i<10;i++){
		for(int j=1;j<=i;j++){
			int result=0;
			result=i*j;
			System.out.print(j+"*"+i+"="+result+"\t");
		}
		System.out.println();
	}
}
}
