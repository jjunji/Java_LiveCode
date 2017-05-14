package com.jihoon.java.bbs;

import java.text.SimpleDateFormat;

// Bbs 객체

public class Bbs {

	public String author;
	public String date;
	public String title;
	public String content;
	
	public void initDate(){
		SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-mm-dd HH:mm:ss"); // 사용자 지정형식으로 날짜,시간 구하는 함수
		date = sdf.format(System.currentTimeMillis()); // 문자열 date변수에 날짜,시간 값 넣기.
	}
}

