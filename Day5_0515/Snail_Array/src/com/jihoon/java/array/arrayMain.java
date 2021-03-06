package com.jihoon.java.array;

import java.util.Scanner;

public class arrayMain {

	public static void main(String[] args) {
		// 행을 입력받아 소용돌이 숫자 배열 만들기
		// ex) 3 -> 3 X 3 배열
		/*
		 *  1 2 3
		 *  8 9 4
		 *  7 6 5
		 */
		
		/* 1.열 증가  2.행 증가  3.열 감소  4.행 감소  패턴을 인지    */
		
		/* 반복되는 로직을 찾은 후  if문 2개로 1,2번 패턴과 3,4번 패턴을 크게 묶었다.  
		 * 각 if문에서 for문 2개를 사용하여 열 증가와 행 증가 부분을 따로 만들었다.
		 * switch 변수로 큰 패턴을 교환하기 위한 변수로 한 로직 수행후  x -1 을 함으로써 로직이 끝날 때마다 다음 로직이 수행되도록 정의.
		 * */
		
		int count = 1;  // 배열에 +1씩 순서대로 들어가는 수
		
		int sw = 1;  // 한 행 & 한 열에 대한 로직 수행 후 [ㄱ자] [ㄴ자]에 대한 한 행 & 한 열 로직으로 바꿔 주기 위한 switch변수
		
		int i = 0;   // i,j를 전역변수로 지정함으로써, while이 진행되는 동안 마지막 수를 기억한다.
		int j = 0;
		int next_i = 1;
		int next_j = 0;
		
		System.out.println("몇 곱하기 몇 행렬을 만들까요?");
		Scanner scanner = new Scanner(System.in);
		
		String n = scanner.nextLine();  // 배열의 크기를 지정할 수를 문자열로 받고
		int num = Integer.parseInt(n);  // 문자열을 숫자로 바꾼다.
		
		int[][] array = new int[num][num];  // 지정한 크기의 배열을 초기화.
		
		while(count <= num*num){   // 숫자가 다 채워질 때 까지 반복.
			
			// sw가 1일 때는 열 증가 한줄 -> 행 증가 한줄 수행.
			if(sw == 1){
				for(j=next_j; j <= num-next_i; j++){ 
					array[i][j] = count;
					count ++;
				}			
				j = j-1;  // j값을 -1하는 이유는 for문을 다 수행하고 마지막에 j++가 되기 때문에 제자리로 돌리기 위해서.
				
				for(i=next_i; i < num-next_j; i++){
					array[i][j] = count;
					count ++;
				}
				i = i-1;  // 위와 같은 이유로 i-1을 함으로써, i값 원위치.
				sw = sw * -1;  // 다음 로직 수행
			}
			// sw가 -1일 때 	
			if(sw == -1){
				for(j=j-1; j>=next_j; j--){
					array[i][j] = count;
					count++;
				}
				j = j+1;
				
				for(i=i-1; i>=next_i; i--){
					array[i][j] = count;	
					count++;	
				}
				i = i+1;
				sw = sw * -1;
			}
			 next_j = j+1;
			 next_i = i+1;
		}	
		
		// 행렬 값 출력
		for(int z=0; z<num; z++){
			for(int x=0; x<num; x++){
				System.out.print(array[z][x]+"\t");
			}
			System.out.println();
		}
		
	}
}