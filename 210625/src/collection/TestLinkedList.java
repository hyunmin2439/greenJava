package collection;

import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {

	public static void main(String[] args) {
		List<String> linked = new LinkedList<>(); 
		linked.add("a");
		linked.add("b");
		linked.add("c");
		linked.add("d");
		
		System.out.println(linked);
		System.out.println(linked.get(0));
		System.out.println(linked.size());
		
		// LinkedList는 ArrayList와 기능적으로 다른게 없다.
		// 하지만 구조상 추가, 삭제 빈번하다면 LinkedList가 더 빠르다.
		// 반면 순서대로 읽어오는 것은 더 느리다.
		
	}

}
