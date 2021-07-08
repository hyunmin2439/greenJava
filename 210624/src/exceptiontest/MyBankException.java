package exceptiontest;

// 자신이 임의의 예외 클래스를 만들 수 있다.
public class MyBankException extends Exception {
	private int amount;

	// Alt + Shift + S => Constructors from SuperClass
	public MyBankException(String message, int amount) {
		super(message);
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}
}
