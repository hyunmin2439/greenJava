package keyevent;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MovingLabel extends JFrame{
	private int x = 100;
	private int y = 100;

	public MovingLabel() {
		JPanel pnl = new JPanel();
		JLabel lbl = new JLabel("+");
		pnl.setLayout(null);
		lbl.setBounds(x, y, 10, 10);
		pnl.add(lbl);
		
		// 패널에 포커를 줄 수 있게 만들어야 움직인다.
		// 없으면 패널이 focus를 얻지 못해서 움직이지 않는다.
		pnl.setFocusable(true);
		
		// KeyAdapter : 추상클래스 - 필요한 메소드만 불러서 쓰기

		pnl.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				// VK_UP : 방향키 위로
				
				switch( e.getKeyCode() ) {
				case KeyEvent.VK_UP: y -= 10; break;
				case KeyEvent.VK_DOWN: y += 10; break;
				case KeyEvent.VK_LEFT: x -= 10; break;
				case KeyEvent.VK_RIGHT: x += 10; break;
				}
				
				if( !(0 <= x && x <= 475) )
					if(x < 0) x = 0;
					else x = 475;
				
				if( !(0 <= y && y <= 475) )
					if(y < 0) y = 0;
					else y = 475;
				
				lbl.setLocation(x, y);
			}
			
		});
		
		add(pnl);
		
		showGUI();
	}
	
	private void showGUI() {
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MovingLabel();
	}

}
