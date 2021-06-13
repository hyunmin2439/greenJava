package com.green.io2;

import java.io.*;

class Student {
	private int 	num;
	private String name;
	private int 	kor;
	private int 	eng;
	private int 	mat;
	private int 	tot;
	private int 	avg;
	
	public Student(String line) {
		String[] li = line.trim().split(",");
		this.num  = Integer.parseInt(li[0]);
		this.name = li[1];
		this.kor  = Integer.parseInt(li[2]);
		this.eng  = Integer.parseInt(li[3]);
		this.mat  = Integer.parseInt(li[4]);
		this.tot  = this.kor + this.eng + this.mat;
		this.avg  = this.tot / 3;
		
	}

	public String getResult() {
		String fmt = "%03d   %s   %3d   %3d   %3d   %3d   %3d\n";
		String result = String.format(fmt, 
				this.num, this.name, 
				this.kor, this.eng, this.mat, 
				this.tot, this.avg);
		return result;
	}	
}

public class TestTextWriter3 {

	public static void main(String[] args) throws IOException {
		// 절대경로 : absolute path
		String filename1 = "C:\\imsi\\sungjuk_in.txt";
		String filename2 = "C:\\imsi\\sungjuk_out2.txt";
		
		// current 폴더 
		// String path = TestTextWriter3.class.getResource("").getPath();
		//			       ClassName
		// String filename3 = "sungjuk_in.txt"; // 현재 경로 : 소스의 .class 파일
		// String filename4 = "sungjuk_out2.txt";
		
		// 실무적으로는 파일은 절대경로 방식을 사용한다.
		// 이유는 currnet 폴더 방식을 사용하면 보안상 이유 그리고 다른 이유들 때문에 잘 사용하지 않는다.
		
		// 혹시나 파일을 인식을 못하고 있으면 이클립스를 껐다가 새로 키면 된다.
		// 이유는 파일 오류나고 난 후, 수정을 했다고 해도 컴파일러가 수정한 것을 인식을 못하고
		// 옛날의 클래스를 계속 실행해서 그렇다.
		
		File file1 = new File( filename1 );
		File file2 = new File( filename2 );
		
		FileReader fr = new FileReader( file1 );
		FileWriter fw = new FileWriter( file2 );
		
		BufferedReader br = new BufferedReader( fr );
		BufferedWriter bw = new BufferedWriter( fw );
		
		bw.write("==================성적표======================\n");
		bw.write("번호  이름  국어  영어  수학  총점  평균\n");
		bw.write("==============================================\n");
		
		String line = "";
		int     cnt = 0;
		while( (line = br.readLine()) != null ) {
			Student s = new Student( line );
			bw.write( s.getResult() );
			cnt++;
		}
		
		System.out.println(cnt + "건의 정보가 저장완료 되었습니다.");
		
		br.close();
		bw.close();
		fr.close();
		fw.close();
	}
}
