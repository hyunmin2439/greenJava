package com.green2;

// 공통되는 메소드를 따로 뺄 것이다.

public class TestMain {

	public static void main(String[] args) {
		
		// Animal ani new Animal(); // 에러 abstract라서 사용 불가
		
		Duck 	duck1 = new Duck();
		Duck 	duck2 = new Duck();
		
		Raccoon rac1  = new Raccoon();
		Raccoon rac2  = new Raccoon();

		
		duck1.name = "퀙일이";
		duck1.sound(); // sound는 Animal이라는 부모 클래스에게 상속받아서 재정의 된 메소드
		duck1.swim();
		
		
		rac1.name = "너글너글";
		rac1.sound();
		rac1.dig();
		
		System.out.println("============================");
		
		action( duck1, "오리1" );
		
		action( duck2, "오리2" );
		
		//Animal ani = new Duck(); // 이것을 뭐라고 하더라?
		
		System.out.println("============================");
		
		action( rac1, "너굴1" );
		
		action( rac2, "너굴2" );
		
		System.out.println("============================");
		
		/*
		Animal ani = duck1; // BOXING 부모 <- 자식 (업캐스팅)
		play(ani);
		Animal ani2 = rac1;
		play(rac1);
		*/
		
		play(duck1);
		play(duck2);
		play(rac1);
		
	}
	
	// 상속하는 이유, 아래처럼 메소드를 두개를 만들 필요가 없다.
	private static void play(Animal ani) {
		ani.sound();
		
		// 하지만 dig, swim은 상속받아 쓴 method가 아니라
		// 자식 클래스에서 만든 메소드라서 사용 불가능하다.
		
		// 강제로 사용하는 방법
		if( ani instanceof Duck  ) {
			Duck d = (Duck) ani;	//UNBOXING 자식 <- 부모 (다운캐스팅)
			d.swim();
		}
		if( ani instanceof Raccoon) {
			((Raccoon) ani).dig();
		}
		
	}

	// method overload
	private static void action( Raccoon rac, String name ) {
		rac.name = name;
		rac.sound();
		rac.dig();
	}

	private static void action( Duck duck, String name ) {
		duck.name = name;
		duck.sound();
		duck.swim();
	}

}
