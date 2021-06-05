package com.green;

public class TestFloatDouble {
	
	private static double round(double v, int i) {
//		  23.456 * 100.0
//		  2345.6 + 0.5 
//		  (int) 2346.1 -> 2346
//		  2346 / 100.0 
//		  23.46
		
		double r = (int)(v * Math.pow(10, i) + 0.5);
		
		r = r / Math.pow(10, i);
		
		return r;
	}

	public static void main(String[] args) {
		
		double org = 23.4578;
		double num   = round(org, 3);
		System.out.println( num );
		System.out.printf( "%.3f \n", org );
		
		
		
		float f = 0.0f;
		for(int i = 1; i <= 10_000; i++) {
			f += 0.1f;
		}
		System.out.println(f); // 999.9029
		// float는 0.1보다 조금 적게 저장된다.
		
		double d = 0.0;
		for(int i = 1; i <= 10_000; i++) {
			d += 0.1;
		}
		System.out.println(d); // 1000.0000000001588
		
		// float보다 double이 더 정확하다.
		// 실수 계산할 때는 double 사용하는게 낫다.
		// 반복문을 실수로 돌리지 말것. 반복은 횟수. 정수로 할 것.
	}

}
