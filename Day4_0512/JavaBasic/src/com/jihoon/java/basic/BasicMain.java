package com.jihoon.java.basic;
import java.util.ArrayList;
import java.util.Scanner;

import com.jihoon.java.bbs.Bbs;

public class BasicMain {

	public static void main(String[] args) {
	
//		Bbs bbs = new Bbs();
//		bbs.title = "�ȳ��ϼ���";
//		bbs.author = "ȫ�浿";
//		bbs.date = System.currentTimeMillis();
//		bbs.content = "~~";
		
		// �迭�� ���̰� �������� ���� �� (�Խ���ó��) -> �����迭�� �ݷ����� ����.
		
		ArrayList<Bbs> datas = new ArrayList<>();
		
		//Bbs datas[] = new Bbs[100];
		
		
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.println("��ɾ �Է��ϼ��� : 1. �Է�, 2. ���, 3. �󼼺���, 4. ����, 5. ����");
			String command = scanner.nextLine();
		
		if(command.equals("1")){
			Bbs bbs = new Bbs();
			System.out.println("������ �Է��ϼ���");
			bbs.title = scanner.nextLine();
			//String title = scanner.nextLine();
			
			
			System.out.println("�̸��� �Է��ϼ���");
			bbs.author = scanner.nextLine();
			//String author = scanner.nextLine();
			
			System.out.println("������ �Է��ϼ���");
			bbs.content = scanner.nextLine();
			
			bbs.initDate();
			//datas[0] = bbs;
			datas.add(bbs); // add�ϴ� ���� �ε����� ���� ����, �ĺ��ڷ� ���� �Ұ�
		}else if(command.equals("2")){
			System.out.println("------ List ------");
			for( Bbs item : datas ){
				System.out.print(item.title);
				System.out.print(" ");
				System.out.println(item.date);
			}
			System.out.println("------------------");
		}else if(command.equals("3")){
			System.out.println("�� �� ����Ʈ�Դϱ�?");
			int num = scanner.nextInt();
			
			System.out.println("�̸� :" + datas.get(num-1).author);
			System.out.println("���� :" +datas.get(num-1).content);
			System.out.println("����: " +datas.get(num-1).title);
		}else if(command.equals("4")){
			System.out.println("�� ��° ����Ʈ�� �����Ͻðڽ��ϱ�?");
			int num = scanner.nextInt();
				
			datas.remove(num-1);
		}else if(command.equals("5")){
			System.out.println("�� ��° ����Ʈ�� �����Ͻðڽ��ϱ�?");
			String choice = scanner.nextLine();
			int num = Integer.parseInt(choice);
				
			datas.get(num-1).author = scanner.nextLine();
			datas.get(num-1).content = scanner.nextLine();
			datas.get(num-1).title = scanner.nextLine();
			}
		}
	}
}
		//String content = scanner.nextLine();
		
/*		System.out.println("---------�Է°��-------");
		System.out.println("���� : " + title);
		System.out.println("�̸� : " + author);
		System.out.println("���� : " + content);*/
		
		
		//String words = scanner.nextLine(); // �Է��� ���ö� ���� ���⼭ �ý����� ����Ѵ�.
		//System.out.println("���� �Է��� ����: " + words);
		
/*
class Student{
	String name;  // class Class���� name������ ������ ���� �ٸ���.
	int Age;
}

class Class{
	String name;
	int size;
	int studentCount;
}

// Ŭ������ �ٸ� Ŭ�������� ���Ǹ� public�� ����. ���� ��Ű���� ������ �׳� ��밡��?
*/