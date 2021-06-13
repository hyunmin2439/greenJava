package com.green.io1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TextWriter {

	// 모든 IO를 사용하려면 error를 방지하기 위해 예외처리를 해줘야 한다.
	public static void main(String[] args) throws IOException {
		// 새로운 파일 생성
		// 경로는 반드시 \\로 표시
		String 	filename = "c:\\imsi\\new1.txt"; // c드라이브 관리자 권한 필요, 폴더가 없으면 오류
		File 	outFile  = new File( filename ); // 대상파일 지정
		
		FileWriter fw1 = new FileWriter( outFile );
		
		// 저장할 이름 배열 준비
		String[] names = {
			"아이유", "소향", "BTS", "J.Fra", "블랙핑크", "싸이"
		};
		
		//fw1.write("아이유"); // 아이유만 쓰고 파일정보를 보면 9Byte, 한글 한자 3Byte
		
		String 	msg = "";
		int 	cnt = 0;
		for(int i = 0; i < names.length; i++) {
			msg = String.format("%d %s\n", i, names[i]);
			fw1.write( msg );
			cnt++;
		}
		
		fw1.close();
		System.out.println(cnt + "건을 저장을 완료하였습니다.");
	}

}
