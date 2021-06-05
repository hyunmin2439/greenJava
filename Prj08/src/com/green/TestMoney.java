package com.green;

import java.util.Scanner;

public class TestMoney {

	public static void main(String[] args) {
		
		// int    []  prdNum   = { 1, 2, 3  };
		String []  products = {
			"커피", "녹차", "카카오", "인삼차"
		};
		int    []  prices   = { 
			2300,  1800,   2250,  3500  
		};   
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("제품 목록");
		System.out.println(
			"1.커피(2300)  2.녹차(1800) 3.카카오(2250), 4.인삼차");
		
		System.out.println("선택(1,2,3,4):");		
		int  choice  =  in.nextInt();
		
		System.out.println("입금:");
		int  money   =  in.nextInt();
				
		System.out.println(
			products[ choice - 1 ] + "(" 
		    + prices[ choice - 1 ] + ") 를 선택하였습니다.");
		 
		// 잔돈 
		int  change  =  money - prices[ choice - 1 ];
		 System.out.println( "잔돈: " + change );
		 
		 if( change < 0 ) {
			 System.out.println("입금액이 모자랍니다");
			 System.exit(01);// return -1;
		 }
		 
		 int []  curr = {10000,5000,1000,500,100,50,10,5,1};
		 int []  mok  = {    0,   0,   0,  0,  0, 0, 0,0,0};
		 
		 int  na  = change; 
		 for (int i = 0; i < mok.length; i++) {
			 mok[ i ] = na / curr[ i ];
			 na       = na % curr[ i ];
		 }
		 
		 for (int i = 0; i < mok.length; i++) {
			System.out.printf("%7d  %4d\n", curr[i], mok[i]);
		}

	}

}
