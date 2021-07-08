package Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest5 {

	public static void main(String[] args) {
		// LinkedHashMap은 삽입한 순서가 유지가 된다.
		Map<String, Integer> linked = new LinkedHashMap<>();
		linked.put("1", 1);
		linked.put("a", 1);
		linked.put("가", 1);
		linked.put("one", 1);
		
		System.out.println(linked);
		
		// TreeMap은 크기 대소비교를 해서 Key 값을 기준으로 정렬을 해둔다.
		Map<Integer, Integer> tree = new TreeMap<>();
		tree.put(5, 50000);
		tree.put(4, 40000);
		tree.put(1, 50000);
		tree.put(2, 20000);
		tree.put(3, 30000);
		
		System.out.println(tree);
	}

}
