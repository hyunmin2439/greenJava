package com.green;

class InkJetPrinter {
	void print() {
		System.out.println("InkJetPrinter로 출력합니다.");
	}
}

class LaserPrinter {
	void print() {
		System.out.println("레이저프린터로 출력합니다.");
	}
}

class PhotoPrinter {
	void print() {
		System.out.println("사진을 뽑습니다.");
	}
}

public class TestInterface {

	public static void main(String[] args) {
		  InkJetPrinter ijp = new InkJetPrinter();
		  ijp.print();
		  
		  LaserPrinter lsp = new LaserPrinter();
		  lsp.print();
		  
		  PhotoPrinter ptp = new PhotoPrinter();
		  ptp.print();
		  
		  System.out.println("=============================");
		  
		  write( ijp );
		  write( lsp );
		  write( ptp );
		  
		  System.out.println("=============================");
		  
		  write( lsp, 5);
	}

	// 컴파일러가 함수를 비교할 때 함수의 signature를 비교한다고 한다.
	// 인자(parameter)의 수나 타입이 다르면 같은 함수명을 여러개 사용할 수 있다.
	// 함수 오버로드( overload ) 다중적재
	// c언어의 경우 signature를 void write까지 보고 
	// java 같은 경우 write(LaserPrinter , int )까지 본다 // 뒤에 파라미터가 더 들어오는 만큼 +
	private static void write(LaserPrinter prn, int cnt) {
		for(int i = 0; i < cnt; i++) {
			prn.print();
		}
	}
	
	private static void write(LaserPrinter prn) {
		prn.print();
	}

	private static void write(InkJetPrinter prn) {
		prn.print();
	}
	
	private static void write(PhotoPrinter prn) {
		prn.print();
	}
	
	// 만약 프린터 종류가 3종류 밖에 없는가? 수백 종류가 되는데 
	// 하나의 새로운 프린터를 들일 때 마다 메소드를 추가하고 수정해야 한다.
	// 이러한 문제를 해결하기 위한 것이 interface이다.
	
}
