package com.green;

// Call by Value 	 : 값에 의한 전달 C, C++, Java, C#의 primitive type 변수
// Call by Reference == Call by Address
// https://felightlim.tistory.com/19
// 참조형 변수(객체)도 call by reference가 아니다 
// 이는 JAVA 공식문서에도 나와있는 설명
// 즉 java는 Call by Reference라는 것이 없다.


// static : new를 하지 않고 쓸수 있다.
// TestSwap.swap( v1, v2 ); // new하지 않고 쓰는법
// => swap( v1, v2 );
// 하지만 같은 클래스 안이라 굳이 안써도 된다.

// stack 함수마다 따로 있다.
//swap stack : main stack과 따로 존재, heap은 같은 것을 쓴다.

class Swap {
	int x; 
	int y;
	
	// 추천방식 : 객체는 reference type이라 굳이 돌려줄 필요X
	public static void swap( Swap obj ) {
		int tmp;
		tmp   = obj.x;
		obj.x = obj.y;
		obj.y = tmp;
	}

	// 객체를 리턴하는 방법
	public static Swap swap2( Swap obj ) {
		int tmp;
		tmp   = obj.x;
		obj.x = obj.y;
		obj.y = tmp;
		return obj;
	}

	@Override
	public String toString() {
		return "Swap [x=" + x + ", y=" + y + "]";
	}

}

public class TestSwap {

	public static void main(String[] args) {
		int v1 = 7, v2 = 2;
		System.out.println("v1:" + v1 + ", v2:" + v2);
		// TestSwap.swap( v1, v2 ); // 같은 클래스 안에서 클래스 이름 생략가능
		swap( v1, v2 );
		System.out.print("v1:" + v1 + ", v2:" + v2);
		System.out.println("  //돌아와도 값이 바뀌지 않음");
		
		System.out.println("===========================");
		
		
		// 해결책 1 - 제일 추천하는 방법
		int[] v = new int[] {7, 2};
		System.out.println("v1:" + v[0] + ", v2:" + v[1]);
		swap2( v ); // 작동함
		System.out.print("v1:" + v[0] + ", v2:" + v[1]);
		System.out.println("  //돌아오면 값이 바뀜");
		
		
		System.out.println("===========================");
		
		
		// 해결책 2
		// 객체를 이용하는 방법
		Swap swp = new Swap();
		swp.x = 7; swp.y = 2;
		System.out.println(swp);
		Swap.swap( swp );
		System.out.println(swp);
		
		
		System.out.println("===========================");
		
		
		Swap swp2 = new Swap();
		swp2.x = 7; swp2.y = 2;
		System.out.println(swp2);
		swp2 = Swap.swap2( swp2 );
		System.out.println( swp2 );
	}

	
	private static void swap2(int[] v) {
		int tmp  = v[0];
			v[0] = v[1];
			v[1] = tmp;
		System.out.println("v1:" + v[0] + ", v2:" + v[1] + "   //함수");
	}

	
	// Call by Value : 값에 의한 인자 전달기법
	// v1(x) <- v1      v2(y) <- v2
	// x, y  이름이 되어도 상관X
	// return 문은 하나의 값만 돌려줄 수 있다.
	// 값 교환이 안됨 - 작동 안됨.
	// 함수 연산이 끝나면 swap 메모리 파괴
	private static void swap(int v1, int v2) {
		int tmp = v1;
			v1	= v2;
			v2 	= tmp;
			System.out.println("v1:" + v1 + ", v2:" + v2 + "   //함수");
	}

}
