package com.green.collection2;

import java.util.ArrayList;

public class BoardList {

	public static void main(String[] args) {
		ArrayList<Board> boardList = new ArrayList<>();
		
		Board brd1 = new Board();
		brd1.num 	 = 1;
		brd1.title	 = "제목1";
		brd1.content = "내용1";
		boardList.add( brd1 );
		
		// System.out.println( brd1 );
		// System.out.println( brd1.toString() ); 
		// 원래라면 아래처럼 출력
		// com.green.collection2.Board@15db9742
		
		// @Override public String toString() { ~ }; 하고 나서
		System.out.println( brd1 );
		//System.out.println( brd1.toString() );
		
		// 인자를 받는 생성자를 사용
		Board brd2 = new Board(2, "제목2", "내용2");
		System.out.println( brd2 );
	}

}
