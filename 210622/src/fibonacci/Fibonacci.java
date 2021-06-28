package fibonacci;
import java.math.BigInteger;

/*
 * 다음과 같은 피보나치 수열을 출력해보세요.
 * 0 1 2 3 4 5 6 7  8  9
 * 
 * 0 1 1 2 3 5 8 13 21 34 ...
 * 
 * 정수 100개.
 * 
 * 개인 이름. 적어서 보내주세요~~
 */


public class Fibonacci {
	
	private static void fibo() {
		long f1 = 1, f2 = 1, f3;
		System.out.println("1:" + f1 + "\n2:" + f2);
		for(int i = 3; i <= 100; i++) {
			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
			
			System.out.println(i + ":" + f3);
		}
	}
	
	public static void main(String[] args) {
		//fibonacci();
		//bigFibonacci();
		fibo();
	}
	
	private static char[] reverseChar(String str) {
		char[] result = new char[str.length()];
		char[] input = str.toCharArray();
		
		for (int j = str.length() - 1; j >= 0; j--) {
			result[str.length() - 1 - j] = input[j];
		}
		
		return result;
	}
	
	private static void fibonacci() {
		long[] f = new long[3];
 		f[0] = 0; f[1] = 1;
 		
 		// 0 ~ 1
 		for(int i = 0; i < 2; i++) {
 			System.out.printf("%d:%d / ", i, f[i]); 			
 		}
 		
 		// 2 ~ 92
		for(int i = 2; i < 93; i++) {
			f[2] = f[0] + f[1];
			f[0] = f[1];
			f[1] = f[2];
			
			System.out.printf("%d:%d / ", i, f[2]);
			if(i % 10 == 0) System.out.println();
		}
		
		//f[0] : 91 f[1] : 92   f[2] : 92
		// 93번째 부터 long overflow
		
		int sum, carry, minLen;
		char[] f1; char[] f2;
		String strf1 = String.valueOf(f[0]), strf2 = String.valueOf(f[1]);
		String printStr;
		
		for(int i = 93; i < 101; i++) {
			f1 = reverseChar( strf1 );
			f2 = reverseChar( strf2 );
			printStr = ""; carry = 0; sum = 0; minLen = 0;
			
			System.out.print(i + ":");
			
			minLen = f1.length < f2.length ? f1.length : f2.length;
			
			for(int j = 0; j < minLen; j++) {
				sum = (f1[j] - 48) + (f2[j] - 48) + carry;
				carry = sum / 10;
				sum %= 10;
				
				printStr = sum + printStr;
				
				if(j == minLen - 1) {
					// 자리수 차이 나도 한자리 밖에 안남
					if(f1.length > f2.length) { 
						carry += f1[f1.length - 1] - 48;
					}
					else if(f1.length < f2.length) {
						carry += f2[f2.length - 1] - 48;
					}
					if(carry != 0)printStr = carry + printStr;
					System.out.print(printStr + " / ");
					
					strf1 = strf2;
					strf2 = printStr;
				}
			}
		}
		
	}
	
	public static void bigFibonacci() {
 		BigInteger f1 = new BigInteger("1");
 		BigInteger f2 = BigInteger.valueOf(1);
 		BigInteger f3;
 		
		for(int i = 3; i < 101; i++) {
			f3 = f1.add(f2); // 굳이 아래 처럼 새로 만들어서 가르키게 안해도 될듯.
			//f3 = new BigInteger( f1.add(f2).toString() ); // f1.add(f2)를 하면 f1에 f2가 더해져 f3는 f1과
															// 같은 값을 가르키기 때문에 f1의 문자열로
														    // 새로운 것을 가르키게 만들어 준다.
			f1 = f2;
			f2 = f3;
			System.out.println(i + ":" + f3);
		}
	}


}  
