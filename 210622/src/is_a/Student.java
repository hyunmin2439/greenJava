package is_a;

public class Student extends Human { // 학생은 사람이다. 상속관계는 말이 되어야 사용가능하다.
	private String major;

	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "Student [major=" + major + ", toString()=" + super.toString() + "]"; // 
	}
}
