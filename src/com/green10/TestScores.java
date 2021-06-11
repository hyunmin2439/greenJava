package com.green10;

public class TestScores {

	public static void main(String[] args) {
		
		String 	num 		= "1";
		String 	name 		= "aaa";
		String 	email 		= "aaa@gmail.com";
		String 	hiredate 	= "20080301";
		int 	deptid 		= 40;
		
		// 1. 생성자(Constructor)를 이용한 정보 전달 기법
		// Employee emp1 = new Employee( "1", "aaa", "aaa@gmail.com", "20080301", 40 );
		Employee emp1 = new Employee( num, name, email, hiredate, deptid );

//		emp1.input();
		emp1.process();
		emp1.output();
		
		System.out.println(emp1); // com.green10.Employee@74a14482
		// == System.out.println( emp1.toString() );
		// 클래스를 sysout하면 위에 처럼 주소만 찍히는데 toString()을 만들고 sysout 할 경우에는
		// 데이터 안에 있는 값들도 추가로 console에 출력된다. 
		// toString() method가 Override 되어 만들어져 있기 때문이다.
	}
	
}
