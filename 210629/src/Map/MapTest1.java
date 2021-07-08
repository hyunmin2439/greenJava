package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapTest1 {

	public static void main(String[] args) {
		Map<String, Integer> myMap = new HashMap<>();
		
		myMap.put("하나", 1);
		myMap.put("둘", 2);
		myMap.put("셋", 3);
		
		myMap.put("one", 1);
		
		System.out.println(myMap); // 삽입된 순서를 보장해주지 않는다.
		
		myMap.put("하나", 111); // put key값이 없으면 삽입
								// key값이 있으면 value값 수정
								// key 중복 X, key들끼리는 set으로 구성되어 있다.
		
		System.out.println(myMap.get("하나")); // get(Key) => value
		
		System.out.println("--------Iterator--------");
		
		Iterator<String> iterator = myMap.keySet().iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			System.out.print("key: " + key);
			System.out.println(" / value: " + myMap.get(key));
		}
		
		System.out.println("--------forEach--------");
		// keySet : key의 값들은 전부 set으로 모여있다.
		for (String key : myMap.keySet()) {
			System.out.println(key + " = " + myMap.get(key));
		}
		
		System.out.println("--------entrySet--------");
		// entrySet : key value 같이 가지고 있는 것.
		for(Entry<String, Integer> entry : myMap.entrySet()) {
			System.out.println( entry.getKey() + " : " + entry.getValue() );
		}
	}

}
