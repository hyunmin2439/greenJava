package com.green.objecttest;

public class Student {
	// field 변수는 기본으로 초기화 된다.
	// String : null, 숫자 변수들 0
	
	private String name;
	private int		kor;
	private int		eng;
	private int		mat;
	private int		tot;
	private int		avg;
	
	// Constructor
	// 기본 생성자 - 초기화 작업 : field 변수에 초기값 설정
	public Student() {
		//this.name = "";
		//this.kor = 0;
	}
	
	public Student(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor  = kor;
		this.eng  = eng;
		this.mat  = mat;
		//this.tot  = kor + eng + mat;
		//this.avg  = tot / 3;
	}
	
	// Getter / Setter
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getKor() {
		return kor;
	}
	
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public int getEng() {
		return eng;
	}
	
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public int getMat() {
		return mat;
	}
	
	public void setMat(int mat) {
		this.mat = mat;
	}
	
	// setTot, setAvg는 main에서 계산하여 값을 출력할 것이면
	// 이 클래스가 왜 필요하나? 그래서 필요가 없다.
	
	public int getTot() {
		// 이런 식으로 하는 것보다 생성자에다가 생성할 때 
		// 값을 넣어주는 것이 낫지 않을까?
		this.tot = this.kor + this.eng + this.mat;
		return tot;
	}
	
	
	public int getAvg() {
		// 아래 3가지 방법 중에 아무 것이나 사용가능.
		this.avg = (this.kor + this.eng + this.mat) / 3;
		//this.avg = this.getTot() / 3;
		//this.avg = this.tot / 3;
		return avg;
	}
	
	// method 메소드
	
	public void disp() {
		String fmt = "%s %d %d %d %d %d\n";
		String msg = String.format(fmt, 
				this.name, this.kor, this.eng, this.mat, this.tot, this.avg);
		System.out.println(msg);
	}

	// toString
	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + ", tot=" + tot + ", avg="
				+ avg + "]";
	}

}
