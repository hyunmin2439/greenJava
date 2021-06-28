package testclass;

public class Rabbit extends Object { // Object가 기본적으로 상속, 생략되어 있음
	// state(field, member variable)
	private int age;
	private String name;
	// 배고픔
	private boolean hungry; // true : 배가 고픔  false : 배부름
	
	// constructor
	public Rabbit() {
		super(); // 부모의 생성자를 호출, 생략가능 / 자동 호출 / 위치 생성자 첫w줄
		this.hungry = true;
	}
	
	public Rabbit(int age, String name) {
		super();
		this.age = age;
		this.name = name;
		this.hungry = true;
	}
	
	// getter / setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public boolean isHungry() {
		return hungry;
	}
	
	// method
	// 토끼가 당근을 먹을 수 있음.
	// 당근을 먹으면 배 불러짐.
	public void eat(Carrot c) {
		if (c != null && c.getWeight() > 10) {
			c.setWeight( c.getWeight() - 10 );
			this.hungry = false;
		}
	}
	
	@Override
	public String toString() {
		return "토끼 " + "이름: " + name + "\n" + "나이: " + age;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) // 가르키고 있는 주소값이 같으면 같은 것.
			return true;
		
		if( !(o instanceof Rabbit) ) { // o가 Rabbit의 instance를 가지고 있냐?
			return false;
		}
		Rabbit other = (Rabbit) o;
		return this.name.equals( other.name ) && this.age == other.age;
	}
	
}
