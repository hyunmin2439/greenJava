package dialog;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TestOption2 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
//				int yesno = JOptionPane.showConfirmDialog(frame, "종료하시겠습니까?", "종료", JOptionPane.YES_NO_OPTION);
//				if (yesno == JOptionPane.YES_OPTION) {
//					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//				}
				
				// 메세지 선택 버튼에 원하는 글자를 넣을 수 있게 해준것.
				String[] option = new String[] {"그렇게 합시다", "싫은데요", "몰라"};
				int index = JOptionPane.showOptionDialog(frame, "종료하시겠습니까?", "제목", JOptionPane.YES_NO_OPTION, 
						JOptionPane.QUESTION_MESSAGE, null, option, option[2]);
				JOptionPane.showMessageDialog(frame, option[index] + "를 선택하셨습니다.");
			}
		});
		
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setVisible(true);
	}
}
