package swing;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

public class TestBox extends JFrame {
	
	// 같은 정렬을 하고 싶을때 사용, 버튼마다 다른 정렬을 하면 이상하게 나온다.
	// 조절하기 진짜 힘든 것이 BoxLayout이다.
	public TestBox() {
		JPanel pnl = new JPanel();
		//						 container,     방향
		pnl.setLayout(new BoxLayout(pnl, BoxLayout.Y_AXIS)); // 가로 방향 X_AXIS
		
		pnl.add(Box.createVerticalGlue()); // Vertical 붙이든 안붙이든 같은 결과. 
										   // 정렬방향에 따라 Horizontal을 사용하거나 안붙이거나.
		pnl.add( makeButton("가") );
		pnl.add( makeButton("나") );
		pnl.add( makeButton("다") );
		pnl.add(Box.createGlue()); // Glue, 안보이는 풀을 붙이는 것.
		
		add(pnl);
		
		showGUI();
	}
	
	private JButton makeButton(String text) {
		JButton btn = new JButton(text);
		btn.setMinimumSize(new Dimension(100, 100));
		btn.setPreferredSize(new Dimension(100, 100));
		btn.setMaximumSize(new Dimension(100, 100));
		btn.setForeground(Color.RED); // 글자색 변경
		
		//btn.setAlignmentX(0.5F); // float 실수값 0.5 가운데
		btn.setAlignmentX(JButton.CENTER_ALIGNMENT); // 가운데
		btn.setAlignmentY(0.5F); // 현재 세로 방향으로 정렬되어 있기 때문에 세로방향 정렬 불가능
						 // 마찬가지로 가로 방향으로 정렬해달라고 했을 때는 가로방향 정렬 불가능
						 // 그렇다면 중앙 정렬을 하는 방법은? => 위에 Glue를 사용하면 된다.
		return btn;
	}
	
	private void showGUI() {
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TestBox();
	}
	
}
