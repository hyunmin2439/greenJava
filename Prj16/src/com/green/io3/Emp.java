package com.green.io3;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

// 입력 : 사번, 이름, 입사일, 월급, 부서번호
// 출력 : 사번, 이름, 입사일, 월급, 보너스, 수령액, 부서명
public class Emp {
	// field (입력)
	private int 	num;
	private String 	name;
	private String 	hiredate;
	private double 	salary;
	private String 	deptId;
	
	// field (출력)
	private double	bonus;
	private double	pay;
	private String	deptName;
	
	// 생성자(constructor) : 객체를 new할 때 실행할 명령(field변수에 값 저장)
	// 생성자 super()의 사용이유 : https://imhotk.tistory.com/555
	public Emp(int num, String name, String hiredate, int salary, String deptId) {
		super();
		this.num = num;
		this.name = name;
		this.hiredate = hiredate;
		this.salary = salary;
		this.deptId = deptId;
	}
	
	public Emp(String line) {
		String[] li = line.trim().split(",");
		
		this.num 	  = Integer.parseInt( li[0].trim() );
		this.name 	  = li[1].trim();
		this.hiredate = li[2].trim();
		this.salary   = Double.parseDouble( li[3].trim() );
		this.deptId   = li[4].trim();
	}

	@Override
	public String toString() {
		return "Emp [num=" + num + ", name=" + name + ", hiredate=" + hiredate + ", salary=" + salary + ", deptId="
				+ deptId + ", bonus=" + bonus + ", pay=" + pay + ", deptName=" + deptName + "]";
	}

	// method
//	수령액 : 월급 + 보너스
//	보너스 : 연차에 따라 월급의 0.05로 계산한다
//	부서번호 : 10:인사, 20:자재, 30:총무, 40:연구개발, 50:서비스
//	입사일 2008-12-23로 출력
//	입사일순으로 직원정보를 출력 - 정렬 입사일 오름차순
//	출력결과 : 사번, 이름, 입사일, 월급, 보너스, 수령액, 부서명
	public String calcPay() {
		Calendar cal  = Calendar.getInstance();
		int	thisYear  = cal.get( Calendar.YEAR );
		int hireYears = thisYear - Integer.parseInt( this.hiredate.substring(0, 3 + 1) );
		this.bonus 	  = this.salary * hireYears * 0.05;
		this.pay 	  = this.salary + this.bonus;
		
//		Map 업캐스팅으로 선언 이유 : 다형성(Polymorphism)과 관련
//		부모클래스에서 가져와서 서브클래스를 호출할때 사용
//		
//		편하게 사용하기 위하여
//		HashMap -> HashTable로 바꾸려고 했을 때
//		HashMap으로 선언되어 있으면 문제가 많다.
//
//		다른 예로 List<User>라고 사용하면 될걸
//		ArrayList<User>라고 해서 "반드시 배열을 백엔드로 하는 사용자의 목록"
//		이라고 제약을 걸어둘 필요가 없다.
		Map<String, String> map = new HashMap<>();
		map.put("10", "인사");
		map.put("20", "자재");
		map.put("30", "총무");
		map.put("40", "연구개발");
		map.put("50", "서비스");
		this.deptName = map.get( this.deptId );
		
		String fmt = "%d %s %s %,.2f %,.2f %,.2f %s";
		return String.format(fmt, this.num, this.name, convtDate(this.hiredate), 
				this.salary, this.bonus, this.pay, this.deptName);
	}

	// 20081223 -> 2008-12-23
	private String convtDate(String hiredate) {
		String yyyy = hiredate.substring(0, 3 + 1);
		String   mm = hiredate.substring(4, 5 + 1);
		String 	 dd = hiredate.substring(6);
		return yyyy + "-" + mm + "-" + dd;
	}
}
