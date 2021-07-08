package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestFlowAlign extends JFrame {
	public TestFlowAlign() {
		FlowLayout layout = new FlowLayout();
		JPanel pnl = new JPanel(layout);
		pnl.add(new JButton("Button 1"));
		pnl.add(new JButton("Button 2"));
		pnl.add(new JButton("Button 3"));
		
		JPanel pnlSouth = new JPanel();
		JButton btnLeft = new JButton("LEFT");
		btnLeft.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				layout.setAlignment(FlowLayout.LEFT);
				
				// 자바에서는 동적변화 후 이상 두줄만 뒤 따르면 모든게 해결
				pnl.revalidate(); // 다시 확인하고
				pnl.repaint(); // 다시 그려주기
			}
		});
		
		JButton btnCenter = new JButton("CENTER");
		btnCenter.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				layout.setAlignment(FlowLayout.CENTER);
				pnl.revalidate();
				pnl.repaint();
			}
		});
		
		JButton btnRight = new JButton("RIGHT");
		btnRight.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				layout.setAlignment(FlowLayout.RIGHT);
				pnl.revalidate();
				pnl.repaint();
			}
		});
		
		pnlSouth.add(btnLeft);
		pnlSouth.add(btnCenter);
		pnlSouth.add(btnRight);
		
		add(pnl);
		add(pnlSouth, "South");
		
		showGUI();
	}
	
	private void showGUI() {
		setSize(800, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TestFlowAlign();
	}
}
