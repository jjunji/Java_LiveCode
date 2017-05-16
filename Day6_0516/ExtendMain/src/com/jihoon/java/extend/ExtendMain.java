package com.jihoon.java.extend;

import com.jihoon.java.obj.Father;
import com.jihoon.java.obj.Son;

public class ExtendMain {

	public static void main(String[] args) {

/*		Father fa = new Father();  // 처음에 빨간줄 -> 패키지가 달라서 -> 패지키 import하고 사용할 변수 접근 제한자 public으로 바꾸자
								   // new를 하는 순간 메모리에 올라간다.
		fa.lastname = "조던";
		fa.name = "마이클";
		fa.car = "람보르기니";
		fa.money = 1000000000;
		
		Son son = new Son();
		son.girlfriend = "수지"; // son. 은 아버지가 가진 변수와 son이 가진 변수 모두 보인다.
								// 상속관계에 있는 변수는 카테고리화 시키는게 좋다.
								// father의 girlfriend는 wife를 의미하고, son의 girlfriend는 여자친구를 의미하는 것처럼 변수명 통일.
*/	
		
		Son son = new Son();
		son.lastname = "";
		son.name = "쥬니어";
		son.car = "머스탱";
		son.money = 0;
		son.wife = "수지";
		son.girlfriend = "수지";
		
		son.goDestination();
		
		Father father = new Father();
		father.process();
	}

}
