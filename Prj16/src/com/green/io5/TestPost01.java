package com.green.io5;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class TestPost01 {
//	ZIPCODE 우편번호		 	7
//	SIDO 	특별시,광역시,도 	4
//	GUGUN 	시,군,구 			17
//	DONG 	읍,면,동,리,건물명	52
//	BUNJI 	번지,아파트동,호수 	17
//	SEQ 	데이터 순서 		5
//	우편번호 데이터 수 52,144
	
	public static void main(String[] args) {
		String 			filename1 	= "c:\\imsi\\zipcode.csv";
		String 			filename2 	= "c:\\imsi\\zipcodeOutput.txt";
		FileReader 		fr = null; // 여기에 변수를 선언하는 이유는 try 안에서 선언되면
		FileWriter 		fw = null; // finally에서 close를 할 수 없기 때문에 밖에 선언한다.
		BufferedReader 	br = null;
		BufferedWriter 	bw = null;
		
		try {	
			fr 	= new FileReader( filename1 );
			fw 	= new FileWriter( filename2 );
			br 	= new BufferedReader(fr);
			bw 	= new BufferedWriter(fw);
			
			String line = "";
			int totCnt = 0;
			int lotteCnt = 0;
			int bujun2Cnt = 0; // pro1
			int busanLotte = 0; // pro2
			int busanZipCnt = 0; // pro3
			Map<String, Integer> pro4 = new HashMap<>(); // pro4
			
			br.readLine(); // 제목줄 skip : 제목줄에 SEQ라는 문자를 숫자를 바꾸려고 하니 에러가 생긴다.
			
			while( (line = br.readLine()) != null ) {
				String[] li = line.trim().split(",");
				String zipcode 	= li[0].trim();
				String sido		= li[1].trim();
				String gugun	= li[2].trim();
				String dong  	= li[3].trim();
				String bunji  	= li[4].trim();
				int    seq   	= Integer.parseInt(li[5].trim());
				
				totCnt++;
				
				// 전국의 "롯데 백화점"의 개수
				// 문자열 찾는 방법은 contains || indexOf
//				if( dong.contains("롯데백화점") ) {
//					//System.out.println(line);
//					System.out.printf( "[%s] %s %s %s %s %d\n", 
//							zipcode, sido, gugun, dong, bunji, seq );
//					lotteCnt++;
//				}
//				
//				if( dong.indexOf("롯데백화점") > -1 )
//					lotteCnt++;
				
//				// a로 시작한다면
//				if( dong.startsWith("a") ) { }
//				// b로 끝이 난다면
//				if( dong.endsWith("롯데백화점") ) { }
				
				
//				 // 1. 부전 2동 우편번호 출력
//				if( dong.contains("부전2동") ) {
//					System.out.println( zipcode );
//					bujun2Cnt++;
//				}
				
//				// 2. 부산 롯데백화점 개수
//				if( dong.contains("롯데백화점") && sido.contains("부산")) {
//					System.out.println(sido + " " + dong);
//					busanLotte++;
//				}
//				if( dong.contains("롯데백화점") && sido.equals("부산") ) { }
				// 서울시 / 서울특별시도 아닌 "서울"로 나와있다.
				// -> 이러한 값들을 서울로 정제하는 것을 데이터 mining(정제)
				// 전부 서울 / 부산 / 충남 이렇게 두글자로 정제되어 있기 때문에
				// indexOf || contains 보다는 equals가 더 낫다.
				
//				// 3. 부산의 우편번호 개수
//				if( sido.equals("부산") ) {
//					busanZipCnt++;
//				}
				
				// 4. 전국 시도명과 개수
				if( pro4.containsKey(sido) ) { // 있으면 값 + 1
					pro4.put(sido, pro4.get(sido) + 1);					
				}
				else { // 없으면 넣어주기
					pro4.put(sido, 1);
				}
				
				
			} // while end
			
//			System.out.println("총 데이터 수:" + totCnt + "    롯데백화점 수:" + lotteCnt); // pro0
//			System.out.println("부전2동 개수 :" + bujun2Cnt); // pro1
//			System.out.println("부산 롯데백화점 개수:" + busanLotte); // pro2
//			System.out.println("부산 우편번호 개수:" + busanZipCnt); // pro3
			
			// pro4
			// entrySet() 이용 출력
			for(Map.Entry<String, Integer> entry : pro4.entrySet()) {
				System.out.println(entry.getKey() + ":" + entry.getValue() + "개");
			}
			
//			// keySet() 이용 출력
//			for(String key : pro4.keySet()) {
//				int value = pro4.get(key);
//				System.out.println(key + ":" + value + "개");
//			}
			
			
		} catch (Exception e) { // 실행하다가 발생한 에러 => 예외
			e.printStackTrace();
			System.out.println( "문제발생: 관리자에게 문의하세요" + e.getMessage() );
		} finally { // 정상, 에러든 무조건 실행
			try {
				br.close();
				bw.close();
				fr.close(); // 읽는 파일은 안닫아도 크게 문제가 안생기지만
				fw.close(); // 쓰는 파일은 안닫을 경우 저장이 끝까지 안되는 상황이 생긴다.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
