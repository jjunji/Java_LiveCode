package com.jihoon.java.obj;

public class Father extends Fix implements Cook{   // ���� �� Ŭ���ؼ� interface�� �ִ� ��� �޼ҵ带 �ҷ��;� ������ �����.

	public String lastname;
	public String name;
	
	public int age;   // private�� ���� ������� �ʰڴ�. -> { } �ڵ� �� �ȿ����� ȣ�� ����.
	public int money;
	public String house;
	public String car;
	public String wife;

	public void process9(){
		
	}
	
	public void goDestination(){
		
		process9();
		System.out.println("ȸ�縦 ����մϴ�.");
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
		System.out.println("�����Ͽ����ϴ�.");
		
	}

	@Override
	public void replacePart() {
		System.out.println("��ü�Ͽ����ϴ�.");
		
	}

	@Override
	public void clean() {
		System.out.println("û���Ͽ����ϴ�.");
		
	}

	@Override
	public void assemble() {
		System.out.println("�����Ͽ����ϴ�.");
		
	}
	
}
