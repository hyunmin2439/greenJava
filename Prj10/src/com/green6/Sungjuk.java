package com.green6;

import java.util.Scanner;

class Sungjuk {
//	public int num;
//	String name;
	
	// 변수를 private로 해놓으면 데이터가 왜곡될 가능성을 없앨 수 있다.
	
	private int 	num;
	private String 	name;
	private int 	kor;
	private int 	eng;
	private int 	mat;
	private int 	tot;
	private int 	avg;
	private char 	grade;
	
	void input() {
		Scanner		in 	 = new Scanner(System.in);
		
		System.out.println("번호,이름,국어,영어,수학");
		String 		line = in.nextLine();
		String []	data = line.split(",");
		
		num 			 = Integer.parseInt(data[0].trim());
		name 			 = data[1].trim();
		kor 			 = Integer.parseInt(data[2].trim());
		eng 			 = Integer.parseInt(data[3].trim());
		mat 			 = Integer.parseInt(data[4].trim());
	}
	
	void process() {
		// input(); // input이 private라도 같은 클래스이기 때문에 사용 가능하다.
		 
		getTot();
		getAvg();
	}
	
	// main에서 사용 불가능
	private void getTot() {
		tot = kor + eng + mat;
	}

	private void getAvg() {	
		avg = tot / 3;
	}

	void output() {
		System.out.println("번호  이름      국어 영어 수학 총점 평균");
		System.out.printf("%-4d %-6s %4d %4d %4d %4d %4d", 
						num, name, kor, eng, mat, tot, avg);
	}
}