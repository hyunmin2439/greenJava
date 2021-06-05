package com.green.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	// Set : 수학의 집합을 의미 - 중복자료가 저장되지 않는다.
	//		 데이터가 저장된 순서대로 유지 되지 않는다.
	
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); // 중복 -> 입력 X
						 // 아래 Iterator를 사용해 출력할 때도 출력 안됨. 
						 // 즉 저장이 아예 안되었다.
		set.add("Spring");
		
		System.out.println( set.size() ); // 4
		
		// set.get(); // HashSet은 get이 없다. get은 위치를 통해 return
		
		Iterator<String> iter = set.iterator(); // Iterator : 자료를 가르키는 손가락 같은 개념
		
		// set 안의 자료를 반복하여 출력
		while( iter.hasNext() ) {
			String element = iter.next();
			System.out.println(element + " ");
		}
	
		System.out.println("==========================");
		
		// for 입력 => Ctrl + Space 
		// => 3번째 for iterate over collection을 입력하면 아래와 같이 자동 완성
		// => 변수명 등 수정하여 사용
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
		}
		
	}

}
