package com.ex;

import java.awt.FlowLayout; // java.awt // Swing에서 쓰는 라이브러리
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

// Java Swing 예제

public class ThreeButton extends JFrame {
	
	// 메모리에 new해서 생성한 것.
	// 메모리에 올린다고 해서 바로 화면에 나타나지 않는다.
	// Layout에 배치를 해서 보이게 해야 한다.
	
	JLabel 		 lbl1 	   = new JLabel("이름");
	JTextField   txt1 	   = new JTextField( 20 ); // ( 크기 )
	JLabel 		 lbl2 	   = new JLabel("입사일");
	JTextField   txt2 	   = new JTextField( 20 ); // ( 크기 )
	
	JButton 	 btn1	   = new JButton("1번 버튼"); // 인자가 있는 생성자를 이용해서 생성

	JLabel		 lblResult = new JLabel("결과");
	
	JRadioButton jrb 	   = new JRadioButton("Hello");
	
	// 기본 생성자
	public ThreeButton() {
		// 제목줄 정보
		super("버튼 3개");
		
		// 버튼 배치방식
		this.setLayout(new FlowLayout() );
		//this.setLayout(new TableLayout() );
		
		// 버튼 배치
		this.add( lbl1 );
		this.add( txt1 );
		this.add( lbl2 );
		this.add( txt2 );
		this.add( btn1 );
		this.add( lblResult );
		//this.add(jrb);
		
		// 액션 감시자(ActionListener)
		// ( ) 안에 객체를 생성해서 넣어준다.
		btn1.addActionListener( new ActionListener() {
			
			// abstract, interface로 구현되어 있는 것.
			@Override
			public void actionPerformed(ActionEvent e) {
				String msg = txt1.getText();
				// 이 순 신
				msg = delBlank( msg );
				
				System.out.println(msg);
				
				lblResult.setText("결과 : " + msg );
			}
			
		} );
		
		// 프레임 크기 지정
		this.setSize(300, 300); // 창의 크기 지정
		this.setVisible(true); 	// 창이 보이게
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// setDefaultCloseOperation메소드에 (EXIT_ON_CLOSE)
		// 필드 값을 붙이면 윈도우창 종료 시 프로세스까지 깔끔하게 닫을 수 있다.
		
	}
	
	// 함수를 따로 만들어서 빼면 좋은 점이 어디서 에러가 발생하였는지 
	// 간편하게 찾을 수 있고 그 함수만 고치면 되기 때문에 편하다.
	protected String delBlank(String msg) {
		return msg.replace(" ", "");
	}

	public static void main(String[] args) {
		new ThreeButton();

	}

}
