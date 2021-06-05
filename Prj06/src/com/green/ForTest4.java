package com.green;

public class ForTest4 {

	// user-defined function : 사용자 정의 함수
	public static void line( int n )  {
		System.out.println(n + ".---------------------");
	}
	
	public static void main(String[] args) {
		
		int rows = 5;
		int cols = 5;
		
		line(1);
		System.out.print("*****\n");
		System.out.print("*****\n");
		System.out.print("*****\n");
		System.out.print("*****\n");
		System.out.print("*****\n");	
		
		line( 2 );		
		for(int i=1 ; i<=rows ; i++ ) {
			// (1)
			System.out.print("*****");
			// (2)
			System.out.print("\n");  
		}
		
		line( 3 );
		for(int i=1 ; i<=rows ; i++ ) {
			// (1)
			System.out.print("*");
			System.out.print("*");
			System.out.print("*");
			System.out.print("*");
			System.out.print("*");
			// (2)
			System.out.print("\n");  
		}
		
		line( 4 );
		// nested for 중첩 for
		for(int i=1 ; i<=rows ; i++ ) {
			// (1)
			for(int j=1;j <= cols ;j++) {
				System.out.print("*");
			}			
			// (2)
			System.out.print("\n");  
		}
		
		line(5);
		for(int i=1;i<=rows;i++) {
			// 1
			for(int j = 1;j <= i ; j++ ) {
				System.out.print("*");
			}
			System.out.print("\n");  // 2			
		}
		
		line(6);
		for(int i=1; i <= rows ;i++) {
			for(int j = 1; j <= 6-i; j++ ) {
				System.out.print("*");
			} 
			System.out.print("\n");
		}
		
		line(7);
		for(int i=1;i<=rows;i++) {
			for(int j=6-i;j<=5;j++) {
				System.out.print("*");	
			}
			System.out.print("\n");
		}
		
		line(8);
		for(int i=1;i<=rows;i++) {
			// 1 : j1 공백
			for(int j1=1; j1<=5-i; j1++) {
				System.out.print(" ");	
			}
			// 2 : j2 '*'
			for(int j2= 6-i ; j2<= 5 ; j2++) {
				System.out.print("*");	
			}
			// 3 \n
			System.out.print("\n");
		}
		
		////////////////////과제///////////////////////////
		
		line(9);
		String blankStr = "";
		for(int i = 1; i <= rows; i++) {
			System.out.print(blankStr);
			for(int j = 1; j <= cols + 1 - i; j++) System.out.print("*");
			blankStr += " ";
			System.out.println();
		}
		
		line(10);
		rows = 7;
		int sw = -1, star = 1, blank = rows / 2, mid = rows / 2 + 1;
		for(int i = 1; i <= rows; i++) {
			for(int j = 1; j <= blank; j++) System.out.print(" ");
			for(int j = 1; j <= star; j++) System.out.print("*");
			
			if(mid == i) sw *= -1;
			star += -sw * 2;
			blank += sw;
			System.out.println();
		}
		
		line(11);
		rows = 7;
		sw = -1; star = rows / 2 + 1; blank = 1; mid = rows / 2 + 1;
		for(int i = 1; i <= rows; i++) {
			for(int j = 1; j <= star; j++) System.out.print("*");
			for(int j = 1; j <= blank; j++) System.out.print(" ");
			for(int j = 1; j <= star; j++) System.out.print("*");
			
			if(mid == i) sw *= -1;
			blank += -sw * 2;
			star += sw;
			System.out.println();
		}
	}

}









