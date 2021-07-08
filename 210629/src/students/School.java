package students;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

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

public class School {
	private int roomNumber = 1;
	Map<Integer, ClassRoom> roomList = new TreeMap<>();
	
	// 1. 새로운 학생의 정보 입력 받음
	public void inputStudent(Scanner scan) {
		System.out.print("학생의 이름 : ");
		String name = scan.nextLine();
		
		System.out.print("학생의 점수 : ");
		int score = scan.nextInt();
		scan.nextLine();
		
		// 학생 생성 parameter로 넘겨줌
		addStudent( new Student(name, score) );
	}
	
	// 1 - 1. 새로운 학생을 반에 추가
	public void addStudent(Student student) {
		ClassRoom classRoom = roomList.get(roomNumber - 1);
		if( classRoom != null && classRoom.size() < 3 ) { 
			classRoom.addStudent(student);
		}
		else {
			newClassRoom(); // 새로운 반 생성
			addStudent(student); // 재귀호출
		}
	}
	
	// 1 - 2
	public void newClassRoom() {
		roomList.put(roomNumber, new ClassRoom() );
		roomNumber++;
	}
	
	// 2
	public void printClassAvg(int num) {
		ClassRoom classRoom = roomList.get(num);
		if(classRoom != null)
			System.out.println(num + "반의 평균 점수 : " + classRoom.classAvg());
		else 
			System.out.println(num + "반이 존재하지 않습니다.");
	}
	
	// 3
	public void printSchoolAvg() {
		double schoolAvg = 0;
		for(Integer key : roomList.keySet() ) {
			ClassRoom classRoom = roomList.get(key);
			schoolAvg += classRoom.classAvg();
		}
		
		schoolAvg /= roomList.size();
		schoolAvg = ( (int)(schoolAvg * 10) ) / 10.0; // 소수 점 첫째 자리까지만
		if( !roomList.isEmpty() )
			System.out.println( "학교의 전체 평균 : " + schoolAvg );
		else
			System.out.println( "학생이 한명도 존재하지 않습니다." );
	}
}
