package image;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UseToolkit extends JFrame {
	
	public UseToolkit() {
		JPanel pnl = new JPanel();
		
		// Toolkit : 메소드 호출 Toolkit 객체 얻어옴
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image img = toolkit.getImage("images/bimo.png");
		// 크기를 조절한 새로운 Image를 만들어서 넘겨준다. img에 담아도 결과 같음
		Image scale = img.getScaledInstance(300, 300, java.awt.Image.SCALE_DEFAULT);
		
		JLabel lbl = new JLabel(new ImageIcon(scale));
		
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
		new UseToolkit();
	}

}
