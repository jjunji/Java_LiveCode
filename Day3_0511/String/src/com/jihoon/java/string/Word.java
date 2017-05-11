package com.jihoon.java.string;

public class Word {

	public static void main(String[] args) {

		String name = "안녕하세요";
	    //1. 글자 자르기				// String 클래스는 인덱스가 글자 사이에 있음. 
		String secondWord = name.substring(1, 2);	
		System.out.println(secondWord);
		
		//2. 문자열 길이
		int 문자열길이 = name.length();
		System.out.println(문자열길이);
		
		//3. n번째 글자
		char 한글자 = name.charAt(3);
		System.out.println(한글자);
		
		//4. 안:0  녕:1  하:2  세요:3 -> 해당 글자를 한묶음으로 생각하고 인덱스 출력
		int 몇번째 = name.indexOf("세요");
		System.out.println(몇번째);
		
		//5. "안녕하세요" 에서 "하"를 기준으로 나눠짐
		String 두덩이[] = name.split("하");
		System.out.println(두덩이[0]);
		System.out.println(두덩이[1]);
		
		//6. 문자열 바꾸기
		String 바뀐글 = name.replace("하", "라라라");
		System.out.println(바뀐글);
	}

}
