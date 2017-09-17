package com.learn.day1;

public class Test {
	public static void main(String[] args) {
		
	//变量使用常用错误汇总

	//a=1;//编译错误，变量没有声明
	//int score=0;
	//score=100;//编译错误
	
	//int 123go = 100； // 编译错误，不能以数字开头。    
	//int 成绩 = 60；// 编译没错，但不建议使用。    
	//int break= 200; // 编译错误，break是Java保留字。   
	//int score = 80;    
	//System.out.println(Score);     // 编译错误，Java大小写敏感，Score变量没有声明。
	
	//int a, b = 10; 
    //int c = a + b; // 编译错误，变量a没有初始化
    //System.out.println(c);	
    //int sum;
    /*if (a>0) {
		sum=0;
		sum=a+b;
	}
    System.out.println(sum);//编译错误，sum没有初始化
    
    //nt salary;
   // salary = 15000.50;  // 编译错误,整型变量不可以赋予浮点值（小数）。
    
    //int d = 10000000000;//一个int类型的变量占用4个字节（32位），最大表示范围为：-2^31 ~ 2^31-1，即 -2147483648 ~2147483647。
    
    /*整数运算溢出*/
    //int a = 2147483647;
   // int b = -2147483648;
   // a = a + 1;
    //b = b - 1;
    //System.out.println("a=" + a);//a=-2147483648
   // System.out.println("b=" + b);//b=2147483648
    
    
	}

}
