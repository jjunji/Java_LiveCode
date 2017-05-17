package com.jihoon.mybbs.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.jihoon.mybbs.model.Bbs;

//
public class BbsInput {
	
	// void를 Bbs로 바꾼 이유 : 다 처리하고 presenter [ArrayList<Bbs> datas(임시 저장소)]로  넘겨줘야되기 때문?
	public Bbs process(Scanner scanner){
		System.out.println("제목을 입력하세요.");
		String title = scanner.nextLine();
		System.out.println("작성자를 입력하세요.");
		String author = scanner.nextLine();
		System.out.println("내용을 입력하세요.");
		String content = scanner.nextLine();
		
		Bbs bbs = new Bbs();
		bbs.setTitle(title);
		bbs.setAuthor(author);
		bbs.setContent(content);
		
		return bbs;
	}
}
