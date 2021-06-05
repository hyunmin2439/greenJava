package com.green;

import java.util.Scanner;

public class TestInput2 {
	// 입력 num, name, email, hiredate, deptno
	// 출력 num, name, email, hireYears, deptName, position 

	static final int MAX = 13;

	static String [] num 		= new String [MAX];
	static String [] name 		= new String [MAX];
	static String [] email 		= new String [MAX];
	static String [] hiredate 	= new String [MAX];
	static int	  [] deptno 	= new int	 [MAX];
	
	static int	  [] hireYears 	= new int 	 [MAX];
	static String [] deptName 	= new String [MAX];
	static String [] position 	= new String [MAX];
	
	static String [] dName 		= { "인사", "총무", "자재", "연구개발", "생산" };
	static int	  [] empCount	= new int [5]; // 부서수 만큼
	// static 전역변수는 기본적으로 자동 초기화 
	// 숫자 : 0		문자열|객체 : null
	
	public static void main(String[] args) {
		input();
		process();
		output();
	}
	
	private static void input() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("입력 : 번호, 이름, 이메일, 입사일, 부서번호");
		for(int i = 0; i < MAX; i++) {
			String line = in.nextLine();
			String [] data = line.split(",");
			
			num		[i] = data[0].trim();
			name	[i] = data[1].trim();
			email	[i] = data[2].trim();
			hiredate[i] = data[3].trim();
			deptno	[i] = Integer.parseInt(data[4].trim());
		} 
	}
	private static void process() {
		for(int i = 0; i < MAX; i++) {
			getHireYears( i );	
			getDeptName( i );
			getPosition( i );
		}
	}

	private static void getHireYears(int i) {
		int thisYear = 2021;
		// 01234567
		// 19930501
		
		int hYear = Integer.parseInt( hiredate[ i ].substring(0, 3 + 1) );
		hireYears[i] = thisYear - hYear;
	}
	private static void getDeptName( int i ) {
		switch( deptno[i] ) {
		case 10 : deptName[i] = dName[0]; empCount[0]++; break;
		case 20 : deptName[i] = dName[1]; empCount[1]++; break;
		case 30 : deptName[i] = dName[2]; empCount[2]++; break;
		case 40 : deptName[i] = dName[3]; empCount[3]++; break;
		case 50 : deptName[i] = dName[4]; empCount[4]++; break;
		}
	}
	private static void getPosition( int i ) {
		// 잘못된 입력 데이터를 걷어내려고 하면 논리 위치를 잘잡아야 한다.
		if		( hireYears[i] < 0 )   position[i] = "잘못된 입력";
		else if	( hireYears[i] < 2 )   position[i] = "사원"; // 0 ~ 1
		else if	( hireYears[i] <= 5 )  position[i] = "대리"; // 2 ~ 5
		else if	( hireYears[i] <= 10 ) position[i] = "과장"; // 6 ~ 10
		else if	( hireYears[i] <= 15 ) position[i] = "부장"; // 11 ~ 15
		else if	( hireYears[i] <= 20 ) position[i] = "이사"; // 16 ~ 20
		else if	( hireYears[i] > 20 )  position[i] = "고문"; // 21 ~
		
		// else						   position[i] = "잘못된 입력"; 
		// 한번도 실행될 가능성이 없는 문장, 에러 잡지 못함
	}
	
	private static void output() {
		// 출력 num, name, email, hireYears, deptName, position 
		System.out.println("\n번호    이름        이메일             근속연수     부서명    직급");
		
		for (int i = 0; i < MAX; i++) {
			System.out.printf("%-5s %-10s %-20s %4d %8s %6s\n", 
					num[i], name[i], email[i], hireYears[i], deptName[i], position[i] );
		}
		
		empCount();
	}

	private static void empCount() {
		int tot = 0;
		System.out.println("부서별 인원수");
		
		for(int i = 0; i < dName.length; i++) {
			System.out.printf( "%-6s %4d 명\n", dName[i], empCount[i] );
			tot += empCount[i];
		}
		System.out.println("총계    " + tot + " 명");
//		deptName[i] empCount[i]
//		인사	 2명
//		총무 	 2명
//		자재 	 2명
//		연구개발 2명
//		생산 	 2명
//		총계	 10명
	}
	
}