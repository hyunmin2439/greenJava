package com.green;

public class ForTest2 {

	public static void main(String[] args) {
		
		// 1+2+3+4+5+6+7+8+9+10 =
		int sum1 = 0 ; 
		for(int i=1 ; i <= 10; i++) {
			sum1 = sum1 + i;
		}
		System.out.println(sum1);
		
		int sum2 = 1+2+3+4+5+6+7+8+9+10;
		// 13 + 11 + 37 + 33+ 16+ 128=
		System.out.println(sum2);
		
		int n = 10;
		int sum3 = n * (n + 1) / 2;
		System.out.println(sum3);
	}

}







