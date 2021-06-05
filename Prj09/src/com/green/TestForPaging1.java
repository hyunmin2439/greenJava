package com.green;

public class TestForPaging1 {

	public static void main(String[] args) {
		int totPage = 26;
		int pagePerLine = 10;
		
		/*
		 *        1   2   3   4   5   6   7   8   9  10  > >>
		 * << <  11  12  13  14  15  16  17  18  19  20  > >>
		 * << <  21  22  23  24  25  26  
		 */
		
		System.out.println("\n==============내가 푼 방법==============");
		
		for (int i = 1; i <= totPage; i++) {
			if(i % pagePerLine == 1) {
				if(i == 1) System.out.print("     ");
				else System.out.print("<< < ");
			}
			
			System.out.printf(" %2d ", i);
			
			if(i % pagePerLine == 0) {
				System.out.print(" > >>\n");
			}
		}
		
		System.out.println("\n==============문제있는 방법==============");
		
		// 만약 totPage가 30이라면 > >>가 찍히고 그 밑에 다음 페이지가 없음에도 << <가 찍힌다.
		
		System.out.print("     ");
		for (int i = 1; i <= totPage; i++) {
			System.out.printf(" %2d ", i);
			if(i % pagePerLine == 0) {
				System.out.print(" > >>\n");
				System.out.print("<< < ");
			}
		}
		
		System.out.println("\n==============추가조건(nowPage)==============");
		
		int nowPage = 21;
		int start, end;
		
		start = nowPage / 10 * 10 + 1;
		end   = start + pagePerLine - 1; // nowPage / 10 * 10 + pagePerLine;
		if(end > totPage) end = totPage;
		
		//System.out.println(start + "  " + end);
		
		if(start == 1) System.out.print("     ");
		else System.out.print("<< < ");
		
		if( !(end == totPage) ) // end < totPage 같은 조건
			System.out.print(" > >>\n");
		
		for (int i = start; i <= end; i++) {
			System.out.printf(" %2d ", i);
		}

	}

}
