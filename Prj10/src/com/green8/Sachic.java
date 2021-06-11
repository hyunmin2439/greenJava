package com.green8;

public class Sachic {
	// field
	private int v1;
	private int v2;
	
	// 기본 생성자
	public Sachic() {
		
	}
	
	// 생성자 Constructor
	public Sachic(int v1, int v2) { // v1, v2는 지역변수
		this.v1 = v1;
		this.v2 = v2;
	}

	// setter
	public void setV1(int v1) {
		this.v1 = v1;
	}
	
	public void setV2(int v2) {
		this.v2 = v2;
	}
	
	// getter
	
	// toString

	// method
	public int add() {
		int v = this.v1 + this.v2;
		return v;
	}


	public int sub() {
		int v = this.v1 - this.v2;
		return v;
	}
	
}
