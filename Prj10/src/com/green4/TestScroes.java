package com.green4;

import java.util.Scanner;

// com.green4 ~ 

// TestScores --(use)--> Sungjuk
class Sungjuk {
	int num;
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	int avg;
	char grade;	
	
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
		tot = kor + eng + mat;
		avg = tot / 3;
	}
	
	void output() {
		System.out.println("번호  이름      국어 영어 수학 총점 평균");
		System.out.printf("%-4d %-6s %4d %4d %4d %4d %4d", 
						num, name, kor, eng, mat, tot, avg);
	}
}

public class TestScroes {

	public static void main(String[] args) {
		// static 방식보다 new 방식을 대부분 많이 쓴다.
		Sungjuk s1 = new Sungjuk();
		
		// 두가지 방법으로 사용 가능.
		s1.input();
		s1.process();
		s1.output();
		
//		method에 static을 붙이면 아래와 같이 사용가능.
//		static은 특수한 경우에만 쓴다. 
//		ex) main은 new할 수 없으니 static을 붙여서 쓴다. 
//		실제 코딩 중 보통 5% 내외만 쓴다.
//		Sungjuk.input();
//		Sungjuk.process();
//		Sungjuk.output();
	}

}
