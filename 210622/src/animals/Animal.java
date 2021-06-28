package animals;

// 클래스를 다 작성하고 나면 내 의도대로 잘 만들어졌는지 확인해야한다.

// 상속의 문제점
// Animal을 상속받아 비둘기를 만들고 싶다.
// 하지만 비둘기는 꼬리가 없다.
// => tail 변수를 없앤다. => Dog, Cat, Lion Class에 문제가 생긴다.

// 

public class Animal {
	private Tail tail;// 꼬리
	private String color;// 털 색깔
	private int age;// 나이
	
	public Animal() {
		
	}
	
	public Animal(Tail tail, String color, int age) {
		super();
		this.tail = tail;
		this.color = color;
		this.age = age;
	}
	
	public Tail getTail() {
		return tail;
	}


	public void setTail(Tail tail) {
		this.tail = tail;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((tail == null) ? 0 : tail.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (age != other.age)
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (tail == null) {
			if (other.tail != null)
				return false;
		} else if (!tail.equals(other.tail))
			return false;
		return true;
	}
	
	@Override
	public String toString() { // tail(.toString) 생략되어 있음
		return "Animal [tail=" + tail + ", color=" + color + ", age=" + age + "]";
	}

	public void walk() { // 걷는다
		System.out.println("동물이 걷습니다.");
	}
}
