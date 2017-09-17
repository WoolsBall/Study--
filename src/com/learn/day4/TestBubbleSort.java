package com.learn.day4;

import java.util.Arrays;
import java.util.Random;

public class TestBubbleSort {
public static void main(String[] args) {
	int arr[]=new int[10];
	
	 Random ran = new Random();
	for(int i=0;i<arr.length;i++){
		arr[i]=ran.nextInt(100);
	}
	
	System.out.println("数组中的数为："+Arrays.toString(arr));
	System.out.println("冒泡排序开始************");
	for (int i = 0; i < arr.length-1; i++) {
		for (int j = 0; j < arr.length-i-1; j++) {
			if(arr[j]>arr[j+1]){
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				
			}
		}
	}
	System.out.println("冒泡排序结束************");
	System.out.println("排序后的数组为："+Arrays.toString(arr));
}
}
