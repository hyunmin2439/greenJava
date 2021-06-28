package testInterface;

//Interface는 인터페이스라는 의미로 I를 붙이기도 하고 그냥 쓰기도 한다.

public interface Flyable { 
	// 추상 메서드만 가진 클래스를 인터페이스라고 한다.
	public abstract void fly(); // 인터페이스이기 때문에 public abstract를 생략해도 된다.
	
	// public을 private로 선언하면
	// Illegal modifier for the interface method fly; only public, abstract, default, static and strictfp are permitted
	// 인터페이스 메서드에 잘못된 수정자 fly. 공용, 추상, 기본값, 정적 및 엄격한 fp만 허용됨
	// strictfp는 정말 간단한 개념인데, 자바와 타 플랫폼간의 부동소수점의 정밀도를 맞춰주기 위한 키워드

}
