package com.green.collection;

import java.util.ArrayList;

public class ArrayListTest3 {

	public static void main(String[] args) {
		// Java ArrayList<T> 제네릭(Generic)
		// T는 반드시 클래스 타입이어야 한다.
		// => Java 1.5 버전부터 나온 기술.
		// => ArrayList에 아무 것이나 들어올 수 있으니 문제가 생기고 불편해짐.
		
		// 입력 가능한 데이터 타입을 String을 지정
		// String 외의 다른 타입은 저장 불가능.
		ArrayList<String> fruits = new ArrayList<String>();
		
		fruits.add("사과");
		fruits.add("배");
		fruits.add("감");
		fruits.add("딸기");
		// fruits.add(3.5); 
		// String type만 저장 가능
		// error : The method add(String) in the type ArrayList<String> is not applicable for the arguments (double)
		
		// for each
		// fruits 안의 내용을 꺼내서 출력
		int i = 0; // index는 사용이 불가능하다.
		for(String fruit : fruits) {
			System.out.println( i + ":" + fruit );
			i++;
		}
	}

}
