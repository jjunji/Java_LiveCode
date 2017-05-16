package com.jihoon.java.polymorphism;

public class Son extends Father{
	public void goSchool(){
		// System.out.println("학교에 갑니다.");	
	}
	
	@Override
	public void setName(String name){
		//super.setName("s" + name);
		super.name = "s" + name;
	}
}
