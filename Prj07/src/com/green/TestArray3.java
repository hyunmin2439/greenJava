package com.green;

public class TestArray3 {

	// 3차원
	// 보이그룹 + 걸그룹 = 아이돌
	public static void main(String[] args) {
		String[][][] idols = new String[][][] { 
			{ 
				{"1", "2", "3", "4", "5"}, 
				{"6", "7", "8", "9", "10"},
				{"11", "12", "13", "14", "15", "16"}
			}, // 보이그룹
			{ 
				{"지수", "제니", "로제", "리사"}, 
				{"예지", "리아", "류진", "채령", "유나"},
				{"소원", "예린", "은하", "유주", "신비", "엄지"}
			} // 걸그룹
		};
		
		int sw = 0;
		for(int i = 0; i < idols.length; i++) {
			
			if(sw == 0) System.out.println("----------남자 그룹----------");
			else System.out.println("----------여자 그룹----------");
			
			for(int j = 0; j < idols[i].length; j++) {
				for(int k = 0; k < idols[i][j].length; k++) {
					System.out.print(idols[i][j][k] + " ");
				}
				System.out.println();
			}
			sw++;
		}
	
		System.out.println("\n----------------------------\n");
		
		sw = 0;
		for(String[][] idol : idols) {
			if(sw == 0) System.out.println("----------남자 그룹----------");
			else System.out.println("----------여자 그룹----------");
			
			for(String[] group : idol) {
				
				for(String name : group) {
					System.out.print(name + " ");
				}
				System.out.println();
			}
			sw++;
		}
	}

}
