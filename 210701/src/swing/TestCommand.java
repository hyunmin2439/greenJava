package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestCommand extends JFrame implements ActionListener{
	
	public TestCommand() {
		JPanel pnl = new JPanel();
		
		char a = 65;
		for(int i = 0; i < 5; i++) {
			JButton btn1 = new JButton(String.valueOf(a));
			btn1.setActionCommand("동작1"); // ActionCommand를 지정
			a++;
			btn1.addActionListener(this);
			pnl.add(btn1);
			
			// 패널에 추가가 됐지만 발생되는 이벤트 액션 이벤트를 연결 안시켜줘서 작동안된다.
			// addActionListener는 return값 void여서 작동 X. 추가되는건 component여야 한다. 
			// pnl.add( new JButton("동작1").addActionListener(this) );
		}
		
		add(pnl);
		
		showGUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		/*////참조값을 확인///////
		// 동작1, 동작2 버튼만 여러개 있을 때는 아래와 같이 사용하면 된다.
		// 하지만 A, B, C, D, E 버튼이 있고 A, B, D가 같은 동작을 해야 한다면
		// 아래의 방식으로는 불가능 하다.
		Object source = e.getSource();
		if (source instanceof JButton) {
			JButton btn = (JButton) source;
			if (btn.getText().equals("동작1")) {
				System.out.println("동작 1번 누름");
			}
		}
		*//////////////////////
		
		System.out.println(e.getActionCommand()); // ActionCommand를 가지고 옴
		
		if (e.getActionCommand().contentEquals("동작1")) {
			// 동작 1
		} else {
			// 다른 동작
		}
		
	}
	
	private void showGUI() {
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TestCommand();
	}

}
