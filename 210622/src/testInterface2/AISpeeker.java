package testInterface2;

// 스페인어 인사를 말할 수 있는 인공지는 스피커 (chao)
public class AISpeeker extends Thing implements Greeting {
	
	public AISpeeker(String thing) {
		this.thing = thing;
	}
	
	@Override
	public void greeting() {
		System.out.print(thing + "이(가) ");
		Greeting.super.greeting();
		System.out.println("chao");
	}

}
