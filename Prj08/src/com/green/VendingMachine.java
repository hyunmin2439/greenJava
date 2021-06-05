package com.green;

import java.util.Scanner;

public class VendingMachine {
	final static int INPUT_DEPOSIT = 0;
	final static int SELECT_PRODUCT = 1;
	final static int INPUT_OR_SELECT = 2;
	final static int INPUT_END = 3;
	
	static int state = INPUT_DEPOSIT;
	
	// Field 변수 자동 0 초기화
	static int depos, withd, prodt; 
	static int[] change = new int[9];	
	
	static int[] price = {3999, 2353, 3253, 2142, 6999, 2350, 2363, 11222, 52200};
	
	public static void priceCal() {
		if(depos - price[prodt] < 0) 
			state = INPUT_OR_SELECT;
		else {
			withd = depos - price[prodt];
			state = INPUT_END;
		}
	}
	
	public static void inputString(int i) {
		switch(i) {
		case 0:
			System.out.print("금액을 투입해 주십시오:");
			break;
		case 1:
			System.out.println("현재 투입 금액 : " + depos);
			System.out.println("물건을 선택해주십시오.(1 ~ 9)\n"
					+ "1 : 3,999  2 :  2,353  3 :  3,253\n"
					+ "4 : 2,142  5 :  6,999  6 :  2,350\n"
					+ "7 : 2,363  8 : 11,222  9 : 52,200");
			break;
		case 2:
			System.out.println("금액이 부족합니다.");
			System.out.println("금액 추가 투입 : 0\n다른 상품 선택 : 1");
			break;
		case 3:
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
	}
	
	public static void input() {
		Scanner in = new Scanner(System.in);
		
		if(state == INPUT_OR_SELECT) {
			inputString(2);
			
			while( true ) {
				state = in.nextInt();
				
				if(state == INPUT_DEPOSIT || state == SELECT_PRODUCT) break;
				else inputString(3);
			}
		}
		
		if(state == INPUT_DEPOSIT) {
			inputString(0);
			
			depos += in.nextInt();
			state = SELECT_PRODUCT;
		}
		
		if(state == SELECT_PRODUCT) {
			inputString(1);
			
			while( true ) {
				prodt = in.nextInt() - 1;
				
				if(0 <= prodt && prodt <= 8) break;
				else inputString(3);
			}
			
			priceCal();
		}
	}
	
	public static void process() {
		int tmpWithd = withd, won = 10000;
		
		for(int i = 0; i < 9; i++) {
			change[i] = tmpWithd / won;
			tmpWithd %= won;
			
			if(i % 2 == 0) won /= 2;
			else won /= 5;
		}
	}
	
	public static void output() {
		int won = 10000;
		System.out.println("잔액은 " + withd + "원 입니다." );		
		
		for(int i = 0; i < 9; i++) {
			System.out.printf("%5d원은 %2d개 입니다.\n", won, change[i]);
			
			if(i % 2 == 0) won /= 2;
			else won /= 5;
		}
	}
	
	public static void main(String[] args) {
		while(state != INPUT_END)
			input();
		process();
		output();
	}
}
