package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveElementInLoop {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Melon");
		fruits.add("Banana");
		fruits.add("Strawberry");

////////////////////////////////////일반 for문///////////////////////////////////////////
		
//		for(int i = 0; i < fruits.size(); i++) {
//			if( fruits.get(i).length() <= 5 ) { // 5글자 이하면 삭제
//				fruits.remove(i);
//			}
//		}
//		System.out.println(fruits); // [Melon, Banana, Strawberry]
//		// 실제로 결과는 Apple만 지워졌다.
//		  0       1       2         3
//		[Apple, Melon, Banana, Strawberry]  i = 0
//		  0       1          2  
//		[Melon, Banana, Strawberry]         i = 1 지나침
//		
//		// 편법 : 1
//		for(int i = fruits.size() - 1; i > -1; i--) {
//			if( fruits.get(i).length() <= 5 ) { // 5글자 이하면 삭제
//				fruits.remove(i);
//			}
//		}
//		System.out.println(fruits); // [Banana, Strawberry] : 다 지워짐.
//		
//		
//		// 편법 : 2
//		for (int i = 0; i < fruits.size(); i++) {
//			if (fruits.get(i).length() <= 5) { // 5글자 이하면 삭제
//				fruits.remove(i);
//				i--;
//			}
//		}
//		System.out.println(fruits); // [Banana, Strawberry] : 다 지워짐.
//		List는 일부러 순서를 만들어서 저장해놓은 것이다. 
//		그래서 일의 흐름상 역순으로 하는 것도 가능하지만 역순으로 불가능할 때도 있다.
		
////////////////////////////////////for-each문///////////////////////////////////////////
		
		
//		// forEach문은 안의 내용을 보기만 할 때 사용할 수 있다.
//		for(String fruit : fruits) {
//			if(fruit.length() <= 5) {
//				fruit.remove(fruit); // 불가
//			}
//		}
//		
//		// for each문을 사용할 경우 fruits가 변경 불가능한 상태가 되서 아래것도 안된다.
//		for(String fruit : fruits) {
//			if(fruit.length() <= 5) {
//				fruits.remove(new String(fruit));
//			}
//		}
//		System.out.println(fruits);
		
		
////////////////////////////////////Iterator///////////////////////////////////////////
		
		// 안전하게 삭제
		Iterator<String> iterator = fruits.iterator();
		while (iterator.hasNext()) { // 다음 것 있냐?
			String fruit = iterator.next(); // 가져와라
			if (fruit.length() <= 5) {
				iterator.remove();
			}
		}
		System.out.println(fruits);
		
//		Iterator 사용이유
//		collection들은 한번씩 순환하고 싶을 때 사용하면 된다.
//		List index가 있기 때문에 번호로 접근 볼 수 있다.
//		Set같은 것들은 index가 없다. 살펴볼 때는 iterator를 사용할 수 밖에 없다.
//		삭제할 때도 안전하게 삭제할 수 있기 때문에 사용한다.
		
	} // main end
} // class end
