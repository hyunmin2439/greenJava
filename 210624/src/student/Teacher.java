package student;

public class Teacher {
	private int pointer = 0; // 위치정보를 나타냄
	private Student[] stdList = new Student[10];
	
	public void newStudent(Student student) {
		if(pointer >= stdList.length) {
			System.out.println("수강 인원이 다 찼습니다.");
		} else {
			stdList[pointer] = student;
			System.out.println("새로운 " + student.toString() + "이 들어왔습니다.");
			greeting();
			pointer++;			
		}
	}
	
	public void greeting() {
		for(int i = 0; i < pointer; i++) {
			stdList[i].selfIntroduction();
		}
		
		System.out.println();
	}
}
