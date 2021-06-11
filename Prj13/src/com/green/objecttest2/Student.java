package com.green.objecttest2;

public class Student {
	// Fields
	private String  name;
	private int		kor;
	private int 	eng;
	private int		mat;
	
	// Constructor 생성자
	//public Student() { }
	
	public Student(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	// Getter
	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMat() {
		return mat;
	}

	public int getTot() {
		int tot = kor + eng + mat;
		return tot;
	}
	
	public int getAvg() {
		int avg = (kor + eng + mat) / 3;
		return avg;
	}
	
	// toString()
	@Override
	public String toString() {
		String fmt = "%s %d %d %d %d %d";
		String msg = String.format(fmt, name, kor, eng, mat, getTot(), getAvg() );
		
		return msg;
	}


}
