package com.jihoon.java.collection;

import java.util.ArrayList;

import com.jihoon.java.dummy.Student;

public class CollectionMain {

	public static void main(String[] args) {
		
		// ArrayList<Student> list = new ArrayList<>();  <Student> -> ���׸� : Ÿ������.
		ArrayList list = new ArrayList<>();  // ���׸��� �Ⱦ��ٸ�
		Student a1 = new Student();
		a1.name = "������";
		a1.age = 500;
		
		Student a2 = new Student();
		a2.name = "�̼���";
		a2.age = 1000;
		
		list.add(a1);
		list.add(a2);
		
/*		System.out.println(a1.name);
		System.out.println(a1.age);
		System.out.println(a2.name);
		System.out.println(a2.age);*/
		
/*		for(Student item : list){
			System.out.println(item.name + " " + item.age);
		}*/
		
		for(Object item : list){
			
			//System.out.println(item.name + " " + item.age);   // �ȵǴ� ���� : �ٸ� ��ü�� �ִ� ��� item�� ������ ����Ű���� �� �� ����.
															// ���׸����� StudentŬ������ ������ �ؾ߸� ���ٷ� ó������.(��ó��)
			Student std = (Student) item;
			System.out.println(std.name + std.age);
		}
		
		// 2. Map �迭
		
		// 3. Set �迭

	}

}






/*
package com.jihoon.java.collection;

import java.util.ArrayList;

public class CollectionMain {

	public static void main(String[] args) {
		
		// 1. List �迭
		// ���������� ���� �ԷµǸ� ���� �Բ� ������ ����ȴ�.
		// .add(��) : �� �Է�
		// .get(�ε���) : �� ���
		ArrayList<Integer> list = new ArrayList<>(); // ��ü�̱� ������ new�� , ��ü�� ��� ���� �迭 
		int a = 33;
		
		
		//���׸��� ������� �ʴ� �÷����� �ԷµǴ� ���� Object�� Casting �Ѵ�.
		list.add((Integer)a); // ������ (Integer) ĳ���� ���ص� ������ �⺻ -> ��ü -> �⺻Ÿ������ �ٲ���.
		list.add(457);
		list.add(1234);
		
//		list.add("�ȳ��ϼ���");
//		list.add("abcd");
		
		// ��Ʈ�� ù��° ���� ����ϱ�
		//System.out.println("�ȳ��ϼ���".substring(0, 1));
		
		
/*		
 		int list_length = list.size();
		// �Ϲ� for��
		for(int i =0; i < list_length; i++){
			System.out.println(list.get(i));
		}
		*/
		
		// ���� for��
/*		for(Object item : list){
			String string = item + "";
			int number = Integer.parseInt(string);
			//System.out.println(string.substring(0, 1));
			//System.out.println(item);
			System.out.println( number + 3 );
		}*/
		/*
		for(int item : list){
			System.out.println( item + 3 );
		}
		*/
		
		// 2. Map �迭
		
		// 3. Set �迭
/*
	}

}


*/

