package lotto;

import java.util.*;

// 로또
// 무작위로 번호(1 - 45) 랜덤으로 중복되지 않게

public class LottoMain {

	public static void main(String[] args) {
		Random r =  new Random();
		int number = r.nextInt(10) + 1; // parameter로 범위를 알려줄 수 있다.'
		System.out.println(number); // 1 ~ 10까지 출력
		
		// 중복이 문제가 된다. 
		// 중복을 걸러주기 위해서 해야하는 일이 많다.
		int[] lotto = new int[6];
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = r.nextInt(10) + 1;
		}
		System.out.println( Arrays.toString(lotto) );
		
		// Set은 중복을 허용하지 않는다.
		// Set은 넣은 순서를 보장해주지 않는다.
		Set<Integer> mySet = new HashSet<>();
//		System.out.println(mySet.add(10)); // true
//		System.out.println(mySet.add(10)); // false : 중복된 값을 집어넣고 출력하면 실패했기 때문에 false 출력
		
		
		// index가 없어서 하나씩 꺼내서 사용하는 method가 없다.
		// 때문에 iterator를 통해서 하나씩 꺼내서 출력
		Iterator<Integer> iterator = mySet.iterator();
		while(iterator.hasNext()) { 
			System.out.println(iterator.next());
		}
		for(Integer i : mySet) {
			System.out.println(i);
		}
		System.out.println( mySet.contains(8) ); // 8 원소를 가지고 있는지 없는지 체크 가능.
		
		
		while(mySet.size() < 6) {
			mySet.add( r.nextInt(45) + 1 );
		}
		System.out.println( mySet );
		
		
		// List로 구현
		List<Integer> list = new ArrayList<>();
		for(int i = 1; i <= 45; i++) {
			list.add(i);
		}
		Collections.shuffle(list);
		System.out.println(list.subList(0, 6));
	}

}
