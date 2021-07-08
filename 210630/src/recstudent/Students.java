package recstudent;

import java.util.ArrayList;
import java.util.List;

/*
 * 학교
 *   1. 학생을 등록
 * 1-1. 학생을 등록할 수 있어요.  학생 정원 3명, 
 * 1-2. 추가로 등록하면 다음 반이 생긴다.
 *      1반(3명), 2반(3명), ....
 * 2.   반 평균 출력.
 * 3.   전체 평균 출력.
 * 
 * 학급(반) - 총원이 3명
 * 학생 : 이름, 점수
 */

class School {
	List< List<Student> > classRoom = new ArrayList<>();
	private int current = 0;
	
	public void register(Student student) {
		if( classRoom.isEmpty() ) {
			classRoom.add( new ArrayList<Student>() );
		}
		
		if( classRoom.get(current).size() >= 3 ) {
			classRoom.add( new ArrayList<Student>() );
			current++;
		} 
		
		classRoom.get(current).add(student);
	}
	
	public void printAvg(int index) {
		int sum = 0;
		List<Student> list = classRoom.get(index);
		
		if ( index < 0 || index >= classRoom.size() ) {
			return;
		}
		
		for( Student st : list ) {
			sum += st.getScore();
		}
		
		System.out.println(index + 1 + "반의 평균: " + sum / list.size() );
	}
}

public class Students {

	public static void main(String[] args) {
		Student s = new Student("길동", 100);
		Student s1 = new Student("둘리", 90);
		Student s2 = new Student("도우너", 80);
		Student s3 = new Student("마이콜", 70);
		Student s4 = new Student("AA", 60);
		Student s5 = new Student("BB", 50);
		Student s6 = new Student("CC", 40);
		
		School school = new School();

		school.register(s);
		school.register(s1);
		school.register(s2);
		school.register(s3);
		school.register(s4);
		school.register(s5);
		school.register(s6);
		
		school.printAvg(0);
		school.printAvg(1);
	}

}
