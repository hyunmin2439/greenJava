package com.green;

import java.util.Scanner;

public class IfTest1 {

	public static void main(String[] args) {
		// 양수   a > 0
		// 0      a == 0
		// 음수   a < 0
		
		// 숫자를 외부(키보드)에서 입력받는다
		// 외부라이브러리 사용방법
		//java.util.Scanner  in = new java.util.Scanner(System.in);
		Scanner in = new Scanner(System.in);
		System.out.println("숫자를 입력(ex:100, -32");
		
		int num ;
		num  =  in.nextInt();
		System.out.println("입력받은 숫자는" + num + "입니다");
		
		if(num > 0) {
			System.out.println("양수입니다");			
		} else {
			if( num == 0) {
				System.out.println("0입니다");
			} else {
				if( num < 0 )
					System.out.println("음수입니다");
			}
		}
		// 비추
		if( num > 0 ) 
			 System.out.println("양수입니다");
		if( num == 0 )
			System.out.println("0입니다");
		if( num < 0 )
			System.out.println("음수입니다");
		
		

	}

}









