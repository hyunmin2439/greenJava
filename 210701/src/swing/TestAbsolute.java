package swing;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestAbsolute extends JFrame {
	
	// AbsoluteLayout : 절대 레이아웃
	public TestAbsolute() {
		JPanel pnl = new JPanel();
		pnl.setLayout(null); // component 위치 크기 정해주던 LayoutManager가 사라짐.
							 // 때문에 component 각각 일일이 크기와 위치를 정해줘야 한다.
		
		JButton btn1 = new JButton("Click Me");
//		btn1.setSize(100, 100); // LayoutManager가 있을 때는 위치 정해주는 것이 불가능 했지만 사라져서 가능
//		btn1.setLocation(300, 300);
		btn1.setBounds(300, 300, 100, 100); // 이렇게 해도 가능하다.
		
		btn1.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
				//System.out.println("마우스 해제");
				btn1.setBackground(Color.WHITE);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				//System.out.println("마우스 누름");
				btn1.setBackground(Color.RED);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				//System.out.println("클릭");
				//btn1.setBackground(Color.BLUE);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("마우스 나감");
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("마우스 들어옴");
			}

		});
		
		// MouseAdapter(추상클래스) : 원하는 마우스 이벤트만 추가 구현
//		btn1.addMouseListener( new MouseAdapter() {
//			// Alt + Shift + S : 원하는 메소드 구현
//			
//			@Override
//			public void mouseEntered(MouseEvent e) {
//				btn1.setLocation((int)(Math.random() * 400), (int)(Math.random() * 400));
//			}
//
//		});
		
		pnl.add(btn1);
		
		add(pnl);
		
		showGUI();
	}
	
	private void showGUI() {
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TestAbsolute();
	}

}
