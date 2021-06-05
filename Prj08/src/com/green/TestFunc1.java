package com.green;

import java.util.Scanner;

public class TestFunc1 {
	
	// user defined function
	// 함수 : function - 부프로그램 : 프로그램의 일부
	//  !=
	// 서브루틴 = 프로시저(Procedure) MYSQL 등에서 사용하는 것.
	
	// return
	// 1. 현재 실행중인 함수를 종료. void도 return; 가능. return값이 없다.
	// => 분기문으로 함수를 종료하는 경우. ex) if(exit == 0) return;
	// 2. 값을 돌려준다

	// 모듈(Module), 조각
	// main과 같은 클래스에 있는 함수는 static이 포함되어야 한다.
	
	public static String input() { 
		System.out.println("input");
		
		Scanner in = new Scanner(System.in); // 단축키 ctrl + shift + O
		System.out.print("영어 이름 소문자 입력:");
		
		String name = in.nextLine(); // 문자열은 nextLine이 더 낫다.
		return name;
	}
	
	// process( name )
	// name : parameter, argument  (인자, 매개변수) 
	// => 이런 말도 있다. 실(actual) 인자, 더미() argument
	
	// java는 Call by value(값에 의한 호출)는 인자로 받은 값을 복사하여 처리
	// javaScript는 Call by reference(참조에 의한 호출)
	
	public static String process( String irum ) { 
		System.out.println("process");
		
		// 소문자 -> 대문자
		String result = irum.toUpperCase(); // 소문자 -> 대문자

					 // irum.toLowerCase(); 			// 대문자 -> 소문자
		
					 // irum.compareTo("~~"); 			// 대소문자 구분하여 자리 차이 비교
					 // irum.compareToIgnoreCase("~~"); // 대소문자 구분없이 자리 차이 비교
		
					 // irum.equals("~~");				// 대소문자 구분하여 같은지 비교
		             // irum.equalsIgnoreCase("~~")     // 대소문자 구분없이 같은지 비교

		return result;
	}
	
	public static void output( String result ) {
		System.out.println("output");
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		
		String name = input(); // 함수 호출해서 local variable에 담기
		
		// System.out.println("name:" + name);
		
		String result = process( name );
		
		output(result);
	}

}
