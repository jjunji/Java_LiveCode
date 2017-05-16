package com.jihoon.java.obj;

public class Father extends Fix implements Cook{   // 빨간 줄 클릭해서 interface에 있는 모든 메소드를 불러와야 에러가 사라짐.

	public String lastname;
	public String name;
	
	public int age;   // private를 쓰면 상속하지 않겠다. -> { } 코드 블럭 안에서만 호출 가능.
	public int money;
	public String house;
	public String car;
	public String wife;

	public void process9(){
		
	}
	
	public void goDestination(){
		
		process9();
		System.out.println("회사를 출근합니다.");
	}

	@Override
	public void boil() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void grill() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fry() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void oven() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void steam() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disassemble() {
		System.out.println("분해하였습니다.");
		
	}

	@Override
	public void replacePart() {
		System.out.println("교체하였습니다.");
		
	}

	@Override
	public void clean() {
		System.out.println("청소하였습니다.");
		
	}

	@Override
	public void assemble() {
		System.out.println("조립하였습니다.");
		
	}
	
}
