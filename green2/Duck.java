package com.green2;

public class Duck extends Animal {
	
	@Override
	void sound() {
		System.out.println(name + "(이)가 꿱꿱");
	}
	
	void swim() {
		System.out.println(name + "(이)가 헤엄친다");
	}


}
