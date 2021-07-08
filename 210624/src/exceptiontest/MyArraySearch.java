package exceptiontest;

import java.util.NoSuchElementException;

//class 클래스 extends 부모클래스
//class 클래스 extends 추상클래스
//class 클래스 extends 부모클래스 implements 인터페이스, 인터페이스2, 인터페이스3
//interface 인터페이스 extends 부모인터페이스

public class MyArraySearch {
	public static int indexOf(int[] array, int element) {
		if(array == null) {
			throw new NullPointerException("배열이 null 참조입니다.");
		} else if (array.length == 0) {
			throw new IllegalArgumentException("배열의 길이가 0입니다.");
		}
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] == element) {
				return i;
			}
		}
		throw new NoSuchElementException("해당하는 원소값이 없습니다.");
		// 들어가보면 생성자 달랑 하나 있고 RuntimeException을 상속 받고 있다.
		// 단지 예외가 발생했다고 표시하기 위해서 사용하는 것이다.
	}
	
	public static void main(String[] args) {
		int[] arr = { 5, 2, 3, 4, 1 };
		
//		Scanner sc = new Scanner(System.in);
		
//		System.out.println(indexOf(arr, 3));
//		System.out.println(indexOf(arr, 7));
//		System.out.println(indexOf(null, 5));
//		System.out.println(indexOf(new int[0], 3));
		
		
		Object o = new Object();
		Integer i = (Integer)o;
		
	}

}
