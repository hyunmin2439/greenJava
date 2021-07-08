package component;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class TestRadio extends JFrame {

	public TestRadio() {
		JPanel pnl = new JPanel();
		ButtonGroup group = new ButtonGroup();
		JRadioButton radio1 = new JRadioButton("남");
		JRadioButton radio2 = new JRadioButton("여");
		JRadioButton radio3 = new JRadioButton("기타");
		
		// 클릭할 때 마다 계속 이벤트 발생, 
		// 그리고 다른 버튼 누르면 해제 되는데 이럴 때 이벤트가 문제가 일어날 수 있다.
//		radio1.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("사용자가 남 버튼을 눌렀습니다.");
//			}
//		});
		
		// 때문에 ItemListener로 선택/선택해제 되었을 때 이벤트가 발생하게 할 수 있다.
		radio1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					System.out.println("사용자가 남 버튼을 선택하였습니다.");
				} else if(e.getStateChange() == ItemEvent.DESELECTED) {
					System.out.println("사용자가 남 버튼을 선택해제하였습니다.");
				}
				
			}
		});
		
		group.add(radio1);
		group.add(radio2);
		group.add(radio3);
		
		pnl.add(radio1);
		pnl.add(radio2);
		pnl.add(radio3);
		
		add(pnl);
		
		showGUI();
	}
	
	private void showGUI() {
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TestRadio();
	}
}
