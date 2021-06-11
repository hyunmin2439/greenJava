package com.green.properties;

//Access Modifier(접근 지정자)
// 1. public(아무나 접근가능), 
// 2. private(클래스 자기 자신만)
// 3. protected(상속받은 자식 + 같은 패키지)
// 4. 안 적으면 같은 패키지만

// field vs local variable

// field : 클래스 전체에서 다 쓸 수 있는 것 (클래스 맨위에 선언)
// local : 메소드 내에서만 사용 가능, 메소드가 끝나면 사라짐 (메소드 내부에 선언)

// 하나의 .java안에 두가지 public을 못함
class OperClass {
	////////////// field (variable) //////////////
	private int x; // private라 접근 못함
	private int y;
	
	////////////// constructor //////////////
	
	// 기본 생성자(constructor)
	//private OperClass() { } // private라 사용하지 못함
	
	// 매개변수(parameter)가 있는 생성자
	public OperClass(int x, int y) { // x, y는 parameter
		this.x = x;
		this.y = y;
	}
	
	////////////// method //////////////
	public int add() {
		int result = x + y; // result : local variable
		return result;
	}
	
	// static은 변수나 메소드만 사용 가능
	public static int sub(int x, int y) {
		return x - y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
}

public class classTest {

	public static void main(String[] args) {
		
		// 1. 기본 생성자가 private라 접근 불가
//		OperClass c1 = new OperClass(); // 생성자를 불러들여서 생성
////		클래스명  인스턴스명
//		int       i1 = 3;
////		기본타입  변수명
//		
//		// 2. 매개변수가 있는 생성자로 생성
//		//Class명 Instance명 = new Class(parameter);
//		OperClass a1 = new OperClass(1, 2);
//		
//		// 3. static이 아닌 method
//		a1.add(); // add는 static이 아니라 클래스를 생성해서 사용
//		OperClass.add(); // add가 static이 아니라 사용 불가.
//		
//		
//		// 4. OperClass의 x, y값 출력
//		System.out.println( a1.x ); // x, y는 private라 직접 접근하여 값 가져오기 불가
//		a1.y = 3; // 마찬가지로 값을 넣는 것도 불가
//		
//		System.out.println( a1.getX() ); // x값 가져와서 출력
//		
//		a1.setX(3); // x값 3으로 바꾸기
//		System.out.println( a1.getX() ); // 바뀐 x값 출력
//		
//		
//		// 5. static인 method
//		OperClass.sub(1, 2); // Class명.method명 접근 가능
//							 // 즉 static은 클래스를 생성하지 않고도 메서드 사용 가능
//		a1.sub(1, 2); // Instance명.method명 접근 가능하지만 굳이 쓰지 않음

	}

}