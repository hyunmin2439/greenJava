package com.green;

import java.util.ArrayList;

public class TestArray1 {

	public static void main(String[] args) {
		// 동창리스트
		
		System.out.println("================배열================");
		
		String [] names = {"김좌진", "신채호", "안중근", "이봉창"};
		
		for (int i = 0; i < names.length; i++) {
			System.out.println( i + ":" + names[i] );
		}
		
		// 유관순 추가 하고 싶다.
		// 배열의 요소(Element) 만들면 추가 / 삭제 불가능
		
		// names[4] = "유관순";
		// -> ArrayIndexOutOfBound 추가 불가능
		
		System.out.println("================ArrayList================");
		
		// 실행할 때 크기를 변화 할 수 있는 자료구조
		ArrayList friends = new ArrayList(); // size : 0
		
		friends.add("김좌진"); // size : 1
		friends.add("신채호"); // size : 2
		friends.add("안중근"); // size : 3
		friends.add("이봉창"); // size : 4
		
		// friends.length가 없다. => 속성(attribute)
		// friends.size()를 써야한다. => 함수
		
		output(friends);
		
		System.out.println("================List추가================");
		
		friends.add("유관순"); // size : 5
		
		output(friends);
		
		System.out.println("================List삭제================");
		
		// ArrayList : 자동 위치 정리 vs 배열 : 그 위치의 자료를 삭제
		friends.remove(3);
		
		output(friends);
		
	}

	private static void output(ArrayList friends) {
		for (int i = 0; i < friends.size(); i++) {
			System.out.println( i + ":" + friends.get(i) );
		}
	}

}
