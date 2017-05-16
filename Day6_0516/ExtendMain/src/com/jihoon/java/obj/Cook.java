package com.jihoon.java.obj;

// interface도 하나의 객체
// interface를 만든다는 것 -> 꼭 구현해야한다.
// 객체지향 설계를 위한 중요한 부분


public interface Cook {
	
	// 이름만 정의, 블럭을 쓰지 않는다.
	// 일반상속과의 차이는 다중상속이 안됨, interface는 가능.(ex. implements 1번, 2번, 3번)
	public void boil();
	public void grill();
	public void fry();
	public void oven();
	public void steam();

}
