package students;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom {
	private List<Student> classRoom = new ArrayList<>();
	
	// 새로운 학생 추가
	public void addStudent(Student student) {
		classRoom.add(student);
	}
	
	// 반에 몇명 있는지 체크
	public int size() {
		return classRoom.size();
	}
	
	// 학생들 평균 점수 return
	public double classAvg() {
		double classAvg = 0;
		for(Student student : classRoom) {
			classAvg += student.getScore();
		}
		
		classAvg /= classRoom.size();
		return ( (int)(classAvg * 10) ) / 10.0; // 소수 점 첫째 자리까지만
	}
}
