package students;
/*
 * 학생 클래스 : 이름, 나이, (자기소개) 자신의 이름을 콘솔창에 출력할 수 있다.
 * 강사 클래스 : 학생들을 10명을 기억할 수가 있어요.
 * 				 새로운 학생을 기억하는 행동을 할 수 있음.
 *               -> 새로운 학생이 들어오면 기존의 학생들이 자기소개를 할 수 있게 작성.
 */

public class Main {

	public static void main(String[] args) {
		Student s= new Student("길동", 33);
//		s.introduce(); // 지가 길동이라는 이름을 콘솔창에 출력한다.
		Student s2 = new Student("둘리", 22);
		
		Lecturer l = new Lecturer();
		l.remember(s);
		
		l.remember(s2);
		
	}

}
