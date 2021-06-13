package com.green.io2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestReaderTest {
	// add throws를 할 때는 입출력(프린터, 모니터, 키보드, USB 등 정전, 
	// 또는 오류로 인해 중지될 때 문제가 일어남.), 변환(인코딩을 바꾸는 등)
	
	// FileReader가 에러날 때 add throws를 하니 FileNotFoundException가 뜨는데 
	// br1.close에 add throws를 하면 IOException으로 바뀐다.
	// 이유는 FileNotFoundException의 부모가 IOException이기 때문
	
	public static void main(String[] args) throws IOException {
		String 			filename 	= "C:\\imsi\\in_name.txt";
		File 			inFile 		= new File(filename);
		
		if( !inFile.exists() ) { // inFile부터 검사를 하고 내려가야 함.
			System.out.println("파일이 존재하지 않습니다.");
			return;		// System.exit(-1);  -1 : error, 0 : 문제없이 종료
			// 메인에서는 return문으로도 종료시킬 수 있다.
		}

		// FileNotFoundException : 파일을 찾을 수 없음.
		// 파일을 만들어야 함.
		FileReader 		fr1 		= new FileReader(inFile); 
		BufferedReader 	br1 		= new BufferedReader(fr1);
		
		
		String 			filename2	= "C:\\imsi\\out_name.txt";
		// FileWriter는 파일이 있으면 덮어쓴다.
		// 파일이 없으면 바로 만들어준다.
		FileWriter		fw1 		= new FileWriter( filename2, true );  // , 다음에 true : append  /  false : 파일 새로 덮어씀;
		BufferedWriter  bw1			= new BufferedWriter( fw1 );
		
		// fr1.readLine(); // FileReader는 readLine이 없다. 
		// 문자열로 받아들이는 것이 없다. read는 char[]로 받아들이기 때문에 문자열로 바꿔야하는 번거로움이 있다.
		
		int 	cnt = 0;
		String line = "";
		// 바이트스트림의 경우는 EOF를 쓴다. 파일의 끝은 -1
		while( ( line = br1.readLine() ) != null ) { // 파일 끝까지 읽는 동안 반복
			cnt++;
			String fmt = "%05d. %s 님 하이\n";
			String msg = String.format(fmt, cnt, line);
			bw1.write(msg);
		}
		System.out.println(cnt + "건저장완료");
		
		// 사용자가 원할 때 버퍼를 비워주는 것으로 버퍼를 비우는 것은 IO에서는 출력하는 것 이겠고, 
		// 네트워크에서는 버퍼의 내용을 클라이언트나 서버로 보내는 것이겠지. 여기서 사용자가 원할 때라는 말이 포인트인 것 같다.

		// flush()를 검색하다보니 같이 나오는 메소드가 바로 close()
		// flush()와 close()를 같이 쓰는데, 
		// 사실 close() 함수가 내부적으로 flush함수를 호출한다.
		// flush()에 대한 추가 정보 : https://vaert.tistory.com/160
		
		br1.close();
		bw1.close();
		
		fr1.close();		
		fw1.close();
		
	}

}
