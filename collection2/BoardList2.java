package com.green.collection2;

import java.util.ArrayList;
import java.util.Vector;

public class BoardList2 {

	public static void main(String[] args) {
		
		ArrayList<Board> boardList = new ArrayList<>();
		
		for(int i = 1; i <= 5; i++) {
			boardList.add( new Board(i, "제목" + i, "내용" + i) );
		}
		
		// LinkedList와는 달리 ArrayList는 for-each문 보다 전통적인 for문이 더 빠르다고 한다.
		for(int i = 0; i < boardList.size(); i++) {
			System.out.println( boardList.get(i) );
		}
		
		//----------------------------------------------------
		System.out.println("=================================");
		
		Vector<Board> boardVector = new Vector<>();
		
		for(int i = 1; i <= 5; i++) {
			boardVector.add( new Board(i, "제목" + i, "내용" + i) );
		}
		
		for(Board board : boardVector) {
			System.out.println( board );
		}
	}

}
