package com.jihoon.java.polymorphism;

public class Son extends Father{
	public void goSchool(){
		// System.out.println("�б��� ���ϴ�.");	
	}
	
	@Override
	public void setName(String name){
		//super.setName("s" + name);
		super.name = "s" + name;
	}
}
