package testInterface;

// interface에는 추가적으로 상수, default를 선언해서 무조건 재정의 하지 않아도 되는 메서드를 선언 가능.

public interface MyInterface {
	public static final int MY_NUMBER = 22; // 정적 상수 (public static final) 생략 가능
	
	default void myMethod() { // default method
		// 인터페이스를 상속한 클래스가 myMethod를 Override를 하지 않으면 기본적으로 사용되는 메서드
		System.out.println("Hello");
	}
	
	// interface에 static method도 올 수 있다.
	// 하지만 static은 구현이 되어 있어야 한다.
	// 즉 abstract 추상 메서드이면 static을 붙여서 사용하지 못한다.
	public static void hi() { // 정적 메소드
		System.out.println("hi");
	}
}
