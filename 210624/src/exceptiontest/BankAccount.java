package exceptiontest;

public class BankAccount {
	private int balance;

	public int getBalance() {
		return balance;
	}

	public void deposit(int amount) {
		balance = amount;
	}
	
	public void withdraw(int amount) throws MyBankException { // MyBankException 예외처리를 던져서 맡기는 것.
		if(balance > amount) {
			balance -= amount;			
		} else {
			throw new MyBankException("잔고 부족함:", amount - balance);
		}
	}
	
	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		b.deposit(10000);
		try {
			b.withdraw(50000);
		} catch (MyBankException e) {
			e.printStackTrace();
			System.out.println("부족한 잔고:" + e.getAmount());
		}
		
		System.out.println(b.getBalance()); // 프로그램은 정상적으로 흘러갔음
	}
}
