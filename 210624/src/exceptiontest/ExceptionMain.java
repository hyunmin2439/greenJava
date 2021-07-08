package exceptiontest;

import java.util.Scanner;

// checked Exception : 무조건 체크를 해야하는 예외
// unchecked Exception : try catch를 안해도 되는 예외 => Runtime E~ ex) 10 /0

public class ExceptionMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("피젯수: ");
		int x = sc.nextInt();
		System.out.print("젯수: ");
		int y = sc.nextInt();
		
		
		if( y != 0 ) { } //  / by 0는 예외 처리를 하지말고 if를 쓰면 된다.
		
		try { // divide by zero Exception
			int result = x / y; // 예외 발생!
			throw new Exception("내가 맘대로 생성해서 던지는 예외"); // Exception이 없으면 오류
		} catch (ArithmeticException e) { 
			System.out.println("111111");
			// ArithmeticException은 RuntimeException을 상속받고 있다.
			// 따라서 RuntimeException을 써도 divide by zero E~ 잡을 수 있다.
			System.out.println(e.getMessage()); // / by zero
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (RuntimeException e) { // Ari~, Run~ 위치를 바꾸면 오류
			System.out.println("222222"); // 자식은 제일 위에 쓰고, 부모는 제일 밑에
		} catch (Exception e) {
			System.out.println("333333");
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("언제나 실행됩니다.");
		}
		System.out.println("프로그램은 계속 진행됩니다.");
	}
}
