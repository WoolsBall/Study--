package com.learn.day4;

import java.util.Scanner;

public class GuessGame {
	public static void main(String[] args) {
		// ��ʾ��Ҳ²�Ĵ���
		int count = 0;
		// ��ʾ�û��²������
		char[] input = null;
		// ���ڱ����жϵĽ��
		int[] result = new int[2];
		Scanner scanner = new Scanner(System.in);
		System.out.println("GuessingGame>��ӭ���Բ���ĸ��Ϸ��");
		// ��ʾ�²���ַ���
		char[] chs = generate();
		System.out.println("GuessingGame>��Ϸ��ʼ�������������µ�5����ĸ���У���exit�����˳���");
		while (true) {
			String inputStr = scanner.next().trim().toUpperCase();
			if ("EXIT".equals(inputStr)) {
				System.out.println("GuessingGame>лл��ĳ��ԣ��ټ���");
				break;
			}
			input=inputStr.toCharArray();
			result=check(chs,input);
			if(result[0]==chs.length){
				int score=100*chs.length-count*10;
				System.out.println("��ϲ��¶��ˣ���ĵ÷��ǣ�" +score);
				break;
			}else{
				count++;
                System.out.println("��¶�" + result[1] +
                		           "���ַ�������"+ result[0] + 
                		           "���ַ���λ����ȷ�����ܴ���=" + count + 
                		           "��exit�����˳���");
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
            } while (flags[index]);// �ж����ɵ��ַ��Ƿ��ظ�
            chs[i] = letters[index];
            flags[index] = true;
        }
        return chs;
	}

}
