package swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestFlowLayout extends JFrame {

	public TestFlowLayout() {
		// 기본적으로 중앙에 정렬하게 되어있다.
//		setLayout(new FlowLayout());
		// 오른쪽 정렬
//		setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		// button같은 위젯은 component라고 부르고
		// container - component를 담을 수 있는 화면
		JPanel pnl = new JPanel(); 
		pnl.add( new JButton("Button1") );
		pnl.add( new JButton("Button2") );
		pnl.add( new JButton("Button3") );
		
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		TestFlowLayout frame = new TestFlowLayout();
	}

}
