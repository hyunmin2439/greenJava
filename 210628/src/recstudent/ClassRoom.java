package recstudent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// extends ArrayList - 이렇게 사용하게 되면 좋지 못한 방법.
// ArrayList의 기능을 모두 가질 수 있다.
// 이중 예를 들면 ArrayList에는 clear라는 메소드가 있다.
// 하지만 문서는 학급에 대한 모든것을 지우는 요구사항이 없다.
// 때문에 has-a(포함) 관계로 하는 것이 좋다.

public class ClassRoom extends ArrayList {
	private List<Student> list = new ArrayList<>();
	
	// 추가
	public void add(Student student) { // 메소드는 보통 동사가 온다.
		list.add(student);
	}
	
	// 삭제
	public void remove(Student student) {
		list.remove(student);
	}
	
	// 이름순 출력
	public void printByName() {
		// compareTo를 구현하기 전에는 기준점이 없기 때문에 정렬을 할 수 없다.
		// compareTo를 구현하고 나면 Collections.sort가 알아서 정렬을 해준다.
		// Collections.sort(list);
		
		// 원래의 순서를 유지할려면 새로 List를 만들고 정렬하고 출력하면 된다.
		List<Student> copy = new ArrayList<>(list);
		Collections.sort(copy);
		System.out.println(copy);
	}
	
	// 나이순 출력
	public void printByAge() {
		List<Student> copy = new ArrayList<>(list);
		Collections.sort(copy, new StudentAgeComparator());
		System.out.println(copy);
	}
	
	// 평균 출력
	public void printAvgAge() {
		int avgAge = 0;
		for(Student student : list) {
			avgAge += student.getAge();
		}
		System.out.println( "평균나이 : " + (double)avgAge / list.size() );
	}
}
