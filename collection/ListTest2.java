package com.green.collection;

import java.util.Arrays;
import java.util.List;

public class ListTest2 {

	public static void main(String[] args) {
		String [] arrStr = { "홍길동", "이순신", "김유신", "박문수"};
		// String [] -> arrayLists : 이런 상황이 굉장히 많이 생긴다.
		
		// ArrayList는 List를 상속 받는다.
		// <<interface>>List : 인터페이스도 부모가 될 수가 있다.
		
		// List의 추가적인 설명
		// https://multifrontgarden.tistory.com/130
		
		List<String> list1 = Arrays.asList( arrStr );
		
		for(String name : list1) {
			System.out.println( name );
		}
		
		// list1.add("세종");
		// error : java.lang.UnsupportedOperationException
		// asList로 만들어진 것은 동적 리스트가 아님
		// Arrays.asList 로 생성한 리스트는 고정되어 있어 원소를 추가, 제거할 수 없다.
		// 사이즈를 안바꾼다는 전제 하에 asList를 사용 가능
		
		List<Integer> list2 = Arrays.asList(1, 7, 5, 6, 3);
		
		for (Integer val : list2) {
			System.out.println(val);
		}
		
	}

}
