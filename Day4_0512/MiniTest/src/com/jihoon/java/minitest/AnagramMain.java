package com.jihoon.java.minitest;

import java.util.Scanner;

public class AnagramMain {

	public static void main(String[] args) {
		
		/*
		 * anagram : ���ڿ��� ������ ���� ���ڿ��� �Ƴ��׷��̶�� �Ѵ�.
		 * ex) abcd = acbd = cabd
		 * ���� : �Է°��� ���ڿ� n,m���� ���� ��, n ���ڿ��� m ���ڿ��� �Ƴ��׷����� Ȯ���ϴ� ���α׷��� �ۼ��ϼ���.
		 * ���� : �Ƴ��׷��� ��� ��� ������ true�� �����Ѵ�.
		 */
		
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String str2 = scanner.nextLine();
		
		String[] str_s = str.split("");
		String[] str2_s = str.split("");
		String temp = "";
		
		//System.out.println(str_s[1]);
		
		
		for(int i=0; i < str_s.length; i++){
			if(Integer.parseInt(str_s[i]) > Integer.parseInt(str_s[i+1])){
				temp = str_s[i];
				str_s[i] = str_s[i+1];
				str_s[i+1] = temp;
			}
			System.out.println(str_s[i]);
		}
		

	}

}

/*
	anagram�� ��� �˰����� ���̽�
	
	a = abcde
	b = bcdea
	
	1. ���ڿ��� �� �ɰ��� for������ �� -> �ɷ��� ������.
	
	2. sort �� ��
*/
