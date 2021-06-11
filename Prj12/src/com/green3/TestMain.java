package com.green3;

class Animal {
	String name;
}

interface Isound {
	void sound();
}


class Duck extends Animal implements Isound {
	
	@Override
	public void sound() {
		System.out.println(name + "(이)가 꿱꿱");
	}
	
	void swim() {
		System.out.println(name + "(이)가 수영해요");
	}
}


class Raccoon extends Animal implements Isound {

	@Override
	public void sound() {
		System.out.println(name + "(이)가 너굴너굴");
	}
	
	void dig() {
		System.out.println(name + "(이)가 땅을 파요");
	}
}

public class TestMain {

	public static void main(String[] args) {
		Duck duck1 = new Duck();
		Duck duck2 = new Duck();
		Raccoon rac1 = new Raccoon();
		
		duck1.name = "하양이";
		duck2.name = "노랑이";
		rac1.name = "브라우니";
		
		
		duck1.sound();
		duck1.swim();
		
		System.out.println("==========================");
		
		animalInfo( duck1 );
		
		System.out.println("==========================");
		
		animalInfo( duck2 );
		
		System.out.println("==========================");
		
		animalInfo( rac1 );
	}

	private static void animalInfo(Animal ani) {
		if(ani instanceof Duck) {
			((Duck) ani).sound();
			((Duck) ani).swim();			
		}
		else if(ani instanceof Raccoon) {
			((Raccoon) ani).sound();
			((Raccoon) ani).dig();			
		}
	}

}
