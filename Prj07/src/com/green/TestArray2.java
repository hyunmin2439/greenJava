package com.green;

public class TestArray2 {
	
	/*
	 * 자바의 2차원 배열은 배열 안에 배열을 넣은 형태
	 * 블랙핑크 : 지수 제니 로제 리사
	 * itzy	  :	예지 리아 류진 채령 유나
	 * 여자친구 : 소원 예린 은하 유주 신비 엄지
	 */
	
	public static void main(String[] args) {
		
		// String[][] girls = new String[3][6];
		String[][] girls = new String[][] {
			{"지수", "제니", "로제", "리사"}, 
			{"예지", "리아", "류진", "채령", "유나"},
			{"소원", "예린", "은하", "유주", "신비", "엄지"}
		};
		
		// 행 : row   열 : column
		// girls[1][2] : "류진"
		//           j
		// i 0 : 0(지수) 1(제니) 2(로제) 3(리사) 4(없음) 5(없음) - girls[0][4] : 에러
		// i 1 : 0(예지) 1(리아) 2(류진) 3(채령) 4(유나) 5(없음) 
		// i 2 : 0(소원) 1(예린) 2(은하) 3(유주) 4(신비) 5(엄지)
		// girls.length = 3
		// i
		// 0 girls[0].length = 4;
		// 1 girls[1].length = 5;
		// 2 girls[2].length = 6;
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 6; j++) {
				// ArrayIndexOutOfBoundsException: 4
				//System.out.print(girls[i][j] + " ");
			}
			//System.out.println();
		}
		
		for(int i = 0; i < girls.length; i++) {
			for(int j = 0; j < girls[i].length; j++) {
				System.out.print(girls[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("----------------------------");
		
		for(String[] rows : girls) {
			for(String cols : rows) {
				System.out.print(cols + " ");
			}
			System.out.println();
		}
	}

}
