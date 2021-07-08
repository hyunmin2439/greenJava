package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest3 {

	public static void main(String[] args) {
		// 다음 문자열의 각 문자 개수를 확인해보세요.
		String line = "Hello. I`m a Developer.";
		
		Map<Character, Integer> myMap = new LinkedHashMap<>();

		for(int i = 0; i < line.length(); i++) {
			char key = line.charAt(i);
			if( !myMap.containsKey(key) ) { myMap.put(key, 1); } 
			else { myMap.put(key, myMap.get(key) + 1); }
		}
		
		System.out.println(myMap);
		
		
		System.out.println("---------------------------------------------------------------------");
		
		
		Map<Character, Integer> alphaMap = new LinkedHashMap<>();
		
		for(char c = 'A'; c <= 'Z'; c++) {
			alphaMap.put(c, 0);
		}
		
		String tmpline = line.toUpperCase(); // 대소문자 구분 없이 하기 위해
		for(int i = 0; i < tmpline.length(); i++) {
			char key = tmpline.charAt(i);
			if( alphaMap.containsKey(key) )
				alphaMap.put(key, alphaMap.get(key) + 1);
		}
		
		System.out.println(alphaMap);
	}

}
