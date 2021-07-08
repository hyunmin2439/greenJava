package dialog;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

class MyDialog extends JDialog {

	public MyDialog() {
		// 설정 안하면 누를때마다 창이 새로 생긴다.
		setModal(true); // 부모창이랑 소통을 못하게 막는다. 자식창이 우선적
		JButton lbl = new JButton("이것은 다이얼로그");
		add(lbl);
		setSize(300, 300);
		// DISPOSE_ON_CLOSE는 기본값이라서 굳이 설정할 필요X
		// setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
}

public class TestDialog extends JFrame {
	

	
	public TestDialog() {
		JButton btn = new JButton("팝업");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JDialog dialog = new MyDialog();
				dialog.setVisible(true);
			}
		});
		add(btn);
		
		showGUI();
	}
	
	private void showGUI() {
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new TestDialog();
	}
}
