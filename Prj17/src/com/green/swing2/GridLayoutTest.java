package com.green.swing2;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class GridLayoutTest extends JFrame {
	
	public GridLayoutTest() {
		super("Grid Layout Test");
		
		initComponent();
		
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setSize(500, 500);
		this.setVisible(true);
		
	}
	
	private void initComponent() {
		
		GridLayout gl = new GridLayout(3, 2, 20, 20);  // 3줄 2칸, margin 20 20
		this.setLayout( gl );
		
		JButton  [] btns = new JButton[5];
		for (int i = 0; i < btns.length; i++) {
			btns[i] = new JButton("버튼");
			this.add( btns[i] );
		}
		this.add(new JTextField());
		
	}

	public static void main(String ... args) {  // ...  가변인자
		new GridLayoutTest(); 
	}
	
	
}






