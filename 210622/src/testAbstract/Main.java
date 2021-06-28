package testAbstract;

public class Main {

	public static void main(String[] args) {
		//Shape s = new Shape(); // 추상 클래스는 instance화를 할 수 없다.
		
		
		// Shape는 사각형, 삼각형, 원을 부를 수 있는 명칭으로 선언된 것이다.
		// 조금 더 편하게 쓸 수 있게 하는 것. 
		// 내건 LG V50이고 니꺼는 아이폰 SE2이고 이렇게 부르지 않는다.
		// 폰이라는 단어로 내폰 , 니폰으로 부를 수 있게 조금 더 편하게 쓸 수 있게 하는 것과 마찬가지.
		
		Shape r = (Shape) new Rectangle(100, 100); // Up Casting : (Shape)는 생략가능
		Shape t = new Triangle(100, 100);
		Shape c = new Circle(100);
		
		Rectangle r1 = (Rectangle) r; // Down Casting : (Rectangle)는 생략 불가능.
									  // Rectangle, Triangle, Circle 모두 Shape를 상속 받기 때문에
									  // 생략하면 어디를 가르켜야 할지 모르게 된다.
		
		// Triangle r2 = (Triangle) r; // 컴파일 단계에서는 오류X, 실행 시 오류
		// java.lang.ClassCastException: testAbstract.Rectangle cannot be cast to testAbstract.Triangle
		// Triangle r3 = (Triangle) r1; // 컴파일 단계에서 에러   사각형 -> 삼각형
		
		// java는 다중 상속 불가능
		// 다중 상속 가능한 언어에서 다이아몬드 상속 에러? => 누구의 자식인가?
		// 그러면 java는 다중 상속이 불가능 하냐? => 간접적으로 가능하다.
		
		System.out.println(r.getArea());
		System.out.println(t.getArea());
		System.out.println(c.getArea());
		
		System.out.println(r1.getArea());
	}
}
