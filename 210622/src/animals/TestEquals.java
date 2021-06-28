package animals;

public class TestEquals {

	public static void main(String[] args) {
		
		/////// equals 사용이유 ///////
		Tail t1 = new Tail(10, 10);
		Tail t2 = new Tail(20, 20);
		Tail t3 = new Tail(10, 10);
		Tail t4 = t1;
		
		// 같은 Reference를 가르키고 있느냐?
		System.out.println(t1 == t2); // false
		System.out.println(t1 == t3); // false : t1, t2 => new 다른 객체
		System.out.println(t1 == t4); // true
		
		System.out.println(t1.equals(t2)); // false
		System.out.println(t1.equals(t3)); // true : 내가 Override한 같냐고 묻는
										   // equals 메소드에 의해 t1, t2가 가진
										   // 속성 값이 같기 때문에 true
		System.out.println(t1.equals(t4)); // true
		
		"abc".equals("abc");
		
		/////// setter 사용 이유 ///////
		Tail t = new Tail(10, 20);
		t.setLength(15); // 꼬리 털 길이가 자란다면? 
						 // 꼬리가 새로 생긴 것이 아니기 때문에 new X
						 // length는 private이기 때문에 setter를 이용해서 값을 바꿔줘야 함
		System.out.println( t.getLength() );
	}
}
