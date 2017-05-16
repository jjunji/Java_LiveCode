package com.jihoon.java.obj;

// 같은 패키지에 father가 있다면 public을 안써도 되지만 다른 패키지에 있다면 접근할 수 없음.

public class Son extends Father{  //extends를 하면 father에 있는 변수 모두 들어감.
	/*public String lastname;
	public String name;
	
	public int age;
	public int money;
	public String house;
	public String car;
	public String wife;*/
	
	public String wife;
	public String girlfriend;
	
	
	
	
	@Override // 예약어 
	public void process9() {
		
	}
	
	
	// 오버로딩 - 인자가 다르면 같은 함수명으로 함수 정의가능 , 예약어는 붙이지 않음.
	public void process9(int aaa){
		
	}
	
	public void process9(String a){
		
	}



	@Override
	public void goDestination() {
		// super.goDestination();
		System.out.println("PC방을 갑니다.");  // 내가 할 일 작성
		process9();  // 내 것
		super.process9(); // 아빠의 것
	}
	
	
	
	// 우 클릭 - source - Override implements method
	
}
