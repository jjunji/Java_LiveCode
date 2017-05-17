package com.jihoon.mybbs.view; // v를 담당.
							   // System.out.println() 보여주는 것은 p로 이동해야함.
import java.util.ArrayList;

import com.jihoon.mybbs.model.Bbs;

public class BbsList {
	
/*	
	// 리스트에서 보여줄 저장소
	// 배열의 개수가 정해지지 않는다 -> ArrayList            -> p로 옮겨보자
	ArrayList<Bbs> datas = new ArrayList<>();
*/	
	// 목록 뿌리기
	public void showList(ArrayList<Bbs> datas){
		
		for( Bbs bbs: datas){
			System.out.print(bbs.getId()+" | ");
			System.out.print(bbs.getTitle()+" | ");
			System.out.print(bbs.getAuthor()+" | ");
			System.out.print(bbs.getDate()+" | ");
			System.out.println(bbs.getView()+"");
		}
		
	}
	
	// 쓰기
	public void goInput(){
		
	}
	
	// 상세보기로 이동 -> 누르면 무엇을 눌렀는지 알아야 하기 때문에 id값이 필요 -> 인자 값 long id
	//public void goDetail(ArrayList<Bbs> datas, long id){
		
/*		for( Bbs bbs : datas){
			if(bbs.getId() == id){
				BbsDetail detail = new BbsDetail();
				detail.showDetail(bbs);
				break; // 조건문에 부합되면 반복문을 중지한다.
			}
		}
		
	}
*/
	// 검색
	public void search(String word){
		
	}
	
	// 삭제
	public void delete(long id){
		
	}
}
