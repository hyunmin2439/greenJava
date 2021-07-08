package image;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TestImage extends JFrame {
	public TestImage() {
		JPanel pnl = new JPanel();
		ImageIcon icon = new ImageIcon("images/finn.png");
		JLabel lbl = new JLabel(icon);
		
		JButton btn = new JButton("제이크");
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				switch( (int)(Math.random() * 4) ) {
				case 0:
					lbl.setIcon(new ImageIcon("images/finn.png"));
					break;
				case 1:
					lbl.setIcon(new ImageIcon("images/jake.png"));
					break;
				case 2:
					lbl.setIcon(new ImageIcon("images/bimo.png"));
					break;
				case 3:
					lbl.setIcon(new ImageIcon("images/lemon.jpg"));
					break;
				}
				
			}
			
		});
		
		pnl.add(lbl);
		
		add(pnl);
		add(btn, "South");
		
		showGUI();
	}

	private void showGUI() {
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TestImage();
	}
	
}
