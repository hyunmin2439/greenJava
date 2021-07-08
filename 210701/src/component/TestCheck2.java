package component;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class TestCheck2 extends JFrame {
	public TestCheck2() {
		JPanel pnlBox = new JPanel();
		pnlBox.setLayout(new BoxLayout(pnlBox, BoxLayout.Y_AXIS));
		
		JPanel pnlName = new JPanel();
		JPanel pnlAge = new JPanel();
		
		JCheckBox chkName = new JCheckBox("이름");
		JTextField tfName = new JTextField(10);
		//tfName.setEditable(false); //        수정 true : 가능 / false : 불가능
		tfName.setEnabled(false); // 비활성화  수정 true : 가능 / false : 불가능
		
		JCheckBox chkAge = new JCheckBox("나이");
		JTextField tfAge = new JTextField(10);
		tfAge.setEditable(false); 
		
//		ActionListener chkListener = new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				tfName.setEditable(chkName.isSelected());
//				tfAge.setEditable(chkAge.isSelected());
//			}
//		};
//		chkName.addActionListener(chkListener);
//		chkAge.addActionListener(chkListener);
		
		ItemListener itemListener = new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				// System.out.println("선택된 상태가 변경될 때 발생합니다.");
				tfName.setEditable(chkName.isSelected());
				tfAge.setEditable(chkAge.isSelected());
			}
		};
		
		chkName.addItemListener( itemListener );
		chkAge.addItemListener( itemListener );
		
		
		pnlName.add(chkName);
		pnlName.add(tfName);
		
		pnlAge.add(chkAge);
		pnlAge.add(tfAge);
		
		pnlBox.add(pnlName);
		pnlBox.add(pnlAge);
		
		add(pnlBox);
		
		JButton btn = new JButton("비활성화 버튼");
		btn.setEnabled(false);
		add(btn, "South");
		// 다 입력을 하면 활성화를 시킨다 같은 응용으로 사용 가능
		
		showGUI();
	}
	
	private void showGUI() {
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TestCheck2();
	}
}
