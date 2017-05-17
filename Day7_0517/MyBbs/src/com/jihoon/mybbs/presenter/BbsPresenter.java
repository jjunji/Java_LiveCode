package com.jihoon.mybbs.presenter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

import com.jihoon.mybbs.model.Bbs;
import com.jihoon.mybbs.model.BbsLoader;
import com.jihoon.mybbs.view.BbsDetail;
import com.jihoon.mybbs.view.BbsInput;
import com.jihoon.mybbs.view.BbsList;

public class BbsPresenter {

	final boolean START = true;  // 상수를 사용하는 것은 가독성을 위해.(보통은 보기가 3개 이상일 때)
	final boolean FINISH = false;
	boolean runFlag = START;
	
	//ArrayList<Bbs> datas = new ArrayList<>();  
	// 데이터 임시 저장소
							//   1    3    3
	ArrayList<Bbs> datas;  // { Bbs, Bbs, Bbs ... }
	
	// 모두가 사용하므로 전역변수로 선언
	Scanner scanner;
	BbsInput input;
	BbsList list;
	BbsDetail detail;
	BbsLoader loader;
	
	int number = 0;
	
	/*
	 * new 생성자가 호출되면 init() 함수를 통해 초기화해준다.
	 */

	public BbsPresenter(){  // 객체화.
		init();
	}
	
/*	함수형
   private void caller(){
		init();
		start();
	}
*/
	
	
	/*
	 * 초기화 함수, 사용할 객체들을 미리 메모리에 로드해둔다. 
	 */
	private void init(){             // init()을 정의하는 것이 사실 무의미 -> 생성자에 아래 코드를 그대로 붙여넣으면 되기 때문이다.
		scanner = new Scanner(System.in);
		input = new BbsInput();
		list = new BbsList();
		detail = new BbsDetail();
		loader = new BbsLoader();
		datas = new ArrayList<>();
	}
	
	// 메인에서 제일 먼저 호출한 메소드이므로 바로 실행됨.
	public void start(){
		// Scanner scanner  = new Scanner(System.in);
		// init(); -> 옛날 방식 -> 함수간의 종속성이 생김.
		
		while(runFlag){
			System.out.println("명령어를 입력하세요 [l.목록, w:쓰기, r:상세보기]");
			String command = scanner.nextLine();
			switch(command){
			case "l" :
				datas = loader.read();
				list.showList(datas);
				break;
			case "w" :
				write();
/*				System.out.println("제목을 입력하세요.");
				String title = scanner.nextLine();
				System.out.println("작성자를 입력하세요.");   -> 만들고 input클래스로 넘겼음.
				String author = scanner.nextLine();
				System.out.println("내용을 입력하세요.");
				String content = scanner.nextLine();*/
				
				//BbsInput input = new BbsInput();  // -> 이렇게 쓰면 while이 돌 때 마다 new가 생성됨 -> 좋지않다. -> 반복문 밖으로
				/*
				Bbs bbs = input.process(scanner);
				
				int number = datas.size()+1;
				bbs.setId(number);
				datas.add(bbs);
*/
				//input.process(scanner);
				break;
			case "r" :
				//System.out.println("글 번호를 입력하세요 ");
				//String id = scanner.nextLine();
				goDetail();
				break;
			}
		}
	}
	
	public void end(){
		runFlag = FINISH;
	}
	
	public void write(){
		// datas.add(input.process(scanner));
		Bbs bbs = input.process(scanner);
		// 기준이 되는 변수가 있으면 미리 지정해야한다.
		number = number + 1;
		bbs.setId(number);
		bbs.setDate(getDate());
		
		loader.write(bbs);
		//datas.add(bbs);
	}
	
	public String getDate(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // SimpleDateFormat을 이용해 날짜 표시 형식 지정.
		long currentTime = System.currentTimeMillis(); // currentTime변수에 currentTimeMillis형식으로 값을 넣고
		return sdf.format(currentTime);  // 날짜 표시 형식으로 바꿔서 리턴함.
	}
	
	public void goDetail(){
		System.out.println("글 번호를 입력하세요 ");
		String temp = scanner.nextLine();
		long id = Long.parseLong(temp);
		for( Bbs bbs : datas){  // -> ?
			if(bbs.getId() == id){
				//detail.showDetail(bbs);
				
				detail.showNo(bbs.getId());
				detail.showTitle(bbs.getTitle());
				detail.showAuthor(bbs.getAuthor());
				detail.showDate(bbs.getDate());
				detail.showCount(bbs.getView());
				detail.showContent(bbs.getContent());
				detail.endDetail();

				break; // 조건문에 부합되면 반복문을 중지한다.
			}
		}
	}
}
