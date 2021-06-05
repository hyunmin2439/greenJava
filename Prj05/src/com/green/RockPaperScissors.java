package com.green;

import java.util.Scanner;

public class RockPaperScissors {
	
	public static String rpsString(int rps) {
		switch(rps) {
		case 0: return "가위";
		case 1: return "바위";
		default: return "보";
		}
	}
	
	public static void main(String[] args) {
		int me, com, result;
		Scanner in = new Scanner(System.in);
		
		System.out.println("================가위 바위 보 게임================");
		
		while(true) {
			while(true) {
				System.out.println("가위(0), 바위(1), 보(2) 중 낼 것을 입력해주세요.");
				me = in.nextInt();
				
				if(0 <= me && me <= 2) break;
				else System.out.println("잘못입력하셨습니다.");
			}
			
			com = (int)(Math.random() * 3);
			result = me - com;
			
			System.out.println("당신은 " + rpsString(me) + ", 컴퓨터는 " + rpsString(com) + "를 냈습니다.");
			
			switch(result) {
			case -2: case 1:
				System.out.println("당신이 이겼습니다.");
				break;
			case -1: case 2:
				System.out.println("당신이 졌습니다.");
				break;
			default: // case 0도 가능
				System.out.println("비겼습니다.");
			}
		}
		
	}

}
