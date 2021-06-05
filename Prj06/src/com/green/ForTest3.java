package com.green;

public class ForTest3 {

	public static void main(String[] args) {
		int j, sum;
		j = 0;	sum = 0;
		for(int i=1;i<=5;i++) {
			j   =  j + 1;
			sum = sum + j;
		}
		System.out.println("1+2+3+4+5=" + sum);
		
		//-------------------------------
		j = 0; sum = 0;
		for(int i=1; i<=5 ; i++) {
			 j   = j   + 2;
			 sum = sum + j;
		}
		System.out.println("2+4+6+8+10=" + sum);
		
		//--------------------------------
		j = -1 ;  sum = 0;
		for(int i=1; i<=5 ; i++ ) {
			j   = j + 2;
			sum += j;
			System.out.println(i + "," + j + "," + sum);
		}
		System.out.println("1+3+5+7+9=" + sum);
		
		//--------------------------------
		sum = 0;
		for(int i=1;i<=9;i=i+2) {
			sum = sum + i;
		}
		System.out.println("1+3+5+7+9=" + sum);
		
		//--------------------------------
		sum = 0;
		for(int i=1;i<=7;i++) {
			 j   = (int) Math.pow(2, i-1);
			 sum = sum + j;
		}
		System.out.println("1+2+4+8+16+32+64=" + sum);
		
		//--------------------------------
		// (1)   (2) 
		//  1 +  (2 + 4 + 8 + 16 + 32 + 64) =
		// (2)
		j = 1; sum = 0;
		for(int i=1;i<=6;i++) {
			j   = j   * 2;
			sum = sum + j; 
		}
		//    !1) + (2)
		sum  = 1 + sum;
		System.out.println("1+2+4+8+16+32+64=" + sum);
		
		//-------------------------------------
		j = 0; sum = 0;
		for(int i=1;i<=5;i++) {
			j   = j   + i;
			sum = sum + j;
		}
		System.out.println("1+1+2+1+2+3+1+2+3+4+1+2+3+4+5==" + sum);
		//-------------------------------------
		int j1 = 1, j2 = 0 ;
		sum = 0;
		for(int i=1;i<=30;i++) {
			j   = j1  + j2;
			sum = sum + j;
            j2  = j1;
            j1  = j;			         
		}	
		System.out.println("1+2+3+5+8+13+21=" + sum);
	}

}















