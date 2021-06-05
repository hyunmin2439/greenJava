package com.green;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/* Class
 * 하나의 자바 소스파일에는 여러 개의 클래스를 작성할 수 있지만, 
 * 하나의 클래스 파일(.class)에는 반드시 하나의 컴파일된 자바 클래스만이 포함되어야 합니다. 
 * 만약 하나의 클래스 파일에 여러개의 클래스를 정의한 경우 컴파일러가 별도의 파일을 생성합니다.
 * 
 * bin 폴더 안에 보면 Class파일이 따로 생성되어 있음.
 * 
 * + public class는 오직 하나만 가능
 * 추가 내용 - https://gsgdvxhx.tistory.com/3 (추후 살펴볼것)
*/


/* ArrayList list
 * ArrayList list = new ArrayList()로 선언, 값 추출 시 캐스팅(Casting) 연산이 필요
 * 잘못된 타입으로 캐스팅을 한 경우, 에러가 발생, 때문에 타입을 명시해주는것이 좋다. 
 * 
 * JDK 5.0이후부터 자료형의 안정성을 위해 제너릭스(Generics)라는 개념이 도입
 * ArrayLIst<String> list = new ArrayList<String>(); 이라고 되어있다면 
 * String객체들만 add되어질수있고 다른 타입의 객체는 사용이 불가능
 * 
 * 값을 추가하려면 ArrayList의 add(index, value) 사용 
 * 해당 index ~ 마지막 index까지 1칸씩 밀려남, index를 생략하면 맨 뒤에 추가
 * 
 * 때문에 데이터가 늘어나면 늘어날 수록 성능에 악영향 
 * 중간에 데이터를 insert를 해야할 경우가 많다면 LinkedList를 활용
 * 
 * 현재는 삭제하는 case가 없기 때문에 ArrayList 사용
*/


/* Sample Data 13명
A001,  이순신,   master@korea.com, 19900101,      10
A002,  강감찬,   gamchan@joong.kr, 20170204,      10
A003,  이기순,   gisoon@soon.kr,   20130703,      10
A004,  세종,     king@korea.com,   19800101,      10
A005,  욘개소문, somoon@korea.com, 20190101,      10
A006,  장금이,   cooker@korea.com, 20150101,      10
B001,  정세종,   sejong@sejong.kr, 20191217,      20
C001,  이방헌,   banghun@bang.kr,  20140701,      30
C002,  을지문덕, duck@korea.com,   20170101,      30
D001,  조대리,   jodaeri@daeri.kr, 20010811,      40
D002,  이이,     lee@korea.com,    19830701,      40
E001,  김과장,   gwajang@jang.kr,  20080304,      50
E002,  허준,     doctor@korea.com, 20100101,      50
*/

class Employee {
	String 	num;
	String 	name;
	String 	email;
	int 	hiredate;
	int 	deptno;
	int 	hireYears;
	String 	deptName;
	String 	position;
	
	// 생성자 생략시 - default 생성자로 생성
}

public class EmployeeList {
	
	static ArrayList<Employee> employees = new ArrayList<Employee>();
	static String	[] dName  = {"인사", "총무", "자재", "연구", "생산",  "총계"};
	static int		[] dCount = {   0  ,    0  ,    0   ,   0  ,    0  };
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("몇명의 직원정보를 입력하시겠습니까?");
		int n = in.nextInt();
		
		in.nextLine();
		/* =>
		 * nextInt() -> nextLine();
		 * 숫자 입력후 엔터를 치면 Exception이 발생
		 * 숫자만 입력 받고 개행문자(\n)는 다음 nextLine()이 읽음. 
		 * 이를 해결하기 위해선 nextLine()함수를 한번 더 사용해 개행문자를 제거
		 */
		
		input(in, n);
		
		statistics();
		
		output();
	}

	
	private static void input(Scanner in, int n) {
		
		System.out.println("직원정보를 아래의 양식으로 입력해주십시오.");
		System.out.println("사번,이름,이메일,입사일,부서번호:");
		
		for(int i = 0; i < n; i++) {
			String line = in.nextLine();
			String[] tmp = line.split(",");
			
			Employee employ = new Employee();
			employ.num = tmp[0].trim();
			employ.name = tmp[1].trim();
			employ.email = tmp[2].trim();
			employ.hiredate = Integer.parseInt(tmp[3].trim());
			employ.deptno = Integer.parseInt(tmp[4].trim());

			process(employ);

			employees.add(employ);
		}
	}
	
	
	private static void process(Employee emp) {
		
		// 근속 연수 <- 현재년도 - 입사일
		getHireYears(emp);
		
		// 부서명 <- 부서번호
		getDeptName(emp);
		
		// 직급명 <- 직급
		getPosition(emp);

	}
	
	private static void getHireYears(Employee emp) {
		Date today = new Date();
		int thisYear = today.getYear() + 1900; // ---- deprecated : 옛날 것이다. 쓰지마라.
		//System.out.println("올해 : "+ thisYear);
		
		// 근속연수 = 현재년도 - 입사일
		emp.hireYears = thisYear - emp.hiredate / 10_000;
	}

	private static void getDeptName(Employee emp) {
		emp.deptName = dName[ emp.deptno / 10 - 1 ];
		
	}

	private static void getPosition(Employee emp) {
		if		( emp.hireYears > 20 ) emp.position = "고문"; // 21 ~
		else if ( emp.hireYears > 15 ) emp.position = "이사"; // 16 ~ 20
		else if ( emp.hireYears > 10 ) emp.position = "부장"; // 11 ~ 15
		else if ( emp.hireYears >  5 ) emp.position = "과장"; //  6 ~ 10
		else if ( emp.hireYears >  2 ) emp.position = "대리"; //  3 ~  5
		else						   emp.position = "사원"; //  0 ~  2
	}

	
	// 통계는 입력이랑 따로 둬야함. 
	// 추후 직원 추가 삭제시에 통계를 다시 계산해야하기 때문.
	private static void statistics() {
		for(Employee emp : employees) {
			dCount[emp.deptno / 10 - 1]++;
		}
	}
	
	
	private static void output() {
		System.out.println("\n//////////////////////////출력//////////////////////////\n");

		// 직원 목록 출력
		System.out.println(
				"사번   이름        이메일          근속연수    부서명    직급");
		
		for(Employee emp : employees)
		System.out.printf("%-5s %-5s %-20s %4d %9s %6s\n", 
				emp.num, emp.name, emp.email, emp.hireYears, emp.deptName, emp.position);
		
		System.out.println();
		
		// 통계 출력
		System.out.println("    부서별    인원수");
		for(int i = 1; i <= 5; i++) {
			System.out.printf("%d   %s       %d\n", i * 10, dName[i - 1], dCount[i - 1]);
		}
		System.out.printf("     %s       %d\n", dName[dName.length - 1], employees.size());
	}

}
