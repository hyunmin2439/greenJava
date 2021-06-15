package com.green.swing3;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutTest extends JFrame {

	public FlowLayoutTest() {
		super("제목제목제목");

		initComponent();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 300);
		this.setVisible(true);
	}
	
	private void initComponent() {
		this.getContentPane().setLayout( new FlowLayout() );
		
		// 배열 생성
		JButton [] btns = new JButton[3]; // JButton이 세개 들어갈 공간 생성
		
		for(int i = 0; i < btns.length; i++) {
			// 버튼 생성
			btns[ i ] = new JButton("Button" + (i + 1) );
			this.add( btns[i] );
			
			// 기능연결 - action(event)를 연결
			// Listener는 감시자의 느낌, 이벤트가 발생하는지 지켜보고 있는 것.
//			btns[i].addActionListener( (e) -> {
//				JButton btn = (JButton) e.getSource();
//				String msg = btn.getText();
//				System.out.println( msg );
//			} );
			Color [] colors = { Color.BLUE, Color.RED, Color.GREEN };
			btns[i].addActionListener( new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println( e );
					JButton btn = (JButton) e.getSource();
					String msg = btn.getText();
					System.out.println( msg );
					int idx = Integer.parseInt( msg.substring(6) );
					btn.setBackground( colors[ idx - 1 ] );
					btn.setForeground(Color.yellow);
				}
			} );
		}
	}

	public static void main(String[] args) {
		new FlowLayoutTest();
	}

}
