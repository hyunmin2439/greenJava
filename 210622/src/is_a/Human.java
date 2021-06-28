package is_a;

// p.259 LAB 1 ~ 2

public class Human {
	private String name;
	private int age;
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// +getName() : String // +:public methodName() : return type
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	// +setName(name:String) // +:public methodName(parameter) : return type(void 적기도 하고 생략하기도 함)
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + "]";
	}

}
