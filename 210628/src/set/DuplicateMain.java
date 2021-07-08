package set;
import java.util.*;

public class DuplicateMain {
	public static void main(String[] args) {
		// 1. 다음과 같은 리스트에서 중복이 제거된 Collection으로 만드시오.
		// 2. 중복된 원소값만을 가지는 Collection을 만드시오.
		// 결과 두개 => (가, 나, 다, 라, 마)  //  (가, 다)
		List<String> list = new ArrayList<>( 
				Arrays.asList("가", "가", "나", "다", "다", "라", "마") );
		
		//////////////////// 내가 한 방법 /////////////////////////////
		
		// 중복 제거 출력
		Set<String> set = new HashSet<>();
		List<String> overlap = new ArrayList<>();
		// set.addAll(list); // 리스트 전부 집어넣기 가능
		
		for(String s : list) {
			if( set.contains(s) ) overlap.add(s);
			else set.add(s);
		}
		System.out.println("중복 문자 출력 : " + overlap);
		System.out.println("중복 제거 출력 : " + set);
		
		//////////////////// 강사님이 하신 방법 ///////////////////////
		
		Set<String> distinct = new HashSet<>();
		Set<String> duplicate = new HashSet<>(); // duplicate : 중복
		
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			if( !distinct.add(str) ) { // set add하면 true / false 값을 리턴
				duplicate.add(str);	   // 즉 삽입에 실패했다고 하면 다른 set에 넣기.
			}
		}
				
		System.out.println("중복 문자 출력 : " + duplicate);
		System.out.println("중복 제거 출력 : " + distinct);

	}
}
