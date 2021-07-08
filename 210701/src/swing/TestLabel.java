package swing;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class TestLabel extends JFrame {

	public TestLabel() {
		JPanel pnl = new JPanel();
		JLabel lbl = new JLabel("asdf");
		
		// lbl.setSize(300, 300); 이렇게 설정시 사이즈가 바뀌지 않는다. 배치관리자가 배치를 관리하기 때문
		// 아래처럼 배치 관리자에게 부탁을 해서 사이즈를 변경해야 한다.
		lbl.setMinimumSize(new Dimension(100, 100)); // 최소 100, 100 크기를 보장해달라
		lbl.setPreferredSize(new Dimension(300, 300)); // 300, 300으로 설정해달라. Dimension 가로, 세로 가지고 있는 간단한 객체
		lbl.setMaximumSize(new Dimension(300, 300)); // 최대 300, 300 크기를 넘지 말라.
		
		// Horizontal 수평, wingConstants 안에 상수값으로 위치가 저장되어 있다.
		lbl.setHorizontalAlignment(SwingConstants.CENTER); // 위치지정 가능
		//lbl.setVerticalAlignment(SwingConstants.TOP);
		
		lbl.setOpaque(true); // default : false값, Opaque(불투명)
		lbl.setBackground(Color.WHITE); // 전체 배경 
		
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
		new TestLabel();
	}

}
