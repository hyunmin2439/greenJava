package com.green8;

public class TestSachic {

	public static void main(String[] args) {
		int v;
		
		Sachic s1 = new Sachic();
		
		s1.setV1(123);
		s1.setV2(234);
		
		v = s1.add();
		System.out.println( v );
		
		v = s1.sub();
		System.out.println( v );
		
		s1.setV1(12);
		s1.setV2(23);
		
		v = s1.add();
		System.out.println( v );
		
		v = s1.sub();
		System.out.println( v );
		
		
		Sachic s2 = new Sachic(12, 24);
		v = s2.add();
		System.out.println( v );
	}

}
