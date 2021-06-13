package com.green.io1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * test sample data
 1, aaa, 59, 47, 99
 2, bbb, 35, 75, 22
 3, ccc, 99, 89, 66
 4, ddd, 77, 76, 89
 5, eee, 97, 46, 65
 */

public class TextWriter2 {

	public static void main(String[] args) throws IOException {
		int cnt = 0;
		String 		filename = "c:\\imsi\\new2.txt"; // c드라이브 관리자 권한 필요, 폴더가 없으면 오류
		File 		file1  	 = new File( filename ); // 대상파일 지정
		FileWriter 	fw1 	 = new FileWriter( file1 );
		BufferedWriter bw1 = new BufferedWriter( fw1 ); // 저장속도를 빠르게 하는 객체
		// buffer(메모리) 저장 해두었다가, 나중에 한꺼번에 출력하면 속도가 훨씬 빨라짐
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("번호, 이름, 국어, 영어, 수학");
		System.out.println("종료:exit");
		
		while( true ) {
			String line = in.nextLine();
			
			if( line.equalsIgnoreCase("exit") ) 
				break; // 무한루프 탈출조건
			
			writeData(bw1, line);
			cnt++;
		}
		
		in.close();
		bw1.close();
		fw1.close(); // fw1을 안 닫으니 데이터가 안날라간다.
					 // 아마 fw1를 닫으면서 데이터를 저장하는데, 
					 // 안닫으면 계속 켜져 있는 상태라서 데이터가 저장이 안됨.
		// bw1, fw1 순서를 바꾸면 오류가 난다. java.io.IOException: Stream closed
		// 파일에 쓰지도 않았는데, 버퍼를 닫으니 당연히 오류가 난다.
		System.out.println(cnt + "건 저장완료");
	}

	// throws는 method에 붙는다.
	private static void writeData(BufferedWriter bw1, String line) throws IOException {
		
		String[] li  = line.split(",");
		int 	num  = Integer.parseInt( li[0].trim() );
		String 	name = li[1].trim();
		int 	kor  = Integer.parseInt( li[2].trim() );
		int 	eng  = Integer.parseInt( li[3].trim() );
		int 	mat  = Integer.parseInt( li[4].trim() );
		int 	tot  = kor + eng + mat;
		int		avg  = tot / 3;
		
		String fmt = "%4d %6s  %3d %3d %3d %3d\n";
		String msg = String.format(fmt, 
				num, name, kor, eng, mat, tot, avg);
		
		bw1.write( msg );
	}

}
