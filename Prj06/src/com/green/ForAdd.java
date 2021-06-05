package com.green;

public class ForAdd {
	
	// 1 + 2 + 3 + 4 + 5 =
	public static void test1 (int n) {
		int sum = 0, sum2 = 0;
		
		// 반복문
		for(int i = 1; i <= n; i++) sum += i;
		
		// 간단
		sum2 = n * (n + 1) / 2;
		
		// 출력
		for(int i = 1; i < n; i++) 
			System.out.print(i + " + ");
		System.out.println(n + " =");
		
		System.out.printf("반복문 : %d   간단 : %d\n\n", sum, sum2);
	}
	
	
	// 2 + 4 + 6 + 8 + 10 =
	public static void test2 (int n) {
		int sum = 0, sum2 = 0;
		
		// 반복문
		for(int i = 1; i <= n; i++) sum += i * 2;
		
		// 간단
		sum2 = n * (2 * n + 2) / 2;
		
		// 출력
		for(int i = 1; i < n; i++) 
			System.out.print(2 * i + " + ");
		System.out.println(n * 2 + " =");
		
		System.out.printf("반복문 : %d   간단 : %d\n\n", sum, sum2);
	}
	
	
	// 1 + 2 + 4 + 8 + 16 =
	public static void test3 (int n) {
		int sum = 0, sum2 = 0;
		
		// 반복문
		for(int i = 1; i <= n; i++) sum += (int)Math.pow(2, i - 1);
		
		// 간단
		sum2 = (int)Math.pow(2, n) - 1;
		
		// 출력
		for(int i = 1; i < n; i++) 
			System.out.print((int)Math.pow(2, i - 1) + " + ");
		System.out.println((int)Math.pow(2, n - 1) + " =");
		
		System.out.printf("반복문 : %d   간단 : %d\n\n", sum, sum2);
	}
	
	
	// 1       2            3               4                   5  
	// 1 + / 1 + 2 +  / 1 + 2 + 3 + / 1 + 2 + 3 + 4 + / 1 + 2 + 3 + 4 + 5
	public static void test4 (int n) {
		int sum = 0, sum2 = 0;
		
		// 이중 반복문
		for(int i = 1; i <= n; i++) {
			for(int j  = 1; j <= i; j++) {
				sum += j;
			}
		}
		
		// 반복문
		int d = 0;
		for(int i = 1; i <= n; i++) sum2 += d += i;
		
		// 출력
		for(int i = 1; i <= n; i++) {
			for(int j  = 1; j <= i && j != n; j++) {
				System.out.print(j + " + ");
			}
		}
		
		System.out.println(5 + " =");
		
		
		System.out.printf("이중 반복문 : %d   반복문 : %d\n\n", sum, sum2);
	}
	
	
	// 피보나치 수열
	// 1 + 2 + 3 + 5 + 8 + 13 + 21 + ... 30번째
	public static void test5 (int n) {
		int f1 = 0, f2 = 1, f3 = 0, sum = 0;
		
		for(int i = 1; i <= n; i++) {
			f3 = f1 + f2;
			
			if(i != n) System.out.print(f3 + " + ");
			
			sum += f3;
			f1 = f2; 
			f2 = f3;
		}
				
		System.out.println(f3 + " =");
		
		System.out.printf("정답 : %,d \n\n", sum);
	}
	
	public static void main(String[] args) {	
		test1(5);
		test2(5);
		test3(5);
		test4(5);
		test5(30);
	}

}
