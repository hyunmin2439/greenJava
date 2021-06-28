package testInterface2;

// interface를 다 이해하면 java를 완벽히 이해한 것이라고 생각할 수 있다.

public interface Greeting {
	public default void greeting() {
		System.out.print("인사말을 합니다 : ");
	}
}

// 글을 적는 기능을 추가하려고 하는데 AI 스피커는
// 글을 적지 못한다. 이럴때 할 수 있는 방법 두가지

// 인터페이스를 상속 받은 인터페이스 => Korean
interface SpeakAndWrite extends Greeting {
	void write();
}

// 인터페이스 다중 상속 => American
interface Write {
	void write();
}