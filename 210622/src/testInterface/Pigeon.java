package testInterface;

class Plane implements Flyable {
	@Override
	public void fly() {
		System.out.println("비행기가 슈웅 납니다.");
	}
}

public class Pigeon implements Flyable, MyInterface {

	@Override
	public void fly() {
		System.out.println("비둘기가 파닥파닥 납니다.");
	}
	
	@Override
	public void myMethod() { // Override 메소드
		System.out.println("오버라이드 함");
	}



	public static void main(String[] args) {
		Pigeon pigeon = new Pigeon(); // fly() myMethod() 둘 다 사용가능
		Flyable plane = new Plane(); // fly() 메소드만 사용 가능
		
		System.out.println(MY_NUMBER);
		
		pigeon.fly();
		pigeon.myMethod(); // myMethod()를 재정의 하지 않으면 Hello 출력
						   // Override할 경우 기본 정의된 메서드가 아니라 재정의한 메서드가 실행
		plane.fly();
	}
}
