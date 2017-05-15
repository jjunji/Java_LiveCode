package com.jihoon.java.basic;

// 사용하고자하는 클래스가 다른 패키지에 있을 때는 import로 불러온다.
// 같은 디렉토리안에 있는데 내 주소를 왜 내가 써야하는 가 -> 컴퓨터는 모르기때문에 import해야한다.
// 안써도 작동이 되는 것은 자동으로 import 해주기 때문에

public class BasicMain {

	public static void main(String[] args) {
		
		// 1. 객체를 사용하기
		// 기본형과 사용법이 유사한데.. 메모리를 지정해주기 위해서 new 연산자를 사옹한다.
		BasicSub sub = new BasicSub(); // -> 처음에 오류남 -> 사용하고자하는 클래스가 다른 패키지에 있을 때 import로 불러온다.
		
		// 2. 멤버사용하기
		// 2.1 변수
		
		int aaa = sub.변수이름;  // 메모리에 있는 값을 가져오는 것.
		
		// 2.1 gkatn 메서드
		int bbb = sub.함수명();
		// sub.함수명(); -> 문맥상 오류가 없으나, 값을 담고 있는 공간이 없기에 사라짐.
	}

}