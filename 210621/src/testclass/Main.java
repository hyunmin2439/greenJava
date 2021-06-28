package testclass;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		Rabbit r = new Rabbit();
		r.setName( "토깽이" );
		r.setAge( 10 );
		
		System.out.println( r.getName() );
		System.out.println( r.getAge() );
		
		Rabbit r2 = new Rabbit(3, "토쟁이");
		
		System.out.println(r.toString());
		System.out.println(r2.toString());
		
		System.out.println( r.equals(r2) );
		
		CarrotFactory factory = new CarrotFactory();
		List<Carrot> list = factory.makeCarrots(5);
		
		
		r.eat(list.get(0));
		System.out.println( r.isHungry() );
		
		Carrot c = new Carrot(11);
		r.eat(c);
		System.out.println( r.isHungry() );
		System.out.println( c.getWeight() );
	}

}
