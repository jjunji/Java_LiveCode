package com.jihoon.java.exception;

public class ExceptionMain {

	public static void main(String[] args) {
		
		int array[] = new int [6];
			
		try{
			array[0] = 5;
			array[5] = 10;
		//	array[6] = 11;
			
			int x = 1/0;
			
			String s = "a";
			int a = Integer.parseInt(s);
			 

		}catch(ArrayIndexOutOfBoundsException e){  // e: nameOfException
/*			String msg = e.toString();
			System.out.println(msg);*/
			e.printStackTrace();
		}catch(ArithmeticException e){
			e.printStackTrace();
		}finally{
			System.out.println("다섯번째 값 = " + array[5]);
		}
		System.out.println("시스템이 완료되었습니다.");
	}
}
