package component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TestCheckBox extends JFrame {
	public TestCheckBox() {
		JPanel pnl = new JPanel();
		JCheckBox chk1 = new JCheckBox("고수 추가: 1000원");
		JCheckBox chk2 = new JCheckBox("면 추가: 1000원");
		JCheckBox chk3 = new JCheckBox("육수 추가: 500원");
		
		pnl.add(chk1);
		pnl.add(chk2);
		pnl.add(chk3);
		
		JLabel lblPrice = new JLabel("총 금액: ");
		JButton btnAll = new JButton("전체 선택");
		JButton btnReset = new JButton("전체 해제");
		JButton btn = new JButton("계산");
		
		JPanel pnlWest = new JPanel();
		pnlWest.setLayout(new BoxLayout(pnlWest, BoxLayout.Y_AXIS));
		
		pnlWest.add(btnAll);
		pnlWest.add(btnReset);
		pnlWest.add(btn);
		
		add(new JLabel("기본 쌀국수: 5000원"), "North");
		add(pnlWest, "East");
		add(pnl);
		add(lblPrice, "South");

		btn.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int price = 5000;
				// 실무에서 삼항 연산자 쓰는건 개인/회사 스타일
				// 회사에서 엄격한데는 띄워쓰기까지 맞추는데도 있다.
				price += chk1.isSelected() ? 1000 : 0;
				if( chk2.isSelected() ) price += 1000;
				if( chk3.isSelected() ) price += 500;
				lblPrice.setText("총 금액: " + price + "원");
			}
		});
		
		// 익명 클래스로 만든 인스턴스를 btnListener가 가르키는 것.
		ActionListener btnListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				Object source = e.getSource();
//				if(source == btnAll) {
//					chk1.setSelected(true);
//					chk2.setSelected(true);
//					chk3.setSelected(true);
//				} else if (e.getSource() == btnReset) {
//					chk1.setSelected(false);
//					chk2.setSelected(false);
//					chk3.setSelected(false);
//				}
				
				switch(e.getActionCommand()) {
				case "전체 선택":
					chk1.setSelected(true);
					chk2.setSelected(true);
					chk3.setSelected(true);
					break;
				case "전체 해제":
					chk1.setSelected(false);
					chk2.setSelected(false);
					chk3.setSelected(false);
					break;
				}
			}
		};
		btnAll.addActionListener(btnListener);
		btnReset.addActionListener(btnListener);
		
		showGUI();
	}
	
	private void showGUI() {
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TestCheckBox();
	}
}
