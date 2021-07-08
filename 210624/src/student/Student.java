package student;

public class Student {
	private String name;
	private int 	age;
	
	public Student(String stdInfo ) {
		super();
		String[] info = stdInfo.trim().split(",");
		name = info[0];
		age  = Integer.parseInt( info[1].trim() );
	}

	public void selfIntroduction() {
		System.out.println( "안녕하세요. 저는 " 
							+ age + "살 " + name + "입니다." );
	}

	@Override
	public String toString() {
		return "학생(" + name + ", " +age + "살)";
	}
}
