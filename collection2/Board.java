package com.green.collection2;

// DB : Record, C : Structure와 같은 개념
// Java : Structure가 없음 Class를 Structure처럼 이용
// C# : Structure(데이터만), Class(데이터 + 기능)

public class Board {
	// fields
	int 	num;
	String 	title;
	String	content;
	
	// Constructor
	// 기본생성자 - 자바는 기본생성자가 없으면 컴파일시 자동으로 추가해준다.
	public Board() {
		
	}

	public Board(int num, String title, String content) {
		this.num 	 = num;
		this.title 	 = title;
		this.content = content;
	}

	@Override
	public String toString() {
		return "Board [num=" + num + 
				", title=" + title + 
				", content=" + content + "]";
	}
	
}
