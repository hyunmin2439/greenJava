package com.green.collection;

import java.util.ArrayList;

public class ListTest {

	public static void main(String[] args) {
		// <ClassType만 가능>
		// ArrayList<int> scoreList = new ArrayList<int>(); // error int 라서
		// T는 반드시 클래스 타입이어야 한다. 즉 Reference Type이어야 한다.
		
		// Wrapper class : value Type -> Reference Type으로 표시
		// int 	   -> Integer
		// char    -> Character
		// short   -> Short
		// long    -> Long
		// float   -> Float
		// double  -> Double
		// boolean -> Boolean
		
		ArrayList<Integer> scoreList = new ArrayList<Integer>();
		// ArrayList<Integer> scoreList = new ArrayList<>(); 
		// 뒷자리 <T> 생략가능 - jdk 1.7 부터 가능.
		
		scoreList.add( 70 );
		scoreList.add( 80 );
		scoreList.add( 70 );
		scoreList.add( 100 );
		
		for(Integer val : scoreList)
			System.out.println(val);
		
	}

}
