package wrapper;

public class Main {
	public static void main(String[] args) {
		
		int i = 10;
		double d = 5.5;
		boolean b = true;
		
		//Wrapper 클래스 : Primitive Type -> Reference Type (Boxing)
		//Wrapper 클래스는 자동으로 Boxing || UnBoxing을 해주기 때문에 대입연산자로 넣어주기만 하면 된다.
		Integer boxedI = i;
		Integer boxedI2 = i;
		
		int my = boxedI; // Reference Type -> Primitive Type (UnBoxing)
		int my2 = boxedI2.intValue(); // Integer값을 집어넣을 수 있다.
								      
		// null값이 들어있는 boxedI2 int로 변환시키고 출력하려고 하면 NullPointerE~
		System.out.println(my);
		System.out.println(my2);
		
		// Wrapper 클래스들은 아래와 같은 행동을 할 수 있다.
		System.out.println(boxedI.compareTo(boxedI2));
		System.out.println(boxedI.doubleValue());
		System.out.println(Integer.MAX_VALUE);
		System.out.println(boxedI.MAX_VALUE); // 오류 The static field Integer.MAX_VALUE should be accessed in a static way
		System.out.println(Integer.MIN_VALUE);
		
		// Static Method : Can be used without creating
		Integer value = Integer.valueOf("1010"); // valueOf => Integer type return
		int parse = Integer.parseInt("2020"); // parseInt => int type return
		
		System.out.println(value + 9);
		System.out.println(parse + 9);
		
		
		Double  boxedD = d;
		Double  boxedD2 = new Double(d);
		
		Boolean boxedB = b;
		Boolean boxedB2 = new Boolean(b);
		
	}
}
