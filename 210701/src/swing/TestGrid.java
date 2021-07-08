package swing;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestGrid extends JFrame {

	// 바둑판 모양의 칸칸마다 컴포넌트가 들어가는 Layout
	// GridLayout의 단점은 각 Component마다 다른 크기를 가질 수 없다.	
	public TestGrid() {
		JPanel pnl = new JPanel();
		//						   rows cols
		pnl.setLayout(new GridLayout(3, 3));
		// 먼저 rows를 우선으로 본다, 나머지 cols 알아서 계산
		// 버튼 5개라서 3줄 2칸으로 계산
		// 그래서 rows cols 하나만 정해주면 알아서 만들어준다.
		// (0, 3) : 3칸짜리가 필요하다.
		// (2, 0) : 2줄짜리가 필요하다.
		
		pnl.add(new JButton("Button"));
		pnl.add(new JButton("Button"));
		pnl.add(new JButton("Button"));
		pnl.add(new JButton("Button"));
		pnl.add(new JButton("LONG LONG LONG LONG LONG"));

		add(pnl);
		
		showGUI();
	}
	
	private void showGUI() {
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TestGrid();
	}

}
