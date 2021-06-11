package com.green;

public class Duck {
	// field는 원래는 private로 해야 하지만 객체 상속을 설명하기 위하여 default로 하였다.
	String name;
	
	void quack() {
		System.out.println(name + "(이)가 꿱꿱");
	}
	
	void swim() {
		System.out.println(name + "(이)가 헤엄친다");
	}

}
