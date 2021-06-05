package com.green4;

// 오리 + 너구리 생성 : 다중 상속
class Animal {
	String name;
	
}

interface ISound {
	void sound();
}

interface IDuck {	
	void swim();
}

interface IRaccoon {
	void dig();
}

class DuckRaccoon extends Animal implements ISound, IDuck, IRaccoon {

	@Override
	public void dig() {
		System.out.println( name + "(이)가 땅을 판다" );
	}

	@Override
	public void swim() {
		System.out.println( name + "(이)가 헤엄 친다" );		
	}

	@Override
	public void sound() {
		System.out.println( name + "(이)가 소리지른다");
	}
	
}

// 상속하여 사용할 때 DuckRaccoon을 쓰는 것이 아니라 
// DuckRaccoon에 메소드나 미리 다 만들어놓고
// DuckRaccoon을 상속받은 자식(child) 클래스를 사용한다.

class ChildDuckRaccoon extends DuckRaccoon {
	
}

public class TestMain {
	
	public static void main(String[] args) {
		ChildDuckRaccoon cdr = new ChildDuckRaccoon();
		
		cdr.name = "오리너구리새끼";
		cdr.dig();
		cdr.sound();
		cdr.swim();
		
	}
}
