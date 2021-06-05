package com.green;

import java.util.Scanner;

public class IfTest2 {
	public static void main(String [] args) {
		// 입력 국어, 영어, 수학 
		// 출력 총점, 평균, 학점
		
		Scanner in = new Scanner(System.in);
		System.out.println("입력:국어 영어 수학(ex 100 100 100)");
		
		int   kor, eng, mat;
		kor = in.nextInt();
		eng = in.nextInt();
		mat = in.nextInt();
	
		System.out.printf("국어:%d 영어:%d, 수학: %d\n", kor, eng, mat);
		
		int tot = kor + eng + mat;
		int avg = tot / 3;
		
		System.out.printf("총점:%d 평균:%d\n", tot, avg);
		
		if( kor >= 60 )
			System.out.println("국어 Pass");
		else
			System.out.println("국어 Fail");
		if( eng >= 60 )
			System.out.println("영어 Pass");
		else
			System.out.println("영어 Fail");
		if( mat >= 60 )
			System.out.println("수학 Pass");
		else
			System.out.println("수학 Fail");
		
		// 학점 : 평균  90 <= age <= 100
		//  90~100 : A  
		//  80~89  : B  
		//  70~79  : C  
		//  68~69  : D  
		//  0~5S9  : F  
		 
		char grade = ' ' ;
		// if( (90 <= avg) <= 100 ) // error
		if( 90 <= avg && avg <= 100  ) grade = 'A';
		else 
			if( 80 <= avg && avg <= 89  )  grade = 'B';
			else
				if( 70 <= avg && avg <= 79  )  grade = 'C';
				else
					if( 50 <= avg && avg <= 69  )  grade = 'D';
					else
						if( 0 <= avg && avg <= 59  )  grade = 'F';
		System.out.println("학점:" + grade);
						                        
				
		
		
		
	}
}








