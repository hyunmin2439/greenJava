package com.green.io2;

import java.io.*;

// 클래스로

public class TestTextWriter4_1 {

	public static void main(String[] args) throws IOException {
		// 할인액 : 단가 * 0.1
		//   금액 : 단가 * 수량
		// 실금액 : 금액 - 할인액
		
		// 입력 : 번호, 제품명, 수량, 단가
		// 			 1, 새우깡,   10, 1200
		// 출력 : 번호, 제품명, 수량, 단가, 총금액, 할인액, 실제금액
		// 출력시 소수이하 2자리로 반올림하여 출력하시오.
		String 			path =  TestTextWriter4.class.getResource("").getPath();
		// D:/greenjava/Prj16/bin/com/green/io2/
		System.out.println(path);
		String 			fn1  =  path + "indata2.txt";
		String 			fn2  =  path + "outdata2.txt";
		FileReader 		fr 	 =  new FileReader( fn1 );
		FileWriter 		fw 	 =  new FileWriter( fn2 );
		
		BufferedReader 	br 	 =  new BufferedReader( fr );
		BufferedWriter 	bw 	 =  new BufferedWriter( fw );
		
		String  line  = "";
		int		cnt   = 0;

		// 파일 끝까지 반복으로 읽는다.
		// 제목줄을 skip
		br.readLine(); // 제묵줄을 읽어서 변수에 담지 않음.
		while( (line = br.readLine() ) != null ) {
			String [] li = line.trim().split(",");
			int 	num 	 = Integer.parseInt( li[0].trim() );
			String 	prodName = li[1].trim();
			double	quantity = Double.parseDouble( li[2] );
			double	price 	 = Double.parseDouble( li[3] );
			
			// 계산
			double	totPrice = quantity * price;
			double	discount = price * 0.1; // 10% 할인
			double  amount	 = totPrice - discount;
			
			// 글꼴이 다르면 아무리 칸을 맞춰도 안맞춰진다.
			// 번호, 제품명, 수량, 단가, 금액, 할인액, 실금액
			String fmt = "%d %s %.2f %.2f %.2f %.2f %.2f\n";
			
			String msg = String.format(fmt, 
					num, prodName, quantity, price, totPrice, discount, amount);
			
			System.out.println(msg);
			bw.write(msg);
			
			cnt++;
		}
		System.out.println(cnt + "건 출력");
		
		br.close();
		bw.close();
		fr.close();
		fw.close();
	}


}