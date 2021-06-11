package com.green5;

import java.util.Scanner;

public class Sungjuk {
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