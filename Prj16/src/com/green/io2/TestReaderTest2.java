package com.green.io2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestReaderTest2 {

	public static void main(String[] args) throws IOException {
		String  filename1  =  "c:\\imsi\\sungjuk_in.txt";
		String  filename2  =  "c:\\imsi\\sungjuk_out.txt";
		
		File 	   inFile  =  new File(filename1);
		File 	  outFile  =  new File(filename2);
		
		FileReader 	   fr  =  new FileReader(inFile); // FileNotFound가 중요
		BufferedReader br  =  new BufferedReader( fr );
		FileWriter 	   fw  =  new FileWriter(outFile); // IO가 중요
		BufferedWriter bw  =  new BufferedWriter( fw );
		
		if( !inFile.exists() ) { // inFile부터 검사를 하고 내려가야 함.
			System.out.println("파일이 존재하지 않습니다.");
			return;		// System.exit(-1);  -1 : error, 0 : 문제없이 종료
			// 메인에서는 return문으로도 종료시킬 수 있다.
		}
		
		int		cnt =  0;
		String line = "";
		
		bw.write("==================성적표======================\n");
		bw.write("번호  이름  국어  영어  수학  총점  평균\n");
		bw.write("==============================================\n");
		
		while( ( line = br.readLine() ) != null ) {
			String result = process( line );
			bw.write( result );
			cnt++;
		}
		
		System.out.println(cnt + "건의 정보가 저장완료 되었습니다.");
		
		br.close();
		bw.close();
		fr.close();
		fw.close();
	}

	private static String process(String line) {
		
		String[] li = line.trim().split(",");
		int 	num = Integer.parseInt( li[0].trim() );
		String name = li[1].trim();
		int 	kor = Integer.parseInt( li[2].trim() );
		int 	eng = Integer.parseInt( li[3].trim() );
		int 	mat = Integer.parseInt( li[4].trim() );
		int		tot = kor + eng + mat;
		int		avg = tot / 3;
		
		String fmt = "%03d   %s   %3d   %3d   %3d   %3d   %3d\n";
		String msg = String.format(fmt, 
				num, name, kor, eng, mat, tot, avg);
		
		return msg;
	}

}
