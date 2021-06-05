package com.green2;

public class Raccoon extends Animal {

	@Override
	void sound() {
		System.out.println(name + "(이)가 너굴너굴");
	}
	
	void dig() {
		System.out.println(name + "(이)가 땅을 판다");
	}

}
