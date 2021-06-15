package com.green.thread1;

import java.awt.Toolkit;

public class BeepTest1 {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i = 0; i < 5; i++) {
			toolkit.beep(); // 띵 소리를 내는 것.
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		// 소리가 나면서 띵 문자를 출력해야 하지만 
		// 소리가 5번 나고 띵 문자가 출력이 된다.

	}

}
