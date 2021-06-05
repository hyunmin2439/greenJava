package com.green;

public class TestMain {

	public static void main(String[] args) {
     // 형(type) 변수)variable)   data 수치
		int      v1 =              7;
		int      v2 =              2;
		int      v;
		
		v =  v1 + v2;
		System.out.print(v1 + "\n"	);
		System.out.print(v2);
		System.out.println("\n" + v);
		
		// %d  : decimal 10진 정수
		// %o  : octa decimal 8진 정수
		// %x  : hexa decimal 16진 정수
		
		// %f : float, double 
		// %전체자리수.소수이하자리수f 
		
		System.out.printf("v1=%d v2=%d v=%d\n", v1, v2, v);
		System.out.printf("v1=%d v2=%o v=%x\n", 0xff, 255, 255);
		
		double  d  = Math.PI;
		System.out.printf("%f %10.4f, %.20f\n", d, d, d);
		
     	//  %c : char
		//  %s : String
		
		System.out.println("1234567890");
		System.out.printf("%10s\n", "abcd");
		System.out.printf("%-10s\n", "abcd");
		
		System.out.printf("$%,d\n", 1234567890);
		System.out.printf("%,d\n", 1234567890);
		
		// 제어문자 \n : line feed
		//          \r : carrage return
		//          \\ : backslash   \
		//          \' : quatation   '
		//          \" : double quatation   "
		//          \t : tab
		//          \a : alarm
		//          \b : backspace
		
		//  c:\backup\test\aaa1\n1
		//  cackup        estaa1
		//  1  
		// c:\\backup\\test\\aaa1\\n1
		
		System.out.println("C:\\Users\\user>");
		System.out.println("My name is \"Hello\" ");  // My name is "Hello"
		
		// 조건문
		
		int a = -10;
		if( a < 0 )
			System.out.println("움수입니다");
		else {
			System.out.println("양수입니다");
		}

	}

}












