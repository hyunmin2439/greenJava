package com.green;

public class TestArray4 {

	public static void main(String[] args) {
		//					          국어,영어,수학,과학,역사
		int[] scores = new int[] {95, 86, 73, 60, 58};
		// 초기값을 바로 준다면 new int[] 생략 가능
		// int[] scores = {95, 86, 73, 60, 58};
		String[] subject = {"국어", "영어", "수학", "역사", "과학"};
		
		System.out.println("전체 점수:");
		for(String sub : subject) {
			System.out.print(sub + "  ");
		}
		System.out.println();
		
		for(int i = 0; i < scores.length; i++) {
			System.out.printf("%3d ", scores[i]);
		}
		System.out.println();
		
		// 총점
		int tot = 0;
		for(int i : scores) tot += i;
		// for(int i = 0; i < scores.length; i++) tot = tot + scores[i];
		System.out.println("총점:" + tot);
		
		// 평균
		double avg = 0;
		avg = (double)tot / scores.length;
		System.out.println("평점:" + avg);
		
		// 평점
		char[] grade = {
		//   0    1    2    3    4    5    6    7    8    9   10
			'F', 'F', 'F', 'F', 'F', 'F', 'D', 'C', 'B', 'A', 'A'
		};
		System.out.println("평점:" + grade[(int)avg / 10]);
		
		// 80점 이상 점수의 위치 : 과목을 출력
		System.out.println("80점 이상인 과목:");
		for (int i = 0; i < scores.length; i++) {
			if(scores[i] >= 80) 
				System.out.print(i + ":" +subject[i] + " ");
		}
		System.out.println();
	}
}
