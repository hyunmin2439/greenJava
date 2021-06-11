package com.green.objecttest; // 패키지명은 전부 소문자로 하는 것이 원칙이다.

// 성적처리 객체로 하는 것.

public class StudentTest {

	public static void main(String[] args) {
//		1. 기본생성자를 생성 (private가 아닌) 필드값 전달 - 절대 사용금지
//		Student s1 = new Student();
//		// Access Modifier : private로 설정하니 error
//		s1.name = "사나"; 
//		s1.kor = 100;
//		s1.eng = 100;
//		s1.mat = 100;
//		s1.disp();
		
		
//		위의 방식은 매번 새로운 학생이 들어올 때 마다 코딩을 한다면 번거롭다. 
//		아래의 방식으로 처리하는 것이 효율적이다.
//		s1.name = "모모"; // 허용 불가, 중간에 값이 바뀔수도 있기 때문에 사용금지
		
//		2. 인자있는 생성자를 통해 class 값을 전달하는 방법
		Student s1 = new Student("사나", 100, 100, 100);
//		s1.disp();
		
		
//		3. Getter / Setter 사용법
//		Student s1 = new Student();
//		s1.setName("사나");
//		s1.setKor(100);
//		s1.setEng(100);
//		s1.setMat(100);
		
		s1.disp();
		
		System.out.println( "이름:" + s1.getName() );
		System.out.println( "총점:" + ( s1.getKor() + s1.getEng() + s1.getMat() ) );
		// ( )를 안 붙일 경우 출력 : 총점:100100100
		
		System.out.println( "총점:" + s1.getTot() );
		System.out.println( "평균:" + s1.getAvg() );
		
	}

}
