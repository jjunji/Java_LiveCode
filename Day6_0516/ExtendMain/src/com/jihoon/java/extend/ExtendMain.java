package com.jihoon.java.extend;

import com.jihoon.java.obj.Father;
import com.jihoon.java.obj.Son;

public class ExtendMain {

	public static void main(String[] args) {

/*		Father fa = new Father();  // ó���� ������ -> ��Ű���� �޶� -> ����Ű import�ϰ� ����� ���� ���� ������ public���� �ٲ���
								   // new�� �ϴ� ���� �޸𸮿� �ö󰣴�.
		fa.lastname = "����";
		fa.name = "����Ŭ";
		fa.car = "���������";
		fa.money = 1000000000;
		
		Son son = new Son();
		son.girlfriend = "����"; // son. �� �ƹ����� ���� ������ son�� ���� ���� ��� ���δ�.
								// ��Ӱ��迡 �ִ� ������ ī�װ�ȭ ��Ű�°� ����.
								// father�� girlfriend�� wife�� �ǹ��ϰ�, son�� girlfriend�� ����ģ���� �ǹ��ϴ� ��ó�� ������ ����.
*/	
		
		Son son = new Son();
		son.lastname = "";
		son.name = "��Ͼ�";
		son.car = "�ӽ���";
		son.money = 0;
		son.wife = "����";
		son.girlfriend = "����";
		
		son.goDestination();
		
		Father father = new Father();
		father.process();
	}

}
