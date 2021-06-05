package com.green.prj02;

public class TestMain {

	public static void main(String[] args) {
		int v1,  v2;
		int v;
		v1 = 7;
		v2 = 2;
		v  = v1 + v2;
		System.out.println(v);
		
		double h     = 25;
		double w     = 30;
		double area;
		
		area = h * w;
		
		System.out.println( area  + " 평방미터");
        System.out.println('한');
     //   System.out.println('한국');
		
        String  title = String.valueOf( 'A' ); 
        String  name  = "아이유";
        String  heart = " 🧡🧡 ";
        String  shape = "⭕⭕⭕⭕❓❓⭕⭕⭕⭕❓❓ ";
        System.out.println(name);
        System.out.println("🧡🧡" + name + "🧡🧡");
        System.out.println(heart + name + heart);
        System.out.println(shape + name);
		
        long  l   = 32l;
        int   val = 3;
        
        long result;
        result = l + val;
        System.out.println( result );
        
        // (int) : casting 얀산자 강제 형변환
        int  x = (int) 32l;
                
        short s1 = 10;
      //  short s1 = 100000;
        short s2 = 10;
        short s = (short) (s1 + s2);
        System.out.println(s);
        

	}

}
