package com.green;

import java.util.Scanner;

// 상수 선언
// 상수는 대문자로 선언하는 것이 약속.
// 그냥 day = 3이라고 표현하면 어느날을 표시하는지 알수가 없다.
// 0 1 2 3 목요일을 뜻하는지 
//   1 2 3 수요일을 뜻하는지
// 그냥 날짜 3을 말하는지 알수가 없다.
// 그래서 아래와 같이 표현해야 한다.
// final static int WED = 3;
// int day = WED;

public class TestScores2 {
	
	// OBSOLETE - 현재 사용 가능하나 앞으로는 사용불가
	// DEPLICATE - 현재 사용불가
	
	// 상수( const ) 선언, const 현재 사용불가.
	// final 최종적인, 변화될 수 없는 변수. => 상수
	final static int N = 3; 
	
	static int	  [] num 	= new int	 [N];
	static String [] name 	= new String [N];
	static int    [] kor 	= new int	 [N];
	static int    [] eng 	= new int	 [N];
	static int    [] mat 	= new int	 [N];
	static int    [] tot 	= new int	 [N];
	static int    [] avg	= new int	 [N];
	static char   [] grade	= new char	 [N];

	public static void main(String[] args) {
		input();
		process();
		output();
	}

	private static void input() {
		Scanner in = new Scanner(System.in);
		System.out.println("번호,이름,국어,영어,수학");
		
		for(int i = 0; i < N; i++) {
			// buffer : 임시 저장공간에 담겨져 있다가 넘겨준다.
			String line = in.nextLine();
			String [] datas = line.split(",");
			num  [i] = Integer.parseInt( datas[0].trim() );
			name [i] = datas[1].trim();
			kor  [i] = Integer.parseInt( datas[2].trim() );
			eng  [i] = Integer.parseInt( datas[3].trim() );
			mat  [i] = Integer.parseInt( datas[4].trim() );
		}
	}

	private static void process() {
		char[] g = {'F', 'F', 'F', 'F', 'F', 'F', 'D', 'C', 'B', 'A', 'A'};
		
		for (int i = 0; i < N; i++) {
			tot[i]	 = kor[i] + eng[i] + mat[i];
			avg[i]	 = tot[i] / 3;
			grade[i] = g[ avg[i] / 10];
		}
		
	}

	private static void output() {
		System.out.println("번호 이름     국어 영어 수학 총점 평균 학점");
		
		for (int i = 0; i < N; i++) {
			System.out.printf("%3d  %-6s %4d %4d %4d %4d %4d %2c \n",
					num[i], name[i], kor[i], eng[i], mat[i], tot[i], avg[i], grade[i]);
		}
	}
}
