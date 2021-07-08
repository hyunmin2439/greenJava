package student2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SchoolClass {
	private List<Student> stdList = new ArrayList<>();
	
	public boolean checkSameStudent(Student student) {
		Iterator<Student> iterator = stdList.iterator();
		
		while(iterator.hasNext()) {
			Student std = iterator.next();
			if( std.equals(student) ) return true;
		}
		
		return false;
	}
	
	public void newStudent(Student student) {
		stdList.add(student);
		System.out.println("---------------------------------------------");
		System.out.println(student.getName() + "님이 반에 무사히 적응했습니다.");
		System.out.println("---------------------------------------------");
	}	
	
	public void remStudent(Student student) {
		stdList.remove(student);
		System.out.println("---------------------------------------------");
		System.out.println(student.getName() + "님이 반에서 탈주했습니다.");
		System.out.println("---------------------------------------------");
	}
	
	public void newOrRem(String name, int age) {
		Student student = new Student(name, age);
		
		if( checkSameStudent(student) ) // 같은 사람이 있으면
			remStudent( student ); // 삭제
		else 
			newStudent( student ); // 추가
	}
	
	// 1 ~ 2
	public void outputStdList(int switNumber) {
		switch(switNumber) {
		case 1:
			Collections.sort(stdList, new StudentNameComparator());
			output();
			break;
		case 2:
			Collections.sort(stdList, new StudentAgeComparator());
			output();
			break;
		}
	}
	
	public void output() {
		System.out.println("---------------------------------------------");
		for(Student s : stdList) {
			System.out.println(s);
		}
		System.out.println("---------------------------------------------");
	}
	
	// 3
	public void avgAge() {
		int avgAge = 0;
		for (Student s : stdList) {
			avgAge += s.getAge();
		}
		System.out.println("---------------------------------------------");
		System.out.println("평균 나이는 " + avgAge / stdList.size() + "입니다.");
		System.out.println("---------------------------------------------");
	}
}
