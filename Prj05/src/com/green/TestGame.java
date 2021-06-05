package com.green;

import java.util.Random;
import java.util.Scanner;

public class TestGame {
	
	public static void main(String [] args) {
		/*
	    가위 : 0  바위 : 1  보: 2         
		상대방     내       결과   
		가위  0   가위  0   비김
		          바위  1   이김
		          보    2   짐	
		바위  1   가위  0   짐
	              바위  1   비김
	              보    2   이김	
		보    2   가위  0   이김
	              바위  1   짐
	              보    2   비김
	    */
		
		Scanner  in  = new Scanner(System.in);
			
		String result = "";
		// A 유저 컴퓨터
		System.out.println("유저A 의 선택(0:가위 1:바위 2:보");
		//int  inA  =  in.nextInt();
		
		Random  rnd = new Random();
		int     r   = rnd.nextInt();
		//System.out.println(r);
		int   inA   = Math.abs( rnd.nextInt() ) % 3; // 0 ~ 2
		
		// int   inA   = (int) (Math.random() * 3); // 0,1,2
		
		// B 유저 : 나
		System.out.println("유저B(나) 의 선택(0:가위 1:바위 2:보");
		int  inB  = in.nextInt() ;
		
		if(inB >= 3) {
			System.out.println("잘못입력하셧습니다\n프로그래믕ㄹ 종료합니다");
			System.exit(-1); // 프로그램 강제 종료
		}
		
		if(inA == 0) {
			if( inB == 0 ) result  = "비김";
			if( inB == 1 ) result  = "이김";
			if( inB == 2 ) result  = "짐";
		}
		
		if(inA == 1) {
			if( inB == 0 ) result  = "짐";
			else if( inB == 1 ) result  = "비김";
			else if( inB == 2 ) result  = "이김";
		}
		
		if(inA == 2) {
//			if( inB == 0 ) result  = "이김";
//			else if( inB == 1 ) result  = "짐";
//			else if( inB == 2 ) result  = "비김";
			switch( inB ) {
			case 0: result  = "이김"; break;
			case 1: result  = "짐"; break;
			case 2: result  = "비김"; break;
			}			
		}
			
		System.out.println(result);
	}
	
}














