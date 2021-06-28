package primenumber;
import java.util.ArrayList;
import java.util.List;

/*
 * 다음 중 가장 큰 소수를 찾아 출력하시오.
 * 1. 2^17 - 1
 * 2. 3^10 - 2
 * 3. 5^ 7 - 3
 * 4. 소수가 없다.
 */

public class Main {
//	Method
//	Access Modifier, (static Type), return type, method name, parameter // Method header
//	Method body
	
	private static int pow(int n, int e) {
		int pow = 1;
		
		for(int i = 0; i < e; i++) {
			pow *= n;
		}
		
		return pow;
	}
	
	private static boolean isPrimeNumber(double n) {
		if(n % 2 == 0) return false;
		
		for(int i = 3; i <= Math.sqrt(n); i += 2) {
			if(n % i == 0) return false;
		}
		
		return true;
	}
	
	private static int largestPrime( List<Integer> list ) {
		int max = 0;
		for(int i = 0; i < list.size(); i++) {
			
			if( isPrimeNumber( list.get(i ) ) ) {
				max = Math.max(max, list.get(i));
			}
		}
		return max;
	}
	
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add( pow(2, 17) - 1 ); 
		list.add( pow(3, 10) - 2 ); 
		list.add( pow(5, 7) - 3 );
		
		System.out.println( largestPrime( list ) );
		
	}
	
}
