package selfdialog;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.swing.*;

class MyDialog extends JDialog {

	public MyDialog(String line) {
		setModal(true); 
		setLayout( new FlowLayout() );
		
		String[] splitLine = line.trim().split(",");
		Arrays.sort(splitLine); // 정렬
		
		// HashSet 중복제거 && 순서 유지
		Set<String> set = new HashSet<>();
		for(String str : splitLine) {
			set.add(str);
		}
		
		// btn 추가
		for(String str : set) {
			add(new JButton(str));
		}
		
		pack();
	}
}

public class DialogSort extends JFrame {
	
	public DialogSort() {
		setLayout( new FlowLayout() );
		JPanel pnl = new JPanel();
		
		pnl.setLayout( new BoxLayout(pnl, BoxLayout.Y_AXIS) );
		JLabel lbl1 = new JLabel("수를 입력해주세요.");
		JLabel lbl2 = new JLabel("ex) 6, 3, 2, 2, 4, 5");
		JTextField txtf = new JTextField(10);
		JButton btn = new JButton("확인");
		
		// 가운데
		lbl1.setAlignmentX(JButton.CENTER_ALIGNMENT);
		lbl2.setAlignmentX(JButton.CENTER_ALIGNMENT);
		txtf.setAlignmentX(JButton.CENTER_ALIGNMENT);
		btn.setAlignmentX(JButton.CENTER_ALIGNMENT);
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JDialog dialog = new MyDialog( txtf.getText() );
				dialog.setVisible(true);
			}
		});
		
		pnl.add(lbl1);
		pnl.add(lbl2);
		pnl.add(txtf);
		pnl.add(btn);
		add(pnl);
		
		showGUI();
	}
	
	private void showGUI() {
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new DialogSort();
	}
}
