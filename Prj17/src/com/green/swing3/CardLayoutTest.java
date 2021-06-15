package com.green.swing3;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CardLayoutTest extends JFrame {
	
	CardLayout	card;
	Container 	c; // 담는 개념
	
	public CardLayoutTest() {
		super("CardLayoutTest");
		
		initComponent();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 300);
		this.setVisible(true);
	}

	private void initComponent() {
		c 	 = this.getContentPane();
		card = new CardLayout(40, 30); // margin(x : 40, y : 30)  
		c.setLayout( card );
		
		JButton btn1 = new JButton("버튼 1");
		JButton btn2 = new JButton("버튼 버튼  2");
		JButton btn3 = new JButton("버튼 버튼 버튼 3");
		
		
		/* 익명 클래스 -> 자바 1.8 이상이면 람다식으로 코드 줄임
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				card.next( c );
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				card.next( c );
			}
		});
		
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				card.next( c );
			}
		});
		*/
		
		
		btn1.addActionListener( new ButtonListener() ); // ButtonListener : 사용자 정의 클래스
		btn2.addActionListener( new ButtonListener() );
		btn3.addActionListener( new ButtonListener() );
		
		c.add( btn1 );
		c.add( btn2 );
		c.add( btn3 );
	}

	public static void main(String[] args) {
		new CardLayoutTest();
	}
	
	// inner class : 내부 클래스 -> 이벤트들이 공통으로 동작하면 내부 클래스로 동작하게
	class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			card.next( c );
		}
	}

}
