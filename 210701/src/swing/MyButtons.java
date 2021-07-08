package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyButtons extends JFrame implements ActionListener {
	private JPanel pnl;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;

	public MyButtons() {
		pnl = new JPanel();
		btn1 = new JButton("1번 버튼");
		btn2 = new JButton("2번 버튼");
		btn3 = new JButton("3번 버튼");
		
		// this : 이 클래스 자체를 담아서 이벤트 처리
		btn1.addActionListener(this); 
		btn2.addActionListener(this); 
		btn3.addActionListener(this); 

		pnl.add(btn1);
		pnl.add(btn2);
		pnl.add(btn3);
		
		add(pnl);
		
		showGUI();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn1) {
			System.out.println("버튼 1번 눌렀지용");			
		} else if(e.getSource() == btn2) {
			btn2.setText("바뀐 2번 버튼");
		} else if(e.getSource() == btn3) {
			System.out.println("버튼 3번 눌렀지용");			
		}
		
	}

	private void showGUI() {
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyButtons();
	}

}
