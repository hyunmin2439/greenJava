package com.green.io4;

import java.io.FileInputStream;
import java.io.IOException;

public class ttstInputStream {

	// byte 단위로 처리해야 할 데이터 : .gif, .mp3, .mp4 같은 이진 파일들 처리
	// FileInputStream - byte 단위로 파일을 조작하겠다.
	public static void main(String[] args) throws IOException {
		String file1 = "c:\\imsi\\empdata.txt";
		FileInputStream fis = new FileInputStream( file1 );
		
		int ch;								  // byte 단위로 읽기 때문에 한글이 다 깨진다.
		while ( ( ch = fis.read() ) != -1 ) { // ff => -1 => EOF - End of File
			System.out.print( (char) ch );
		}
		
		fis.close();
	}

}
