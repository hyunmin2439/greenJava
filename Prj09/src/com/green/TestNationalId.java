package com.green;

import java.util.Scanner;

// 주민등록번호 Check Digit
// RRN : Resident Registration Number(주민등록번호)

/* 문자열 추출
String substring(int start) : 현재 문자열 객체 start위치부터 끝까지 문자열 발췌

String substrnig(int start, int end) : 현재 문자열 객체에서 start 부터 end 직전까지 문자열 발췌

Char charAt(int location) : 현재 문자열 객체에서 해당위치의 문자값 1개를 발췌. 반환값은 char형

int indexOf(int ch) : 현재 문자열 객체에서 ch문자가 첫번째로 발견된 위치를 반환,없으면 -1반환

int indexOf(String str) : 현재 문자열 객체에서 str를 찾아서 존재하면 첫째문자 위치를 반환하고 없으면 -1반환
*/

public class TestNationalId {
	
	// 강사님 버전
	public static void NationalIdCheck() {
		String nationalId = "123456-7890123";

		String[] nids = nationalId.split("-");
		// nids[0] : "123456"
		// nids[1] : "7890123"으로 자른다.

		int[] m1 = { 2, 3, 4, 5, 6, 7 };
		int[] m2 = { 8, 9, 2, 3, 4, 5 };

		int[] n1 = new int[6];
		int[] n2 = new int[7];

		// substring( 시작(0), 끝(1)1-1 ); 012345
		// "123456"

		for (int i = 0; i < n1.length; i++) {
			n1[i] = Integer.parseInt(nids[0].substring(i, i + 1));
		}

		for (int i = 0; i < n2.length; i++) {
			n2[i] = Integer.parseInt(nids[1].substring(i, i + 1));
		}

		int tot = 0;

		for (int i = 0; i < m1.length; i++) {
			tot += m1[i] * n1[i];
			tot += m2[i] * n2[i];
		}

		int result = (11 - tot % 11) % 10;

		if (result == n2[6])
			System.out.println("맞는 주민등록번호 입니다.");
		else
			System.out.println("틀린 주민등록번호 입니다.");
	}
	
	// 내가 만든 것.
	public static boolean checkRRN2( String nationalId ) {
		int tot = 0;
		int idNum, lastNum, result;
		String gender = "여자";
		int[] checkNum = { 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5 };
		
		// 가져오면서 바로 계산
		for(int i = 0; i < checkNum.length; i++) {
			
			// AscII 49 : 1 그래서 -48
			// '-'의 Index위치 6 : '-'를 건너 뛰고 가져오기 위해 +1
			
			if( i <= 5 ) idNum = nationalId.charAt(i) - 48; 
			else idNum = nationalId.charAt(i + 1) - 48;
			
			if( i == 6 && idNum % 2 == 1) gender = "남자";
			
			tot += idNum * checkNum[i];
			
			System.out.println("idNum:" + idNum + "   tot:" + tot);
		}
		
		// 마지막 숫자 가져오기
		lastNum = nationalId.charAt(nationalId.length() - 1) - 48;
		
		result = (11 - tot % 11) % 10;
		
		System.out.println("lastNum:" + lastNum + "   result:" + result);
		
		System.out.println("성별은 " + gender + "입니다");
		
		if(result == lastNum) 
			return true;
		else 
			return false;
	}

	public static void main(String[] args) {
		String nationalId;
		Scanner in = new Scanner(System.in);
		
		System.out.println("주민등록번호 입력(123456-7890123);");
		nationalId = in.nextLine();
		
		// 맞는 문자열인지 정규표현식을 작성해야함
		
		if( checkRRN2(nationalId) )
			System.out.println("맞는 주민등록번호 입니다.");
		else
			System.out.println("틀린 주민등록번호 입니다.");	
	}

}
