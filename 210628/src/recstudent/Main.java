package recstudent;

public class Main {

	public static void main(String[] args) {
		Student s0 = new Student("d", 7);
		Student s1 = new Student("a", 10);
		Student s2 = new Student("b", 8);
		Student s3 = new Student("c", 9);
		
		ClassRoom room = new ClassRoom();
		room.add(s0);
		room.add(s1);
		room.add(s2);
		room.add(s3);
		
		room.printByName();
		room.printByAge();
		room.printAvgAge();
		
		//System.out.println(s1.compareTo(s2));
	}

}
