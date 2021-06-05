package com.green;

import java.util.Date;
import java.util.Scanner;

public class TestInput1 {
	// 입력 num, name, email, hiredate,  deptno
	// 출력 num, name, email, hireYears, deptName, position
	static String	num;
	static String	name;
	static String 	email;
	static int 		hiredate;
	static int 		deptno;
	
	static int		hireYears;
	static String 	deptName;
	static String 	position;
	
	public static void main(String[] args) {
		input();
		process();
		output();

	}

	private static void input() {
		Scanner in = new Scanner(System.in);
		System.out.println("입력\n사번,이름,이메일,입사일,부서번호:");
		String line = in.nextLine();
		
		String[] data = line.split(",");
		
		num 	 = data[0].trim();
		name 	 = data[1].trim();
		email 	 = data[2].trim();
		hiredate = Integer.parseInt( data[3].trim() );
		deptno 	 = Integer.parseInt( data[4].trim() );
		
	}
	
	// obsolete   : 현재는 사용가능 향후 사용불가
	// deprecated :   옛날 버전으로 현재 사용불가
	// java 컴파일러는 버전 다운 기능이 있다. 
	// 그래서 1.8 버전만 깔려있어도 1.6버전으로 낮춰서 돌릴 수 있다.
	
	private static void process() {
		Date today = new Date();
		int thisYear = today.getYear() + 1900; // ---- deprecated : 옛날 것이다. 쓰지마라.
		//System.out.println("올해 : "+ thisYear);
		
		// 근속연수 = 현재년도 - 입사일
		hireYears = thisYear - hiredate / 10_000;
		// 부서명 <- 부서번호
		String	[] dName = {
				"인사", "총무", "자재", "연구개발", "생산"
		};
		
		int idx = 0;
		switch(deptno) {
		case 10: idx = 0; break;
		case 20: idx = 1; break;
		case 30: idx = 2; break;
		case 40: idx = 3; break;
		case 50: idx = 4; break;
		}
		
		deptName = dName[ idx ];
		
		// 직급명 <- 직급
		if		( hireYears > 20 ) position = "고문"; // 21 ~
		else if ( hireYears > 15 ) position = "이사"; // 16 ~ 20
		else if ( hireYears > 10 ) position = "부장"; // 11 ~ 15
		else if ( hireYears >  5 ) position = "과장"; //  6 ~ 10
		else if ( hireYears >  2 ) position = "대리"; //  3 ~  5
		else 					   position = "사원"; //  0 ~  2
	}
	
	private static void output() {
		System.out.println(
				"출력\n사번   이름        이메일          근속연수    부서명    직급");
		
		System.out.printf("%-5s %-5s %-20s %4d %9s %6s\n", num, name, email, hireYears, deptName, position);
		
	}

}
