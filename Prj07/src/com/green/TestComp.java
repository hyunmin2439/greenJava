package com.green;

import java.util.Scanner;

public class TestComp {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("a1 a2 비교");
		
		int a1 = 10;
		int a2 = 5 + 5;
		
		if(a1 == a2) // 값을 비교
			System.out.println("같다");
		else
			System.out.println("같지 않다");
		
		System.out.println("s1 s2 비교");
		
		String s1 = "쯔위";
		String s2 = "쯔위";
		
		if(s1 == s2) // 값 비교 X, 데이터 위치 비교
			System.out.println("같다");
		else
			System.out.println("같지 않다");
		
		System.out.println("s3 s4 비교");
		
		String s3 = "아이유";
		String s4;
		System.out.println("이름입력:");
		s4 = in.nextLine();
		
		if(s3 == s4) // 다르다
			System.out.println("같다");
		else
			System.out.println("같지 않다");
		
		if(s3.equals(s4)) // 문자열 비교, 같다
			System.out.println("같다");
		else
			System.out.println("같지 않다");
		
		if(s3.compareTo(s4) == 0) // 같다
			System.out.println("같다");
		else
			System.out.println("같지 않다");
		
		// CompareTo메서드는 정렬 또는 사전순 정렬 작업에 주로 사용
		// 두 문자열이 같은지 여부를 확인 하려면 Equals
		// ABC랑 ADC 비교 
		// => 문자를 하나하나 비교, B D에서 차이난다. -2 return, 두 문자열이 같다면 0
		// 문자열 비교 : "이순신".compareTo("이이"); // 자료순서 - 정렬
		//  > 0 
		// == 0 
		//  < 0
		
		System.out.println("s5 s6 비교");
		
		String s5 = new String("이순신"); // new 실행할 때 메모리를 잡는다.
		String s6 = new String("이순신"); // new를 했기 때문에 이미 있는지 없는지 관심없고 바로 새로 생성한다.
		
		if (s5 == s6) // 같지 않다
			System.out.println("같다");
		else
			System.out.println("같지 않다");
		
		if (s5.compareTo(s6) == 0) // 같다
			System.out.println("같다");
		else
			System.out.println("같지 않다");
	}
}
