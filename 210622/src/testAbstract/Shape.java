package testAbstract;

// 추상 클래스
public abstract class Shape {
	// 도형마다 넓이 구하는 공식이 다른데 어떻게 정의를 해서 상속을 받아 쓰느냐?
	// 그래서 이럴 때 쓰는 것이 abstract를 사용한다.
	
	// 추상 메소드 : method의 body는 없고 header만 있다.
	public abstract int getArea();
}
