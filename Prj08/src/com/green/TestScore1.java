package com.green;

import java.util.Scanner;

// 강사님 것을 받아서 원래대로 되돌려 놓기

public class TestScore1 {
	// 번호 이름 국어 영어 수학
	// Field 변수 - 전역변수
	// static은 글자가 italic체로 나온다.
	static int    num;
	static String name;
	static int    kor, eng, mat;
	static int    tot, avg;
	static char   grade;
	
	// 메소드
	public static void input() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("번호,이름,국어,영어,수학:");
		
		String line = in.nextLine();
		String [] datas = line.split(",");
		
		num   =  Integer.parseInt( datas[0] );
		name  =  datas[1];
		kor   =  Integer.parseInt( datas[2] );
		eng   =  Integer.parseInt( datas[3] );
		mat   =  Integer.parseInt( datas[4] );	
	}
	
	public static void process() {
		char[] g = {'F', 'F', 'F', 'F', 'F', 'F', 'D', 'C', 'B', 'A', 'A'};
		
		// String.trim() : 앞뒤 공백 제거
		
		// 가운데 공백도 제거 자세한 사용법은 구글링
		// String.replace(char, char)
		// String.replaceAll(String, String)
		// String.replaceFirst(String, String)
		
		tot = kor + eng + mat;
		avg = tot / 3;
		grade = g[avg / 10];
	}
	
	public static void output() {
		System.out.println("번호 이름     국어 영어 수학 총점 평균 학점");
		System.out.printf("%3d %-6s %4d %4d %4d %4d %4d %2c \n",
				num, name, kor, eng, mat, tot, avg, grade);
	}
	
	// 메인
	public static void main(String[] args) {
		input();
		process();
		output();
	}

}
