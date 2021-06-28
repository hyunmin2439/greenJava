package animals;

public class TestAnimal {

	public static void main(String[] args) {
		// Animal 클래스를 다 작성하고 잘 작성이 되었는지 확인
		Animal a = new Animal();
		System.out.println(a);
		
		Animal a2 = new Animal(new Tail(10, 10), "검정", 5);
		System.out.println(a2);
		
		Animal a3 = new Animal(new Tail(10, 10), "검정", 5);
		
		System.out.println(a2.equals(a3));
		
		a.walk();
		
		///////////////////////////////////////////////////////////////
		
		// extends Animal만 작성하고 아무것도 작성하지 않아도 
		// Animal의 method를 상속 받아 사용가능하다.
		Dog d = new Dog();
		
		d.setTail(new Tail(30, 30));
		d.setColor("빨강");
		d.setAge(3);
		
		d.bark(); // dog class에 선언된 메서드
		// a.bark(); // Animal에 bark() 메소드가 정의 된게 아니기 때문에 사용 불가.
		
		System.out.println(d); // Animal [tail=null, color=null, age=0]
	}

}
