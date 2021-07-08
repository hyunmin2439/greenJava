package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// Set은 수학의 집합을 의미한다.
		Set<Integer> set1 = new HashSet<>( Arrays.asList(1, 2, 3) );
		Set<Integer> set2 = new HashSet<>( Arrays.asList(3, 4, 5) );		
		
		Set<Integer> union = new HashSet<>();
		union.addAll(set1);
		union.addAll(set2);
		System.out.println("합집합: " + union);
		
		Set<Integer> duplicate = new HashSet<>(set1);
		duplicate.retainAll(set2); // 중복 되는 값만 찾아서 넣는다.
		System.out.println("교집합: " + duplicate); 
		
		Set<Integer> outersector = new HashSet<>(union);
		outersector.removeAll(duplicate); // 중복 제거 나머지만 찾음
		System.out.println("여집합: " + outersector); 
	}

}
