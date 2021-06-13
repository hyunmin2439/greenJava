package com.green.io4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// 윈도우에서는 확장자가 중요하지만
// 윈도우 빼고 UNIX, LINUX 등에서는
// 프로그램자체가 실행 가능한 속성을 가지면 실행이 된다.
// 즉 확장자는 윈도우 빼고는 중요하지 않다. 파일 구조가 중요하다.
// 이클립스에 파일을 가져오면 텍스트가 출력이 된다.

public class TestFileAppend {

	public static void main(String[] args) throws IOException {
		File file = new File("c:\\imsi\\appenddata.khm");
		
		FileWriter fw = new FileWriter(file, true); // append    : true면 파일이 있으면 글자를 추가
													// OverWrite : false면 파일을 덮어쓴다. default false
													// filePoint를 end위치에 가져다 놓으면 true 
													// filePoint를 begin자리에 가져다놓으면 false
													// -> begin자리에 가져다 놓고 끝이라는 표시를 해주면 뒤에가 없는 것처럼 된다.
		fw.write("Hello123\n");
		
		fw.close();
	}

}
