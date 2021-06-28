package testInterface2;

/*
 * 한국어 인사를 말할 수 있는 한국인
 * 영어 인사를 말할 수 있는 미국인
 * 스페인어 인사를 말할 수 있는 인공지는 스피커 (chao)
 */

public class Main {

	public static void main(String[] args) {
		Korean k = new Korean("한국인");
		American a = new American("미국인");
		Greeting ai = new AISpeeker("AI스피커");
		
		k.greeting();
		k.write();
		
		a.greeting();
		a.write();
		
		ai.greeting();
	}

}
