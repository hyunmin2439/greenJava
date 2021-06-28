package testconst;

public class Main {

	public static void main(String[] args) {
		// Date today = new Date(2021, 6, 23, 3); 
		// 맨 뒤의 3이라고 표현하면 명확하지 않다.
		// 인터페이스로 요일을 적어놓으면 조금 더 명확해 진다.
		
		Date today = new Date(2021, 6, 23, Days.WEDNESDAY);
		Date restDay = new Date(2021, 6, 26, Days.SATURDAY);
		
		switch( restDay.dayOfWeek ) {
		case 1: case 2: case 3: case 4: case 5:
			System.out.println("일하자~");
			break;
		case Days.SATURDAY:
		case Days.SUNDAY:
			System.out.println("휴일이다. 놀자");
			break;
		default:
			System.out.println("없는 요일");
			break;
		}
	}
}
