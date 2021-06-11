package com.green.collection;

import java.util.LinkedList;
import java.util.Vector;

public class VectorTest {
	
	// Vector는 ArrayList의 thread safe 버전
	// thread : 네트워크 채팅, 그래픽(GUI) Swing 같은 것에서 사용.

	public static void main(String[] args) {
		Vector<String> names = new Vector<>();
		
		names.add("토르");
		names.add("아이언맨");
		names.add("헐크");
		names.add("스파이더맨");
		
		for (int i = 0; i < names.size(); i++) {
			System.out.println( names.get(i) );
		}
		
		LinkedList<Integer> llist = new LinkedList<>();
		llist.add(10);
		llist.add(30);
		llist.add(40);
		llist.add(20);
		
		for(Integer i : llist) {
			System.out.println(i);
		}
	}
}
