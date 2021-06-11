package com.green.objecttest2;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentTest {

	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in); 
		// System.in이 빠지면 오류가 난다. 기본 생성자가 없다는 의미
		
		// Student s1 = new Student(); 
		// 기본생성자 X, set, get이 없기 때문에 기본생성자가 의미X
		// field 변수가 전부 private이기 때문에 set, get 없으면 접근 불가능.
		
		Student s1 = new Student("사나", 100, 100, 100);
		Student s2 = new Student("모모", 90, 80, 100);
		Student s3 = new Student("효리", 90, 80, 70);
		Student s4 = new Student("나은", 100, 100, 100);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);

		
		System.out.println("---------------------------------------------------------");
		// class 배열 초기화
		
//		Student [] sosi = new Student[5];
//		sosi[0] = new Student("윤아", 100, 90, 100);
//		sosi[1] = new Student("태연", 70, 90, 80);
//		...
		
		// 배열은 초기값을 넣을 때 사이즈를 넣으면 안된다.
		Student [] sosi = new Student[] {
			new Student("윤아", 100, 90, 100),
			new Student("태연", 70, 90, 80),
			new Student("수영", 50, 100, 60),
			new Student("써니", 60, 50, 40),
			new Student("서현", 50, 60, 30)
		};
		
		// sosi[5] = new Student("유리", 80, 60, 90); 
		// ArrayIndexOutOfBoundsException
		
		for (int i = 0; i < sosi.length; i++) {
			System.out.println( sosi[i] );
		}
		
		
		System.out.println("---------------------------------------------------------");
		// ArrayList
		ArrayList<Student> studList = new ArrayList<>(); 
		studList.add( new Student("가영", 90, 100, 90) );
		studList.add( new Student("나영", 70, 30, 60) );
		studList.add( new Student("다영", 60, 50, 80) );
		studList.add( new Student("라영", 100, 80, 90) );
		studList.add( new Student("아영", 80, 40, 60) );
		
		for (Student student : studList) {
			System.out.println( student );
			//System.out.println( studList ); // [ elements가 출력된다. ] // 보통 이렇게 쓰지 않는다.
		}
		System.out.println("---------------------------------------------------------");
		
		studList.add( new Student("자영", 100, 90, 80) );
		studList.add( new Student("자영", 100, 90, 80) );
		
		for (Student student : studList) {
			System.out.println( student );
		}
		
		System.out.println("---------------------------------------------------------");
		
		System.out.println("아영을 찾아서 점수를 출력하세요.");
		for (int i = 0; i < studList.size(); i++) {
			Student stud = studList.get(i);
			if( stud.getName().equals("아영") ) {
				System.out.println( stud );
			}
		}
		
		System.out.println();
		
		// 평균이 90점 이상인 학생 출력
		System.out.println("평균이 90점 이상인 학생 출력");
		for (Student stud : studList) {
			if(stud.getAvg() >= 90)
				System.out.println( stud);
		}
		
		System.out.println();
		
		// 국어, 영어, 수학 점수가 각각 90점 이상인 사람 출력
		System.out.println("국어, 영어, 수학 점수가 각각 90점 이상인 사람 출력");
		for (int i = 0; i < studList.size(); i++) {
			Student s = studList.get(i);
			if( s.getKor() >= 90 
					&& s.getEng() >= 90 
					&& s.getMat() >= 90) {
				System.out.println( s );
			}
		}
		
		// 국어점수가 100점인 학생을 출력
		
		
		//-------------------------------------
		
	}

}
