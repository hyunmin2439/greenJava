package com.green.swing2;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutTest extends JFrame {

	public FlowLayoutTest() {
		super("FlowLayout Test");
		
		initComponent();
		
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setSize(400, 400);
		this.setVisible(true);
	}
	
	private void initComponent() {
		
		this.getContentPane().setLayout( new FlowLayout() );
		
		/*
		List<JButton>  btnList  = new ArrayList<>();		
		for (int i = 0; i < 30; i++) {
			btnList.add( new JButton("버튼" + (i+1) ) );
			this.add( btnList.get(i) );
			
			final int  index  = i;
			// 익명 함수에서는 바깥의변수를 직정사용할 수 없다
			// final 붙여야 사용가능하다 
			// final - 한번만 값을 넣을 수 있는 변수
			btnList.get(i).addActionListener( new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					String caption = btnList.get(index).getText() ;
					System.out.println( caption );		
					
				}
			}  );
			
		}
		*/
		JButton [] btns = new JButton[30];
		
		for (int i = 0; i < btns.length; i++) {
			btns[i] = new JButton("Button " + (i+1));
			this.add( btns[i] );
			
			btns[i].addActionListener( ( e )->{
				// e.getSource() : e를 발생시킨 소스 - component 
				//  -> 눌러진 버튼
				JButton btn  = (JButton) e.getSource();
				String  msg  = btn.getText();
				System.out.println(msg);						
			});
		}
				
	}

	public static void main(String[] args) {
		new FlowLayoutTest();
	}

}













