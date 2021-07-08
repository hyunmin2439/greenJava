package keyevent;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestKeyEvent extends JFrame {

	public TestKeyEvent() {
		JPanel pnl = new JPanel();
		JTextField tf = new JTextField(20);
		pnl.add(tf);
		add(pnl);
		
		tf.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				printKeyInfo(e);
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				printKeyInfo(e);
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				printKeyInfo(e);
			}
		});
		
		showGUI();
	}
	
	private void printKeyInfo(KeyEvent e) {
//		if (e.getID() == KeyEvent.KEY_TYPED) { // 발생한 이벤트
//			// 입력한 문자가 무엇인지 알기 위해서는 getKeyChar()를 사용
//			// 하지만 ctrl, alt, shift 등은 KEY_TYPE이 아니기 때문에 Char형식으로 알려주지 못한다.
//			System.out.println( "사용자가 입력한 키캐릭터: " + e.getKeyChar() );
//		} else {
//			// 코드 값은 keyPressed, keyReleased를 사용하여 얻음
//			// 코드 값은 ctrl, alt, shift 등을 인식할 수 있다.
//			System.out.println( "사용자가 입력한 키코드: " + e.getKeyCode() );
//			System.out.println(KeyEvent.getKeyText(e.getKeyCode())); // keyCode를 통해서 문자열로 알려준다.
//		}
		
		// ctrl | alt | shift 다른 키들과 조합해서 누르면 키값을 알려준다.
		System.out.println("모디파이어" + e.getModifiersEx());
		System.out.println(KeyEvent.getModifiersExText(e.getModifiersEx()));
	}
	
	private void showGUI() {
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TestKeyEvent();
	}

}
