package com.green;

public class TestMain {
	
	public static void main(String [] args ) {
		int v1, v2;
		int v;
		v1 = 2100000000;
		v2 = Integer.MAX_VALUE;
		
		v = v1 + v2 ;
		System.out.println(v);
		
		long vl = v1 + v2;
		System.out.println(vl);
		
		long vl2 = (long) v1  + (long) v2; // explicit 변환 명시적
		System.out.println(vl2);
		
		long vl3 = (long) v1  +  v2; 
		   // 자동변환 implicit 변환 (long) v2
		System.out.println(vl2);
		//---------------------------
		
		int  thisYear  = 2021;
		int  birthYear = 2002;
		int  age;
		
		age     =   thisYear - birthYear + 1;
		System.out.print(birthYear + "년생은 ");
		System.out.print( age );
		System.out.print("살입니다\n");
		
		boolean  adult;
		adult    =  age > 19;
		if(adult == true) {
			System.out.println("성인입니다");
		} else {
			System.out.println("미성년자입니다");			
		}
		
		int  val1 = 3 + 12 * 4;
		System.out.println("\n" + val1);
		
		int  val2 = 0 / 3;
		System.out.println(val2);
		
	//	int  val3 =  3 / 0;
	//	System.out.println(val3);
		// 계산 불가
		// Exception in thread "main" java.lang.ArithmeticException: / by zero
	    //	at com.green.TestMain.main(TestMain.java:40)
		
		int val4 = 7 / 2;
		System.out.println( val4 ); // 정수(int) / 정수(int) : 정수(int) 3
		
		double  val5 = 7 / 2;
		System.out.println(val5);  // 3.0
		
		double  val6 = (double) 7 / (double) 2;
		System.out.println(val6);  // 3.5
		
		System.out.printf("%.3f5", val6);  // 3.500
		// 정수 :  %d - decimal      : 10진수
		//         %o - octa decimal : 8진수
		//         %x - hexa decimal : 16진수
		// 실수    %f - 실수
		//         %e - 지수
		// 문자    %c - 문자
		// 믄지열  %s - 문자열
	}

}
