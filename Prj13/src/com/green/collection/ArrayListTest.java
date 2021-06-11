package com.green.collection;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// ArrayList : class
		// ArrayList<Type> 변수명 = new ArrayList<Type>(); // Type을 지정해주는 것이 좋다.
		// 실행할 때 메모리가 추가, 삭제가 가능한 리스트 생성
		
		// 초기 크기(Capacity)는 10개 확보하고 사용한다.
		// Capacity => 11개가 되면 책상을 준비하고 사람도 앉혀야 한다.

		// 내부적으로 배열을 사용한다. 내부에서 배열을 만들어 사용.
		// 실행할 때마다 배열을 새로 만들어서 옮겨주고 옮겨주고 사용한다.
		// 배열을 사용한 List이다 => 그래서 ArrayList이다.

		ArrayList nameList = new ArrayList();
		nameList.add("이순신");
		nameList.add("김유신");
		nameList.add("킹세종");
		System.out.println( nameList.size() );
		
		nameList.add("을지문덕");
		System.out.println( nameList.size() );
		
		System.out.println( "2 위치의 이름:" + nameList.get(2) );
		
		nameList.set(1, "박혁거세");
		output( nameList );
		
		nameList.remove(1); // 김유신
		output( nameList );
	}

	private static void output(ArrayList nameList) {
		for(int i = 0; i < nameList.size(); i++)
			System.out.print( i + " " + nameList.get(i) + " " );
		System.out.println();
	}

}
