package person;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Person {
	String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public static void main(String[] args) {
		Set<Person> mySet = new HashSet<Person>();
		mySet.add(new Person("AAA"));
		mySet.add(new Person("AAA"));
		mySet.add(new Person("BBB"));
		mySet.add(new Person("CCC"));
		mySet.add(new Person("DDD"));
		System.out.println(mySet);
		
		// 중복되있는지 없는지 알아야 중복을 제거할 수 있다.
		// 때문에 HashCode + equals를 Override를 해서 같은지 다른지 판별할 수 있게 해주어야 한다.
		// HashCode는 객체에 부여되는 특별한 숫자
	}
}
