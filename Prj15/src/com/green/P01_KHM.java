package com.green;

import java.util.Scanner;

public class P01_KHM {

	public static void main(String[] args) {
		int n = 0;
		boolean check = true;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("별 출력 개수를 입력해주세요.");
		
		while(check) {
			n = sc.nextInt();
			check = checkInput(n);
		}
		
		sc.close();
		printStar(n);
	}

	// n의 값 check method
	private static boolean checkInput(int n) {
		if( !( 2 <= n && n <= 9 ) ) {
			System.out.print("잘못된 입력입니다. ");
			
			if(n < 2) System.out.println("더 큰 수를 입력하세요.");
			if(n > 9) System.out.println("더 작은 수를 입력하세요.");
			
			return true;
		}
		else return false;
	}

	// 별 출력 method
	private static void printStar(int n) {
		String star = "";
		String result = "";
		
		for(int i = 0; i < n; i++) {
			star += "*";
			result += ( star + "\n" );
		}
		
		// 한번에 출력시 속도 더 빠름
		System.out.println(result); 
	}
}
