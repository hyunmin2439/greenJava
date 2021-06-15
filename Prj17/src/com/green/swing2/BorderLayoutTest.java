package com.green.swing2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayoutTest extends JFrame {

	JButton [] btns;
	
	public  BorderLayoutTest() {
		super("BorderLayout Test");
		
		initComponent();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setVisible(true);
	}
	
	private void initComponent() {
		String [] titles = {
				"North", "East", "South", "West", "Center",
				"단추1", "단추2", "단추3", "단추4", "단추5"
		}; 
		
		this.setLayout( new BorderLayout() );
		
		btns = new JButton[ titles.length ];
		
		for (int i = 0; i < titles.length; i++) {
			btns[i] = new JButton( titles[i] );			
		}
		
		// 베치
		this.add(btns[0], BorderLayout.NORTH);
		this.add(btns[1], BorderLayout.EAST);
		this.add(btns[2], BorderLayout.SOUTH);
		this.add(btns[3], BorderLayout.WEST);
		//this.add(btns[4], BorderLayout.CENTER);
		
		JPanel  pan1 = new JPanel( new FlowLayout() ); 
		pan1.add(btns[4]);
		pan1.add(btns[5]);
		pan1.add(btns[6]);
		pan1.add(btns[7]);
		this.add(pan1, BorderLayout.CENTER);
		
	}

	public static void main(String[] args) {
		new BorderLayoutTest();

	}

}






