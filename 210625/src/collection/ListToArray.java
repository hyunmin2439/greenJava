package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		// ArrayList 배열로 변환하기
//		int[] arr = new int[list.size()];
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = list.get(i);
//		}
		
		// http://asuraiv.blogspot.com/2015/06/java-list-toarray.html 참고
		// 길이값 보통 0 으로 선언하고 만든다. => list가 4이기 때문에 4 사이즈의 배열 만듬
		Integer[] arr = list.toArray(new Integer[0]); // 배열로 변환하는 것.
		Integer[] arr2 = list.toArray(new Integer[5]); // 배열로 변환하는 것.
		
		System.out.print(Arrays.toString(arr));
		System.out.println( " " + arr.length ); // 4로 만들어진다.
		
		System.out.print(Arrays.toString(arr2));
		System.out.println( " " + arr2.length ); // 5로 만들어진다.
		
		
		
		///////////////////////////////////////////////////////////////////////////////////////////

		
		// https://woowacourse.github.io/javable/post/2020-05-18-ArrayList-vs-Arrays.asList/
		// https://kim-jong-hyun.tistory.com/31
		// 편하게 리스트를 만들 때 사용
		// 추가 삭제가 안되는 Arrays 길이가 고정된 list를 반환 해준다.
		List<Integer> mylist = Arrays.asList(1, 2, 3, 4, 5, 6); // List로 만들어준다.
		System.out.println(mylist);
		
		// 문제점 : 값을 변경하는 것은 가능하지만 추가, 삭제는 불가능하다.
		mylist.set(0, 100);
//		mylist.add(7); // java.lang.UnsupportedOperationException
//		mylist.remove(0); // java.lang.UnsupportedOperationException 
		System.out.println(mylist);
		
		List<Integer> mylist2 = new ArrayList<Integer>( Arrays.asList(1, 2, 3, 4, 5, 6) );
		// 새로운 ArrayList로 만들어 추가, 삭제가 가능해 진다.
		
		mylist2.addAll(Arrays.asList(100, 200, 300)); // 뒤에 값을 추가.
		System.out.println(mylist2); // [1, 2, 3, 4, 5, 6, 100, 200, 300]
		
		
		// 3, 4, 5라는 원소를 전부다 가지고 있느냐 물어보는 메서드
		System.out.println(mylist2.containsAll(Arrays.asList(3, 4, 5)));
		
		
		//////////////정렬//////////////
		List<Integer> mylist3 = new ArrayList<Integer>( Arrays.asList(6, 2, 4, 3, 5, 1) );
		Collections.sort(mylist3); // list를 넣을 수 있다. Integer 대소비교 가능. 
								   // 바로 Collections.sort에 넣어주면 알아서 정렬을 해준다.
		System.out.println(mylist3);
	}

}
