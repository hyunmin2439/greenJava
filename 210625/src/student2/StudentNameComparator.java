package student2;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student> {
	@Override
	public int compare(Student s1, Student s2) {

		return s1.getName().compareTo(s2.getName());
	}
}

class StudentAgeComparator implements Comparator<Student> {
	@Override
	public int compare(Student s1, Student s2) {

		return s1.getAge() - s2.getAge();
	}
}