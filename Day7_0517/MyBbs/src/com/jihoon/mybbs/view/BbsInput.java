package com.jihoon.mybbs.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.jihoon.mybbs.model.Bbs;

//
public class BbsInput {
	
	// void�� Bbs�� �ٲ� ���� : �� ó���ϰ� presenter [ArrayList<Bbs> datas(�ӽ� �����)]��  �Ѱ���ߵǱ� ����?
	public Bbs process(Scanner scanner){
		System.out.println("������ �Է��ϼ���.");
		String title = scanner.nextLine();
		System.out.println("�ۼ��ڸ� �Է��ϼ���.");
		String author = scanner.nextLine();
		System.out.println("������ �Է��ϼ���.");
		String content = scanner.nextLine();
		
		Bbs bbs = new Bbs();
		bbs.setTitle(title);
		bbs.setAuthor(author);
		bbs.setContent(content);
		
		return bbs;
	}
}
