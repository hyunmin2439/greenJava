package com.green10;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//입력 : 사번 이름  이메일  입사일  부서번호
//       num, name, email, hiredate, deptid
//출력 : 사번 이름  이메일  근속연수   부서명     직급
//		 num, name, email, hireYears, deptName, position


// 입력 데이터
// 1, aaa, aaa@gmail.com, 20110329, 10


// public class의 이름을 바꾸고 F2
// .java 파일명이 자동으로 바뀐다.
public class Employee {
	
	// field
	
	private String 	num;
	private String 	name;
	private String 	email;
	private String 	hiredate;
	private int 	deptid;
	
	// 출력용
	private int 	hireYears;
	private String 	deptName;
	private String 	position;
	
	
	// 생성자(Constructor) : 접근제어자 클래스이름() { }
	
	// 인자가 없는 생성자 - 기본 생성자
	public Employee() {
		
	}
	
	// 인자가 있는 생성자 - new될 때 실행되는 것.
	public Employee(String num, String name, String email, 
			String hiredate, int deptid) {
		this.num 	  = num;
		this.name 	  = name;
		this.email 	  = email;
		this.hiredate = hiredate;
		this.deptid   = deptid;
	}
	
	
	// Getter / Setter
	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public void setHireYears(int hireYears) {
		this.hireYears = hireYears;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	
	// method
	public void input() {
		Scanner 	in 	 = new Scanner(System.in); // System.in 기본 입력장치 키보드 의미
		System.out.println("입력 : 사번 이름  이메일  입사일  부서번호");
		String 		line = in.nextLine();
		String [] 	data = line.split(",");
		
		this.num		 = data[0].trim();
		this.name		 = data[1].trim();
		this.email		 = data[2].trim();
		this.hiredate 	 = data[3].trim();
		this.deptid   	 = Integer.parseInt( data[4].trim() );
	}
	
	public void process() {
		getHireYears();
		getDeptName();
		getPosition();
	}
	
	private void getHireYears() {
		Date 			 today 		= new Date();
		SimpleDateFormat sdf 		= new SimpleDateFormat("yyyy");
		int 			 thisYear 	= Integer.parseInt( sdf.format(today) );
		int				 hYear		= Integer.parseInt(this.hiredate.substring(0, 3 + 1));
		this.hireYears 				= thisYear - hYear;
		// hireYears this를 빼도 된다.
		// 꼭 붙여야 하는 경우는 local 변수랑 겹치는 경우 꼭 붙여야 한다.
		// this를 붙이는게 구분하기 편해 붙이는 것이 좋다.
	}

	private void getDeptName() {
		// 실제 업무에서는 이렇게 안한다.
		// 부서가 추가 된다고 코드를 수정해야 한다면 그것은 잘못된 코딩.
		// 별도의 파일, DB에 저장해놓고 읽어서 추가되도록 코딩을 한다.
		
		switch( this.deptid ) {
		case 10: this.deptName = "인사"; break;
		case 20: this.deptName = "총무"; break;
		case 30: this.deptName = "자재"; break;
		case 40: this.deptName = "연구개발"; break;
		case 50: this.deptName = "생산"; break;
		}
	}

	private void getPosition() {
		if		( this.hireYears <=  3 ) this.position = "사원"; //  0 ~  3
		else if ( this.hireYears <=  5 ) this.position = "대리"; //  4 ~  5
		else if ( this.hireYears <= 10 ) this.position = "과장"; //  6 ~ 10
		else if ( this.hireYears <= 15 ) this.position = "부장"; // 11 ~ 15
		else if ( this.hireYears <= 20 ) this.position = "이사"; // 16 ~ 20
		else						 	 this.position = "고문"; // 21 ~
	}

	public void output() {
		System.out.println(
				"사번   이름     이메일       근속연수   부서명    직급");
		System.out.printf("%-6s %-6s %-14s %4d %9s %6s\n", 
				this.num, this.name, this.email, this.hireYears, this.deptName, this.position);
	}

	
	// toString() : Override method
	// Alt + Shift + S => Generate toString()
	@Override
	public String toString() {
		return "Employee [num=" + num + ", name=" + name + ", email=" + email + ", hiredate=" + hiredate + ", deptid="
				+ deptid + ", hireYears=" + hireYears + ", deptName=" + deptName + ", position=" + position
				+ ", getNum()=" + getNum() + ", getName()=" + getName() + ", getEmail()=" + getEmail()
				+ ", getHiredate()=" + getHiredate() + ", getDeptid()=" + getDeptid() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
