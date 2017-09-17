package com.learn.day4;

import java.util.Scanner;

public class GuessGame {
	public static void main(String[] args) {
		// 表示玩家猜测的次数
		int count = 0;
		// 表示用户猜测的数据
		char[] input = null;
		// 用于保存判断的结果
		int[] result = new int[2];
		Scanner scanner = new Scanner(System.in);
		System.out.println("GuessingGame>欢迎尝试猜字母游戏！");
		// 表示猜测的字符串
		char[] chs = generate();
		System.out.println("GuessingGame>游戏开始，请输入你所猜的5个字母序列：（exit——退出）");
		while (true) {
			String inputStr = scanner.next().trim().toUpperCase();
			if ("EXIT".equals(inputStr)) {
				System.out.println("GuessingGame>谢谢你的尝试，再见！");
				break;
			}
			input=inputStr.toCharArray();
			result=check(chs,input);
			if(result[0]==chs.length){
				int score=100*chs.length-count*10;
				System.out.println("恭喜你猜对了！你的得分是：" +score);
				break;
			}else{
				count++;
                System.out.println("你猜对" + result[1] +
                		           "个字符，其中"+ result[0] + 
                		           "个字符的位置正确！（总次数=" + count + 
                		           "，exit——退出）");
			}
			
		}
		scanner.close();

	}

	

	private static int[] check(char[] chs, char[] input) {
		int[] result = new int[2];
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < chs.length; j++) {
				if(input[i]==chs[j]){
					result[1]++;
					if(i==j){
						result[0]++;
					}
					break;
				}
			}
			
		}
		return result;
	}



	private static char[] generate() {
		char[] letters = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
                'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
                'W', 'X', 'Y', 'Z' };
        boolean[] flags = new boolean[letters.length];
        char[] chs = new char[5];
        for (int i = 0; i < chs.length; i++) {
            int index;
            do {
                index = (int) (Math.random() * (letters.length));
            } while (flags[index]);// 判断生成的字符是否重复
            chs[i] = letters[index];
            flags[index] = true;
        }
        return chs;
	}

}
