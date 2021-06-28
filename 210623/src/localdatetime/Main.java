package localdatetime;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now(); // 날짜 클래스, public static 메소드
		LocalDate someDay = LocalDate.of(2020, 6, 1); // 원하는 날짜 출력가능
		LocalDate parsing = LocalDate.parse("2021-03-01");
		LocalDate tomorrow = now.plusDays(-1); // 양수면 더해서 날짜 출력, 음수면 빼서 날짜 출력
		
//		System.out.println(now); // 2021-06-23
//		System.out.println(someDay); // 2020-06-01
//		System.out.println(parsing); // 2021-03-01
//		System.out.println(tomorrow); // 2021-06-22
		
		
		System.out.println( "일:" + now.getDayOfMonth() );
		System.out.println( "월:" + now.getMonth() );
		System.out.println( "월 value:" + now.getMonth().getValue() );
		System.out.println( "년:" + now.getYear() );
		System.out.println( "요일:" + now.getDayOfWeek() ); // 1 (Monday) to 7 (Sunday)
		System.out.println( "요일 value:" + now.getDayOfWeek().getValue() ); // 요일을 숫자로 알려준다.
		System.out.println( "달 길이:" + now.lengthOfMonth() ); //해당 월의 마지막 날짜를 알려준다.
	}

}
