package com.jihoon.java.bbs;

import java.text.SimpleDateFormat;

// Bbs ��ü

public class Bbs {

	public String author;
	public String date;
	public String title;
	public String content;
	
	public void initDate(){
		SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-mm-dd HH:mm:ss"); // ����� ������������ ��¥,�ð� ���ϴ� �Լ�
		date = sdf.format(System.currentTimeMillis()); // ���ڿ� date������ ��¥,�ð� �� �ֱ�.
	}
}

