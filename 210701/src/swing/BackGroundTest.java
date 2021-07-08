package swing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BackGroundTest extends JFrame implements ActionListener {
	private JPanel pnlA;
	
	
	public BackGroundTest() {
		pnlA = new JPanel();
		JLabel lbl = new JLabel("Hello World!");		
		pnlA.add(lbl);
		
		JPanel pnlB = new JPanel();
		JButton btn1 = new JButton("랜덤");
		btn1.addActionListener(this);
		pnlB.add(btn1);
		// 초록, 파랑, 랜덤색
		
		add(pnlA);
		add(pnlB, "South");
		
		showGUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Color[] color = new Color[3];
		color[0] = Color.BLUE;
		color[1] = Color.GREEN;
		color[2] = new Color((int)(Math.random() * 256), 
								(int)(Math.random() * 256), 
								(int)(Math.random() * 256) );
		
		pnlA.setBackground( color[ (int)(Math.random() * 3) ] );
		// new Color() 생성자로 RGB 값을 넣어주면 색깔이 들어간다.
		// 많이 쓰는 색깔들은 static final 값으로 들어가 있다.
	}
	
	private void showGUI() {
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new BackGroundTest();
	}

}
