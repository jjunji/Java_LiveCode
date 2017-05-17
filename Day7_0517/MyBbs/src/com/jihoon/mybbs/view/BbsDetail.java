package com.jihoon.mybbs.view;

import com.jihoon.mybbs.model.Bbs;

// 목록에서 상세보기 페이지로 넘어 왔다.
public class BbsDetail {
	
	public void showNo(long id){
		System.out.println("글 번호: " + id);
	}
	
	public void showTitle(String title){
		System.out.println("제 목: " + title);
	}
	
	public void showAuthor(String author){
		System.out.println("작성자: " + author);
	}
	
	public void showDate(String date){
		System.out.println("작성일자: " + date);
	}

	public void showCount(int count){
		System.out.println("조회수: " + count);
	}
	
	public void showContent(String content){
		System.out.println(content);
	}
	
	public void endDetail(){
		System.out.println("----------------------");
	}
	
	/*public void showDetail(Bbs bbs){
		
		System.out.println("글번호 : " + bbs.getId());
		System.out.println("제 목 : " + bbs.getTitle());
		System.out.println("작성자 : " + bbs.getAuthor());
		System.out.println("작성일자 : " + bbs.getDate());
		System.out.println("조회수 : " + bbs.getView());
		
		System.out.println(bbs.getContent());
		
	}*/
}
