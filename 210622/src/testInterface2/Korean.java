package testInterface2;

// 한국어 인사를 말할 수 있는 한국인
public class Korean extends Thing implements SpeakAndWrite {

	public Korean(String thing) {
		this.thing = thing;
	}
	
	@Override
	public void greeting() {
		System.out.print(thing + "이(가) ");
		SpeakAndWrite.super.greeting();
		System.out.println("안녕하세요");
	}

	@Override
	public void write() {
		System.out.println("한글을 씁니다.");
	}
}
