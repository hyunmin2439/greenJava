package com.green.collection;

import java.util.ArrayList;

public class ArrayListTest2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		// 아무거나 저장가능 - Object(제일 윗 조상 클래스) 
		// => 모든 클래스는 Object를 상속받아서 사용
		list.add("사과");
		list.add("배");
		list.add("바나나");
		list.add(true);
		list.add(37.8);
		list.add('A');

		display(list);
	}

	private static void display(ArrayList list) {
		for(int i = 0; i < list.size(); i++)
			System.out.println( i + ":" + list.get(i) );
		System.out.println();
	}

}
