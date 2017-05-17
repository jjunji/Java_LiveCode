package com.jihoon.mybbs;

import com.jihoon.mybbs.presenter.BbsPresenter;

// 우리가 설계하는 객체와는 관계없다. 진입을 위한 클래스

public class MyBbsMain {

	public static void main(String[] args) {
	
		BbsPresenter presenter = new BbsPresenter();  // 생성자를 통해 BbsPresenter클래스를 인스턴스화
		presenter.start();  // 메모리에 올라간 BbsPresenter클래스가 가지고 있는 start() 메소드 실행.

	}

}


/*
	컴파일 -> 제일 먼저 Main(진입점)을 찾고 메모리에 BbsPresenter클래스를 올림.
	클래스가 메모리에 올라가면서  BbsPresenter 클래스의 생성자 호출. 동시에 생성자가 가지고 있는 init() 호출
	다음 start() 메소드 실행.
*/