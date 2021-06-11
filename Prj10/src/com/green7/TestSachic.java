package com.green7;

public class TestSachic {

	public static void main(String[] args) {
		int result;
		Sachic s1 	=  new Sachic();
		result 		=  s1.add(10, 20);
		System.out.println(result);
		
		result 		= s1.sub(10, 20);
		System.out.println(result);
		
		double result2 = s1.add(37.54, -12.46); // double double을 넘겨주는 것이 아니라, 
		// int double, double int를 넘겨줘도 값이 잘 출력이 된다.
		System.out.println(result2);
		
		// -----------------------------------------
		
						   // private일 경우 에러 발생 is not visible
//		s1.val1		= 123; // field를 public으로 바꾸면 값을 넣고 
//		s1.val2		= 34;  // 결과를 출력할 수 있지만, 이렇게 쓰는 것은 좋지 못한 방식
		
		Sachic s2 = new Sachic();
		
		// 장점 : Scanner를 쓰지 않고 값을 한번만 넣어서 여러가지 연산을 한꺼번에 할 수 있다.
		// 이것이 원칙이다.
		s2.setVal1(123);
		s2.setVal2(34);
		
		result		= s2.add();
		System.out.println(result);

		result		= s2.sub();
		System.out.println(result);
		
		result		= s2.mul();
		System.out.println(result);
		
		// ------------------------------------
		TestClass tc1 = new TestClass();
		
		System.out.println( tc1.toString() ); // com.green7.TestClass@15db9742
											  //                      hashCode(16진수) => 주소 메모리
											  // stack 메모리에 tc1이 생성, 그리고 heap 영역에 hashCode 주소에 tc1의 내용이 들어가 있다.
		
		System.out.println( tc1 );			  // com.green7.TestClass@15db9742 // toString을 생략해도 같은 것이 나온다.
		
//		tc1. // 코딩이 한줄도 없음에도 .을 누르면 어떠한 것들이 나온다. 이 이유는 TestClass extends Object라는 말이 생략이 되어 있다.

		// String은 클래스이다. reference type. String은 Object를 자동 상속 받았기 때문에 equals 사용 가능.
		// 자주 사용하는 것들 : equals, toString, hashCode 
		// 가끔 쓰는 것 : getClass
		// 거의 사용하지 않음 : notify() threading이라는 것을 알려주기 위해서 사용
	}

}
