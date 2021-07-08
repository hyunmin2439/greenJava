package student;

/*
 * 학생 클래스 : 이름, 나이 (자기소개)자신의 이름을 콘솔창에 출력할 수 있음.
 * 강사 클래스 : 학생들을 10명 기억할 수가 있어요. (field)
 * 				 새로운 학생을 기억하는 행동을 할 수 있음.
 * 				 -> 새로운 학생이 들어오면, 기존의 학생들이 자기소개를 할 수 있게 작성.
 */

public class Main {
	public static void main(String[] args) {
		Teacher humin = new Teacher();
		String[] stdList = { "김현민, 30", "이영균, 26", "김형수, 28",
				"윤정인, 26", "장세호, 33", "전유리, 30", "이준석, 26",
				"김준수, 29", "장석호, 24", "이석, 20", "나가리, 22" };
		
		for(int i = 0; i < stdList.length; i++) {
			humin.newStudent( new Student(stdList[i]) );
		}
	}
}
