package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListMain {

	public static void main(String[] args) {
		//List l = new List(); // 추상 메서드를 가진 인터페이스는 생성할 수 없다.
		
		List l = new ArrayList();
		
		l.add("Apple");
		l.add(100);
		l.add(5.5);
		
		System.out.println(l.size());
		
		//Integer o1 = (Integer) l.get(0); // 오류, 다양한 형태로 들어갔기 때문에
							  // Object 형태로 들어간다. 
							  // 때문에 Down Casting 필요
							  // 하지만 잘못된 Type으로 Down Casting을 해버리면
							  // java.lang.ClassCastException 예외가 발생한다.
		Object o2 = l.get(1); // 그래서 Object로 받아야 하고 이러한 문제를 방지하기 위해
							  // Generic을 사용 한다.
		
		l.size(); // 크기
		
		////////////////////////////////////////////////////////////////////////////////////
		
		
		List<String> fruits = new ArrayList<>(); // 뒤의 Generic은 생략이 가능하다.
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Strawberry");
		
		String a = fruits.get(0);
		// fruits.add(500); // 다른 Type을 집어넣지 못함.
		
		
		for(int i = 0; i < fruits.size(); i++) {
			System.out.println(fruits.get(i));
		}
		
		for(String fruit : fruits) {
			System.out.println(fruit);
		}
		
		// 자주 나오고 사용하기 때문에 익혀둘 것.
		Iterator<String> iterator = fruits.iterator();
		while( iterator.hasNext() ) { // 다음 것 있냐?
			String fruit = iterator.next(); // 가져와라
			System.out.println(fruit);
		}
		
		
		/////////////////////////////////////////////////////////////////////////////////////////
		
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(100);
		numbers.add(50);
		numbers.add(0, 0); // (index, value) 원하는 index에 value를 넣어달라
		
		System.out.println(numbers); // [0, 100, 50]
		
		numbers.set(2, 999); // (index, element) 해당하는 index에 value를 선언해주세요.
		
		System.out.println(numbers); // [0, 100, 999]
		
		System.out.println(numbers.isEmpty()); // 비어있냐라고 물어보는 것 : false
		System.out.println(numbers.contains(100)); // 같은 객체(값)가 있냐? : true

		//numbers.remove(0); // 해당 index에 위치한 value 제거
		// System.out.println( numbers.remove(0) ); // 지우는 동시에 가져온다.
		Integer i = numbers.remove(0); // 0번째 index 지우면서 i에 담을 수 있다.
		numbers.remove(new Integer(777)); // 객체를 던져줄 수 있다. 
										  // 해당하는 객체랑 똑같은 것을 지워줄 수 있다.
										  // 객체 지울때는 객체에 equals가 있어야 됨.
										  // ★★★ 클래스 객체를 지울 때 유용할 듯 ★★★
										  // - 사용할때 그 클래스에 equals()가 구현되어 있어야 사용 가능
		System.out.println( numbers.remove(new Integer(777)) ); // 지우면서 바로 출력가능
		
		System.out.println(numbers); // [100, 999]
		
		numbers.clear(); // 비우는것 => 빈 리스트로 만드는 것.
		System.out.println(numbers.isEmpty()); // true
		System.out.println(numbers.contains(100)); // false
		System.out.println(numbers); // []
		
		
		
		
	}

}
