package com.green3;

// TestInterface 1 ~ 3 비교하면서 이해할 것

// C++이나 C#에서는 interface면 앞에 I를 붙인다.
// 하지만 java에서는 interface면 Printable이라는 형용사를 많이 쓴다.

// 메소드는 동사로 많이 표현한다. 
// 클래스나 변수는 명사를 많이 쓴다.

interface IPrint { // interface는 모두다 abstract
	void prepare(); // 때문에 abstract 생략가능
	void print();
	//void func() { } // Abstract methods do not specify a body
}

// @Controller : 클래스에 붙이는 @, 컴파일러에게 알려줌, Spring 등에서 많이 씀.
class InkJetPrinter implements IPrint {

	// @ : annotation 적용 범위 : 바로 아래줄에 영향
	// @Override를 생략해도 문제 없이 동작하는데 왜 붙이느냐?
	// 사람이 실수로 Override 메소드를 작성하면서 public print()를
	// 오타내어 public prin()이라고 작성할 수도 있다. 
	// 그렇다면 이것이 오류라고 알려주지 않는다. 그렇다면 오류를 찾기 힘들어진다.
	// 그렇기 때문에 컴파일러에게 이것은 @Override된 메소드다라고 알려주고 오류를 잡게하기 위해서 작성한다.
	
	@Override
	public void prepare() {
		System.out.println("잉크를 준비한다.");
	}

	@Override
	public void print() {
		System.out.println("잉크젯 프린터를 인쇄합니다.");
	}
	
	public void func() {
		System.out.println("하이 Hello 난 func()");
	}
	
}

class LaserPrinter implements IPrint {

	@Override
	public void prepare() {
		System.out.println("토너를 준비합니다.");
	}

	@Override
	public void print() {
		System.out.println("레이저 프린터를 사용합니다, 인쇄중...");
		
		try { // 예외처리
			Thread.sleep(1 * 1000); 	   // 컴퓨터 시스템 호출
		} catch (InterruptedException e) { // 실패시 작동
			System.out.println("관리자 문의");
			//e.printStackTrace();
		}
		
		System.out.println("인쇄끝");
	}
}

class ThreeDPrinter implements IPrint {

	@Override
	public void prepare() {
		System.out.println("도면을 준비합니다.");
	}

	@Override
	public void print() {
		System.out.println("입체로 도형을 출력합니다.");
	}
	
}

public class TestInterface3 {

	public static void main(String[] args) {
		//IPrint ip = new IPrint(); // Cannot instantiate the type IPrint 
									// interface는 new 할 수 없다.
		
		System.out.println("1.==================================");
		InkJetPrinter ijp = new InkJetPrinter();
		ijp.prepare();
		ijp.print();
		ijp.func();
		
		System.out.println();
		
		LaserPrinter lsp = new LaserPrinter();
		lsp.prepare();
		lsp.print();
		
		System.out.println("\n2.==================================\n");
		IPrint ip;
		
		ip = new InkJetPrinter();
		ip.prepare();
		ip.print();
		
		System.out.println();
		
		ip = new LaserPrinter();
		ip.prepare();
		ip.print();
		
		System.out.println("\n3.==================================\n");
		// interface를 사용하면 얻을 수 있는 가장 큰 장점이자 이유
		
		ip = new LaserPrinter();
		write( ip );
		
		System.out.println();
		
		ip = new InkJetPrinter();
		write( ip );
		
		System.out.println();
		
		ip = new ThreeDPrinter();
		write( ip );
	}

	private static void write(IPrint ip) {
		ip.prepare();
		ip.print();
	}
}
