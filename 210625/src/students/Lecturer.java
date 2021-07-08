package students;
import java.util.ArrayList;
import java.util.List;

public class Lecturer {
	private List<Student> list;

	public Lecturer() {
		list = new ArrayList<>();
	}
	
	// 기억
	public boolean remember(Student s) {
		if (list.indexOf(s) == -1) { // 없는 위치
			if (list.size() < 10) {
				return list.add(s);
			}
		}
		return false;
	}
	
	public List<Student> getStudents() {
		return list;
	}
}
