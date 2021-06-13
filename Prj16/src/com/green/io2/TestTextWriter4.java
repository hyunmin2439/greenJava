package com.green.io2;

import java.io.*;

// 클래스로

class Snack {
	// field
	private int		num; 	  // 번호
	private String 	name; 	  // 제품명
	private int  	count; 	  // 수량
	private int 	price; 	  // 단가
	private int		totPrice; // 총금액
	private int		amount;   // 실제 금액
	
	public Snack(int num, String name, int count, int price, int totPrice, int amount) {
		super();
		this.num = num;
		this.name = name;
		this.count = count;
		this.price = price;
		this.totPrice = totPrice;
		this.amount = amount;
	}

	// 출력 : 번호, 제품명, 수량, 단가, 총금액, 할인액, 실제금액
	@Override
	public String toString() {
		String fmt = "%02d  %5s  %4d  %,8d  %,9d  %,9d  %,9d\n";
		
		return String.format(fmt, num, name, count, price, totPrice, totPrice - amount, amount);
				
	}
}

public class TestTextWriter4 {

	public static void main(String[] args) throws IOException {
		// 할인액 : 단가 * 0.1
		//   금액 : 단가 * 수량
		// 실금액 : 금액 - 할인액
		
		// 입력 : 번호, 제품명, 수량, 단가
		// 			 1, 새우깡,   10, 1200
		// 출력 : 번호, 제품명, 수량, 단가, 총금액, 할인액, 실제금액
		String 			path =  TestTextWriter4.class.getResource("").getPath();
		String 			fn1  =  path + "indata.txt";
		String 			fn2  =  path + "outdata.txt";
		FileReader 		fr 	 =  new FileReader( fn1 );
		FileWriter 		fw 	 =  new FileWriter( fn2 );
		
		BufferedReader 	br 	 =  new BufferedReader( fr );
		BufferedWriter 	bw 	 =  new BufferedWriter( fw );
		
		Snack   snack;
		String  line  = "";
		int		cnt   = 0;
		
		bw.write("====================================================================\n");
		bw.write("번호  제품명   수량     단가      금액      할인액    실제금액\n");
		bw.write("====================================================================\n");
		
		// 파일 끝까지 반복적으로 읽는다.
		while( (line = br.readLine() ) != null ) {
			snack = creatSnack( line );
			bw.write( snack.toString() );
			cnt++;
		}
		System.out.println(cnt + "건 출력");
		
		br.close();
		bw.close();
		fr.close();
		fw.close();
	}

	private static Snack creatSnack(String line) {
		String[] li  = line.trim().split(",");
		
		int 	num 	 = Integer.parseInt( li[0].trim() );
		String	name  	 = li[1].trim();
		int 	count 	 = Integer.parseInt( li[2].trim() );
		int 	price 	 = Integer.parseInt( li[3].trim() );
		int 	totPrice = count * price;
		int 	amount 	 = (int)(totPrice * 0.9);
		
		return new Snack(num, name, count, price, totPrice, amount);
	}

}
