package com.green.swing1;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// 	   class    this     extends  super
public class TestSwing02 extends JFrame {
	// Fields
	JLabel label1;
	JButton[] btns;
	
	
	public TestSwing02 () {
		// title 대신 사용가능하다.
		super("제목제목제목"); // 부모생성자 호출, setTitle("")

		initComponent();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 300);
		this.setVisible(true);
	}
	
	// 메소드
	private void initComponent() {
		
		String[] names = {
				"김유신",
				"이순신",
				"정발",
				"세종"
		};
		
		this.setLayout( new FlowLayout() );
		
		this.label1 = new JLabel("친구이름");
		
		this.btns = new JButton[ names.length ];
		
		for(int i = 0; i < names.length; i++) {
			btns[ i ] = new JButton( names[i] );
		}
		
		// 배치
		this.add( label1 );
		for(int i = 0; i < btns.length; i++) {
			this.add( btns[i] );
		}
	}

	public TestSwing02 ( String title ) {
		this(); // 자신의 생성자를 호출
		System.out.println(title);
	}
	
	public static void main(String[] ars) {
		new TestSwing02("하하하");
	}

}
