package testInterface2;

// 영어 인사를 말할 수 있는 미국인
public class American extends Thing implements Greeting, Write {

	public American(String thing) {
		this.thing = thing;
	}
	
	@Override
	public void greeting() {
		System.out.print(thing + "이(가) ");
		Greeting.super.greeting(); // super 왜 쓰지
		// Greeting 인터페이스의 greeting() 메서드를 호출하여 실행하고 자식의 메서드를 수행
		System.out.println("Hello");
	}

	@Override
	public void write() {
		System.out.println("영어를 적습니다.");
	}
}
