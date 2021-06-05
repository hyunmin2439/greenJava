package com.green.collection4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		// JSON(JavaScript Object Notation)에서 굉장히 중요하게 사용된다.
		// json은 속성-값 쌍( attribute–value pairs and array data types (or any other serializable value)) 
		// 또는 "키-값 쌍"으로 이루어진 데이터 오브젝트
		// ex) "rules": { "a1": [false, "p", "a", "s"], "a2":[ , , , ] ... }
		
		//       key  ,  value
		HashMap<String, Integer> map = new HashMap<>();
		// HashMap<Integer, String> map2 = new HashMap<>(); key는 숫자도 가능
		
		// 쯔위	  아이유	사나	모모
		// 100      90       80      95
		
		//       key    value
		map.put("쯔위", 100);
		map.put("아이유", 90);
		map.put("사나", 80);
		map.put("모모", 95);
		
		System.out.println( "아이유의 점수:" + map.get("아이유") ); // 90
		map.put("아이유", 95); 				   // 값을 수정하는 것.
		System.out.println( "아이유의 점수:" + map.get("아이유") ); // 100
		
		int score = map.get("아이유") + 5;
		System.out.println( "아이유의 점수:" + score ); // 100
		
		
		// 출력방법 1
		// 객체를 하나씩 처리 : KeySet
		// key만 잘라서 들고옴 (Set으로 들고 온다.)
		
		// keySet
		// 쯔위	  아이유	사나	모모
		
		System.out.println("==============출력방법 1==============");
		
		Set<String> 		keySet 	= map.keySet();
		Iterator<String> 	iter 	= keySet.iterator();
		while( iter.hasNext() ) {
			String 	key 	= iter.next();
			Integer value 	= map.get(key);
			
			System.out.println( key + ":" + value);
		}
		
		// 출력방법 2 : 어려워서 추천 안하고 싶은 방법, 이러한 방법이 있다는 것만 이해
		// 객체를 한꺼번에 처리 : entrySet
		
		// 전체가 Map.Entry
		// 쯔위	  아이유	사나	모모
		// 100      90       80      95
		
		System.out.println("==============출력방법 2==============");
		
		// < T(class) <  Key ,  Value > >
		Set< Map.Entry<String, Integer> > entrySet = map.entrySet(); // Map 전체를 한꺼번에 들고옴
		Iterator< Map.Entry<String, Integer> > entryIter = entrySet.iterator(); // 방향키라고 생각.
		
		while( entryIter.hasNext() ) {
			Map.Entry< String, Integer > entry 	= entryIter.next();
			
			String						 key	= entry.getKey();
			Integer						 value	= entry.getValue();
			
			System.out.println( key + ":" + value );
		}

	}

}
