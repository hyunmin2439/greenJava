package com.green2;

// 잘쓰지 않는 방법

abstract class IPrint {
	abstract void prepare();
	abstract void print();
	void func() {
		System.out.println("함수지");
	}
}

// InkJetPrinter 빨간 밑줄 
// - Add unimplemented methods를 누르면 
// 자동으로 구현되지 않은 메소드 Override로 추가
class InkJetPrinter extends IPrint {

	@Override
	void prepare() {
		System.out.println("잉크를 준비합니다.");
	}

	@Override
	void print() {
		System.out.println("잉크젯 프린터를 인쇄합니다.");
	}
	
}

public class TestInterface2 {
	
	public static void main(String[] args) {
		InkJetPrinter ijp = new InkJetPrinter();
		ijp.prepare();
		ijp.print();
		ijp.func();
	}
}
