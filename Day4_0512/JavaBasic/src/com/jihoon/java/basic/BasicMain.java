package com.jihoon.java.basic;
import java.util.ArrayList;
import java.util.Scanner;

import com.jihoon.java.bbs.Bbs;

public class BasicMain {

	public static void main(String[] args) {
	
//		Bbs bbs = new Bbs();
//		bbs.title = "안녕하세요";
//		bbs.author = "홍길동";
//		bbs.date = System.currentTimeMillis();
//		bbs.content = "~~";
		
		// 배열의 길이가 정해지지 않을 때 (게시판처럼) -> 동적배열인 콜렉션을 쓴다.
		
		ArrayList<Bbs> datas = new ArrayList<>();
		
		//Bbs datas[] = new Bbs[100];
		
		
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.println("명령어를 입력하세요 : 1. 입력, 2. 목록, 3. 상세보기, 4. 삭제, 5. 수정");
			String command = scanner.nextLine();
		
		if(command.equals("1")){
			Bbs bbs = new Bbs();
			System.out.println("제목을 입력하세요");
			bbs.title = scanner.nextLine();
			//String title = scanner.nextLine();
			
			
			System.out.println("이름을 입력하세요");
			bbs.author = scanner.nextLine();
			//String author = scanner.nextLine();
			
			System.out.println("내용을 입력하세요");
			bbs.content = scanner.nextLine();
			
			bbs.initDate();
			//datas[0] = bbs;
			datas.add(bbs); // add하는 순간 인덱스로 접근 가능, 식별자로 접근 불가
		}else if(command.equals("2")){
			System.out.println("------ List ------");
			for( Bbs item : datas ){
				System.out.print(item.title);
				System.out.print(" ");
				System.out.println(item.date);
			}
			System.out.println("------------------");
		}else if(command.equals("3")){
			System.out.println("몇 번 리스트입니까?");
			int num = scanner.nextInt();
			
			System.out.println("이름 :" + datas.get(num-1).author);
			System.out.println("내용 :" +datas.get(num-1).content);
			System.out.println("제목: " +datas.get(num-1).title);
		}else if(command.equals("4")){
			System.out.println("몇 번째 리스트를 삭제하시겠습니까?");
			int num = scanner.nextInt();
				
			datas.remove(num-1);
		}else if(command.equals("5")){
			System.out.println("몇 번째 리스트를 수정하시겠습니까?");
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
		
/*		System.out.println("---------입력결과-------");
		System.out.println("제목 : " + title);
		System.out.println("이름 : " + author);
		System.out.println("내용 : " + content);*/
		
		
		//String words = scanner.nextLine(); // 입력이 들어올때 까지 여기서 시스템이 대기한다.
		//System.out.println("내가 입력한 문자: " + words);
		
/*
class Student{
	String name;  // class Class에도 name변수가 있지만 서로 다른것.
	int Age;
}

class Class{
	String name;
	int size;
	int studentCount;
}

// 클래스가 다른 클래스에서 사용되면 public을 쓴다. 같은 패키지에 있으면 그냥 사용가능?
*/