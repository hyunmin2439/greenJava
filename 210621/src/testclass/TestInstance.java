package testclass;

public class TestInstance {
	public static void main(String[] args) {
		Integer i = new Integer(10);
		String  s = new String("a");
		
		Object o  = new Integer(10); // UpCasting
		Object o2 = new String("a");
		
		System.out.println( i.intValue() );
		//System.out.println( o.intValue() ); // object는 그 객체가 가지고 있는 행동을 할 수 없다.
		System.out.println( ((Integer) o).intValue() ); // casting을 하고 사용할 수 있다.
		
		System.out.println( ((String) o).isEmpty() ); // o를 착각해서 잘못 casting
		// 컴파일 에러X, 실행시 에러 : java.lang.ClassCastException
		
		// instanceof : 참조변수가 어떤 객체를 가르키고 있는지 확인
		// 때문에 미리 o가 Integer를 가르키고 있는지 확인
		if(o instanceof Integer) { // 즉, 안전한 casting을 위해서
			Integer a = (Integer) o; // DownCasting
			System.out.println( a.intValue() );
		} else if (o instanceof String) {
			String b = (String) o;
			System.out.println( ((String) o).isEmpty() );
		}
	}
}
