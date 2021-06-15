package com.green.swing1;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestSwing01 extends JFrame{
	
	JButton btn1, btn2, btn3, btn4, btn5;

	public TestSwing01 () {
		this.setTitle("첫번째 스윙프로그램");
		
		this.setLayout( new FlowLayout() );
		
		btn1 = new JButton("버튼1");
		btn2 = new JButton("버튼2");
		btn3 = new JButton("버튼3");
		btn4 = new JButton("버튼4");
		btn5 = new JButton("버튼5");
		
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(btn4);
		this.add(btn5);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 300);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new TestSwing01();
		
	}

}
