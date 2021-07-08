package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> myList = new ArrayList<>(Arrays.asList("나", "다", "가", "라", "마"));
		
		Collections.sort(myList);
		
		System.out.println("정렬후:" + myList);
		
		Collections.reverse(myList);
		System.out.println("뒤집은후:" + myList);
		
		Collections.shuffle(myList);
		System.out.println("섞은후:" + myList);
		
		System.out.println("최소값:" + Collections.min(myList));
		System.out.println("최대값:" + Collections.max(myList));
		
		Collections.swap(myList, 0, 4); // 위치 바꾸는 메서드
		System.out.println(myList);
		
		// binarySearch : 오름차순으로 정렬이 되어 있으면 원하는 원소값을 찾을 수 있다.
	}
}
