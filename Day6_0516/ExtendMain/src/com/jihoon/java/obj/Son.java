package com.jihoon.java.obj;

// ���� ��Ű���� father�� �ִٸ� public�� �Ƚᵵ ������ �ٸ� ��Ű���� �ִٸ� ������ �� ����.

public class Son extends Father{  //extends�� �ϸ� father�� �ִ� ���� ��� ��.
	/*public String lastname;
	public String name;
	
	public int age;
	public int money;
	public String house;
	public String car;
	public String wife;*/
	
	public String wife;
	public String girlfriend;
	
	
	
	
	@Override // ����� 
	public void process9() {
		
	}
	
	
	// �����ε� - ���ڰ� �ٸ��� ���� �Լ������� �Լ� ���ǰ��� , ������ ������ ����.
	public void process9(int aaa){
		
	}
	
	public void process9(String a){
		
	}



	@Override
	public void goDestination() {
		// super.goDestination();
		System.out.println("PC���� ���ϴ�.");  // ���� �� �� �ۼ�
		process9();  // �� ��
		super.process9(); // �ƺ��� ��
	}
	
	
	
	// �� Ŭ�� - source - Override implements method
	
}
