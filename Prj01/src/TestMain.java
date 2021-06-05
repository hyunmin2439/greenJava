import java.util.Date;

public class TestMain {

	// Comment 주석, 설명문
	// 함수 : 프로그램의 조각
	// 함수: function -> method(class 안에 있는 홤수)
	// Program entry Point : 진입점
	
	public static void line() {
		System.out.println("---------------------------------");
	}
	
	public static void init() {
		System.out.println("아이유");       //  String
		System.out.println(010-7561-1447 );  // 숫자 		
	}
	
	public static void main(String[] args) {
		line();
		//java.util.Date today = new java.util.Date();
		Date today = new Date();
		System.out.println( today.toLocaleString() );
		init();
		line();
		System.out.println("010-7561-1447"); // 문자열 String
		System.out.println('A');
		System.out.printf("%d\n", 65);  // decimal 10진수
		System.out.printf("%c\n", 65);  // char    문자   A
		line();
		
	} // main end

}  // class end











