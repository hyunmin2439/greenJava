package testStatic;

// 프로그램 실행 시
// static을 전부 찾아서 미리 static메모리에 올려놓는다.

public class TestStatic {
	public static int a = 10;
	public static String str = "abc";
	
	///////////////////////////////////////////////////////////////////
	
	// public static String str = "abc"; 
	public static final String str2 = "abc"; // 이렇게 사용하는 건 괜찮다.
	
	// public static으로 선언하는 것은 좋지 않다.
	// public static final을 쓰는 것이 좋다.
	// => public은 공용으로 쓰는 것
	// => static : static은 미리 올려놓고 계속 쓰는 값. 프로그램 종료시까지 사라지지 않음.
	// => 즉, 중요한 값이고 이곳 저곳에서 다 쓰는 값인데 마음대로 바뀌는 것은 문제가 된다.
	// => ex) PI 처럼 중요한 값인데 중간에 바뀌지 않게 final을 붙여서 바뀌지 않게 하는 것이 좋다.
	
	///////////////////////////////////////////////////////////////////
	
	static { // 이건 좀 충격적, 스스로 발상의 전환이 필요할 듯
		System.out.println(a);
		System.out.println(str);
		System.out.println("Hello");
	}
	
	// method 미리 메모리에 올려놓음
	public static void sayHo() {
		System.out.println("호우");
	}
	
	public void nonStatic() {
		System.out.println("스태틱하지 않은 메소드");
	}
	
	public static void main(String[] args) {
		System.out.println("World");
		
		a = 50;
		System.out.println("메인 메소드에서 a값을 변경했습니다.");
		System.out.println(a);
		
		sayHo();
		
		TestStatic t = new TestStatic();
		t.nonStatic();
		// == new TestStatic().nonStatic();
	}

}
