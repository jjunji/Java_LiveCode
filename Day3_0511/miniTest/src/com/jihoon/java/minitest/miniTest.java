package com.jihoon.java.minitest;

public class miniTest {

	int count = 0;
	
	public int count(){
		
		String temp;
		int temp_len;
		
		for(int i = 0; i <= 10000; i++){
			
			temp = Integer.toString(i);		
			temp_len = temp.length();
			
			for(int j = 0; j < temp_len; j++){
				if(temp.charAt(j) == '8'){
					count++;
				}
			}
		}
		return count;
	}
	
	public void printCount(){
		System.out.println(count);
	}
}
