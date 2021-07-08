package dialog;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TestOption {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JButton btn = new JButton("누름");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String userInput = JOptionPane.showInputDialog(frame, "이름을 입력하세요");
				if (userInput == null || userInput.trim().isEmpty()) {
					JOptionPane.showMessageDialog(frame, "이름을 입력하세요!", "에러에러!", JOptionPane.ERROR_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(frame, "안녕하세요. " + userInput + "님");
				}
//				JOptionPane.showMessageDialog(frame, "경고경고", "제목", JOptionPane.WARNING_MESSAGE);
			}
		});
		frame.add(btn);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
