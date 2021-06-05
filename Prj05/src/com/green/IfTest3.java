package com.green;

import java.util.Currency;
import java.util.Locale;

public class IfTest3 {

	public static void main(String[] args) {
		
		int birthYear = 1993;
		int ddi       = birthYear % 12;
		
		String ddiStr = "";
		if(ddi == 0 ) 
			ddiStr = "원숭이";
		else
			if(ddi == 1 ) 
				ddiStr = "닭";
			else
				if(ddi == 2 ) 
					ddiStr = "개";
				else
					if(ddi == 3 ) 
						ddiStr = "돼지";
					else
						if(ddi == 4 ) 
							ddiStr = "쥐";
						else
							if(ddi == 5 ) 
								ddiStr = "소";
							else
								if(ddi == 6 ) 
									ddiStr = "호랑이";
								else
									if(ddi == 7 ) 
										ddiStr = "토끼";
									else
										if(ddi == 8 ) 
											ddiStr = "용";
										else
											if(ddi == 9 ) 
												ddiStr = "뱀";
											else
												if(ddi == 10 ) 
													ddiStr = "말";
												else
													if(ddi == 11 ) 
														ddiStr = "양";
	
		System.out.println("당신의 띠는 " + ddiStr + " 띠 입니다");
		
		if(ddi == 0 )	    ddiStr = "원숭이";
		else  if(ddi == 1 )	ddiStr = "닭";
		else  if(ddi == 2 )	ddiStr = "개";
        else  if(ddi == 3 )	ddiStr = "돼지";
        else  if(ddi == 4 )	ddiStr = "쥐";
		else  if(ddi == 5 )	ddiStr = "소";
		else  if(ddi == 6 )	ddiStr = "호랑이";
		else  if(ddi == 7 )	ddiStr = "토끼";
		else  if(ddi == 8 )	ddiStr = "용";
		else  if(ddi == 9 ) ddiStr = "뱀";
		else  if(ddi == 10 ) ddiStr = "말";
		else  if(ddi == 11 ) ddiStr = "양";
													
		
		System.out.println("당신의 띠는 " + ddiStr + " 띠 입니다");
		
		switch(ddi) {
		case 0: ddiStr = "원숭이"; break;
		case 1: ddiStr = "닭"; break;
		case 2: ddiStr = "개"; break;
		case 3: ddiStr = "돼지"; break;
		case 4: ddiStr = "쥐"; break;
		case 5: ddiStr = "소"; break;
		case 6: ddiStr = "호랑이"; break;
		case 7: ddiStr = "토끼"; break;
		case 8: ddiStr = "용"; break;
		case 9: ddiStr = "뱀"; break;
		case 10: ddiStr = "말"; break;
		case 11: ddiStr = "양"; break;
		//default :
		//	ddiStr  = "";
		}
			
		System.out.println("당신의 띠는 " + ddiStr + " 띠 입니다");
		
		String won = Currency.getInstance(Locale.KOREA).getSymbol();
		System.out.printf("%s %,d\n", won, 123456789);
	}

}
