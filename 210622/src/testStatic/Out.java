package testStatic;

public class Out {

	// 이클립스 자체가 프로그램 시작점을 여러군데에서 사용할 수 있도록 제공한다.
	// main은 한 프로젝트 안에서 하나만 있는 것이 좋다.
	public static void main(String[] args) {
		//sayHo(); // 불가능 어디 있는 sayHo method인지 모름
		TestStatic.sayHo();
	}

}
