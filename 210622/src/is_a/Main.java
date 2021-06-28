package is_a;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student("길동", 22, "실용음악");
		Human   s2 = new Student("톰", 33, "물리학과"); // Up Casting
		
		System.out.println(s1);
		System.out.println(s2);
	}

}
