package Map;

import java.util.HashMap;
import java.util.Map;

public class MapTest4 {
	public static void main(String[] args) {
		Map<Integer, String> myMap = new HashMap<>();
		myMap.put(1, "a");
		myMap.put(2, "b");
		myMap.put(3, "c");
		
		System.out.println("비었는가? " + myMap.isEmpty());
		System.out.println("사이즈: " + myMap.size());
		System.out.println("제거된 원소: " + myMap.remove(2));
	}
}
