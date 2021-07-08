package Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest2 {

	public static void main(String[] args) {
		// Map을 사전이라고 부르기도 한다.
//		Map<String, String> dictionary = new HashMap<>();
//		dictionary.put("얼룩말", "털빛이 얼룩얼룩한 말");
//		dictionary.put("망아지", "말의 새끼");
//		
//		System.out.println( dictionary.get("얼룩말") );
//		System.out.println( dictionary.get("망아지") );
		
		
		Map<String, List<String>> dictionary = new HashMap<>();
		
		dictionary.put("배", Arrays.asList(
				"사람이나 동물의 몸에서 위장, 창자, 콩팥 따위의 내장이 들어 있는 곳으로 가슴과 엉덩이 사이의 부위", 
				"절족동물, 특히 곤충에서 머리와 가슴이 아닌 부분. 여러 마디로 되어 있으며 숨구멍, 항문 따위가 있다",
				"긴 물건 가운데의 볼록한 부분"));
		
		System.out.println(dictionary.get("배"));
	}

}
