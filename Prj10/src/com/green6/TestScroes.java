package com.green6;

// 레고로 따지자면 레고 판때기 역할이다.

public class TestScroes {
	//1, 김현민, 100, 95, 54
	public static void main(String[] args) {
		Sungjuk s1 = new Sungjuk();
		
							
//		s1.input();			// method를 private로 설정하면 The method input() from the type Sungjuk is not visible
//		s1.num = 32; 		// 클래스 안의 변수는 절대 public으로 만들면 안된다. 데이터가 왜곡되는 현상이 발생한다.
//		s1.name = "아이유"; // default - 같은 패키지(package) 안이라서 접근이 가능하다.
//							// sungjuk의 field 변수를 private로 만들어 놓으면 s1.num으로 접근 불가하다.
		
		s1.input();
		s1.process();
		s1.output();
		
	}

}
