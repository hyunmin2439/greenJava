package border;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TestBorder extends JFrame {
	public TestBorder() {
		JPanel pnl = new JPanel();
		
		JLabel lbl = new JLabel("테두리1");
		lbl.setPreferredSize( new Dimension(100, 100) );
		lbl.setOpaque(true);
		lbl.setBackground(Color.WHITE);
		
		// 1픽셀의 검은선을 그리겠다.
		//lbl.setBorder(new LineBorder(Color.BLACK, 1));
		// Border를 만드는 클래스
		lbl.setBorder( BorderFactory.createLineBorder(Color.BLACK, 1) );
		lbl.setBorder( BorderFactory.createTitledBorder("테두리의 제목") );
		
		pnl.add(lbl);
		
		add(pnl);
		
		showGUI();
	}
	
	private void showGUI() {
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TestBorder();
	}

}
