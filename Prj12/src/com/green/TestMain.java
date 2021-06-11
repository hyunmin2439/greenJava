package com.green;

// 자바는 다중 상속이 불가능하다 extends 뒤에 하나만 쓸 수 있다.
// class DuckRaccoon extends Duck, Raccoon { }
// C++에서는 다중 상속이 가능하다. 하지만 문제점이 많다.

public class TestMain {

	public static void main(String[] args) {
		Duck duck1 = new Duck();
		duck1.name = "아롱이";
		System.out.println( duck1.name );
		duck1.quack();
		duck1.swim();
		
		Raccoon rac1 = new Raccoon();
		rac1.name = "둥글이";
		System.out.println(rac1.name);
		rac1.nuggle();
		rac1.dig();
	}

}
