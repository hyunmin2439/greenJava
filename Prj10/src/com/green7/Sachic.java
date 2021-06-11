package com.green7;

public class Sachic {
	// 실행에 관여하지 않는 field
	// 파라미터의 v1, v2와 다른 field 변수이다.
	private int v1; 
	private int v2;
	// ----------------------------
	
	private int val1;
	private int val2;

	// Getter / Setter : 클래스 외부에서 클래스 내부로 값을 집어넣는 방법
	public void setVal1(int val1){
// field variable <- local variable
		this.val1 = val1; // new된 instance가 이 this에 들어간다. 
						  // Sachic s2 = new Sachic();
						  // new 될 때 마다 다른 객체가 들어올 것을 대비해서 사용한다. ex) s1, s2, s3...
		
						  // Sachic.val1과 this.val1 과 다른 개념이다.
		
//		Sachic.val1 // 이것은 val1이 static일 경우에 사용한다.
	}
	
	public void setVal2(int val2){
		this.val2 = val2;
	}
	
	public int add() {
		int v = val1 + val2;
		return v;
	}

	public int sub() {
		int v = val1 - val2;
		return v;
	}

	public int mul() {
		int v = val1 * val2;
		return v;
	}

	public int div() {
		int v = val1 / val2;
		return v;
	}

	// ----------------------------
	
	//signature가 다른 add method
	public double add(double v1, double v2) {
		double v = v1 + v2;
		return v;
	}
	
	public int add(int v1, int v2) {
		int v = v1 + v2;
		return v;
	}
	
	public int sub(int v1, int v2) {
		int v = v1 - v2;
		return v;
	}
	
	public int mul(int v1, int v2) {
		int v = v1 * v2;
		return v;
	}
	
	public int div(int v1, int v2) {
		int v = v1 / v2;
		return v;
	}
}
