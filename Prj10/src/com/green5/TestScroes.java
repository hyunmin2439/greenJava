package com.green5;

public class TestScroes {

	public static void main(String[] args) {
		// static 방식보다 new 방식을 대부분 많이 쓴다.
		Sungjuk s1 = new Sungjuk();
		
		// 두가지 방법으로 사용 가능.
		s1.input();
		s1.process();
		s1.output();
		
//		method에 static을 붙이면 아래와 같이 사용가능.
//		static은 특수한 경우에만 쓴다. 
//		ex) main은 new할 수 없으니 static을 붙여서 쓴다. 
//		실제 코딩 중 보통 5% 내외만 쓴다.
//		Sungjuk.input();
//		Sungjuk.process();
//		Sungjuk.output();
	}

}
