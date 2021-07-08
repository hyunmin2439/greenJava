package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyActionListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("사용자가 버튼을 누름");
	}
}

public class SimpleCounter extends JFrame {
	private int count = 0;
	
	public SimpleCounter() {
		JPanel pnl = new JPanel();
		JLabel lbl = new JLabel("0");
		JButton btn = new JButton("증가");
		
		// 클래스 따로 빼서 구현
//		btn.addActionListener( new MyActionListener() );
		
		// 클래스를 method 내부에 구현. 익명 클래스/함수? 방식
		btn.addActionListener(new ActionListener() { 
//			private String myField = "asdf"; // Field
//
//			private void printHello() {		 // Method
//				System.out.println("Hello");
//			}
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				printHello();
//				System.out.println("사용자가 버튼 누름" + myField);
				
//				String text = lbl.getText();
//				int parse = Integer.parseInt(text);
//				parse++;
				count++;
				lbl.setText(String.valueOf(count));
			}
		});
		
		pnl.add(lbl);
		pnl.add(btn);
		
		add(pnl);
		
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new SimpleCounter();
	}

}
