package com.learn.day4;

import java.util.Arrays;
import java.util.Random;

public class ArrayMaxNumber {
public static void main(String[] args) {
	int arr[]=new int[10];
	
	 Random ran = new Random();
	for(int i=0;i<arr.length;i++){
		arr[i]=ran.nextInt(100);
	}
	
	System.out.println("数组中的数为："+Arrays.toString(arr));
	int temp=arr[0];
	
	for (int i = 1; i < arr.length; i++) {
		if(arr[i]>temp){
			temp=arr[i];
		}
	
	}
	System.out.println(temp);
}
}
