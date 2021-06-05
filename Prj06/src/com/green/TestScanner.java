package com.green;

import java.util.Scanner;

public class TestScanner {
	
	public static void main(String[] args) {
		
		int     num   =  0;
		String  name  =  "";  // "" 빈문자열 empty string
		// char  ch  = ' ';  // ' ' 빈문자:공백 문자
		int     kor=0, eng=0, mat=0;
				
		Scanner  in = new Scanner(System.in);
		
		System.out.println("번호,이름,국어,영어,수학");
		//  0 1      2   3  4 
		// "1,홍길동,100,90,80"
		String  inStr =  in.nextLine(); // enter 앞까지 data 를 입력
		
		// spiit(",") 문자열을 , 롤 잘라서 여러개의 변수(베얄)로 변환
		String[] values =  inStr.split(",");
		
//		values[0] = "1";
//		values[1] = "홍길동";
//		values[2] = "100";
//		values[3] = "90";
//		values[4] = "80";
		
		// double degree = Double.parseDouble("36.7");
		num  = Integer.parseInt( values[0].trim() ) ;
		name = values[1].trim();
		kor  = Integer.parseInt( values[2].trim() );
		eng  = Integer.parseInt( values[3].trim() );
		mat  = Integer.parseInt( values[4].trim() );
		
		System.out.printf("번호:%d 이름:%s 국어:%d 영어:%d 수학:%d\n", 
				num, name, kor, eng, mat);
		
		int tot = kor + eng + mat;
		int avg = (int) ((double) tot / 3.0 + 0.5); // 반올림된 점수
		// 반올림 : 3.6  + 0.5 -> (int) 4.1 -> 4
		//          3.3  + 0.5 -> (int) 3.8 -> 3
		
		char grade = ' ';
		switch(  avg / 10  ) {
		case 10: 	
		case 9: 	grade = 'A'; break;
		case 8: 	grade = 'B'; break;
		case 7: 	grade = 'C'; break;
		case 6: 	grade = 'D'; break;
		default :   grade = 'F'; break;
		}
		
		System.out.printf("총점:%d 평균:%d 학점:%c\n", tot, avg, grade);
		
		/*
		System.out.println("번호:");
		num   = in.nextInt();
		System.out.println("이름:");
		name  = in.next();
		System.out.println("국어:");
		kor   = in.nextInt();
		System.out.println("영어:");
		eng   = in.nextInt();
		System.out.println("수학:");
		mat   = in.nextInt();
		System.out.printf("번호:%d 이름:%s 국어:%d 영어:%d 수학:%d\n", 
				num, name, kor, eng, mat);
		*/
		
		
	
		
		
	}
	
}







