package com.green.thread1;

import java.awt.Toolkit;

public class BeepTest2 {

	public static void main(String[] args) {
		// Instruction Point : IP
		// Program Count     : PC
		
		// Multi Threading
		
		// Parallel Program : 병렬 프로그램
		// Multi Processing : 다중 프로세싱

		// 동시에 다른일 두가지를 실행하는 방법
		// thread
		// 별도의 클래스로 작업(Task) 분리
		// 클래스에 저장된 소스를 별도의 thread로 실행한다.
		
		/*
		// 첫번째 방법
		Runnable beepTask = new BeepTask();
		Thread	 thread	  = new Thread(beepTask);
		thread.start();
		*/
		
		//===================================================
		/*
		// 두번째 방법 - 익명( Anonymous ) 클래스
		Thread thread = new Thread( new Runnable() {
			
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				
				for(int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
		});
		thread.start();
		
		
		// 세번째 방법
		new Thread( new Runnable() {

			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();

				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}
		}).start();
		*/
		// 네번째 방법 : 람다식
		Thread thread1 = new Thread ( () -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();

			for (int i = 0; i < 5; i++) {
				toolkit.beep();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		} );
		thread1.start();
		
		// =========================
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

}
