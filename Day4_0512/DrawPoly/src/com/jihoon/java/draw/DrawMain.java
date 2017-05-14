package com.jihoon.java.draw;

public class DrawMain {

	public static void main(String[] args) {
		
		DrawMain main = new DrawMain();
		
		main.drawRect("A", 5);  //1
		main.drawTri("A", 5);   //2 
		main.drawTri_reverse("A", 5); //3
		main.drawTri_reverse_f("A", 5); //3
		main.drawRegularTri("A",5); //4
		main.drawRegularTri_blank("A", 5); //5
		main.drawRegularTri_blank2("A", 5);
	}
	
	// 입력받은 문자 한개를 세로 개수를 지정해서 출력하시오. 1번
	/* 'A' , 5
	 *  AAAAA
	 *  AAAAA
	 *  AAAAA
	 *  AAAAA
	 *  AAAAA
	 */
	
	public void drawRect(String mark, int count){
		
		for( int i=0; i < count; i++){
			for( int j=0; j < count; j++){
				System.out.print(mark);
			}
			System.out.println("");
		}
		System.out.println();
	}
	
	// 2번
	public void drawTri(String mark, int count){
		for( int i=0; i < count; i++){
			for( int j=0; j <= i; j++){
				System.out.print(mark);
			}
			System.out.println("");
		}
		System.out.println();
	}
	
	// 3번
	/*     A   1 = 4, 1
	 *    AA   2 = 3, 2
	 *   AAA   3 = 2, 3
	 *  AAAA   4 = 1, 4
	 * AAAAA   5 = 0, 5
	 */
	
	public void drawTri_reverse(String mark, int count){
		for(int i = count; i > 0; i--){
			
			for(int j=0; j < count; j++){
	
				if(j<i-1){
					System.out.print(" "); // "  " 안에 j를 넣고 밑에 ""+i 를 넣고 출려해봄으로써 디버깅 가능.
				}else{					   //                        -> 무슨 역할 하는지 한눈에 보임
					System.out.print(mark);
				}
			}
			System.out.println(""+i);  // +i 
		}
		System.out.println("");
	}
	
	// 큰 for문 안에 작은 for문 2개로 해결가능, if문으로도 해결 가능.
	public void drawTri_reverse_f(String mark, int count){
		// 0. 각 줄 단위를 처리하는 전체 반복문
		for( int i=0; i < count; i++){
			
			// 1. 공백찍는 반복문
			// 공백은 전체 카운트에서 각 홀수를 뺀 값을 출력한다.
			for( int j=0; j < (count-1)-i; j++){ 
				System.out.print(" ");
			}
			
			// 2. 마크찍는 반복문
			// 마크는 각 줄의 숫자만을 출력한다.
			for(int k=0; k <= i; k++){
				System.out.print(mark);
			}
			System.out.println("i = " + i);  // i 값을 같이 출력해봄으로써  각 줄 마다 어떻게 처리가 되고있는지 확인할 수 있다.
		}
		System.out.println();
	}
	
	/*  4번		
	 		A
		   AAA
		  AAAAA
		 AAAAAAA
		AAAAAAAAA
	 */
	
	public void drawRegularTri(String mark, int count){
		
		for(int i=0; i < count; i++){
			
			for(int j=0; j < (count-1)-i; j++){
				System.out.print(" ");
			}
	
			for(int k=0; k < 2*i+1; k++){
				System.out.print(mark);
			}
			System.out.println();
		}
		System.out.println();
	}

	// 5번 - 4번을 변형에서 피라미드 속 비우기 
	
	public void drawRegularTri_blank(String mark, int count){
		
		for(int i=0; i < count; i++){
			
			for(int j=0; j < (count-1)-i; j++){
				System.out.print(" ");
			}
		
			for(int k=0; k < 2*i+1; k++){
				if(k==0 || k ==2*i){
					System.out.print(mark);
				}else{
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
		System.out.println();
	}
	
	// 6번
	public void drawRegularTri_blank2(String mark, int count){
		
		for(int i=0; i < count; i++){
			
			for(int j=0; j < (count-1)-i; j++){
				System.out.print(" ");
			}
		
			for(int k=0; k < 2*i+1; k++){
				if(k==0 || k ==2*i){
					System.out.print(mark);
				}else if(i == 4){
					System.out.print(mark);
				}else
					System.out.print(" ");
			}
			
			System.out.println();
		}
		System.out.println();
	}
	
	
	
}
